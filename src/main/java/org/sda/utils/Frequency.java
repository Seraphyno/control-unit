package org.sda.utils;

public class Frequency {
    
    private int value;
    private FrequencyType unit;
    
    public Frequency(int value) {
        this.value = value;
        if (value > 1000) {
            this.unit = FrequencyType.MHz;
        } else {
            this.unit = FrequencyType.GHz;
        }
    }
    
    public int getValue() {
        return value;
    }
    
    public FrequencyType getUnit() {
        return unit;
    }
    
    enum FrequencyType {
        MHz,
        GHz
    }
}
