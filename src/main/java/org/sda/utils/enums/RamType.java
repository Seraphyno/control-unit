package org.sda.utils.enums;

public enum RamType {
    
    SDRAM("SD-RAM"),
    DDR3("DDR-3"),
    DDR4("DDR-4");
    
    private String value;
    
    RamType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
