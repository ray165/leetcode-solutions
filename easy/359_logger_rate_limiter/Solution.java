class Logger {
    
    Map<String, Integer> map;

    public Logger() {
        map = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean allowable = true;
        if (!map.containsKey(message) || (map.containsKey(message) && timestamp >= map.get(message))) {
            // add it to the key with the next time stamp; 
            map.put(message, timestamp + 10);
        } else {
            // if it does contain the key, check if 
            allowable = timestamp >= map.get(message);
        }
        
        return allowable;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */

// i'll make a hashmap that creates
// key == 'foo'
// value == NEXT time stamp allowed 