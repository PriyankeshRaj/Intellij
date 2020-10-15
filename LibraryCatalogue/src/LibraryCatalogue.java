import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    Map<String, Books> bookCollection=new HashMap<String,Books>();
    int currentDay=0;
    int lengthOfCheckoutPeriod=7;
    double initialLateFee=0.50;
    double feePerLateDay=1.00;

    public LibraryCatalogue(Map<String, Books> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCatalogue(Map<String, Books> bookCollection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
//getters
    public Map<String, Books> getBookCollection() {
        return bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public Books getBooks(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
//setters
    public void nextDay(){
        currentDay++;
    }
    public void setDay(int day){
        currentDay=day;
    }

    //Instance methods
    public void checkOutBook(String title){
        Books book=getBooks(title);
        if(book.isCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }
        else{
            book.setCheckedOut(true,currentDay) ;
            System.out.println("You have checked out"+title+".It is due on day"+(getCurrentDay()+getLengthOfCheckoutPeriod())+".");
        }
    }
    public void returnBook(String title)
    {
    Books books=getBooks(title);
    int daysLate=currentDay-(books.getDayCheckedOut()+getLengthOfCheckoutPeriod());
    if(daysLate>0)
        System.out.println("You owe the library $"+(getInitialLateFee()+daysLate*getFeePerLateDay())+"because your book is"+daysLate+"days overdue.");
    else
        System.out.println("Book returned.Thank You");

    books.setCheckedOut(false,-1);
    }
    public void sorryBookAlreadyCheckedOut(Books books)
    {
        System.out.println("sorry"+books.getTitle()+"is already checked out. It should be back on day "+(books.getDayCheckedOut()+getLengthOfCheckoutPeriod())+".");
    }
    public static void main(String[] args) {
    Map<String,Books>bookCollection=new HashMap<String,Books>();
    Books harry=new Books("Harry Potter",827132,999999);
    bookCollection.put("Harry Potter",harry);
    LibraryCatalogue lib=new LibraryCatalogue(bookCollection);
    lib.checkOutBook("Harry Potter");
    lib.nextDay();
    lib.nextDay();
    lib.checkOutBook("Harry Potter");
    lib.setDay(17);
    lib.returnBook("Harry Potter");
    lib.checkOutBook("Harry Potter");
    }
}
