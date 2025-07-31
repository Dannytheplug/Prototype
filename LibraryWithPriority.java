package com.example.Week4;

import com.example.Week3.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LibraryWithPriority {
    //    Wednesday, 16 July 2025
    private Map<String, Book> books = new HashMap<>();
    private PriorityQueue<BookRequest> queue = new PriorityQueue<>(new Comparator<BookRequest>() {
        @Override
        public int compare(BookRequest o1, BookRequest o2) {
            User u1 = o1.getUser();
            User u2 = o2.getUser();

            if (u1 instanceof Teacher && !(u2 instanceof Teacher)) return -1;
            if (!(u1 instanceof Teacher) && u2 instanceof Teacher) return 1;

            if (u1 instanceof Student && u2 instanceof Student) {
                return Integer.compare(((Student) u2).getLevel(), ((Student) u1).getLevel());

            }

            return Long.compare(o1.getTimeStamp(), o2.getTimeStamp());
        }

    });

    public void addBook(String title, int copies) {
        books.put(title, new Book(title, copies));
    }

    public void requestBook(User user, String title) {
        queue.offer(new BookRequest(user, title));
    }

    public String serveNextRequest() {
        if (queue.isEmpty()) return "no request";

        BookRequest request = queue.poll();


        Book book = books.get(request.getBookTitle());

        if (book == null || !book.availableCopies())
            return "Sorry  has been taken";
        book.borrow();
        return request.getUser().getName() + " borrowed " + request.getBookTitle();
    }
}