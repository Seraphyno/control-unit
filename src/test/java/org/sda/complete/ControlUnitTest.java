package org.sda.complete;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.sda.parts.CPU;
import org.sda.parts.HardDrive;
import org.sda.parts.Memory;
import org.sda.parts.Motherboard;
import org.sda.utils.Size;

@RunWith(MockitoJUnitRunner.class)
public class ControlUnitTest {
    
    @Mock public Memory memory;
    @Mock public CPU cpu;
    @Mock public HardDrive hdd;
    @Mock public Motherboard motherboard;
    @Mock public Size size;
    public ControlUnit target = new ControlUnit(memory, cpu, motherboard, hdd);
    
    @Before
    public void setUp() {
        when(size.getSize()).thenReturn(16.0);
        when(memory.getSize()).thenReturn(size);
    }
    
    @Test
    public void a_test() {
        Memory result = target.getMemory();
        
        double actualMemorySize = size.getSize();
        assert actualMemorySize == 16.0;
    }
}