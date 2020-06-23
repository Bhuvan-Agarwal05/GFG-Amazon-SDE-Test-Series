import java.io.*;
import java.util.*;

class ArrayWave{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());

		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Wave obj = new Wave();
			obj.convertToWave(arr,n);

			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++)
				sb.append(arr[i]+" ");

			System.out.println(sb);
		}
	}
}


class Wave{

    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    public static void convertToWave(int arr[], int n){
        for(int i=0;i<n-1;i+=2){
            if(arr[i]<arr[i+1])
            {
                arr[i]^=arr[i+1];
                arr[i+1]^=arr[i];
                arr[i]^=arr[i+1];
            }
        }
    }
    
}


