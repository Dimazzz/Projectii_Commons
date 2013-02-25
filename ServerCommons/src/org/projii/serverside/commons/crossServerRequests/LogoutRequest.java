package org.projii.serverside.commons.crossServerRequests;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class LogoutRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerRequestsCodes.LOGOUT;

    @Override
    public int getType() {
        return type;
    }
}
