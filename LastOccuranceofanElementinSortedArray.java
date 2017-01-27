package flexton;

public class LastOccuranceofanElementinSortedArray {
	
	public int LastOccured (int []arr,int start,int end, int ele){	
		int mid;
		int last =Integer.MIN_VALUE;
		//if midle is equal to first occurrence so far last equal to middle index
		 // check if next element is same or not in next iteration
		//else if middle is smaller than the element check in left side of array
		 //else element ins in right side of middle
		while(start<=end){
			mid = start +(end-start)/2;
			if(arr[mid]==ele){
				last = mid;
				start = mid+1;
			}else if (arr[mid]<ele)
			{start=mid+1;}
			else{end=mid-1;}
		}
		return last;
	}
	private int firstOccurrenceBinarySearch(int[] source, int needle) {
	    int low = 0;
	    int high = source.length - 1;
	    int firstOccurrence = Integer.MIN_VALUE;

	    while (low <= high) {
	        int middle = low + ((high - low) >>> 1);

	        if (source[middle] == needle) {
	            // key found and we want to search an earlier occurrence
	            firstOccurrence = middle;
	            high = middle - 1;
	        } else if (source[middle] < needle) {
	            low = middle + 1;
	        } else {
	            high = middle - 1;
	        }
	    }

	    if (firstOccurrence != Integer.MIN_VALUE) {
	        return firstOccurrence;
	    }

	    return -(low + 1);  // key not found
	}
	
	public static void main(String args[])
	{
		LastOccuranceofanElementinSortedArray L=new LastOccuranceofanElementinSortedArray();
		
		int [] a1={1,2,3,4,5,6,7,8,9,9,9,9,9,9,9,10};
		int a=L.firstOccurrenceBinarySearch(a1,9);
		int b =L.LastOccured(a1, 0, a1.length, 9);
		System.out.println("First Occurance of 9 is "+a);
		System.out.println("Last occurance of 9 is "+b);

	}

}
