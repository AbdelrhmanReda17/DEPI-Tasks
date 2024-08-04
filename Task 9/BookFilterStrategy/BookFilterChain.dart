// BookFilterChain.dart
import '../Book.dart';
import 'IBookFilter.dart';
class BookFilterChain {
  final List<IBookFilter> filters = [];

  void addFilter(IBookFilter filter) {
    filters.add(filter);
  }

  List<Book> applyFilters(List<Book> books) {
    List<Book> filteredBooks = books;
    for (var filter in filters) {
      filteredBooks = filteredBooks.where(filter.applyFilter()).toList();
    }
    return filteredBooks;
  }
}
