import java.util.Scanner;
import java.io.*;

public class CalculatorFinalVersion {

  public static void main(String[] args) {
    //Declaration of variables
    Scanner keyboard = new Scanner(System.in);
    Stack<String> operands = new Stack<String>(100);
    Stack<String> operators = new Stack<String>(100);
    int i, L ;
    String token ;
    String EXIT = "exit" ;
    String op ;
    String mathExpr = "whatever";
    String[] tokensList ;

    while (!mathExpr.equals(EXIT)) {
      System.out.print("\nEnter a math expression : ") ;
      mathExpr = keyboard.nextLine();
      tokensList = mathExpr.trim().split("\\s+");
      L =  tokensList.length ;
        if ( L < 1 )
          return ;

      i = 0 ;
      while ( L > 0 && i < L) {
        token = tokensList[i];

        switch(token) {
          case "(" :
          //do nothing
          break;
          case "+" :
          case "-" :
          case "*" :
          case "/" :
            operators.pushItem(token);
          break ;
          case ")" : {
            op = operators.popItem();
            String oper2 = operands.popItem();
            String oper1 = operands.popItem();
            String result = perform(oper1,op,oper2);
            operands.pushItem(result);
          }
          break ;
          default : {
            if (token.matches("[+-]?\\d*(\\.\\d+)?") ) {
                  operands.pushItem(token) ;
            }
          } ; break ;
        } ;


        i++;
      } //end of for loop


      if (!operators.isEmpty()) {
        op = operators.popItem();
        String oper2 = operands.popItem();
        String oper1 = operands.popItem();
        String result = perform(oper1,op,oper2);

        if (result != null )
          operands.pushItem(result);
        else
          System.out.println("There was an error from perform");

        System.out.println(operands.popItem());
      }


    }

    keyboard.close();
} //end of main method

public static String perform(String leftOperand,
 String operator, String rightOperand) {
  String result = new String();
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
  }

  if (operator.equals("/"))
    result = String.valueOf(r) ;
  else
    result = String.valueOf(((int)r));
  return result ;
}


}
