
/*
 * Copyright (c) 2004-2005 Crossbow Technology, Inc.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of Crossbow Technology nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

#include <atm128hardware.h>

/**
 * Provide GeneralIO interfaces for all of the ATmega1284's pins.
 *
 * @author Martin Turon <mturon@xbow.com>
 * @author Martin Cerveny
 */

configuration HplAtm128GeneralIOC
{
  // provides all the ports as raw ports
  provides {
    interface GeneralIO as PortA0;
    interface GeneralIO as PortA1;
    interface GeneralIO as PortA2;
    interface GeneralIO as PortA3;
    interface GeneralIO as PortA4;
    interface GeneralIO as PortA5;
    interface GeneralIO as PortA6;
    interface GeneralIO as PortA7;

    interface GeneralIO as PortB0;
    interface GeneralIO as PortB1;
    interface GeneralIO as PortB2;
    interface GeneralIO as PortB3;
    interface GeneralIO as PortB4;
    interface GeneralIO as PortB5;
    interface GeneralIO as PortB6;
    interface GeneralIO as PortB7;

    interface GeneralIO as PortC0;
    interface GeneralIO as PortC1;
    interface GeneralIO as PortC2;
    interface GeneralIO as PortC3;
    interface GeneralIO as PortC4;
    interface GeneralIO as PortC5;
    interface GeneralIO as PortC6;
    interface GeneralIO as PortC7;

    interface GeneralIO as PortD0;
    interface GeneralIO as PortD1;
    interface GeneralIO as PortD2;
    interface GeneralIO as PortD3;
    interface GeneralIO as PortD4;
    interface GeneralIO as PortD5;
    interface GeneralIO as PortD6;
    interface GeneralIO as PortD7;
  }
}

implementation
{
  components 
  new HplAtm128GeneralIOPortP((uint8_t)&PORTA, (uint8_t)&DDRA, (uint8_t)&PINA) as PortA,
    new HplAtm128GeneralIOPortP((uint8_t)&PORTB, (uint8_t)&DDRB, (uint8_t)&PINB) as PortB,
    new HplAtm128GeneralIOPortP((uint8_t)&PORTC, (uint8_t)&DDRC, (uint8_t)&PINC) as PortC,
    new HplAtm128GeneralIOPortP((uint8_t)&PORTD, (uint8_t)&DDRD, (uint8_t)&PIND) as PortD
    ;

  PortA0 = PortA.Pin0;
  PortA1 = PortA.Pin1;
  PortA2 = PortA.Pin2;
  PortA3 = PortA.Pin3;
  PortA4 = PortA.Pin4;
  PortA5 = PortA.Pin5;
  PortA6 = PortA.Pin6;
  PortA7 = PortA.Pin7;

  PortB0 = PortB.Pin0;
  PortB1 = PortB.Pin1;
  PortB2 = PortB.Pin2;
  PortB3 = PortB.Pin3;
  PortB4 = PortB.Pin4;
  PortB5 = PortB.Pin5;
  PortB6 = PortB.Pin6;
  PortB7 = PortB.Pin7;

  PortC0 = PortC.Pin0;
  PortC1 = PortC.Pin1;
  PortC2 = PortC.Pin2;
  PortC3 = PortC.Pin3;
  PortC4 = PortC.Pin4;
  PortC5 = PortC.Pin5;
  PortC6 = PortC.Pin6;
  PortC7 = PortC.Pin7;

  PortD0 = PortD.Pin0;
  PortD1 = PortD.Pin1;
  PortD2 = PortD.Pin2;
  PortD3 = PortD.Pin3;
  PortD4 = PortD.Pin4;
  PortD5 = PortD.Pin5;
  PortD6 = PortD.Pin6;
  PortD7 = PortD.Pin7;
}
