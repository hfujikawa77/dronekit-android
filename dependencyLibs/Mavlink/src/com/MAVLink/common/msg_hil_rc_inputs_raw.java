/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_RC_INPUTS_RAW PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Sent from simulation to autopilot. The RAW values of the RC channels received. The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%. Individual receivers/transmitters might violate this specification.
 */
public class msg_hil_rc_inputs_raw extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW = 92;
    public static final int MAVLINK_MSG_LENGTH = 33;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * RC channel 1 value
     */
    public int chan1_raw;
      
    /**
     * RC channel 2 value
     */
    public int chan2_raw;
      
    /**
     * RC channel 3 value
     */
    public int chan3_raw;
      
    /**
     * RC channel 4 value
     */
    public int chan4_raw;
      
    /**
     * RC channel 5 value
     */
    public int chan5_raw;
      
    /**
     * RC channel 6 value
     */
    public int chan6_raw;
      
    /**
     * RC channel 7 value
     */
    public int chan7_raw;
      
    /**
     * RC channel 8 value
     */
    public int chan8_raw;
      
    /**
     * RC channel 9 value
     */
    public int chan9_raw;
      
    /**
     * RC channel 10 value
     */
    public int chan10_raw;
      
    /**
     * RC channel 11 value
     */
    public int chan11_raw;
      
    /**
     * RC channel 12 value
     */
    public int chan12_raw;
      
    /**
     * Receive signal strength indicator in device-dependent units/scale. Values: [0-254], 255: invalid/unknown.
     */
    public short rssi;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedShort(chan1_raw);
        packet.payload.putUnsignedShort(chan2_raw);
        packet.payload.putUnsignedShort(chan3_raw);
        packet.payload.putUnsignedShort(chan4_raw);
        packet.payload.putUnsignedShort(chan5_raw);
        packet.payload.putUnsignedShort(chan6_raw);
        packet.payload.putUnsignedShort(chan7_raw);
        packet.payload.putUnsignedShort(chan8_raw);
        packet.payload.putUnsignedShort(chan9_raw);
        packet.payload.putUnsignedShort(chan10_raw);
        packet.payload.putUnsignedShort(chan11_raw);
        packet.payload.putUnsignedShort(chan12_raw);
        packet.payload.putUnsignedByte(rssi);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_rc_inputs_raw message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.chan1_raw = payload.getUnsignedShort();
        this.chan2_raw = payload.getUnsignedShort();
        this.chan3_raw = payload.getUnsignedShort();
        this.chan4_raw = payload.getUnsignedShort();
        this.chan5_raw = payload.getUnsignedShort();
        this.chan6_raw = payload.getUnsignedShort();
        this.chan7_raw = payload.getUnsignedShort();
        this.chan8_raw = payload.getUnsignedShort();
        this.chan9_raw = payload.getUnsignedShort();
        this.chan10_raw = payload.getUnsignedShort();
        this.chan11_raw = payload.getUnsignedShort();
        this.chan12_raw = payload.getUnsignedShort();
        this.rssi = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_rc_inputs_raw() {
        this.msgid = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_rc_inputs_raw( long time_usec, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, short rssi) {
        this.msgid = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;

        this.time_usec = time_usec;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.rssi = rssi;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_rc_inputs_raw( long time_usec, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, short rssi, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.rssi = rssi;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_rc_inputs_raw(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" chan1_raw:"+chan1_raw+" chan2_raw:"+chan2_raw+" chan3_raw:"+chan3_raw+" chan4_raw:"+chan4_raw+" chan5_raw:"+chan5_raw+" chan6_raw:"+chan6_raw+" chan7_raw:"+chan7_raw+" chan8_raw:"+chan8_raw+" chan9_raw:"+chan9_raw+" chan10_raw:"+chan10_raw+" chan11_raw:"+chan11_raw+" chan12_raw:"+chan12_raw+" rssi:"+rssi+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW";
    }
}
        