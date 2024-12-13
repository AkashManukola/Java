public class Number_Conversions {
    public static void hex_conv(){
        String s="1F";
        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
        int decimal=0;
        int base=16; 
        
        for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(s.length() - 1 - i);
         for (int j = 0; j < ch.length; j++) {
             if (ch[j] == c) {
                 decimal += j * Math.pow(base, i); 
                 break; 
             }
         }
     }
        System.out.println(decimal);
     int dec1=decimal;
     int dec2=decimal;
     String s1="";
     while(dec1>0){
         int rem=dec1%2;
         s1+=rem;
         dec1/=2;
     }
     System.out.println(s1); 
     String s2=""; 
     while(dec2>0){
         int rem2=dec2%8;
         s2+=rem2;
         dec2/=8;
     }  
     System.out.println(s2);
    }
    public static void octal_conversions(){
        String octal="17";
    
        int decimal = 0;
        int base = 1; // 8^0

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0'; // Convert char to int
            decimal += digit * base;
            base *= 8;
        }
        System.out.println(decimal);
        int hexdecimal=decimal;
        String op="";
        
            while(decimal>0){
                int rem=decimal%2;
                op+=rem;
                decimal/=2;
            }
            char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            StringBuilder sb=new StringBuilder();
            while(hexdecimal>0){
                int rem=hexdecimal%16;
                sb.append(ch[rem]);
                hexdecimal/=16;
            }
            System.out.println(op);
            System.out.println(sb.toString());
    }
    public static void Bin_to_octal(){
        String s="1101";
        int grp_size=3;
        
        int len=s.length();
        int padd=grp_size-(len%grp_size);
 
        if(padd!=grp_size){
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<padd;i++){         
         sb.append('0');
         }
         sb.append(s);
         s=sb.toString();
        }
        StringBuilder res=new StringBuilder();
 
        for(int i=0;i<s.length();i+=3){
             int dec=0;
             int pow=0;
 
             for(int j=grp_size-1;j>=0;j--){
                 if(s.charAt(i+j)=='1'){
                     dec += Math.pow(2,pow);
                 }
                 pow++;
             }
           res.append(dec);  
        }
 
        System.out.println(res.toString());
    }
    public static void Bin_to_hex(){
        String s="1101";
        int grp_size=4;

        int len=s.length();
        int padd=grp_size-(len%grp_size);

        if(padd!=grp_size){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<padd;i++){
                sb.append('0');
            }
            sb.append(s);
            s=sb.toString();
        }
        StringBuilder res=new StringBuilder();
        char[] ch={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int dec=0;
        for(int i=0;i<s.length();i+=4){

            int pow=0;

            for(int j=grp_size-1;j>=0;j--){
                if(s.charAt(i+j)=='1'){
                    dec += Math.pow(2, pow);
                }
                pow++;
            }
            
            res.append(ch[dec]);
        }
        System.out.println(dec);
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
      
    }
    
}

