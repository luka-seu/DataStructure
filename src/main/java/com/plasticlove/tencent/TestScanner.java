package com.plasticlove.tencent;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author luka-seu
 * @description 测试输入输出
 * @create 2019/4/4-18:56
 */
public class TestScanner {
    public static void main1(String[] args) {


        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Vector<Vector<String>> res = new Vector<Vector<String>>();
        n = scanner.nextInt();
        int num = 0;
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String Line = scanner.nextLine();
            if (Line.contentEquals(""))
                break;
            Vector<String> a = new Vector<String>();
            String[] b = Line.split(",");
            for (int i = 0; i < b.length; i++)
                a.add(b[i]);
            res.add(a);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(sc.hasNextLine()){
           String line = sc.nextLine();
           if (line.contentEquals("")){
               break;
           }

            str.add(line);

        }
        System.out.println(n);

        for (String s:str){
            System.out.println(s);
        }
    }
}
