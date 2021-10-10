import java.util.Scanner;
import java.io.*;

public class CalculatorUsesBrackets {

  public static void main(String[] args) {
    //Declaration of variables
    Scanner keyboard = new Scanner(System.in);
    Stack<String> operands = new Stack<String>(100);
    Stack<String> operators = new Stack<String>(100);
    int i, L ;
    char token ;
    String op ;
    String mathExpr = keyboard.nextLine();
    L =  mathExpr.length() ;
      if ( L < 1 )
        return ;
      i = 0 ;

    while ( i < mathExpr.length()) {
      token = mathExpr.charAt(i);
      switch(token) {
        case '(' :
        /* do nothing */
        break;
        case '+' :
        case '-' :
        case '*' :
        case '/' :
          operators.pushItem(Character.toString(token));
        break ;
        case '0' :
        case '1' :
        case '2' :
        case '3' :
        case '4' :
        case '5' :
        case '6' :
        case '7' :
        case '8' :
        case '9' :
          operands.pushItem(Character.toString(token)) ;
        ; break ;
        case ')':
        {
          op = operators.popItem();
          String oper1 = operands.popItem();
          String oper2 = operands.popItem();
          String result = perform(oper1,op,oper2);
          if (result != null )
            operands.pushItem(result);
          else
            System.out.println("There was an error from perform");
        } ;
        break ;
      }
      i++;
    } //end of for loop


if (!operators.isEmpty()) {
  op = operators.popItem();
  String oper1 = operands.popItem();
  String oper2 = operands.popItem();
  String result = perform(oper1,op,oper2);

  if (result != null )
    operands.pushItem(result);
  else
    System.out.println("There was an error from perform");
}

System.out.println(operands.popItem());

} //end of main method

public static String perform(String leftOperand,
 String operator, String rightOperand) {

  String result = "";
  double left = Double.parseDouble(leftOperand);
  double right = Double.parseDouble(rightOperand);
  double r = 0.0 ;
  switch (operator) {
    case "+":
    r = left + right ;
    break;
    case "-":
    r = left - right ;
    break;
    case "*":
    r = left * right ;
    break;
    case "/":
    {

      if ( right < 0.0 || right > 0.0 ) {
        r = (double)((double)left ) / ((double)right) ;
      } else {
        try {
          throw new Exception("Trying to divide by zero");
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    } ;
    break ;
  } ;


    if (operator.equals("/"))
      result = String.valueOf(r) ;
    else
      result = String.valueOf(((int)r));

  return result ;
}


}
