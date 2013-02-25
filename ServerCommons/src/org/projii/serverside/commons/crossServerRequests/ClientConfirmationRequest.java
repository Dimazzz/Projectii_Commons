package org.projii.serverside.commons.crossServerRequests;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class ClientConfirmationRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerRequestsCodes.CLIENT_CONFIRMATION;
    @BSONSerializable
    private final int sessionId;

    public ClientConfirmationRequest(int sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int getType() {
        return type;
    }
}
