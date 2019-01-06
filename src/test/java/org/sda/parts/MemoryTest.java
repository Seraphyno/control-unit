package org.sda.parts;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.sda.utils.Frequency;
import org.sda.utils.Size;
import org.sda.utils.enums.RamType;
import org.sda.utils.enums.SizeUnit;

@RunWith(MockitoJUnitRunner.class)
public class MemoryTest {
    
    public RamType ramType = RamType.DDR4;
    @Mock public Frequency frequency;
    @Mock public Size size;
    @Mock public Memory someMemory;
    public Memory target = new Memory(ramType, frequency, size);
    
    @Before
    public void setup() {
        when(someMemory.getRamType()).thenReturn(RamType.SDRAM);
        when(size.getUnit()).thenReturn(SizeUnit.TB);
        
    }
    
    @Test
    public void a_test() {
        assertEquals(SizeUnit.TB, size.getUnit());
        assertEquals(RamType.SDRAM, someMemory.getRamType());
    }
}