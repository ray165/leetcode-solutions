
// Dirty O(n2) solution.
// Alternatively we could do this in 1 pass as we know that
// time that it takes == sum of all preceeding buyers 
// and subtract the buyers with greater tickets than tickets[k]
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int time = 0;
        
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }
                
                if (tickets[k] == 0) {
                    return time;
                }
            }    
        }
        
        return time;
        
    }
}