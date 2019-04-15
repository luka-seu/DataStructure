package com.plasticlove.string;

import java.util.Arrays;

/**
 * @author luka-seu
 * @description 密码等级
 * @create 2019/4/10-13:36
 */
public class SecurityCodeLevel {
    public static String getLevel(String code){

        //先排序
        char[] chars = code.toCharArray();
        int len = chars.length;
        int uppers = 0;
        int lowers = 0;
        int nums = 0;
        int symbols = 0;
        for (char c:chars){
            if (c>='a'&&c<='z'){
                lowers++;
            }else if (c>='A'&&c<='Z'){
                uppers++;
            }else if (c>='0'&&c<='9'){
                nums++;
            }else {
                symbols++;
            }
        }
        int total = 0;
        if (lowers==0&&uppers==0){
            total = total+0;
        }else if(lowers!=0&&uppers==0){
            total = total+10;
        }else if(lowers==0&&uppers!=0){
            total = total+10;
        }else if(lowers!=0&&uppers!=0){
            total = total+20;
        }

        if (symbols==0){
            total = total+0;
        }else if(symbols==1){
            total = total+10;
        }else{
            total = total+25;
        }

        if (nums==0){
            total = total+0;
        }else if(nums==1){
            total = total+10;
        }else{
            total = total+20;
        }

        if (nums>0&&(uppers>0||lowers>0)&&symbols==0){
            total =total+2;
        }else if (nums>0&&(uppers>0||lowers>0)&&symbols>0){
            total =total+3;
        }else if (nums>0&&uppers>0&&lowers>0&&symbols==0){
            total =total+5;
        }
        return null;


        // //长度
        // int lenScore = 0;
        // if (code.length()<=4){
        //     lenScore = 5;
        // }else if(code.length()>5&&code.length()<=7){
        //     lenScore = 10;
        // }else{
        //     lenScore = 25;
        // }
        // //字母
        // int letter = 0;
        // //全是大写
        // boolean flagLetterUpper = true;
        // for (int i = 0;i<code.length();i++){
        //     if ((code.charAt(i)<'A'||code.charAt(i)>'Z')){
        //         flagLetterUpper = false;
        //         break;
        //     }
        //
        // }
        // //全是小写
        // boolean flagLetterDown = true;
        // for (int i = 0;i<code.length();i++){
        //     if ((code.charAt(i)<'a'||code.charAt(i)>'z')){
        //         flagLetterDown = false;
        //         break;
        //     }
        //
        // }
        // //没有字母
        // for (int i = 0;i<code.length();i++){
        //     if (((code.charAt(i)<'a'||code.charAt(i)>'z')&&(code.charAt(i)<'A'||code.charAt(i)>'Z'))){
        //         letter = 0;
        //     }
        //
        // }
        // if (flagLetterUpper){
        //     letter = 10;
        // }
        // if (flagLetterDown){
        //     letter = 10;
        // }

    }
}
