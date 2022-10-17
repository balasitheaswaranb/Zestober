package com.daily.assignments;



public class ArrayRecursion {
		public static void main(String args[]) {
			ArrayRecursion recursion = new ArrayRecursion();
			int[]arr = {1,2,3,4,5};
			
			int []arr1=recursion.addOneToEverything(arr,0);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr1[i]);
			}
		}

		private int[] addOneToEverything(int[] arr,int index) {
			if(index==arr.length) {
				return arr;
			}
			arr[index]++;
			return addOneToEverything(arr,index+1);
			 
		}
	}

