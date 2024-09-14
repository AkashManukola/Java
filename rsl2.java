
import java.util.ArrayList;
import java.util.HashMap;

public class rsl2 {
   public static void demo1(int arr[],int n){
        HashMap<Integer,Integer> demomap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            demomap.put(arr[i], demomap.getOrDefault(arr[i], 0)+1);

       
        }
        for(int i=0;i<n;i++){
            if(demomap.get(arr[i])>0){
                list.add(arr[i]);
                demomap.put(arr[i], 0);
            }
        }
        for (int element : list) {
            System.out.print(element + " ");
        }

   } 
   static void demo2(int arr[],int n){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==0){
            list.add(arr[i]);
        }
    }
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
    }
   }

   static boolean  prime(int element){
    boolean flag=false;
    if (element < 2) {
        return false; // Numbers less than 2 are not prime
    }

    for(int i=2;i<=Math.sqrt(element);i++){
        if(element % i == 0){
            return false;
        }  
        
    }
    return true;
   }
   static int nextprime(int element){
    if(prime(element-1)){
        return element-1;
    }
    else{
        return nextprime(element-1);
    }
   }

   static void sum(int arr[],int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int remaining=target-arr[i];

        if(map.containsKey(remaining)){
            System.out.println("Indeces are:"+map.get(remaining)+","+i);
            break;
        } 
       map.put(arr[i],i);
    }

    System.out.println("no elements found");

    
   }
   public static void main(String[] args) {
    int arr[]={1,2,3,5,7,3,7};
      int target=8;
      sum(arr,target);
   }
}
