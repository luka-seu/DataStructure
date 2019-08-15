package com.plasticlove.C360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for (int k = 0;k<n;k++){
            num1[k] = sc.nextInt();
        }
        for (int p = 0;p<n;p++){
            num2[p] = sc.nextInt();
        }

        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();
        fullPerm(num1,0,a);
        fullPerm(num2,0,b);
        ArrayList<int[]> cList = new ArrayList<>();
        for (int x = 0;x<a.size();x++){
            for (int y = 0;y<b.size();y++){
                int[] arr = new int[n];
                int[] numA = a.get(x);
                int[] numB = b.get(y);
                for (int f = 0;f<numA.length;f++){
                    int c = (numA[f]+numB[f]) % m;
                    arr[f] = c;
                }
                cList.add(arr);
            }
        }
        Collections.sort(cList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int g = 0;g<o1.length;g++){
                    if (o1[g]==o2[g]){
                        continue;
                    }else if(o1[g]>o2[g]) {
                        return 1;
                    }else{
                        return -1;
                    }
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i:cList.get(cList.size()-1)){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().substring(0,sb.length()-1));
    }



    public static void fullPerm(int[] arr, int start, ArrayList<int[]> ints){
        if (start==arr.length-1){
            int[] B = arr.clone();
            ints.add(B);
            return;
        }

        for (int i = start;i<=arr.length-1;i++){
            swap(arr,start,i);
            fullPerm(arr,start+1,ints);
            swap(arr,start,i);
        }
    }

    public static void swap(int[] A, int i, int j)
    {
        if (i!=j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}
