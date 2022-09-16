package com.in28minutes.unitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {
    @Mock
    List mock;

    @Test
    public void  basic_size(){
        when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());

    }
    @Test
    public void  return_different_values(){
        when(mock.size()).thenReturn(5).thenReturn(10) ;
        assertEquals(5,mock.size());
        assertEquals(10,mock.size());

    }
    @Test
    public void  return_parameters(){

        when(mock.get(anyInt())).thenReturn(2);
        assertEquals(2,mock.get(0));
        assertEquals(2,mock.get(1));

    }
   @Test
    public void  use_verify(){

        when(mock.get(anyInt())).thenReturn(2);
       assertEquals(2,mock.get(0));
       assertEquals(2,mock.get(1));
        verify(mock,times(2)).get(anyInt());
       verify(mock,atLeastOnce()).get(anyInt());
       verify(mock,atLeast(1)).get(anyInt());
       verify(mock,atMost(2)).get(anyInt());
       verify(mock,never()).get(5);

    }

    @Test
    public void spying(){
        List<Integer> spy = spy(ArrayList.class);
        spy.add(1);
        assertEquals(1,spy.size());
        //once you stub a method the original control is lost
        when (spy.size()).thenReturn(3);
        assertEquals(3,spy.size());
    }
}
