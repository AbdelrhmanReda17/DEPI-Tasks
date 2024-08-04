import 'Book.dart';
import 'BookRepository.dart';
typedef BookFilter = bool Function(Book book);

class BookService {
  BookRepository repository;

  BookService(this.repository);

  List<Book> filterBooks(BookFilter filter) {
    return repository.getBooks().where(filter).toList();
  }

  int countCheckedOutBooks() {
    return repository
        .getBooks()
        .fold(0, (count, book) => book.isCheckedOut ? count + 1 : count);
  }

  int totalBooksPublishedAfter(int year) {
    return repository.getBooks().fold(
        0, (count, book) => book.yearPublished > year ? count + 1 : count);
  }

  List<String> getBookTitles() {
    return repository.getBooks().map((book) => book.title).toList();
  }

  void printBookDetails() {
    repository.getBooks().forEach((book) {
      print('Title: ${book.title}, Author: ${book.author}');
    });
  }

  String getBookStatus(Book book) {
    switch (book.isCheckedOut) {
      case true:
        return 'Checked Out';
      case false:
        return 'Available';
      default:
        return 'Unknown Status';
    }
  }
    
  void printList(List<Book> books){
    books.forEach((book) {
      print('Title: ${book.title}, Author: ${book.author}');
    });
  }
}
