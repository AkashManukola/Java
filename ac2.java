public class ac2 {
    public static void main(String[] args) {
        String str="akash";
        removeduplicate(str, 0,new StringBuilder(""),new boolean[26]);
        
    }
    public static void removeduplicate(String str,int idx,StringBuilder newStr,boolean map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char cur=str.charAt(idx);

        
        if (map[cur - 'a']) {
            removeduplicate(str, idx + 1, newStr, map);
        } else {
            map[cur - 'a'] = true;
            removeduplicate(str, idx + 1, newStr.append(cur), map);
        }
    
}
}
