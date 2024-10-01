package org.example;

//　本クラス
public class Book {

  //　タイトル
  String title;

  //  著者
  String author;

  //　番号
  int num;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNum() {
    return num;
  }

  public Book(String title, String author, int num) {
    this.title = title;
    this.author = author;
    this.num = num;
  }

  @Override
  public String toString() {
    return title + "著者名" + author + "No." + num;
  }


}
