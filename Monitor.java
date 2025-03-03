class Monitor {
    private int count;

    public Monitor() {
        this.count = 0;
    }

    // Increment by a specific value
    public void increment(int value) {
        count += value;
        System.out.println("Count incremented by " + value + ": " + count);
    }

    // Simple method to get the current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.increment(5);  // Increment by 5
        System.out.println("Current count: " + monitor.getCount());
    }
}
