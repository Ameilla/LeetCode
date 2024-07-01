class Solution {
    public int minBitFlips(int start, int goal) {
        int mask = start ^ goal;
        int count = 0;
        for(int i=0;i<31;i++)
        {
            if((mask & (1<<i)) != 0)
                count++;
        }
        return count;
        
    }
}