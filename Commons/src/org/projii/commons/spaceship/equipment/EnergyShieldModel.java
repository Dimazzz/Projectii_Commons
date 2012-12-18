package org.projii.commons.spaceship.equipment;

public class EnergyShieldModel {
    public final int id;
    public final String name;
    public final int maxEnergyLevel;
    public final int regenerationSpeed;
    public final int regenerationDelay;

    public EnergyShieldModel(int id, String name, int maxEnergyLevel, int regenerationSpeed, int regenerationDelay) {
        this.id = id;
        this.name = name;
        this.maxEnergyLevel = maxEnergyLevel;
        this.regenerationSpeed = regenerationSpeed;
        this.regenerationDelay = regenerationDelay;
    }
}
