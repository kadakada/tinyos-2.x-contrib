/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'TUnitProcessingMsg'
 * message type.
 */

package com.rincon.tunit.link;
/*
 * Copyright (c) 2005-2006 Rincon Research Corporation
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
 * - Neither the name of the Rincon Research Corporation nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE
 * RINCON RESEARCH OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE
 */

public class TUnitProcessingMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 28;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 255;

    /** Create a new TUnitProcessingMsg of size 28. */
    public TUnitProcessingMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new TUnitProcessingMsg of the given data_length. */
    public TUnitProcessingMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg with the given data_length
     * and base offset.
     */
    public TUnitProcessingMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg using the given byte array
     * as backing store.
     */
    public TUnitProcessingMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public TUnitProcessingMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public TUnitProcessingMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg embedded in the given message
     * at the given base offset.
     */
    public TUnitProcessingMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TUnitProcessingMsg embedded in the given message
     * at the given base offset and length.
     */
    public TUnitProcessingMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <TUnitProcessingMsg> \n";
      try {
        s += "  [cmd=0x"+Long.toHexString(get_cmd())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [expected=0x"+Long.toHexString(get_expected())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [actual=0x"+Long.toHexString(get_actual())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lastMsg=0x"+Long.toHexString(get_lastMsg())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [failMsgLength=0x"+Long.toHexString(get_failMsgLength())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [failMsg=";
        for (int i = 0; i < 16; i++) {
          s += "0x"+Long.toHexString(getElement_failMsg(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: cmd
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'cmd' is signed (false).
     */
    public static boolean isSigned_cmd() {
        return false;
    }

    /**
     * Return whether the field 'cmd' is an array (false).
     */
    public static boolean isArray_cmd() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'cmd'
     */
    public static int offset_cmd() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'cmd'
     */
    public static int offsetBits_cmd() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'cmd'
     */
    public short get_cmd() {
        return (short)getUIntBEElement(offsetBits_cmd(), 8);
    }

    /**
     * Set the value of the field 'cmd'
     */
    public void set_cmd(short value) {
        setUIntBEElement(offsetBits_cmd(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'cmd'
     */
    public static int size_cmd() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'cmd'
     */
    public static int sizeBits_cmd() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'id'
     */
    public short get_id() {
        return (short)getUIntBEElement(offsetBits_id(), 8);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(short value) {
        setUIntBEElement(offsetBits_id(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: expected
    //   Field type: long, unsigned
    //   Offset (bits): 16
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'expected' is signed (false).
     */
    public static boolean isSigned_expected() {
        return false;
    }

    /**
     * Return whether the field 'expected' is an array (false).
     */
    public static boolean isArray_expected() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'expected'
     */
    public static int offset_expected() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'expected'
     */
    public static int offsetBits_expected() {
        return 16;
    }

    /**
     * Return the value (as a long) of the field 'expected'
     */
    public long get_expected() {
        return (long)getUIntBEElement(offsetBits_expected(), 32);
    }

    /**
     * Set the value of the field 'expected'
     */
    public void set_expected(long value) {
        setUIntBEElement(offsetBits_expected(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'expected'
     */
    public static int size_expected() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'expected'
     */
    public static int sizeBits_expected() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: actual
    //   Field type: long, unsigned
    //   Offset (bits): 48
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'actual' is signed (false).
     */
    public static boolean isSigned_actual() {
        return false;
    }

    /**
     * Return whether the field 'actual' is an array (false).
     */
    public static boolean isArray_actual() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'actual'
     */
    public static int offset_actual() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'actual'
     */
    public static int offsetBits_actual() {
        return 48;
    }

    /**
     * Return the value (as a long) of the field 'actual'
     */
    public long get_actual() {
        return (long)getUIntBEElement(offsetBits_actual(), 32);
    }

    /**
     * Set the value of the field 'actual'
     */
    public void set_actual(long value) {
        setUIntBEElement(offsetBits_actual(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'actual'
     */
    public static int size_actual() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'actual'
     */
    public static int sizeBits_actual() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lastMsg
    //   Field type: byte, unsigned
    //   Offset (bits): 80
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lastMsg' is signed (false).
     */
    public static boolean isSigned_lastMsg() {
        return false;
    }

    /**
     * Return whether the field 'lastMsg' is an array (false).
     */
    public static boolean isArray_lastMsg() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lastMsg'
     */
    public static int offset_lastMsg() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lastMsg'
     */
    public static int offsetBits_lastMsg() {
        return 80;
    }

    /**
     * Return the value (as a byte) of the field 'lastMsg'
     */
    public byte get_lastMsg() {
        return (byte)getSIntBEElement(offsetBits_lastMsg(), 8);
    }

    /**
     * Set the value of the field 'lastMsg'
     */
    public void set_lastMsg(byte value) {
        setSIntBEElement(offsetBits_lastMsg(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'lastMsg'
     */
    public static int size_lastMsg() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lastMsg'
     */
    public static int sizeBits_lastMsg() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: failMsgLength
    //   Field type: short, unsigned
    //   Offset (bits): 88
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'failMsgLength' is signed (false).
     */
    public static boolean isSigned_failMsgLength() {
        return false;
    }

    /**
     * Return whether the field 'failMsgLength' is an array (false).
     */
    public static boolean isArray_failMsgLength() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'failMsgLength'
     */
    public static int offset_failMsgLength() {
        return (88 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'failMsgLength'
     */
    public static int offsetBits_failMsgLength() {
        return 88;
    }

    /**
     * Return the value (as a short) of the field 'failMsgLength'
     */
    public short get_failMsgLength() {
        return (short)getUIntBEElement(offsetBits_failMsgLength(), 8);
    }

    /**
     * Set the value of the field 'failMsgLength'
     */
    public void set_failMsgLength(short value) {
        setUIntBEElement(offsetBits_failMsgLength(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'failMsgLength'
     */
    public static int size_failMsgLength() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'failMsgLength'
     */
    public static int sizeBits_failMsgLength() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: failMsg
    //   Field type: short[], unsigned
    //   Offset (bits): 96
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'failMsg' is signed (false).
     */
    public static boolean isSigned_failMsg() {
        return false;
    }

    /**
     * Return whether the field 'failMsg' is an array (true).
     */
    public static boolean isArray_failMsg() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'failMsg'
     */
    public static int offset_failMsg(int index1) {
        int offset = 96;
        if (index1 < 0 || index1 >= 16) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'failMsg'
     */
    public static int offsetBits_failMsg(int index1) {
        int offset = 96;
        if (index1 < 0 || index1 >= 16) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'failMsg' as a short[]
     */
    public short[] get_failMsg() {
        short[] tmp = new short[16];
        for (int index0 = 0; index0 < numElements_failMsg(0); index0++) {
            tmp[index0] = getElement_failMsg(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'failMsg' from the given short[]
     */
    public void set_failMsg(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_failMsg(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'failMsg'
     */
    public short getElement_failMsg(int index1) {
        return (short)getUIntBEElement(offsetBits_failMsg(index1), 8);
    }

    /**
     * Set an element of the array 'failMsg'
     */
    public void setElement_failMsg(int index1, short value) {
        setUIntBEElement(offsetBits_failMsg(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'failMsg'
     */
    public static int totalSize_failMsg() {
        return (128 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'failMsg'
     */
    public static int totalSizeBits_failMsg() {
        return 128;
    }

    /**
     * Return the size, in bytes, of each element of the array 'failMsg'
     */
    public static int elementSize_failMsg() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'failMsg'
     */
    public static int elementSizeBits_failMsg() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'failMsg'
     */
    public static int numDimensions_failMsg() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'failMsg'
     */
    public static int numElements_failMsg() {
        return 16;
    }

    /**
     * Return the number of elements in the array 'failMsg'
     * for the given dimension.
     */
    public static int numElements_failMsg(int dimension) {
      int array_dims[] = { 16,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'failMsg' with a String
     */
    public void setString_failMsg(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_failMsg(i, (short)s.charAt(i));
         }
         setElement_failMsg(i, (short)0); //null terminate
    }

    /**
     * Read the array 'failMsg' as a String
     */
    public String getString_failMsg() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,16)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_failMsg(i) == (char)0) break;
             carr[i] = (char)getElement_failMsg(i);
         }
         return new String(carr,0,i);
    }

}