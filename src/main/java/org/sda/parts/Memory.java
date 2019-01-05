package org.sda.parts;

import org.sda.utils.Frequency;
import org.sda.utils.enums.RamType;
import org.sda.utils.Size;

public class Memory {
    
    private RamType ramType;
    private Frequency frequency;
    private Size size;
    
    public Memory(RamType ramType, Frequency frequency, Size size) {
        this.ramType = ramType;
        this.frequency = frequency;
        this.size = new Size(16);
    }
    
    public RamType getRamType() {
        return ramType;
    }
    
    public Frequency getFrequency() {
        return frequency;
    }
    
    public Size getSize() {
        return size;
    }
}
