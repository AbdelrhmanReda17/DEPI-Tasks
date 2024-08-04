import '../BookFilter.dart';
import '../IBookFilter.dart';
import '../../Book.dart';

class FilterByAuthor implements IBookFilter {
  final String author;
  FilterByAuthor({required this.author});
  @override
  BookFilter applyFilter() {
    return (Book book) => book.author == author;
  }
}