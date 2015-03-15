package org.apollo.game.message.impl;

import org.apollo.game.message.Message;
import org.apollo.game.model.entity.GameObject;

/**
 * A {@link Message} sent to the client to spawn an object.
 * 
 * @author Major
 */
public final class SendObjectMessage extends Message {

	/**
	 * The id of the object.
	 */
	private final int id;

	/**
	 * The orientation of the object.
	 */
	private final int orientation;

	/**
	 * The position of the object.
	 */
	private final int positionOffset;

	/**
	 * The type of the object.
	 */
	private final int type;

	/**
	 * Creates the SendObjectMessage.
	 * 
	 * @param object The {@link GameObject} to send.
	 */
	public SendObjectMessage(GameObject object) {
		this(object, 0);
	}

	/**
	 * Creates the SendObjectMessage.
	 * 
	 * @param object The {@link GameObject} to send.
	 * @param positionOffset The offset of the object's position from the region's central position.
	 */
	public SendObjectMessage(GameObject object, int positionOffset) {
		this.id = object.getId();
		this.positionOffset = positionOffset;
		this.type = object.getType();
		this.orientation = object.getOrientation();
	}

	/**
	 * Gets the id of the object.
	 *
	 * @return The id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the orientation of the object.
	 * 
	 * @return The orientation.
	 */
	public int getOrientation() {
		return orientation;
	}

	/**
	 * Gets the position offset of the object.
	 *
	 * @return The position offset.
	 */
	public int getPositionOffset() {
		return positionOffset;
	}

	/**
	 * Gets the orientation of the object.
	 * 
	 * @return The type.
	 */
	public int getType() {
		return type;
	}

}