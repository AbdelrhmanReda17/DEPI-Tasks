import '../BookService.dart';

abstract class IBookFilter {
  BookFilter applyFilter(dynamic criteria);
}