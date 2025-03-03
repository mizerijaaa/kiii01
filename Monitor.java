class Monitor {
    private int count;

    public Monitor() {
        this.count = 0;
    }

    // Simple method to increment the count
    public void increment() {
        count++;
        System.out.println("Count incremented: " + count);
    }

    // Simple method to get the current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.increment();
        System.out.println("Current count: " + monitor.getCount());
    }
}
