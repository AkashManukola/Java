
import java.util.ArrayList;



public abstract class c5 {
    static int rotatearray(int arr[], int n) {
        int temp = arr[0];  // Store the first element
        int temp1=arr[1];
        for (int i = 0; i < n - 2; i++) {
            arr[i] = arr[i + 2];  // Shift elements to the left //in place of 0 , 1s value is storing
                    }
        arr[n - 1] = temp; 
        arr[n-2]=temp1; // Assign the first element to the last position

        return 1;
    }
    static int rotatebyn(int arr[],int n,int d) //d= n0 of rotation ,n=size
    {
        d=d%n; // d=2%5=2; 8%2=4 // reminder gives the number of rotations
        int temp[]=new int [d];

        for(int i=0;i<d;i++){  // 1, 2 are stored in temp array
         temp[i] += arr[i];
        }

        for(int i=0;i<n-d;i++){  // 5-2=3-1=2 {0,1,2}
            arr[i]=arr[i+d]; // d value is 2(no of rotations)
        }

        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        return 1;

    }
    static int demo(int arr[],int n,int d){
        rev(arr, 0,n-1);
        rev(arr,d+1,n-1 );
       rev(arr, 0, n-1);

        return 1;
    }
    static int rev(int arr[],int start,int end){
        

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
           arr[end]= temp;

            start++;
            end--;
        }
        return 1;


    }
    static int print(int arr[],int n){
        
        for (int i = 0; i < n; i++) {  // Print the entire array
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        return 1;
    
    }
    static int rightshift(int arr[],int n){
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return 1;
    }
    static int demo2(int arr[],int n,int d){
        d=d%n;
        rev(arr, 0, n-1);
        rev(arr, 0, d-1);
        rev(arr, d, n-1);

        return 1;

    }
    static int demo3(int arr[],int n){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int alz=temp.size();
        for(int i=0;i<alz;i++){
            arr[i]=temp.get(i);
        }  
        
        for(int i=alz;i<n;i++){
            arr[i]=0;
        }
    return 1;
}

    


    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 0, 2, 9, 0};           //1,2,3,2,9
        int n = arr.length;
        print(arr, n);
      demo3(arr, n);
      print(arr, n);

        
    }
}
