class StockSpanner {

    public List<Integer> al;
    public List<Integer> span;


    public StockSpanner() {
        al = new ArrayList<>();
        span = new ArrayList<>();
    }
    
    public int next(int price) {
        int count = 1;
        if (al.size() == 0) {
            span.add(count);
        } else {
            // loop through each value in the arraylist to find consecutive days. Go in reverse
            int right = al.size() -1;

            while (right >= 0 && al.get(right) <= price) {
                count++;
                right--;
            }
            span.add(count);
        }
        al.add(price);

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */