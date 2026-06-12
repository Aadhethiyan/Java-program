public class Get {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Get s = new Get();

        s.setName("Dhoni");
        System.out.println("Name: " + s.getName());
    }
}