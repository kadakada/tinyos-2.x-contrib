/**
 * This file is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This file defines the layout of the 'bigmsg_frame_part' message type.
 */

#ifndef BIGMSG_FRAME_PART_H
#define BIGMSG_FRAME_PART_H
#include <message.h>

enum {
  /** The default size of this message type in bytes. */
  BIGMSG_FRAME_PART_SIZE = 68,

  /** The Active Message type associated with this message. */
  BIGMSG_FRAME_PART_AM_TYPE = 110,

  /* Field part_id: type uint16_t, offset (bits) 0, size (bits) 16 */
  /** Offset (in bytes) of the field 'part_id' */
  BIGMSG_FRAME_PART_PART_ID_OFFSET = 0,
  /** Offset (in bits) of the field 'part_id' */
  BIGMSG_FRAME_PART_PART_ID_OFFSETBITS = 0,
  /** Size (in bytes) of the field 'part_id' */
  BIGMSG_FRAME_PART_PART_ID_SIZE = 2,
  /** Size (in bits) of the field 'part_id' */
  BIGMSG_FRAME_PART_PART_ID_SIZEBITS = 16,

  /* Field node_id: type uint16_t, offset (bits) 16, size (bits) 16 */
  /** Offset (in bytes) of the field 'node_id' */
  BIGMSG_FRAME_PART_NODE_ID_OFFSET = 2,
  /** Offset (in bits) of the field 'node_id' */
  BIGMSG_FRAME_PART_NODE_ID_OFFSETBITS = 16,
  /** Size (in bytes) of the field 'node_id' */
  BIGMSG_FRAME_PART_NODE_ID_SIZE = 2,
  /** Size (in bits) of the field 'node_id' */
  BIGMSG_FRAME_PART_NODE_ID_SIZEBITS = 16,

  /* Field buf: type uint8_t[], element size (bits) 8 */
  /** Elementsize (in bytes) of the field 'buf' */
  BIGMSG_FRAME_PART_BUF_ELEMENTSIZE = 1,
  /** Elementsize (in bits) of the field 'buf' */
  BIGMSG_FRAME_PART_BUF_ELEMENTSIZEBITS = 8,
  /** The number of dimensions in the array 'buf'. */
  BIGMSG_FRAME_PART_BUF_NUMDIMENSIONS = 1,
  /** Number of elements in dimension 1 of array 'buf'. */
  BIGMSG_FRAME_PART_BUF_NUMELEMENTS_1 = 64,
  /** Total number of elements in the array 'buf'. */
  BIGMSG_FRAME_PART_BUF_NUMELEMENTS = 64,
};

/**
 * Return the value of the field 'part_id'
 */
uint16_t bigmsg_frame_part_part_id_get(tmsg_t *msg);

/**
 * Set the value of the field 'part_id'
 */
void bigmsg_frame_part_part_id_set(tmsg_t *msg, uint16_t value);

/**
 * Return the value of the field 'node_id'
 */
uint16_t bigmsg_frame_part_node_id_get(tmsg_t *msg);

/**
 * Set the value of the field 'node_id'
 */
void bigmsg_frame_part_node_id_set(tmsg_t *msg, uint16_t value);

/**
 * Return the byte offset of an element of array 'buf'
 */
size_t bigmsg_frame_part_buf_offset(size_t index1);

/**
 * Return an element of the array 'buf'
 */
uint8_t bigmsg_frame_part_buf_get(tmsg_t *msg, size_t index1);

/**
 * Set an element of the array 'buf'
 */
void bigmsg_frame_part_buf_set(tmsg_t *msg, size_t index1, uint8_t value);

/**
 * Return the bit offset of an element of array 'buf'
 */
size_t bigmsg_frame_part_buf_offsetbits(size_t index1);

#endif