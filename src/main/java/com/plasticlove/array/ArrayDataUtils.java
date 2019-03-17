package com.plasticlove.array;

public class ArrayDataUtils
{
	public static int MAX;//数组最大值
	public static int MIN;//数组最小值




	//找到数组中的最大值和最小值
	public static void findMaxAndMin(int array[]){
		MAX = array[0];
		MIN = array[0];
		int i = 0;
		for(i = 0;i<array.length-1;i=i+2){
			if(i+1>array.length){
				if(array[i]>MAX){
					MAX = array[i];
				}
				if(array[i]<MIN){
					MIN = array[i];
				}
			}
			if(array[i]>array[i+1]){
				if(array[i]>MAX){
					MAX = array[i];
				}
				if(array[i+1]<MIN){
					MIN = array[i+1];
				}
			}

			if(array[i]<array[i+1]){
				if(array[i+1]>MAX){
					MAX = array[i+1];
				}
				if(array[i]<MIN){
					MIN = array[i];
				}
			}
		}
	}



	//找到数组中的第二大的值
	public static int findSecNum(int arr[]){
		int max = arr[0];
		int sec = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				sec = max;
				max = arr[i];
			}else{
				if(arr[i]>sec){
					sec = arr[i];
				}
			}
		}
		return sec;
	}
} 
