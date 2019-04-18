package com.plasticlove.huawei;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/10-19:02
 */
public class StringCut {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String[] arr = new String[n];
        // for (int i = 0;i<n;i++){
        //     arr[i] = sc.next();
        // }
        String[] arr = {"43532","432432434234","34344343434","dasdasdasdad","","eqweqweqweewewe","ewewuewew"};
        // Arrays.sort(arr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         int len = Math.min(o1.length(),o2.length());
        //         int i = 0;
        //         while(i<len){
        //             if (o1.charAt(i)!=o2.charAt(i)){
        //                 break;
        //             }
        //             i++;
        //         }
        //         return o1.charAt(i)-o2.charAt(i);
        //
        //     }
        // });
        // for (String s:arr){
        //     System.out.println(s);
        // }
        System.out.println(cut(arr));

    }

    public static String cut(String[] strArr){

        // Arrays.sort(strArr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         int len = Math.min(o1.length(),o2.length());
        //         int i = 0;
        //         while(i<len){
        //             if (o1.charAt(i)!=o2.charAt(i)){
        //                 break;
        //             }
        //             i++;
        //         }
        //         return o1.charAt(i)-o2.charAt(i);
        //
        //     }
        // });

        List<String> set = new ArrayList<>();
        for (int i = 0;i<strArr.length;i++){
            if (strArr[i].trim().equals("")){
                continue;
            }
            if (strArr[i].length()>100){
                return "";
            }
            char[] chars = strArr[i].toCharArray();

            // Arrays.sort(chars);
            String newStr = new String(chars);

            if (newStr.length()<8){
                StringBuilder sb = new StringBuilder();
                sb.append(newStr);
                for (int k = 0;k<8-newStr.length();k++){
                    sb.append(0);

                }
                set.add(sb.toString());
            }else if(newStr.length()%8==0){
                for (int m = 0;m<newStr.length()/8;m++){
                   set.add(newStr.substring(m*8,(m+1)*8));
                }
            }else{
                int zheng = newStr.length()/8;
                int yu = newStr.length()%8;
                for (int j = 0;j<zheng;j++){
                    set.add(newStr.substring(j*8,(j+1)*8));
                }
                StringBuilder sb1 = new StringBuilder();
                sb1.append(newStr.substring(newStr.length()-yu));
                for (int n = 0;n<8-yu;n++){
                    sb1.append(0);

                }
                set.add(sb1.toString());

            }
        }
        //34344343 42340000 43243243 43400000 43532000
        StringBuilder sb2 = new StringBuilder();
        String[] sarr = new String[set.size()];
        for (int p = 0;p<set.size();p++){
            sarr[p] = set.get(p);
            // sb2.append(s + " ");
        }

        Arrays.sort(sarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len = Math.min(o1.length(),o2.length());
                int i = 0;
                while(i<len-1){
                    if (o1.charAt(i)!=o2.charAt(i)){
                        break;
                    }
                    i++;
                }
                return o1.charAt(i)-o2.charAt(i);

            }
        });
        for (String s:sarr){
            sb2.append(s + " ");
        }
        return sb2.toString().substring(0,sb2.length()-1);

    }
}
