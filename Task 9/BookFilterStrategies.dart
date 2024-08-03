import 'Book.dart';
import 'LibraryUtils.dart';

class BookFilterStrategies {
  static BookFilter byAuthor(String author) {
    return (Book book) => book.author == author;
  }

  static BookFilter byCheckedOutStatus(bool isCheckedOut) {
    return (Book book) => book.isCheckedOut == isCheckedOut;
  }

  static BookFilter byYearPublishedAfter(int year) {
    return (Book book) => book.yearPublished > year;
  }

  static BookFilter byTitle(String title) {
    return (Book book) => book.title == title;
  }

  static BookFilter byUnknownAuthor() {
    return (Book book) => book.author == 'Unknown';
  }
}
