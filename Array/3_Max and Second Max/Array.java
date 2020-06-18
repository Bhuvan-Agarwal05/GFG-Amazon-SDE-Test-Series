import java.io.*;
import java.util.*;


// Solution class to implement function largestAndSecondLargest
class ArrayMax{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr)
            set.add(i);
            
        if(set.size()==1)
        {
            list.add(set.first());
            list.add(-1);
        }
        else
        {
            list.add(set.last());
            set.remove(set.last());
            list.add(set.last());
        }
        return list;
    }
}

class Array{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(testcases-- > 0)
        {
            int sizeOfArray = Integer.parseInt(br.readLine());
            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for(int index = 0;index < sizeOfArray; index++)
            {
                arr[index] = Integer.parseInt(elements[index]);
            }

            ArrayMax obj = new ArrayMax();
            ArrayList<Integer> res = new ArrayList<>();
            res = obj.largestAndSecondLargest(sizeOfArray,arr);
            System.out.println(res.get(0) + " " + res.get(1));
        }
    }
}