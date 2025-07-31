package com.example.Week3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//Thursday, 10 July 2025
public class LibraryWithoutPriority {
    //Thursday, 10 July 2025
    private Map<String, Book> books = new HashMap<>();
    private Queue<BookRequest>  queue = new LinkedList<>();

    public void addBook(String title, int copies){
        books.put(title, new Book(title, copies));
    }

    public void requestBook(User user, String title){
        queue.offer(new BookRequest(user, title));
    }

    public String serveNextRequest(){
        if(queue.isEmpty()) return "no request";

        BookRequest request = queue.poll();

//        Monday, 14 July 2025
        Book book = books.get(request.getBookTitle());

        if (book == null || !book.availableCopies())
            return "Book has been taken";
        book.borrow();
        return request.getUser().getName() + " borrowed " + request.getBookTitle();
    }

}
