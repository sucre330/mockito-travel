package com.mockito.travel.learn;

import org.junit.Test;
import org.mockito.ArgumentMatcher;

import java.util.LinkedList;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * @Auther: sucre
 * @Date: 2021/8/15 18:00
 * @Desc:
 **/
public class Matchers {



    @Test
    public void matcher1() {
        LinkedList mockedList = mock(LinkedList.class);
        when(mockedList.get(anyInt())).thenReturn("element");
//        when(mockedList.contains(argThat(isValid())));
        System.out.println(mockedList.get(999));
        verify(mockedList).get(anyInt());


    }

}
