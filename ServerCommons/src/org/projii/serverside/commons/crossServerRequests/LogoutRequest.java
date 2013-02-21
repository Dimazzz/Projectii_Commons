package org.projii.serverside.commons.crossServerRequests;

import org.projii.commons.net.InteractionMessage;

public class LogoutRequest implements InteractionMessage {
    private final int type = CrossServerRequestsCodes.LOGOUT;

    @Override
    public int getType() {
        return type;
    }
}
