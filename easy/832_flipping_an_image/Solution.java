class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // reverse
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            
            if (image[i].length % 2 == 1) {
                int mid = image[i].length / 2;
                image[i][mid] = image[i][mid] == 1 ? 0 : 1;
            }
            
            while (left < right) {
                // swap;
                int temp  = image[i][left] == 1 ? 0 : 1;
                image[i][left] = image[i][right] == 1 ? 0 : 1;
                image[i][right] = temp;
                
                left++;
                right--;
            }
        }
        
        return image;
    }
}

// store the into the hashmap

// Key = index in 2D array, Value = Stack<Integer> 


// Loop through the keys int he hash map from 0 ... n
// Populate an ArrayList by popping off the stack. 
//      if we see 1, add 0
//      if we see 0, add 1


// convert arraylist to 2d arrray 