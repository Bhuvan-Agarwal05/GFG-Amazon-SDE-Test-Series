import java.util.*;
import java.io.*;

class Driver_class{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0)
		{
			String str[] = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);

			int arr1[] = new int[N];
			int arr2[] = new int[M];

			str = br.readLine().trim().split(" ");
			for(int i=0;i<N;i++)
				arr1[i] = Integer.parseInt(str[i]);

			str = br.readLine().trim().split(" ");
			for(int i=0;i<M;i++)
				arr2[i] = Integer.parseInt(str[i]);

			Union obj = new Union();
			ArrayList<Integer> res = new ArrayList<>();
			res = obj.findUnion(arr1,arr2,N,M);
			for(int i=0;i<res.size();i++)
				System.out.println(res.get(i)+" ");
			System.out.println();
		}
	}
}

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Union
{
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:arr1)
            set.add(i);
        
        for(int i:arr2)
            set.add(i);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:set)
            list.add(i);
        
        return list;
    }
}
