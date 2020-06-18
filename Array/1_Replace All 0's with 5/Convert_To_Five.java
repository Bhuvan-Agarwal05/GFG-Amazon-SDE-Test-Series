import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            int N = sc.nextInt();
            System.out.println(new GFG().convertfive(N));
            T--;
        }
    }
}

class GfG {
    int convertfive(int num) {
        // Your code here
        String s = Integer.toString(num);
        if(s.contains("0"))
            {
                StringBuffer sp = new StringBuffer("");
                for(int i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)=='0')
                            sp.append('5');
                        else
                            sp.append(s.charAt(i));
                    }
                return Integer.parseInt(sp.toString());
            }
        else
            return num;
    }
}