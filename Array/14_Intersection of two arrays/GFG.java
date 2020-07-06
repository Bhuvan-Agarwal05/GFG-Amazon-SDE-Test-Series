import java.io.*;
import java.util.*;

class GFG{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0){
			int n,m;
			n = sc.nextInt();
			m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];

			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();

			for(int i=0;i<m;i++)
				b[i] = sc.nextInt();

			System.out.println(NumberofElementsInIntersection(a,b,n,m));
		}
	}

//User function Template for Java

public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
    //Your code here
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    
    for(int i:a)
        set1.add(i);
    for(int i:b)
        set2.add(i);
    
    // To get the intersection of two sets, use the retainAll() method. Here are out two set −
    set1.retainAll(set2);
    return set1.size();
}

}
