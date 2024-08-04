import '../BookService.dart';
import 'IBookFilter.dart';
import '../Book.dart';
class FilterByTitle implements IBookFilter {
  @override
  BookFilter applyFilter(dynamic title) {
    return (Book book) => book.title == title;
  }
}