import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			int missing = new FindMissing().findMissing(arr,n);
			System.out.println(missing);
		}
	}
}


class FindMissing{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i:arr)
            list.add(i);
       
       int i=0;
       for(i=1;i<=size;i++)
       {
           if(!list.contains(i))
                return i;
       }
       return i;
    } 
}