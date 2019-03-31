package com.com.plasticlove.test;

import com.plasticlove.string.StringDataUtils;
import org.junit.Test;

import java.util.ArrayList;


public class StringDataUtilsTest {

    @Test
    public void getLongestSubStrWithoutDup() {

        String s = "abc";
        ArrayList<String> permutation = StringDataUtils.Permutation(s);
        for (String str:permutation){
            System.out.println(str);
        }
    }
}