public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600", 1000, 2015);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "€" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkYearPrice();

        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight +'g');


        Notebook heavyNotebook = new Notebook("2000", 1500, 2011);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + "€" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearPrice();

        String heavyNotebookWeight = heavyNotebook.getWeight();
        System.out.println(heavyNotebookWeight+'g');


        Notebook oldNotebook = new Notebook("1200", 600, 2003);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "€" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkYearPrice();

        String oldNotebookWeight = oldNotebook.getWeight();
        System.out.println(oldNotebookWeight+'g');
    }
}
