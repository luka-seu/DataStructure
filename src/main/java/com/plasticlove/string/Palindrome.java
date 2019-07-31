package com.plasticlove.string;

import org.junit.Test;

public class Palindrome {
    public boolean isPalindrome(int x) {
        StringBuilder sb  = new StringBuilder();
        sb.append(x);
        if(sb.toString().charAt(0)=='+'||sb.toString().charAt(0)=='-'){
            return false;
        }
        String s = sb.toString();
        if(sb.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }







    @Test
    public void test(){
        isPalindrome(10);
    }
}
