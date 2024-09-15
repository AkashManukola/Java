
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class rsl3 {
    static void demo1(String s){
        int i=0;
        int j=s.length()-1;

        boolean flag=true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               flag=false;
            }

            i++;
            j--;
            
        }
        System.out.print(flag);
    }

    static void demo2(String s){

        String output="";

        String[] words=s.split(" ");

        for(String word:words){
            String revword="";
            for(int i=word.length()-1;i>=0;i--){
                revword+=word.charAt(i);

            }
            output += revword+" ";
        }
        System.out.println(output+" ");
        

    }static void demo3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Build the output string
        String output = "";
        for (char ch : map.keySet()) {
            output += map.get(ch) + "" + ch;
        }

        System.out.println("output: " + output);
    }

    static void demo4(String s){
        StringBuilder sb=new StringBuilder();
        int count=1;

        for(int i=1;i<=s.length();i++){
            if(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;

            }
            else{
                sb.append(count).append(s.charAt(i-1));
                count=1;
            }
        }

        // if the inputs are unordered
        // HashMap<Character,Integer> map=new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch=s.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }

        // StringBuilder sb1=new StringBuilder();
        // for(char ch:map.keySet()){
        //     sb.append(map.get(ch)).append(ch);
        // }


        System.out.println("Output: "+sb);
    }

    static void demo5(String s){
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
        }

        System.out.print(set);
    }

    static boolean demo6(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        char[] x1=s1.toCharArray();
        char[] x2=s2.toCharArray();

        Arrays.sort(x1);
        Arrays.sort(x2);

        return Arrays.equals(x1, x2);

    }
    static void demo7(String s){
        for(int i=0;i<s.length();i++){
            boolean isunquie=true;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    isunquie=false;
                    break;
                }
            }
            if(isunquie){
                System.out.print(s.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s="axabbc";
        String s1="racen";
        String s2="carev";
        //2a2b1c
       // System.out.print(demo6(s1, s2));
demo7(s);    
    }

    
    
}
