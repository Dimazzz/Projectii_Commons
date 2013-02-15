package org.projii.commons.spaceship;

import org.jai.BSON.BSONSerializable;

public class SpaceshipModel {

    @BSONSerializable
    public final String name;
    @BSONSerializable
    public final int id;
    @BSONSerializable
    public final int length;
    @BSONSerializable
    public final int width;
    @BSONSerializable
    public final int health;
    @BSONSerializable
    public final int weaponSlotCount;
    @BSONSerializable
    public final int armor;

    public SpaceshipModel(int id, String name, int length, int width, int health, int weaponSlotCount, int armor) {
        this.name = name;
        this.id = id;
        this.length = length;
        this.width = width;
        this.health = health;
        this.weaponSlotCount = weaponSlotCount;
        this.armor = armor;
    }

}
