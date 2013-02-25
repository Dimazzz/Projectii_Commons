package org.projii.serverside.commons.crossServerRequests;

import org.jai.BSON.BSONSerializable;
import org.projii.commons.net.InteractionMessage;

public class UpdateMyInfoRequest implements InteractionMessage {
    @BSONSerializable
    private final int type = CrossServerRequestsCodes.UPDATE_MY_INFO;
    @BSONSerializable
    private final String mapName;
    @BSONSerializable
    private final int maxNumberOfPlayers;


    public UpdateMyInfoRequest(String mapName, int maxNumberOfPlayers) {
        this.mapName = mapName;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
    }

    @Override
    public int getType() {
        return type;
    }
}
