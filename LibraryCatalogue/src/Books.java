public class Books {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public Books(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }
//Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }
//Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setCheckedOut(boolean checkedOut,int dayCheckedOut) {
        this.isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
