package org.projii.serverside.commons.crossServerRequests;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class AuthorizationRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerRequestsCodes.AUTHORIZATION;
    @BSONSerializable
    private final int serverId;
    @BSONSerializable
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
