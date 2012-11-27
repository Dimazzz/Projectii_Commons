package org.projii.commons.spaceship;

import org.projii.commons.space.Map;
import org.projii.commons.space.Point;
import org.projii.commons.space.RealworldObject;
import org.projii.commons.spaceship.equipment.EnergyGenerator;
import org.projii.commons.spaceship.equipment.EnergyShield;
import org.projii.commons.spaceship.equipment.SpaceshipEngine;
import org.projii.commons.spaceship.weapon.Weapon;

public class Spaceship {

	private SpaceshipModel model;
    private int presentHealth;
    private int speed;
    private Weapon[] weapons;
    private EnergyGenerator generator;
    private SpaceshipEngine engine;
    private EnergyShield energyShield;

	public Spaceship(SpaceshipModel model, EnergyGenerator generator, SpaceshipEngine engine, EnergyShield energyShield, Weapon[] weapons) {
        this.model = model;
		this.generator = generator;
        this.engine = engine;
        this.energyShield = energyShield;
        this.weapons = weapons;
        this.presentHealth = model.getHealth();
    }
    public SpaceshipModel getSpaceshipModel() {
        return model;
    }
    
    public int getPresentHealth() {
        return presentHealth;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public EnergyGenerator getGenerator() {
        return generator;
    }

    public SpaceshipEngine getEngine() {
        return engine;
    }

    public EnergyShield getEnergyShield() {
        return energyShield;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }
  
    public void fire(Map map) {
        for (int i = 0; i <= model.getWeaponAmount() - 1; i++) {
            if (generator.getPresentCount() >= weapons[i].getBullet().getConsumeEnergy()) {
                map.addBulletInList(weapons[i].fire(model.getLocation(), model.getRotation()));
                generator.useEnergy(weapons[i].getBullet().getConsumeEnergy());
            }
        }
    }

    public void move(Point p, int rotation) {
        model.setLocation(p);
        model.setRotation(rotation);
    }

    public void demage(int damage) {
        if (energyShield.getPresentCount() > 0) {
            energyShield.Damages(damage);
        } else {
        	int attack = damage - model.getArmor();
        	if (presentHealth < attack){
        		presentHealth = 0;
        	} else {
        		presentHealth -= attack;
        	}
        }
        energyShield.CreateDowload();
    }
   
    public void forTimer() {
        energyShield.Regeneration();
        generator.regenerate();
        for (int i = 0; i <= model.getWeaponAmount() - 1; i++) {
            weapons[i].Download();
        }
    }

    public Boolean equals(Spaceship ship) {
        Boolean result = true;
        if (model.equals(ship.model) == false)
        	return false;
        if (this.generator.getId() != ship.getGenerator().getId())
            return false;
        if (this.generator.getCount() != ship.getGenerator().getCount())
            return false;
        if (this.generator.getRegeneration() != ship.getGenerator().getRegeneration())
            return false;
        if (this.engine.getId() != ship.getEngine().getId())
            return false;
        if (this.engine.getMaxSpeed() != ship.getEngine().getMaxSpeed())
            return false;
        if (this.engine.getSpeedUp() != ship.getEngine().getSpeedUp())
            return false;
        if (this.engine.getHandleability() != ship.getEngine().getHandleability())
            return false;
        if (this.energyShield.getId() != ship.getEnergyShield().getId())
            return false;
        if (this.energyShield.getMaxCount() != ship.getEnergyShield().getMaxCount())
            return false;
        if (this.energyShield.getRegeneration() != ship.getEnergyShield().getRegeneration())
            return false;
        if (this.energyShield.Time() != ship.getEnergyShield().Time())
            return false;

        Weapon[] anotherShipWeapons = ship.getWeapons();
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i].getId() != anotherShipWeapons[i].getId())
                return false;
            if (weapons[i].getCd() != anotherShipWeapons[i].getCd())
                return false;
            if (weapons[i].getRate() != anotherShipWeapons[i].getRate())
                return false;
            if (weapons[i].getBullet().getSpeed() != anotherShipWeapons[i].getBullet().getSpeed())
                return false;
            if (weapons[i].getBullet().getDamage() != anotherShipWeapons[i].getBullet().getDamage())
                return false;
            if (weapons[i].getBullet().getConsumeEnergy() != anotherShipWeapons[i].getBullet().getConsumeEnergy())
                return false;
            if (weapons[i].getBullet().getRange() != anotherShipWeapons[i].getBullet().getRange())
                return false;
            if (weapons[i].getBullet().getLength() != anotherShipWeapons[i].getBullet().getLength())
                return false;
            if (weapons[i].getBullet().getWidth() != anotherShipWeapons[i].getBullet().getWidth())
                return false;
        }
        return result;
    }
}
