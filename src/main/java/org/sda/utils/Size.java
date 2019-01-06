package org.sda.utils;

import org.sda.utils.enums.SizeUnit;

public class Size {
    
    private double size;
    private SizeUnit unit;
    
    public Size(double size) {
        this.size = size;
        if (size < 4) {
            this.unit = SizeUnit.TB;
        } else if (size < 1024){
            this.unit = SizeUnit.GB;
        } else {
            this.unit = SizeUnit.MB;
        }
    }
    
    public double getSize() {
        return size;
    }
    
    public SizeUnit getUnit() {
        return unit;
    }
    
    public int addMemorySizes(int size1, int size2) {
        return size1 + size2;
    }
}
