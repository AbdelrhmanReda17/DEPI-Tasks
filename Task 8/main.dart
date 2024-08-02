import 'Budget.dart';
import 'Transaction.dart';

void main() {
var myBudget = Budget();

  myBudget.addTransaction(Transaction(1000, "X", "income"));
  myBudget.addTransaction(Transaction(200, "B", "expense"));

  // print("Total Income: ${myBudget.totalIncome()}");
  // print("Total Expenses: ${myBudget.totalExpenses()}");
  // print("Current Balance: ${myBudget.balance()}");

  myBudget.displaySummary();
}