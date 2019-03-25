package com.com.plasticlove.test;

import com.plasticlove.string.StringDataUtils;
import org.junit.Test;



public class StringDataUtilsTest {

    @Test
    public void getLongestSubStrWithoutDup() {

        String s = "dsdjfhjafhqjiqwhnksdjiwodjkadjad";
        int i = StringDataUtils.getLongestSubStrWithoutDup(s);
        System.out.println(i);
    }
}