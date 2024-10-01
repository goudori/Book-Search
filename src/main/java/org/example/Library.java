package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// 図書室クラス
public class Library {

  //  本のリスト
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  //  追加の本
  public void addBook(Book book) {
    books.add(book);
  }

  //  タイトルで、本を検索
  public Optional<Book> searchBookTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().equalsIgnoreCase(title))
        .findFirst();
  }

  //  本を表示
  public void displayBooks() {
    String bookList = books.stream()
        .map(Book::toString)
        .collect(Collectors.joining("\n"));
    System.out.println(bookList);
  }

}
