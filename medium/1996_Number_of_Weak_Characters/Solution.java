// Sept 8, 2022
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? (b[1] - a[1]) : a[0] - b[0]);
        // int[][] sortedProperties = preSortByAttack(properties); // nlogn
        int weak = 0;
        int maxDef = 0;
        
        for (int i = properties.length - 1; i >= 0; i--) {
            if (properties[i][1] < maxDef) {
                weak++;
            }
            maxDef = Math.max(maxDef, properties[i][1]);
        }
        
        
        // wrong code
//         for (int i = properties.length - 1; i >= 0; i--) {
//             for (int j = i - 1; j >= 0; j--) {
//                 boolean isDefenceGreater = properties[i][1] > properties[j][1];
//                 boolean isAttackGreater = properties[i][0] > properties[j][0]; 
                
//                 if (isDefenceGreater && isAttackGreater) weak++;
//             }
//         }
        
        return weak;
    }
    
    // public int[][] preSortByAttack(int[][] properties) {
    //     return Arrays.sort(properties, (a,b) -> Integer.compare(a[0], b[0]));
    // }
}

// NOTES 
//      two properties
        //     attack
        //     defence
        // [attk ,def]
        // 2d matrix, array of these
        // each index, i, == a separate char
        
// WEAK IF
//  opponent's attack > curr's attack
// **AND**
//  opponent's def > curr's def

// Return the number of 'weak' characters

// Solution
//      i need to know who is the strongest character
//      

// presort properties by attack
// logic checking then, we just need to know if defence is higher than the others
// 


// Test Case
// [[1,5],[10,4],[4,3]]
// sorted
// [[1,5], [4,3], [10,4]]

// Test Case
// [[1,1],[2,1],[2,2],[1,2]]
// sorted
//  [[1,1],[1,2],[2,1],[2,2],]


