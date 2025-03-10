/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OBSTACLE_DISTANCE_3D PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Obstacle located as a 3D vector.
 */
public class msg_obstacle_distance_3d extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D = 11037;
    public static final int MAVLINK_MSG_LENGTH = 28;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     *  X position of the obstacle.
     */
    public float x;
      
    /**
     *  Y position of the obstacle.
     */
    public float y;
      
    /**
     *  Z position of the obstacle.
     */
    public float z;
      
    /**
     * Minimum distance the sensor can measure.
     */
    public float min_distance;
      
    /**
     * Maximum distance the sensor can measure.
     */
    public float max_distance;
      
    /**
     *  Unique ID given to each obstacle so that its movement can be tracked. Use UINT16_MAX if object ID is unknown or cannot be determined.
     */
    public int obstacle_id;
      
    /**
     * Class id of the distance sensor type.
     */
    public short sensor_type;
      
    /**
     * Coordinate frame of reference.
     */
    public short frame;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        packet.payload.putFloat(min_distance);
        packet.payload.putFloat(max_distance);
        packet.payload.putUnsignedShort(obstacle_id);
        packet.payload.putUnsignedByte(sensor_type);
        packet.payload.putUnsignedByte(frame);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a obstacle_distance_3d message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
        this.min_distance = payload.getFloat();
        this.max_distance = payload.getFloat();
        this.obstacle_id = payload.getUnsignedShort();
        this.sensor_type = payload.getUnsignedByte();
        this.frame = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_obstacle_distance_3d() {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_obstacle_distance_3d( long time_boot_ms, float x, float y, float z, float min_distance, float max_distance, int obstacle_id, short sensor_type, short frame) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;

        this.time_boot_ms = time_boot_ms;
        this.x = x;
        this.y = y;
        this.z = z;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.obstacle_id = obstacle_id;
        this.sensor_type = sensor_type;
        this.frame = frame;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_obstacle_distance_3d( long time_boot_ms, float x, float y, float z, float min_distance, float max_distance, int obstacle_id, short sensor_type, short frame, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.x = x;
        this.y = y;
        this.z = z;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.obstacle_id = obstacle_id;
        this.sensor_type = sensor_type;
        this.frame = frame;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_obstacle_distance_3d(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D;
        
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
        return "MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" x:"+x+" y:"+y+" z:"+z+" min_distance:"+min_distance+" max_distance:"+max_distance+" obstacle_id:"+obstacle_id+" sensor_type:"+sensor_type+" frame:"+frame+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OBSTACLE_DISTANCE_3D";
    }
}
        