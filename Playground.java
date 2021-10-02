import java.util.Scanner;
import java.io.*;

public class Playground {

  public static void main(String[] args) {
    //System.out.println(perform("12", "/", "4"));
    Scanner keyboard = new Scanner(System.in);
    Stack<String> operands = new Stack<String>(100);
    Stack<String> operators = new Stack<String>(100);
    String mathExpr = keyboard.nextLine();
    int i, L ;
    char token ;
    String op ;
    L =  mathExpr.length() ;
    if ( L < 1 )
      return ;
    i = 0 ;
    while ( i < mathExpr.length()) {
      token = mathExpr.charAt(i);
      switch(token) {
        case '(' :
         /* do nothing */  ;
        break ;
        case '+' :
        case '-' :
        case '*' :
        case '/' : {
          Character ch =  new Character(token) ;
          operators.pushItem(ch.toString()) ;
        } ;
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
        case '9' :{
          Character ch =  new Character(token) ;
          operands.pushItem(ch.toString()) ;
        }
        break ;

        case ')':
        {
          op = operators.popItem();
          String oper1 = operands.popItem();
          String oper2 = operands.popItem();
          String result = perform(oper1,op,oper2);
          operands.pushItem(result);
        }
        break ;
      }

      i++;
    }
    System.out.println(operands.popItem());
  }

  public static String perform(String leftOperand,
   String operator, String rightOperand) {
    String result = new String();
    double left = Double.parseDouble(leftOperand);
    double right = Double.parseDouble(rightOperand);
    double r = 0 ;
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

        if ( right != 0.0 ) {
          r = left / right ;
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
    result = String.valueOf(r) ;
    return result ;
  }


}
