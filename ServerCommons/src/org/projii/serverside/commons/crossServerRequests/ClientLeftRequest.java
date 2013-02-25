package org.projii.serverside.commons.crossServerRequests;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class ClientLeftRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerRequestsCodes.CLIENT_LEFT;
    @BSONSerializable
    private final int sessionId;

    public ClientLeftRequest(int sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int getType() {
        return type;
    }
}
