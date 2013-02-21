package org.projii.serverside.commons.crossServerRequests;

import org.projii.commons.net.InteractionMessage;

public class ClientConfirmationRequest implements InteractionMessage {
    private final int type = CrossServerRequestsCodes.CLIENT_CONFIRMATION;
    private final int sessionId;

    public ClientConfirmationRequest(int sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int getType() {
        return type;
    }
}
