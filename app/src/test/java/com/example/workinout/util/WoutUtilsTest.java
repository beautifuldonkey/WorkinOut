package com.example.workinout.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class WoutUtilsTest {

    @Mock
    WoutUtils utils;

    @Test
    public void addUpdateLists(){
        assertThat(utils.addUpdateLists(),is(false));
    }
}
