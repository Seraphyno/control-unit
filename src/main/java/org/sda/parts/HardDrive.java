package org.sda.parts;

import org.sda.utils.Size;

public class HardDrive {
    
    private Size available;
    private Size reserved;
    private Size total;
    private String manufacturer;
    
    public HardDrive(Size total, String manufacturer) {
        this.total = total;
        this.manufacturer = manufacturer;
        reserved = new Size(total.getSize() * 0.1);
        available = new Size(total.getSize() - reserved.getSize());
    }
    
    public Size getAvailable() {
        return available;
    }
    
    public Size getReserved() {
        return reserved;
    }
    
    public Size getTotal() {
        return total;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
}
