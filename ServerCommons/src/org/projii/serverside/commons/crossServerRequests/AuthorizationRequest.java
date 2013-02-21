package org.projii.serverside.commons.crossServerRequests;

import org.projii.commons.net.InteractionMessage;

public class AuthorizationRequest implements InteractionMessage {
    private final int type = CrossServerRequestsCodes.AUTHORIZATION;
    private final int serverId;
    private final String password;

    public AuthorizationRequest(int serverId, String password) {
        this.serverId = serverId;
        this.password = password;
    }

    @Override
    public int getType() {
        return type;
    }
}
