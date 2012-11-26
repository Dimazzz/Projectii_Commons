package org.projii.commons.spaceship.weapon;

import org.projii.commons.space.Point;

public class Bullet extends AbstractBullet {

    public Bullet(int id, int speed, int damage, int consumeEnergy, int distance, int range, Point location, int rotation, int length, int width) {
        super(id, speed, damage, consumeEnergy, distance, range, location, rotation, length, width);
    }
}
