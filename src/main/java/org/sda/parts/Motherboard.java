package org.sda.parts;

public class Motherboard {
    
    private String maker;
    private boolean isGamingReady;
    private int noSlotsRam;
    
    public Motherboard(String maker, boolean isGamingReady, int noSlotsRam) {
        this.maker = maker;
        this.isGamingReady = isGamingReady;
        this.noSlotsRam = noSlotsRam;
    }
    
    public String getMaker() {
        return maker;
    }
    
    public boolean isGamingReady() {
        return isGamingReady;
    }
    
    public int getNoSlotsRam() {
        return noSlotsRam;
    }
}
