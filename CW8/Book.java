public abstract class Book implements Edition {
    String name;
    String author;
    int price;
    String theme;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {}

    @Override
    public void print() {
        System.out.print(name + " " + price + " " + author);
    }

    @Override
    public void advertise() {
        System.out.print("Advertising");
    }

    public void popular() {
        System.out.print("Very popular book");
    }
}
