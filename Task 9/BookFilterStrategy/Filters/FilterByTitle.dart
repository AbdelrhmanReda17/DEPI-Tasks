import '../BookFilter.dart';
import '../IBookFilter.dart';
import '../../Book.dart';
class FilterByTitle implements IBookFilter {
  final String title;
  FilterByTitle({required this.title});
  @override
  BookFilter applyFilter() {
    return (Book book) => book.title == title;
  }
}