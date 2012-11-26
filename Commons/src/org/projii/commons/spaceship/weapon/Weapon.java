package org.projii.commons.spaceship.weapon;

import org.projii.commons.space.Point;

public abstract class Weapon {
    private final int id;
    private int rate;
    private int cd = 0;
    private Bullet bullet;

    public Weapon(int id, Bullet bullet, int rate) {
        this.id = id;
        this.bullet = bullet;
        this.rate = rate;
        createDownload();
    }

    public int getRate() {
        return rate;
    }

    public int getCd() {
        return cd;
    }

    public int getId() {
        return id;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public Bullet fire(Point direction, int rotation) {
        //TODO: Think of better way to create bullet

        if (cd == 0) {
            Bullet blt = new Bullet(
                    0,
                    getBullet().getSpeed(),
                    getBullet().getDamage(),
                    getBullet().getConsumeEnergy(),
                    getBullet().getDistance(),
                    getBullet().getRange(),
                    direction,
                    rotation,
                    getBullet().getLength(),
                    getBullet().getWidth());

            createDownload();
            return blt;
        }
        return null;
    }

    public void createDownload() {
        cd = rate;
    }

    public void Download() {
        if (cd > 0) {
            cd--;
        }
    }
}
