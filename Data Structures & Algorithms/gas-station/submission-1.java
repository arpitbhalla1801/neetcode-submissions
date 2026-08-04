class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for (int i=0;i<n;i++){
            int fuel = 0;
            boolean roundTrip = true;
            for(int j=i;j<n+i+1;j++) { 
                fuel =fuel + gas[j%n]-cost[j%n];
                if(fuel < 0)
                {
                    roundTrip = false;
                    break;
                }
            }
            if(roundTrip)
                return i;
        }
        return -1;
    }
}