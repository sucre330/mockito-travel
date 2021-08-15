package com.mockito.travel.learn;

import org.junit.Test;

import java.util.List;

//静态导入会使代码更简洁
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @Auther: sucre
 * @Date: 2021/8/15 10:43
 * @Desc: 验证某些行为
 **/

public class ValidateAction {



    @Test
    public void ValidateActionThings() {

        //通过 mock创建List
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();



    }

}
