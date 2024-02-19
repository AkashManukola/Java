import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mw {
    public static int ans(ArrayList<Integer> Mainlist){
        int maxwater=0;
        for(int i=0;i<Mainlist.size();i++){
            for(int j=i+1;j<Mainlist.size();j++){
                int height=Math.min(Mainlist.get(i), Mainlist.get(j));
                int width=j-i;
                int currentwater=height*width;
                maxwater=Math.max(maxwater, currentwater);
            }
        }
        return maxwater;
    }
    public static int pomiter(ArrayList<Integer> Mainlist){
        int maxwater=0;
        int left=0;
        int right=Mainlist.size()-1;
        for(int i=0;i<Mainlist.size();i++){
            
            while (left<right) {
                int height=Math.min(Mainlist.get(left),Mainlist.get(right));
                int width=right-left;
                int currentwater=height*width;
                maxwater=Math.max(maxwater, currentwater);
                if (Mainlist.get(left) < Mainlist.get(right)) {
                    left++;
                    
                } else {
                    right--;
                    
                }                
            }

        }
        return maxwater;
    }
    public static boolean  pairs(ArrayList<Integer> Mainlist,int target){
        Collections.sort(Mainlist);
        for(int i=0;i<Mainlist.size();i++){
            for(int j=i+1;j<Mainlist.size();j++){
                if(Mainlist.get(i)+Mainlist.get(j)==target){
                    return true;
                }

            }
        }
        return false;
    }
    public static boolean pairss(ArrayList<Integer> Mainlist,int target){
        int left=0;
        int right=Mainlist.size()-1;
        while (left<right) {
            for(int i=0;i<Mainlist.size();i++){
                if(right+left==target){
                    return true;
                }
                else
                {
                    left++;
                    right--;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Mainlist=new ArrayList<>();
        Mainlist.add(2);
        Mainlist.add(7);
        Mainlist.add(5);
        Mainlist.add(3);
        Mainlist.add(8);
        Mainlist.add(6);
        Mainlist.add(7);
        Mainlist.add(5);
        // System.out.println(ans(Mainlist));
        System.out.println(pairss(Mainlist, 100));
    }

    
}
