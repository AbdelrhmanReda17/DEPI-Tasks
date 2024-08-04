import '../BookFilter.dart';
import '../IBookFilter.dart';
import '../../Book.dart';

enum FilterIdentifier { Before, After, Equal }

class FilterByYearPublished implements IBookFilter {
  final int year;
  final FilterIdentifier identifier;
  FilterByYearPublished({required this.year , required this.identifier });
  @override
  BookFilter applyFilter() {
    return (Book book) {
      if (identifier == FilterIdentifier.Before) {
        return book.yearPublished < year;
      } else if (identifier == FilterIdentifier.After) {
        return book.yearPublished > year;
      } else {
        return book.yearPublished == year;
      }
    };
  }
}