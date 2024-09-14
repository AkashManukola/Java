import java.util.*;

public class rsl1 {
    static void sum(int arr[],int k){
        int n=arr.length;
        boolean flag=false;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    flag=true;
                    System.out.println("Indexes are");
                    System.out.println(i+","+j);
                }
            }

            if(!flag){
                System.out.println("not elemnts found with the sum of the k");
            }
        }
    }


    static void movezeros(int arr[]){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               list.add(arr[i]);
            }
        }
        int index=0;
        while(index<list.size()){
            arr[index]=list.get(index);
            index += 1;
        }

        for(int i=index;i<n;i++){
            arr[i]=0;
        }
    }

    static int stocks(int arr[]){
        int buy=arr[0];
        int sell=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
          buy= Math.min(buy,arr[i]);

            for(int j=buy;j<n;j++){
              sell= Math.max(sell, arr[i]);                
            }
        }
        
        int profit=sell-buy;
        System.out.println("buy the stock on : "+buy);
        System.out.println("sell the stock onn : "+sell);

        return profit;
    }
    static void swap(int arr[],int start,int end){
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start ++;
        end--;
        }
    }

    static int[] rotatebyn(int arr[],int d){
        int n=arr.length;
        d=n%2;  //5%2=2

        swap(arr,0, d);
        swap(arr,d+1,n-1);
        swap(arr,0,n-1);

        return arr;
    }

    static void majority(int arr[],int n){
        int major=0;
        int count=1;
       // int ele=0;

        // int i=arr[0];
        // int j=arr[i+1];
        for (int i = 1; i < n; i++) {
            if (arr[i] == major) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                major = arr[i];
                count = 1;
            }
        }
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[major]){
                count2++;
            }

        }
        if(count2>n/2){
            System.out.println("count is: "+count2);
        }
        else{
            System.out.println("no ele found");
        }
    }

    public static void demo2(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = false; // Mark as non-unique if duplicate found
                    break; // No need to check further, break out of the loop
                }
            }
            if (flag) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }

    public static void demo3(String s){
        int n=s.length();

        Map<Character, Integer> newmap=new HashMap();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(newmap.containsKey(ch)){
                newmap.put(ch, newmap.get(ch)+1);
            }else
            newmap.put(ch,1);
        }

        if(newmap.containsKey(ch,1)){
            System.out.println(ch);
        }
        
    }

    static void demo4(String s){
        String s1=s.replaceAll("\\s", "%");
        s1.replace("boy", "xyz");
        System.out.println(s1);
    }
    
    public static void main(String[] args) {
        String s="akash is a good boy";
        demo4(s);

        
    }
   

    
}
