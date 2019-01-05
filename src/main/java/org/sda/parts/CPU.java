package org.sda.parts;

import org.sda.utils.Frequency;

public class CPU {
    
    private String architecture;
    private String maker;
    private Frequency frequency;
    
    public CPU(String architecture, String maker, Frequency frequency) {
        this.architecture = architecture;
        this.maker = maker;
        this.frequency = frequency;
    }
    
    public String getArchitecture() {
        return architecture;
    }
    
    public String getMaker() {
        return maker;
    }
    
    public Frequency getFrequency() {
        return frequency;
    }
}
