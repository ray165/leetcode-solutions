
// Sept 17, 2022
// Use of a Queue to keep track of the first-most item that needs to be removed from
// the running sum
// Use of the queue size to determine what to divide for the sliding window
class MovingAverage {
    
    int windowSize;
    Queue<Integer> q;
    int runningSum;

    public MovingAverage(int size) {
        windowSize = size;
        q = new LinkedList<>();
        runningSum = 0;
    }
    
    public double next(int val) {
        if (q.size() >= windowSize) {
            runningSum -= q.remove();
        }
        q.add(val);
        runningSum += val; 
        
        return runningSum * 1.0 / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */