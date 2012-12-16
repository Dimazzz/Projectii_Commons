package org.projii.commons.spaceship.equipment;

public class EnergyGenerator {

    private EnergyGeneratorModel model;
    private int currentEnergyLevel;

    public EnergyGenerator(EnergyGeneratorModel model, int currentEnergyLevel) {
        this.model = model;
        this.currentEnergyLevel = currentEnergyLevel;
    }

    public EnergyGenerator(EnergyGeneratorModel model) {
        this.model = model;
        this.currentEnergyLevel = model.maxEnergyLevel;
    }

    public EnergyGeneratorModel getModel() {
        return model;
    }

    public int getCurrentEnergyLevel() {
        return currentEnergyLevel;
    }

    public void useEnergy(int use) {
        currentEnergyLevel = currentEnergyLevel - use;
    }

    public void regenerate() {
        currentEnergyLevel = currentEnergyLevel + model.regenerationSpeed;
    }
}
