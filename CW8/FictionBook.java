public class FictionBook extends Book{
    FictionBook () {
        super();
        theme = "Fiction";
    }

    @Override
    public void popular() {
        System.out.print("Book is so popular!");
    }
}
