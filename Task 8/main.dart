import 'Budget.dart';
import 'Transaction.dart';

void main() {
var myBudget = Budget();

  myBudget.addTransaction(Transaction(amount: 100, description: "A", type: "income"));
  myBudget.addTransaction(Transaction(amount: 200, description: "B", type: "expense"));

  // print("Total Income: ${myBudget.totalIncome()}");
  // print("Total Expenses: ${myBudget.totalExpenses()}");
  // print("Current Balance: ${myBudget.balance()}");

  myBudget.displaySummary();
}