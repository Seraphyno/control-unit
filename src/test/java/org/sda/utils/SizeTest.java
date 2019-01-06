package org.sda.utils;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SizeTest {
    
    public Size target = new Size(16);
    @Mock public Size mockSize;
    
    @Before
    public void setup() {
        when(mockSize.addMemorySizes(eq(1), eq(1))).thenReturn(10);
    }
    
    @Test
    public void a_test() {
        int finalSize = target.addMemorySizes(8, 8);
//        assert finalSize == 16;

        int someSize = mockSize.addMemorySizes(1,1);
//        assert someSize == 10;
    
        int someOtherSize = mockSize.addMemorySizes(1,2);
//        System.out.println(someOtherSize);
    
        //exact de cate ori e apelata
        verify(mockSize, times(2)).addMemorySizes(anyInt(),anyInt());
        //minim de x ori
        verify(mockSize, atLeast(1)).addMemorySizes(anyInt(),anyInt());
        //maxim de x ori
        verify(mockSize, atMost(2)).addMemorySizes(anyInt(),anyInt());
    }
    
    @Test
    public void b_test() {
        verify(mockSize, times(0)).addMemorySizes(anyInt(),anyInt());
        verify(mockSize, never()).addMemorySizes(anyInt(),anyInt());
    }
}