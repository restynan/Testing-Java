package com.in28minutes.unitTesting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;



//import static org.hamcrest.Matchers.*;

public class HamcrestMatch {

    @Test
    public void hamcrestTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        /* assertThat(list,hasSize(3));
        assertThat(list,hasItems(1,2,3));
        assertThat(list,everyItem(greaterThan(0)));
        assertThat(list,everyItem(lessThan(4)));*/

        assertThat(list).hasSize(3)
                .contains(1,2,3)
                .allMatch(x->x>0)
                .allMatch(x->x<10);
        assertThat("ABCD")
                .contains("ABCD")
                .startsWith("AB")
                .endsWith("CD");
    }


}
