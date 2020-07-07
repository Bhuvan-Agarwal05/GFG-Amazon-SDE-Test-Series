import java.util.Scanner;

class SquartRoot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot();
			System.out.println(obj.floorSqrt(a));
			t--;
		}
	}
}


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
		long low = 1;
		long high = x;
		long mid=0;
		long ans=0;
		while(low<=high)
		{
		    mid = low + (high-low)/2;
		    if(mid*mid<=x)
		      {
		          ans = mid;
		          low = mid+1;
		      }
		    else
		        high = mid-1;
		}
		return ans;
	 }
}
