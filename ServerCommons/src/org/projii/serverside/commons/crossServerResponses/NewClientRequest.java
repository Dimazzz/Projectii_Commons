package org.projii.serverside.commons.crossServerResponses;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;
import org.projii.commons.spaceship.Spaceship;

public class NewClientRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerResponsesCodes.NEW_CLIENT;
    @BSONSerializable
    private final int sessionId;
    @BSONSerializable
    private final Spaceship spaceship;

    public NewClientRequest(int sessionId, Spaceship spaceship) {
        this.sessionId = sessionId;
        this.spaceship = spaceship;
    }


    @Override
    public int getType() {
        return type;
    }

    public int getSessionId() {
        return sessionId;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }
}
