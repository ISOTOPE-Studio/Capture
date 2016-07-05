package cc.isotopestudio.Capture.area;

import org.bukkit.Location;

/**
 * Created by Mars on 7/5/2016.
 * Copyright ISOTOPE Studio
 */
public class Area {
    private String name;
    private Location A;
    private Location B;

    public Area(String name, Location a, Location b) {
        this.name = name;
        A = a;
        B = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getA() {
        return A;
    }

    public void setA(Location a) {
        A = a;
    }

    public Location getB() {
        return B;
    }

    public void setB(Location b) {
        B = b;
    }
}
