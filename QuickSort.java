package amazon;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={9, 2, 4, 7, 3, 7, 10};
		System.out.println(Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		for(int i:arr){
			System.out.print("   "+i);
		}
	}

	private static void quicksort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(arr==null||arr.length==0)
			return;
		if(low>=high)
			return;
			
		int mid=low+(high-low)/2;
		int pivot=arr[mid];
		int l=low;
		int h = high;
		int temp;
		System.out.println("pivot is "+ pivot+" from start to end "+low+"-"+high);

		while(l<h){
			while(arr[l]<pivot)
				l++;
			while(arr[h]>pivot)
				h--;
			if(l<=h){
				temp=arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
				System.out.println(Arrays.toString(arr));
				l++;
				h--;
			}
		}
		//temp=arr[mid];
		//arr[mid]=arr[h];
		//arr[h]=arr[mid];
		if(low<h)
			quicksort(arr,low,h-1);
		if(high>l)
			quicksort(arr,h+1,high);
		
	}
	}

