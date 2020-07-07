import java.io.*;
import java.util.*;

class GFG{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(inputLine[i]);

			Frequency obj = new Frequency();
			obj.frequencycount(arr,n);

			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}




class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++)
            map.put(i,0);
        
        for(int i=0;i<n;i++)
            map.put(arr[i],map.get(arr[i])+1);
        
        for(int i=1;i<=n;i++)
            arr[i-1] = map.get(i);
    }
}
