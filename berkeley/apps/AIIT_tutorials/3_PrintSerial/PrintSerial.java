/*									tab:4
 * "Copyright (c) 2005 The Regents of the University  of California.  
 * All rights reserved.
 *
 * Permission to use, copy, modify, and distribute this software and
 * its documentation for any purpose, without fee, and without written
 * agreement is hereby granted, provided that the above copyright
 * notice, the following two paragraphs and the author appear in all
 * copies of this software.
 * 
 * IN NO EVENT SHALL THE UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY
 * PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL
 * DAMAGES ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS
 * DOCUMENTATION, EVEN IF THE UNIVERSITY OF CALIFORNIA HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE.  THE SOFTWARE PROVIDED HEREUNDER IS
 * ON AN "AS IS" BASIS, AND THE UNIVERSITY OF CALIFORNIA HAS NO OBLIGATION TO
 * PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS."
 *
 */

/**
 * Java-side application for testing serial port communication.
 * 
 *
 * @author Phil Levis <pal@cs.berkeley.edu>
 * @date August 12 2005
 */

import java.io.IOException;

import net.tinyos.message.*;
import net.tinyos.packet.*;
import net.tinyos.util.*;

public class PrintSerial implements MessageListener {

  private MoteIF moteIF;
  
  public PrintSerial(MoteIF moteIF) {
    this.moteIF = moteIF;
    this.moteIF.registerListener(new PrintSerialMsg(), this);
  }

  //public void sendPackets() {
  //  int counter = 0;
  //  PrintSerialMsg payload = new PrintSerialMsg();
  //  
  //  try {
  //    while (true) {
	//System.out.println("Sending packet " + counter);
	//payload.set_counter(counter);
	//moteIF.send(0, payload);
	//counter++;
	//try {Thread.sleep(1000);}
	//catch (InterruptedException exception) {}
  //    }
  //  }
  //  catch (IOException exception) {
  //    System.err.println("Exception thrown when sending packets. Exiting.");
  //    System.err.println(exception);
  //  }
  //}

  public void messageReceived(int to, Message message) {
    PrintSerialMsg msg = (PrintSerialMsg)message;
    System.out.print("Received packet: ");
    for (int i = 0; i < msg.DEFAULT_MESSAGE_SIZE; i++) {
      char character = (char) msg.getElement_buffer(i);
      if (character == 0) {
        break;
      }
      System.out.print(character);
    }
    System.out.print("\n");
  }
  
  private static void usage() {
    System.err.println("usage: PrintSerial [-comm <source>]");
  }
  
  public static void main(String[] args) throws Exception {
    String source = null;
    if (args.length == 2) {
      if (!args[0].equals("-comm")) {
	usage();
	System.exit(1);
      }
      source = args[1];
    }
    else if (args.length != 0) {
      usage();
      System.exit(1);
    }
    
    PhoenixSource phoenix;
    
    if (source == null) {
      phoenix = BuildSource.makePhoenix(PrintStreamMessenger.err);
    }
    else {
      phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
    }

    MoteIF mif = new MoteIF(phoenix);
    PrintSerial serial = new PrintSerial(mif);
    //serial.sendPackets();
  }


}