package org.projii.serverside.commons.crossServerRequests;

import org.projii.commons.net.InteractionMessage;

public class ClientLeftRequest implements InteractionMessage {
    private final int type = CrossServerRequestsCodes.CLIENT_LEFT;
    private final int sessionId;

    public ClientLeftRequest(int sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int getType() {
        return type;
    }
}
