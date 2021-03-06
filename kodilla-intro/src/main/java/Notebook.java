public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <=1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public int getWeight(){
        return this.weight;
    }
    public void checkYearPrice() {
        if (this.price < 600 && this.year < 2005) {
            System.out.println("Price drop due massive depreciation.");
        } else if (this.price < 1100 && this.year > 2010) {
            System.out.println("Great deal!");
        } else {
            System.out.println("Please wait for better offer.");
        }
    }
}