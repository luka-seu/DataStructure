package com.plasticlove.leetcode;//给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
//
// 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。 
//
// 示例: 
//
// 
//输入:
//letters = ["c", "f", "j"]
//target = "a"
//输出: "c"
//
//输入:
//letters = ["c", "f", "j"]
//target = "c"
//输出: "f"
//
//输入:
//letters = ["c", "f", "j"]
//target = "d"
//输出: "f"
//
//输入:
//letters = ["c", "f", "j"]
//target = "g"
//输出: "j"
//
//输入:
//letters = ["c", "f", "j"]
//target = "j"
//输出: "c"
//
//输入:
//letters = ["c", "f", "j"]
//target = "k"
//输出: "c"
// 
//
// 注: 
//
// 
// letters长度范围在[2, 10000]区间内。 
// letters 仅由小写字母组成，最少包含两个不同的字母。 
// 目标字母target 是一个小写字母。 
// 
// Related Topics 二分查找




public class Find_Smallest_Letter_Greate_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        //因为字母表顺序是循环的，所以先比较数组最后一个字母
        int len = letters.length;
        //如果比最后一个字符大，则下一个就是lettes[0]
        if (target>letters[len-1]){
            return letters[0];
        }
        char res = letters[0];
        for (char c:letters){
            if (c<=target){
                continue;
            }
            //找到了
            res =  c;
            break;

        }
        return res;

    }
}

