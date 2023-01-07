class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {
            int tank = 0;
            boolean canComplete = true;
            if (gas[i] == 0) continue;
            for (int j = i; j < gas.length * 2; j++) {
                int currStation = j % gas.length;
                // refill 
                tank += gas[currStation];
                tank -= cost[currStation];

                if (tank < 0) {
                    canComplete = false;
                    break;
                } 

            }

            if (canComplete == true) return i; 
        }

        return -1;
    }
}

/**
    circular indexing by 
    int i = 0; i < gas.length *2 
    circularIndex = i % gas.length

    FAIL CONDITION => Tank is negative after refilling and exercising the cost

    find the index where a loop is possible 

    gas[] = amount contained at the i'th station

    cost[] = cost to go from the ith station to the NEXT


 */