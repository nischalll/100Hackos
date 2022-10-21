import java.util.Scanner;

public class Solution {
    static String removeDuplicate(String str, int n)
    {
        String clean="";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(str.charAt(i)==str.charAt(j)){
                    if(!isPresent(clean,str.charAt(i))){
                        clean+=str.charAt(i);
                    }
                    break;
                }
                    
            }
        }
        return clean;
    }
    
    static boolean isPresent(String str,char c){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                return true;
            }  
        }
        return false;
    }
    
    static int[] uniPattern(String cln, String sub){
        int[] arr = new int[cln.length()];
        for(int i=0; i<cln.length(); i++){
                int count=0;
                for(int j=0; j<sub.length(); j++){
                    if(cln.charAt(i)==sub.charAt(j)){
                        count++;
                    }
                }
                arr[i]=count;
            }
        return arr;
    }
    
    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        String cleanA = removeDuplicate(a, a.length());
        String cleanB = removeDuplicate(b, a.length());
        // System.out.println(cleanA+" "+cleanB);
        if(a==b){
            return true;
        }
        else if(cleanA==cleanB){
            return true;
        }
        else{
            int[] arrA = uniPattern(cleanA, a);
            int[] arrB = uniPattern(cleanA, b);
            for(int i=0; i<cleanA.length(); i++){
                // System.out.println(arrA[i]+" "+arrB[i]);
                if(arrA[i]!=arrB[i]){
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {