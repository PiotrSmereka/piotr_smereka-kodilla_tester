public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "€" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2011);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + "€" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2003);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "€" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

    }
}
