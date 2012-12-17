package org.projii.commons.spaceship.equipment;

public class EnergyShield {

    private final EnergyShieldModel model;
    private int currentEnergyLevel;

    public EnergyShield(EnergyShieldModel model, int currentEnergyLevel) {
        this.model = model;
        this.currentEnergyLevel = currentEnergyLevel;
    }

    public EnergyShield(EnergyShieldModel model) {
        this.model = model;
        this.currentEnergyLevel = model.maxEnergyLevel;
    }

    //return how much damage you'll get
    public int protect(int damage) {
        int energyLevelAfterDamage = currentEnergyLevel - damage;
        currentEnergyLevel = energyLevelAfterDamage > 0 ? damage : 0;
        return energyLevelAfterDamage > 0 ? 0 : Math.abs(energyLevelAfterDamage);
    }


    public EnergyShieldModel getModel() {
        return model;
    }

    public int getCurrentEnergyLevel() {
        return currentEnergyLevel;
    }

    public void regenerate() {
        if (currentEnergyLevel < model.maxEnergyLevel) {

            currentEnergyLevel =
                    currentEnergyLevel + model.regenerationSpeed > model.maxEnergyLevel ?
                            model.maxEnergyLevel :
                            currentEnergyLevel + model.regenerationSpeed;
        }
    }


}
