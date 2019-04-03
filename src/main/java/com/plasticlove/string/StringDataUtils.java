package com.plasticlove.string;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author luka-seu
 * @description 字符串相关算法
 * @create 2019/3/25-16:40
 */
public class StringDataUtils {


    /**
     * 字符串最长不重复子串
     * 动态规划 f(i)表示以第i个字符结尾的最大不重复子串，当判断到第i个字符时判断i在之前有没有出现过。出现过算两次出现之间的差，没有出现直接加1
     * @param s
     * @return
     */
    public static int getLongestSubStrWithoutDup(String s) {
        int cur = 0;
        int max = 0;
        int[] pos = new int[26];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = -1;
        }
        for (int k = 0; k < s.length(); k++) {
            int index = pos[s.charAt(k) - 'a'];
            if (index < 0 || k - index > cur) {
                cur++;
            }else {
                if (cur > max) {
                    max = cur;
                }
                cur = k - index;
            }


            pos[s.charAt(k) - 'a'] = k;
        }
        if (cur>max){
            max=cur;
        }
        return max;
    }







    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList();
        if(str==null||str.length()==0){
            return list;
        }
        HashSet<String> set = new HashSet();
        fun(set,str.toCharArray(),0);
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    public static void fun(HashSet<String> set,char[] charArr,int start){
        if(start==charArr.length){
            set.add(new String(charArr));
            return;
        }

        //这一段就是回溯法，这里以"abc"为例

        //递归的思想与栈的入栈和出栈是一样的,某一个状态遇到return结束了之后，会回到被调用的地方继续执行

        //1.第一次进到这里是ch=['a','b','c'],list=[],i=0，我称为 状态A ，即初始状态
        //那么j=0，swap(ch,0,0)，就是['a','b','c']，进入递归，自己调自己，只是i为1，交换(0,0)位置之后的状态我称为 状态B
        //i不等于2，来到这里，j=1，执行第一个swap(ch,1,1)，这个状态我称为 状态C1 ,再进入fun函数，此时标记为T1，i为2，那么这时就进入上一个if，将"abc"放进list中
        /////////////-------》此时结果集为["abc"]

        //2.执行完list.add之后，遇到return，回退到T1处，接下来执行第二个swap(ch,1,1)，状态C1又恢复为状态B
        //恢复完之后，继续执行for循环，此时j=2,那么swap(ch,1,2),得到"acb"，这个状态我称为C2,然后执行fun，此时标记为T2,发现i+1=2,所以也被添加进结果集，此时return回退到T2处往下执行
        /////////////-------》此时结果集为["abc","acb"]
        //然后执行第二个swap(ch,1,2)，状态C2回归状态B,然后状态B的for循环退出回到状态A

        //             a|b|c(状态A)
        //               |
        //               |swap(0,0)
        //               |
        //             a|b|c(状态B)
        //             /  \
        //   swap(1,1)/    \swap(1,2)  (状态C1和状态C2)
        //           /      \
        //         a|b|c   a|c|b

        //3.回到状态A之后，继续for循环，j=1,即swap(ch,0,1)，即"bac",这个状态可以再次叫做状态A,下面的步骤同上
        /////////////-------》此时结果集为["abc","acb","bac","bca"]

        //             a|b|c(状态A)
        //               |
        //               |swap(0,1)
        //               |
        //             b|a|c(状态B)
        //             /  \
        //   swap(1,1)/    \swap(1,2)  (状态C1和状态C2)
        //           /      \
        //         b|a|c   b|c|a

        //4.再继续for循环，j=2,即swap(ch,0,2)，即"cab",这个状态可以再次叫做状态A，下面的步骤同上
        /////////////-------》此时结果集为["abc","acb","bac","bca","cab","cba"]

        //             a|b|c(状态A)
        //               |
        //               |swap(0,2)
        //               |
        //             c|b|a(状态B)
        //             /  \
        //   swap(1,1)/    \swap(1,2)  (状态C1和状态C2)
        //           /      \
        //         c|b|a   c|a|b

        //5.最后退出for循环，结束。

        for(int j = start;j<charArr.length;j++){
            swap(charArr,start,j);
            fun(set,charArr,start+1);
            swap(charArr,start,j);
        }
    }

    public static void swap(char[] str, int i, int j) {
        if (i != j) {
            char t = str[i];
            str[i] = str[j];
            str[j] = t;
        }
    }





        public static String BigDataMutiPly(String s1,String s2){

            StringBuffer sb1=new StringBuffer();
            StringBuffer sb2=new StringBuffer();
            sb1.append(s1);
            sb2.append(s2);
            BigInteger bg1=new BigInteger(sb1.toString());
            BigInteger bg2=new BigInteger(sb2.toString());
            return bg1.multiply(bg2).toString();

        }



}
