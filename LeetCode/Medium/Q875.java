package LeetCode.Medium;

public class Q875 {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1 ; int e = Arrays.stream(piles).max().getAsInt();
        int ans = e;
        while(s <= e){
            int m = s + ( e - s) / 2;    
            if(canFinish(piles,h ,m)){
                ans = m;
                e = m - 1;
            }
            else{
                s = m + 1;
            }                        
        }
        return ans;

    }
    public boolean canFinish(int[] piles , int h , int k){
        long hours = 0;
        for(int pile: piles){
            hours+=pile/k;
            if(pile% k!=0) hours ++;
        }
        return hours <=h;
    }
}
