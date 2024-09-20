import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    // Function to check if a number is prime
    public static boolean prime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to sqrt(n)
            if (n % i == 0) { // Check divisibility by i
                return false; // Not prime if divisible
            }
        }
        return true; // It's prime if no divisors are found
    }

    // Function to find the closest prime to a given number
    public static void closestprime(int n) {
        int smallestPrime = 0;
        int largestPrime = 0;

        // Find the closest smaller prime number
        for (int i = n - 1; i >= 2; i--) {
            if (prime(i)) {
                smallestPrime = i;
                break; // Stop when a smaller prime is found
            }
        }

        // Find the closest larger prime number
        for (int i = n + 1;; i++) { // Infinite loop until a larger prime is found
            if (prime(i)) {
                largestPrime = i;
                break; // Stop when a larger prime is found
            }
        }

        // Compare the absolute distances to the closest smaller and larger primes
        int diffSmall = Math.abs(n - smallestPrime);
        int diffLarge = Math.abs(n - largestPrime);

        if (diffSmall < diffLarge) {
            System.out.println("Closest prime: " + smallestPrime);
        } else if (diffSmall == diffLarge) {
            // If both primes are equidistant, print both
            System.out.println("Closest primes: " + smallestPrime + " and " + largestPrime);
        } else {
            System.out.println("Closest prime: " + largestPrime);
        }
    }

    static int sum(int n){
        int total=0;
        while(n>0){
            total+=n%10;
            n=n/10;
        }
        return total;

    }

    public static int secondlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int slargest=0;
        int n=arr.length;
       // int i=0;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }

            if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }

        }
        return slargest;
    }
//first non repating character
    static char demo(String s){
        int n=s.length();

        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
            boolean isrepating=false;

            for(int j=0;j<n;j++){
                if(j!=i && s.charAt(i)==s.charAt(j)){
                    isrepating=true;
                    break;
                }
            }

            if(!isrepating){
            return curr;
            }
        }
        return 0;
    }

    static void demo21(String s){
        StringBuilder sb=new StringBuilder();
        String result="";

        int count=1;

        for(int i=1;i<s.length();i++){
            if(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else {
                result +=count;
                result +=s.charAt(i-1);
                sb.append(count).append(s.charAt(i-1));
                count=1;
            }
        }
        System.out.println(result);
        System.out.println(sb.toString());
    }

    static void demo20(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue());
            System.out.print(entry.getKey());
        }

    }
static void ksum(int arr[],int k){
    int n=arr.length;

    Arrays.sort(arr);
    int i=0;
    int j=n-1;

    while(i<j){
        if(arr[i]+arr[j]==k){
            System.out.println(i+","+j);
            break;
        }
        else if(arr[i]+arr[j] > k){
            j--;
        }
        else  i++;
    }
}

static void demo22(String s1,String s2){
    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();

    for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        map1.put(ch, map1.getOrDefault(ch,0)+1);
    }
    
    for(int i=0;i<s2.length();i++){
        char ch2=s2.charAt(i);
        map2.put(ch2, map2.getOrDefault(ch2,0)+1);
    }

    if(map1.equals(map2)){
        System.out.println("an anagram");
    }
    else System.out.println("not an anagram");
}
//count no 0f 3s and 5s:
public static String count(int n){
    int countof5=n/5;
    int remaining=n%5;

    while(countof5>=0){
        remaining = n - (countof5*5);
        if(remaining%2==0){
            int count2=remaining/2;
            return countof5 + " coins of 5s" + (count2 > 0 ? " and " + count2 + " coins of 2s" : "");
        }
        countof5--;
    }
    return "not possible";
}

    public static void main(String[] args) {
        int n=34;
        count(n);
    }
}
