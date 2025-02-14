import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,8,9,1};
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
           
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

                if(flag) break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}