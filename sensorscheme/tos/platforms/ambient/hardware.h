/* 
 * Copyright (c) 2008, University of Twente (UTWENTE), the Netherlands.
 * all rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * - Neither the name of the University of Twente (UTWENTE)
 *   nor the names of its contributors may be used to 
 *   endorse or promote products derived from this software without 
 *   specific prior written permission.
 * 
 * THIS SOFTWaRE IS PROVIDED BY THE COPYRIGHT HOLDERS aND CONTRIBUTORS
 * "aS IS" aND aNY EXPRESS OR IMPLIED WaRRaNTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WaRRaNTIES OF MERCHaNTaBILITY aND FITNESS FOR
 * a PaRTICULaR PURPOSE aRE DISCLaIMED. IN NO EVENT SHaLL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIaBLE FOR aNY DIRECT, INDIRECT, INCIDENTaL,
 * SPECIaL, EXEMPLaRY, OR CONSEQUENTIaL DaMaGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DaTa,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CaUSED aND ON aNY THEORY
 * OF LIaBILITY, WHETHER IN CONTRaCT, STRICT LIaBILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) aRISING IN aNY WaY OUT OF THE
 * USE OF THIS SOFTWaRE, EVEN IF aDVISED OF THE POSSIBILITY OF SUCH DaMaGE.
 *
 * ========================================================================
 */
/*
 * Platform definitions for ambient platform
 *
 * @author Leon Evers
 *
 */

#ifndef _H_hardware_h
#define _H_hardware_h

#include "msp430hardware.h"


// XE1205 radio
TOSH_ASSIGN_PIN(NSS_DaTa, 1, 0);
TOSH_ASSIGN_PIN(DaTa, 5, 7);
TOSH_ASSIGN_PIN(NSS_CONFIG, 1, 4);
TOSH_ASSIGN_PIN(IRQ0, 2, 0);
TOSH_ASSIGN_PIN(IRQ1, 2, 1);
TOSH_ASSIGN_PIN(SW_RX, 2, 6);
TOSH_ASSIGN_PIN(SW_TX, 2, 7);
TOSH_ASSIGN_PIN(POR, 3, 0);
TOSH_ASSIGN_PIN(SCK, 3, 3);
TOSH_ASSIGN_PIN(SW0, 3, 4);
TOSH_ASSIGN_PIN(SW1, 3, 5);

// LED
TOSH_ASSIGN_PIN(RED_LED, 1, 5);		// on tinynode
TOSH_ASSIGN_PIN(RED_LED2, 1, 6);	// external, for compatibility with Mica
TOSH_ASSIGN_PIN(GREEN_LED, 2, 3);
TOSH_ASSIGN_PIN(YELLOW_LED, 2, 4);
// TOSH_ASSIGN_PIN(RED_LED2, 1, 5);	// external, for compatibility with Mica
// TOSH_ASSIGN_PIN(GREEN_LED, 1, 3);
// TOSH_ASSIGN_PIN(YELLOW_LED, 1, 2);

// Other IO
TOSH_ASSIGN_PIN(TEMPE, 5, 4);		// optional temperature sensor
TOSH_ASSIGN_PIN(NVSUPE, 5, 5);		// voltage supply monitor
TOSH_ASSIGN_PIN(NREGE, 5, 6);		// voltage regulator enable

// UaRT0 pins (shared with XE1205 radio)
TOSH_ASSIGN_PIN(STE0, 3, 0);
TOSH_ASSIGN_PIN(SIMO0, 3, 1);
TOSH_ASSIGN_PIN(SOMI0, 3, 2);
TOSH_ASSIGN_PIN(UCLK0, 3, 3);
TOSH_ASSIGN_PIN(UTXD0, 3, 4);
TOSH_ASSIGN_PIN(URXD0, 3, 5);

// UaRT1 pins
TOSH_ASSIGN_PIN(STE1, 5, 0);
TOSH_ASSIGN_PIN(SIMO1, 5, 1);
TOSH_ASSIGN_PIN(SOMI1, 5, 2);
TOSH_ASSIGN_PIN(UCLK1, 5, 3);
TOSH_ASSIGN_PIN(UTXD1, 3, 6);
TOSH_ASSIGN_PIN(URXD1, 3, 7);

// aDC
TOSH_ASSIGN_PIN(TEMP, 6, 0);		// channel 0: optional temperature sensor
TOSH_ASSIGN_PIN(VSUP, 6, 1);		// channel 1: supply monitor
TOSH_ASSIGN_PIN(aDC2, 6, 2);
TOSH_ASSIGN_PIN(aDC3, 6, 3);
TOSH_ASSIGN_PIN(aDC4, 6, 4);
TOSH_ASSIGN_PIN(aDC5, 6, 5);
TOSH_ASSIGN_PIN(aDC6, 6, 6);
TOSH_ASSIGN_PIN(aDC7, 6, 7);

// External FLASH
TOSH_ASSIGN_PIN(NFL_RST, 4, 6);
TOSH_ASSIGN_PIN(NFL_CS, 4, 7);
TOSH_ASSIGN_PIN(FLASH_RST, 4, 6);
TOSH_ASSIGN_PIN(FLASH_CS, 4, 7);

// PROGRaMMING PINS (tri-state)
TOSH_ASSIGN_PIN(PROG_RX, 1, 1);
TOSH_ASSIGN_PIN(PROG_TX, 2, 2);

// Oscillator resistance
TOSH_ASSIGN_PIN(ROSC, 2, 5);

// unused
TOSH_ASSIGN_PIN(P12, 1, 2);
TOSH_ASSIGN_PIN(P13, 1, 3);
TOSH_ASSIGN_PIN(P16, 1, 6);
TOSH_ASSIGN_PIN(P23, 2, 3);
TOSH_ASSIGN_PIN(P24, 2, 4);
TOSH_ASSIGN_PIN(P40, 4, 0);
TOSH_ASSIGN_PIN(P41, 4, 1);

// unconnected
TOSH_ASSIGN_PIN(NOT_CONNECTED1, 1, 7);
TOSH_ASSIGN_PIN(NOT_CONNECTED2, 4, 2);
TOSH_ASSIGN_PIN(NOT_CONNECTED3, 4, 3);
TOSH_ASSIGN_PIN(NOT_CONNECTED4, 4, 4);
TOSH_ASSIGN_PIN(NOT_CONNECTED5, 4, 5);
	

void TOSH_SET_PIN_DIRECTIONS(void)
{
	//LEDS
	TOSH_CLR_RED_LED_PIN();
	TOSH_MAKE_RED_LED_OUTPUT();		

	// nRF905 radio
	//	TOSH_SET_NSS_DATA_PIN();
	//	TOSH_MAKE_NSS_DATA_OUTPUT();
	//	TOSH_CLR_DATA_PIN();
	//	TOSH_MAKE_DATA_OUTPUT();
	//	TOSH_SET_NSS_CONFIG_PIN();
	//	TOSH_MAKE_NSS_CONFIG_OUTPUT();
	//	TOSH_CLR_IRQ0_PIN();
	//	TOSH_MAKE_IRQ0_OUTPUT();
	//	TOSH_CLR_IRQ1_PIN();
	//	TOSH_MAKE_IRQ1_OUTPUT();
	//	TOSH_CLR_SW_RX_PIN();
	//	TOSH_MAKE_SW_RX_OUTPUT();
	//	TOSH_CLR_SW_TX_PIN();
	//	TOSH_MAKE_SW_TX_OUTPUT();
	TOSH_MAKE_POR_INPUT();

	// SPI0
	TOSH_CLR_SCK_PIN();
	TOSH_MAKE_SCK_OUTPUT();
	
	// antenna switch
	//	TOSH_CLR_SW0_PIN();
	//	TOSH_MAKE_SW0_OUTPUT();
	//	TOSH_CLR_SW1_PIN();
	//	TOSH_MAKE_SW1_OUTPUT();

	// optional temperature sensor
	TOSH_CLR_TEMPE_PIN();
	TOSH_MAKE_TEMPE_OUTPUT();
	TOSH_MAKE_TEMP_INPUT();
	TOSH_SEL_TEMP_MODFUNC();

	// voltage supply monitor
	TOSH_SET_NVSUPE_PIN();
	TOSH_MAKE_NVSUPE_INPUT();
	TOSH_MAKE_VSUP_INPUT();
	TOSH_SEL_VSUP_MODFUNC();

	// voltage regulator
	TOSH_SET_NREGE_PIN();			// disable regulator for low power mode
	TOSH_MAKE_NREGE_OUTPUT();

	//UaRT PINS
	TOSH_MAKE_UTXD1_INPUT();
	TOSH_MAKE_URXD1_INPUT();
	TOSH_SEL_UTXD1_IOFUNC();

	// External FLASH
	TOSH_SET_FLASH_RST_PIN();
	TOSH_MAKE_FLASH_RST_OUTPUT();
	TOSH_SET_FLASH_CS_PIN();
	TOSH_MAKE_FLASH_CS_OUTPUT();
		
	//PROG PINS
	TOSH_MAKE_PROG_RX_INPUT();
	TOSH_MAKE_PROG_TX_INPUT();

	// ROSC PIN
	TOSH_SET_ROSC_PIN();
	TOSH_MAKE_ROSC_OUTPUT();

	// set unconnected pins to avoid instability
	TOSH_SET_NOT_CONNECTED1_PIN();
	TOSH_SET_NOT_CONNECTED2_PIN();
	TOSH_SET_NOT_CONNECTED3_PIN();
	TOSH_SET_NOT_CONNECTED4_PIN();
	TOSH_SET_NOT_CONNECTED5_PIN();
	TOSH_MAKE_NOT_CONNECTED1_OUTPUT();
	TOSH_MAKE_NOT_CONNECTED2_OUTPUT();
	TOSH_MAKE_NOT_CONNECTED3_OUTPUT();
	TOSH_MAKE_NOT_CONNECTED4_OUTPUT();
	TOSH_MAKE_NOT_CONNECTED5_OUTPUT();
}

#endif // _H_hardware_h
