package org.projii.commons.space;

import org.projii.commons.spaceship.Spaceship;
import org.projii.commons.spaceship.weapon.Projectile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Map {

    private List<Spaceship> shipList;
    private List<Projectile> projectileList;

    private final int width;
    private final int height;

    public Map(int width, int height, List<Spaceship> shipList, List<Projectile> projectileList) {
        this.width = width;
        this.height = height;
        this.shipList = shipList;
        this.projectileList = projectileList;
    }

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.shipList = new ArrayList<Spaceship>();
        this.projectileList = new LinkedList<Projectile>();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Spaceship> getShipList() {
        return shipList;
    }

    public void setShipList(List<Spaceship> shipList) {
        this.shipList = shipList;
    }

    public List<Spaceship> getProjectileList() {
        return shipList;
    }

    public void setProjectileList(List<Spaceship> shipList) {
        this.shipList = shipList;
    }

    public void addProjectile(Projectile blt) {
        projectileList.add(blt);
    }
}
