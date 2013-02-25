package org.projii.serverside.commons.crossServerResponses;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class AuthorizationResultResponse implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerResponsesCodes.AUTHORIZATION_RESULT;
    @BSONSerializable
    private final boolean result;

    public AuthorizationResultResponse(boolean result) {
        this.result = result;
    }

    @Override
    public int getType() {
        return type;
    }
}
