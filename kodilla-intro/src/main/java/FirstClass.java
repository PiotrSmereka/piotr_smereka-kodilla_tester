public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "€" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkYearPrice();

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight +'g');


        Notebook heavyNotebook = new Notebook(2000, 1500, 2011);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + "€" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearPrice();

        int heavyNotebookWeight = heavyNotebook.getWeight();
        System.out.println(heavyNotebookWeight+'g');


        Notebook oldNotebook = new Notebook(1200, 600, 2003);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "€" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkYearPrice();


        int oldNotebookWeight = oldNotebook.getWeight();
        System.out.println(oldNotebookWeight+'g');

        Sum main = new Sum();
        int[] numbers = new int [] {1,2,3,4,5};
        System.out.println(main.sumNumbers(numbers));


        Random countOfRandomNumbers = new Random();
        int max = 6;
        System.out.println(countOfRandomNumbers.getCountOfRandomNumber(max));



    }

}
