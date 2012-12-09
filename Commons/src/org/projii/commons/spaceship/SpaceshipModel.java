package org.projii.commons.spaceship;

import org.projii.commons.space.RealworldObject;

public class SpaceshipModel extends RealworldObject {

    private String name;
    private final int id;
    private int health;
    private int armor;
    private final int weaponAmount;

    public SpaceshipModel(String name, int id, int health, int armor, int weaponAmount, int length, int width) {
        super(id);
        this.id = id;
        this.name = name;
        this.health = health;
        this.armor = armor;
        setLength(length);
        setWidth(width);
        this.weaponAmount = weaponAmount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getWeaponAmount() {
        return weaponAmount;
    }

    public Boolean equals(SpaceshipModel model) {
        Boolean result = true;
        if (id != model.getId())
            return false;
        if (health != model.getHealth())
            return false;
        if (armor != model.getArmor())
            return false;
        if (this.getLength() != model.getLength())
            return false;
        if (this.getWidth() != model.getWidth())
            return false;
        if (weaponAmount != model.getWeaponAmount())
            return false;
        return result;
    }
}
