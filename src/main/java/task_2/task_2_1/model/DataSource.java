package task_2.task_2_1.model;

import task_2.task_2_1.model.entity.Book;

public class DataSource {
    public static Book[] getBooks(){
        return new Book[]{
          new Book("Title1", "Shevchenko", "BXV", 2010,320,459.0),
          new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
          new Book("Title3", "Sokolov", "Veselka", 2006,320,1050.0),
          new Book("Title4", "Maslov", "Kamenar", 2016,1014,569.0),
          new Book("Title5", "Blinov", "Karpaty", 2016,102,399.0),
          new Book("Title6", "Kramar", "Mayak", 2018,874,989.0),
          new Book("Title7", "Gadzhalov", "Molod", 2012,987,679.0),
          new Book("Title8", "Shevchenko", "Osvita", 2015,375,899.0),
          new Book("Title9", "Balev", "BXV", 2011,946,489.0),
          new Book("Title10", "Kolchack", "Tavria", 2017,645,500.0),
        };
    }

}
