// Sept 24, 2022
class Solution {
    public int sum(int num1, int num2) {
        int sum = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        boolean bothNegative = false; 
        if ((num1 * num2) > 0) bothNegative = true;
        
        map.put(num1, true);
        map.put(num2, true);
        
        for (Integer x : map.keySet()) {
            sum += x;
        }
        
        
        while (num2 != 0)
        {
            // carry now contains common set bits of x and y
            int carry = num1 & num2;

            // Sum of bits of x and y where at least one of the bits is not set
            num1 = num1 ^ num2;

            // Carry is shifted by one so that adding it to x gives the required sum
            num2 = carry << 1;
        }
        System.out.println(num1 + " " + sum);
        
        return num1;
    }
}