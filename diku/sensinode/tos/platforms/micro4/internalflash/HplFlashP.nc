/*
 * Copyright (c) 2007 University of Copenhagen
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of University of Copenhagen nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL STANFORD
 * UNIVERSITY OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 *
 * @author Marcus Chang <marcus@diku.dk>
 */

module HplFlashP {
    provides interface HplFlash;
}

implementation {

#define FLASH_BUSY            0x01
#define FLASH_FWKEYx          0xA500
#define FLASH_FSSEL_ACLK      0x00
#define FLASH_FSSEL_MCLK      0x01
#define FLASH_FSSEL_SMCLK     0x02
#define FLASH_FN_DIV3         0x02

#define FLASH_BLKWRT          0x80
#define FLASH_WRT             0x40
#define FLASH_SEGMENT_ERASE   0x02

#define FLASH_LOCK            0x10
#define FLASH_WAIT            0x08


    void writeBlock(uint8_t * src, uint8_t * dst, uint8_t length) __attribute__((section(".data")));
    void writeBlock(uint8_t * src, uint8_t * dst, uint8_t length) {
        uint8_t i;

        atomic {    

            /* wait while busy */                    
            while (FCTL3 & FLASH_BUSY) {;}
            
            /* use SMCLK as clock source                    */
            /* clock must be between 257 kHz - 476 kHz      */
            /* with SMCLK = 1 MHz, use divisor 3 (FNx + 1)  */
            FCTL2 = FLASH_FWKEYx + FLASH_FSSEL_SMCLK + FLASH_FN_DIV3;

            /* clear lock */
            FCTL3 = FLASH_FWKEYx;
            
            /* enable block write */
            FCTL1 = FLASH_FWKEYx + FLASH_BLKWRT + FLASH_WRT;

            /* copy bytes */
            for (i = 0; i < length; i++) {
                dst[i] = src[i];            
                
                /* wait while WAIT */
                while ( !(FCTL3 & FLASH_WAIT) ) {;}                
            }            
            
            /* clear block write */
            FCTL1 = FLASH_FWKEYx;

            /* wait while busy */                    
            while (FCTL3 & FLASH_BUSY) {;}

            /* set lock */
            FCTL3 = FLASH_FWKEYx + FLASH_LOCK;
        }
    
    }
    

    command error_t HplFlash.write(uint8_t * source, uint8_t * destination, uint8_t length) {

        writeBlock(source, destination, length);

        return SUCCESS;
    }
    
    command error_t HplFlash.erase(uint8_t * address) {

        atomic {
        
            /* use SMCLK as clock source                    */
            /* clock must be between 257 kHz - 476 kHz      */
            /* with SMCLK = 1 MHz, use divisor 3 (FNx + 1)  */
            FCTL2 = FLASH_FWKEYx + FLASH_FSSEL_SMCLK + FLASH_FN_DIV3;

            /* clear lock */
            FCTL3 = FLASH_FWKEYx;
            
            /* enable segment erase */
            FCTL1 = FLASH_FWKEYx + FLASH_SEGMENT_ERASE;
        
            /* dummy write in segment to be erased */
            *address = 0x00;
        
            /* set lock */
            FCTL3 = FLASH_FWKEYx + FLASH_LOCK;
        }

        return SUCCESS;
    }

}