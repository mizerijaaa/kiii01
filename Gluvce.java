class Gluvce {
    private String name;

    public Gluvce(String name) {
        this.name = name;
    }

    // Simple method to print a greeting
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // Simple method to set a new name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Gluvce gluvce = new Gluvce("Alice");
        gluvce.greet();
        gluvce.setName("Bob");
        gluvce.greet();
    }
}
