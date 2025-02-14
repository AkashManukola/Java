import java.util.Arrays;

public class Merge_Sort {
    public static int[] merge(int left[],int right[]){
        int n=left.length;
        int m=right.length;

        int newarr[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(left[i]<right[j]){
                newarr[k++]=left[i++];
            }else newarr[k++]=right[j++];
        }

        while(i<n){
            newarr[k++]=left[i++];
        }
        while(j<m){
            newarr[k++]=right[j++];
        }

        return newarr;
    }
    public static int[] split(int a[]){
        int n=a.length;
        if(n==1){
            return a;
        }
        int mid=n/2;
        int left[]=split(Arrays.copyOfRange(a, 0, mid));
        int right[]=split(Arrays.copyOfRange(a,mid,n));

        return merge(left,right);
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 8, 9, 1};
        System.out.println(Arrays.toString(split(arr)));
    }
}
