import java.util.Arrays;

public class Toh{
    public static void main(String[] args) {
        
      int arr[]={1,5,6,7,2};
      for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]);
        
        
      }
      Arrays.sort(arr);
      System.out.println();
      for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]);
        
      }


   }

   public static void henoi(int n,String src,String helper,String des){
         if(n==1){
             System.out.println(" transfer disk  "+n+ " from  "+src+"  to  "+des);
             return;
         }
         henoi(n-1, src,des,helper);
         System.out.println("  transfer disk   "+n+"  from  "+src+"  to  "+des);
         henoi(n-1, helper, src,des);
    }
    public static void rev(String s,int idx){
        if(idx==0){
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        rev(s, idx-1);
    }
    public static  void occ(String s,char ele,int idx){
        int first=-1;
        int last =-1;
        if(idx<0){
            
            return ;
        }
        if(s.charAt(idx)==ele){
           if(first ==-1){ first=idx;

        }
         last = idx;}
        occ(s, ele, idx-1);
       
        

    }
    public static void xx(int arr[],int value){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<value){
                System.out.println(arr[i]);
            }
        }
        
    }
    public static void xy(int arr[],int value)
    {
        if(arr[i]<0){
            return;
        }

    }
    public static void xn(String s,int idx){
        StringBuilder sb=new StringBuilder("");
        int current=s.charAt(idx);
        if(idx==s.length()-1){
            return;
        }
        if(current!='x'){
            sb.append(current);
        }
        
        xn(s, idx+1);
        
        

    }
   
    }
    

