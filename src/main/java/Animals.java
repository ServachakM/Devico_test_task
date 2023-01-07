public class Animals {

    private String name;
    private int quantity;

    public Animals() {
    }

    public Animals(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Animals {" +
                "name = \"" + name + "\"," +
                " quantity = " + quantity +
                "}";
    }
}
