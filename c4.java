



public class c4 {
    public static void main(String[] args) {
    //     String s="aabbcbbaa";
    //    System.out.println( remove(s));

    }
    public static int demo(int arr[],int n){
        int totalsum=0;
        int leftsum=0;

        for(int sum : arr){
        totalsum+=sum;
        }

        for(int i=0;i<n;i++){
            totalsum -= arr[i];

            if(leftsum == totalsum){
                return i;
            }
            
            leftsum += arr[i];
        }
        return -1;



    }
    public static String remove(String s){
        int x=0;
        int y=s.length()-1;
        while(x<y){
        if(s.charAt(x)==s.charAt(y)){
            x++;
            y--;
        }else 
        break;
        
    }
    return s.substring(x,y+1);
    
    }
    public static void fibo(int n){
        for(int i=0;i<n;i++){
            if(i+(i+1)==n){
                System.out.println("yes");
            }else
            i++;
            else
            System.out.println();
            }

        }
        
    }

    
    

