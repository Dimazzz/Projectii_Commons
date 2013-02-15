package org.projii.commons.spaceship.equipment;

import org.jai.BSON.BSONSerializable;

public class EnergyShieldModel {
    @BSONSerializable
    public final int id;
    @BSONSerializable
    public final String name;
    @BSONSerializable
    public final int maxEnergyLevel;
    @BSONSerializable
    public final int regenerationSpeed;
    @BSONSerializable
    public final int regenerationDelay;

    public EnergyShieldModel(int id, String name, int maxEnergyLevel, int regenerationSpeed, int regenerationDelay) {
        this.id = id;
        this.name = name;
        this.maxEnergyLevel = maxEnergyLevel;
        this.regenerationSpeed = regenerationSpeed;
        this.regenerationDelay = regenerationDelay;
    }
}
