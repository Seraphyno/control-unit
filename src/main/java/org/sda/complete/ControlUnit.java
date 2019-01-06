package org.sda.complete;

import org.sda.parts.CPU;
import org.sda.parts.HardDrive;
import org.sda.parts.Memory;
import org.sda.parts.Motherboard;
import org.sda.utils.Frequency;
import org.sda.utils.enums.RamType;
import org.sda.utils.Size;

public class ControlUnit {

    private Memory memory;
    private CPU cpu;
    private Motherboard motherboard;
    private HardDrive hdd;
    
    public ControlUnit(RamType ramType, String cpuMaker, String motherboardMaker) {
        this.memory = new Memory(ramType, new Frequency(1666), new Size(8));
        this.cpu = new CPU("x64", cpuMaker, new Frequency(3));
        this.motherboard = new Motherboard(motherboardMaker, true, 4);
        this.hdd = new HardDrive(new Size(2), "Western Digital");
    }
    
    public ControlUnit(Memory memory, CPU cpu, Motherboard motherboard, HardDrive hdd) {
        this.memory = memory;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.hdd = hdd;
    }
    
    public Memory getMemory() {
        return memory;
    }
    
    public CPU getCpu() {
        return cpu;
    }
    
    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    public HardDrive getHdd() {
        return hdd;
    }
}
