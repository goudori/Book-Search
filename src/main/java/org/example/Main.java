package org.example;

import java.util.Optional;
import java.util.Scanner;

// メインクラス
public class Main {

  public static void main(String[] args) {
    Library library = new Library();

//    追加の本
    library.addBook(new Book("Java入門書", "ジャヴァ", 12));
    library.addBook(new Book("Micraゲーム本", "マイクラ", 7));

//    図書館にある本を表示
    System.out.println("図書館にある本:");
    library.displayBooks();

//    本の検索
    System.out.println("本のタイトルを入力");
    Scanner scanner = new Scanner(System.in);
    String searchTitle = scanner.nextLine();

//    nullを避ける為に、安全に本を検索
    Optional<Book> foundBook = library.searchBookTitle(searchTitle);
    foundBook.ifPresentOrElse(
        book -> System.out.println(
            "本が見つかりました。:" + book.getTitle() + book.getAuthor() + book.getNum()),
        () -> System.out.println("本が見つかりませんでした。")
    );
    scanner.close();
  }
}
