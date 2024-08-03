import "Book.dart";

class BookRepository {
  List<Book> books = [];

  void addBook(Book book) {
    books.add(book);
  }

  void removeBook(Book book) {
    books.remove(book);
  }

  List<Book> getBooks() {
    return books;
  }
}
