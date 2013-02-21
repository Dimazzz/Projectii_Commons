package org.projii.serverside.commons.crossServerRequests;

import org.projii.commons.net.InteractionMessage;

public class UpdateMyInfoRequest implements InteractionMessage {
    private final int type = CrossServerRequestsCodes.UPDATE_MY_INFO;
    private final String mapName;
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
