public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String [5];
        books [0] = "Book_1";
        books [1] = "Book_2";
        books [2] = "Book_3";
        books [3] = "Book_4";
        books [4] = "Book_5";

        String book = books [3];
        System.out.println(book);
        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera" +" "+ books.length +" " + "elementów");
    }
}
