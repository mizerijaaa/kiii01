class Ruter {
    private String task;

    public Ruter(String task) {
        this.task = task;
    }

    // Simple method to print the current task
    public void performTask() {
        System.out.println("Performing task: " + task);
    }

    // Simple method to change the task
    public void changeTask(String task) {
        this.task = task;
    }

    public static void main(String[] args) {
        Ruter ruter = new Ruter("Deliver Package");
        ruter.performTask();
        ruter.changeTask("Collect Payment");
        ruter.performTask();
    }
}
