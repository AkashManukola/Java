import java.util.Arrays;

public class Quick_Sort {
    public static int split(int a[],int s,int e){
        int p=s,i=s+1,j=e;

        while(true){
             while(i<=e && a[i]<a[p]){
                i++;
            }
            while(j>=s && a[j]>a[p]){
                j--;
            }

            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }else{
                int temp=a[p];
                a[p]=a[j];
                a[j]=temp;

                break;
            }
        }
        return j;
    }

    public static void quick(int a[],int s,int e){
        if(s<e){
            int j=split(a,s,e);
            quick(a,s,j-1);
            quick(a,j+1,e);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 8, 9, 1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
