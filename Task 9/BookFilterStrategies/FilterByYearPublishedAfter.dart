import '../BookService.dart';
import 'IBookFilter.dart';
import '../Book.dart';

class FilterByYearPublishedAfter implements IBookFilter {
  @override
  BookFilter applyFilter(dynamic year) {
    return (Book book) => book.yearPublished > year;
  }
}