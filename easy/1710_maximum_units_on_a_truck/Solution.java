// Sept 28, 2022
// So we can improve this by using Math.min(truckSize, boxTypes[i][0]
// Notice how we have two if statements and the sum +=
// Depends on the LOWER of the variables... Could have saved the if else by using Math.min

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        int sum = 0; 
        
        for (int i = 0; i < boxTypes.length; i++) {
            // Add all boxes if we can
            if (truckSize >= boxTypes[i][0]) {
                truckSize -= boxTypes[i][0];
                sum += boxTypes[i][0] * boxTypes[i][1];
            } else if (boxTypes[i][0] > truckSize) {
                // Take as much as we can from truckSize
                sum += truckSize * boxTypes[i][1];
                truckSize -= truckSize;
            }
            
            if (truckSize == 0) return sum;
        }
        
        return sum;
        
    }
}

// truck size == max # of boxes 
// number of boxes == # of boxes of type 'i'
// each box type == fits X# of units inside 

// Sort the 2D array with number Of Units as the anchor point
// Empty out the array and add the total totals every 'i'
