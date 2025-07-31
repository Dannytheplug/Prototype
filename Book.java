package com.example.Week3;

public class Book {
    private String title;
    private int copies;

    public Book(String title, int copies) {

        this.title = title;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean availableCopies() {
        return copies > 0;
    }

    public void borrow(){
        if (! availableCopies()){
            throw new IllegalStateException("Book is not available");
        }
        copies --;
    }

    public void returnCopies() {
        copies ++;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", copies=" + copies +
                '}';
    }


}
