import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s=s.trim();
        String [] strArr = s.split("[ +!,?._'@]+");
        if(s.length()==0){
            System.out.println(0);
        }else{
            System.out.println(strArr.length);    
        }
        
        for(String str : strArr){
            System.out.println(str);
        }
    }
}