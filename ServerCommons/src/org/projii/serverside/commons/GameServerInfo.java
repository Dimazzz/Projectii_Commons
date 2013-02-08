package org.projii.serverside.commons;

import org.jai.BSON.BSONSerializable;import java.lang.String;

public class GameServerInfo {

    @BSONSerializable
    private int maxNumberOfPlayers;

    @BSONSerializable
    private String currentGameMap;

    public GameServerInfo(int maxNumberOfPlayers, String currentGameMap) {
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.currentGameMap = currentGameMap;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    public String getCurrentGameMap() {
        return currentGameMap;
    }
}
