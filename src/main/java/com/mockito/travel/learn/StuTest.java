package com.mockito.travel.learn;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * @Auther: sucre
 * @Date: 2021/8/15 17:33
 * @Desc:
 **/
public class StuTest {

    @Test
    public void Stu(){
        LinkedList mockList = mock(LinkedList.class);
        //打桩
        when(mockList.get(0)).thenReturn("first");
        when(mockList.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockList.get(0));
        System.out.println(mockList.get(1));
        System.out.println(mockList.get(999));

        verify(mockList).get(0);

    }
}
