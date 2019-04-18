package com.plasticlove.array;

import java.util.*;

/**
 * @author luka-seu
 * @description 火车进站问题
 * @create 2019/4/10-16:52
 */
//TODO 尚未完全理解


public class TrainInAndOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<int[]> list = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        fullPerm(arr,0,list);
        for (int[] a:list){
            if (isLegal(arr,a,n)){
                StringBuilder sb = new StringBuilder();
                for (int i:a){
                    sb.append(i).append(" ");
                }
                set.add(sb.toString().substring(0,sb.length()-1));

            }
        }
        for(String s:set){
            System.out.println(s);
        }
    }


    public static boolean isLegal(int[] in,int[] out,int n){
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        while(i<n){
            if (in[i]==out[j]){
                i++;
                j++;
            }else{
                if (stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else{
                    int temp = stack.peek();
                    if (temp==out[j]){
                        j++;
                        stack.pop();
                    }else if(i<n){
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }

        while (!stack.isEmpty()&&j<n){
            int top = stack.pop();
            if (top==out[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }


    public static void Permutation(int[] A, int start, int n, ArrayList<int[]> result)
    {
        if (start == n)
            return;
        if (start == n - 1)
        {
            //这个克隆是什么意思？？？？？
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for (int i = start; i < n; i++)
        {
            swap(A, i, start);
            Permutation(A, start + 1, n, result);
            swap(A, i, start);
        }
    }






    public static void fullPerm(int[] arr, int start, ArrayList<int[]> ints){
        // if (start==arr.length){
        //     return;
        // }
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
