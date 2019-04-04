package com.plasticlove.array;



import java.util.Arrays;
import java.util.HashSet;

/**
 * @author luka-seu
 * @description LL今天心情特别好, 因为他去买了一副扑克牌, 发现里面居然有2个大王,
 * 2个小王(一副牌原本是54张 ^ _ ^)...他随机从中抽出了5张牌, 想测测自己的手气,
 * 看看能不能抽到顺子, 如果抽到的话, 他决定去买体育彩票, 嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
 * 他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 * “So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 * @create 2019/4/4-14:20
 */
public class ArrayIsContinuous {
    public boolean isContinuous(int [] numbers) {
        //数组长度必须为5
        if (numbers.length!=5){
            return false;
        }
        int len = numbers.length;
        //对数组排序
        Arrays.sort(numbers);
        int count0 = 0;
        HashSet<Integer> set = new HashSet<>();
        //记录数组中大小王的个数
        for (int i:numbers){
            if (i==0){
                count0++;
            }

            set.add(i);
        }
        if (count0==0){

            if (set.size()!=5){
                return false;
            }else if (numbers[len-1]-numbers[0]>=5){
                return false;
            }else{
                return true;
            }
        }else{
            int gap = 0;
            for (int k = count0;k<len-1;k++){
                if (numbers[k]==numbers[k+1]){
                    return false;
                }
                //统计相邻两数之间的间隔，要记住减1
                gap = gap+numbers[k+1]-numbers[k]-1;
            }
            //必须要有足够的零来弥补间隔
            if (gap<=count0){
                return true;
            }else {
                return false;
            }
        }
    }
}
