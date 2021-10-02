import java.io.*;
public class Stack<Item> {
  private Item[] a ;
  private int N ;

  public Stack(int capacity) {
    try {
      throwExceptionIfInvalidSize(capacity) ;
      a = (Item[]) new Object[capacity];
      N = 0 ;
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void throwExceptionIfInvalidSize(int capacity) {
    if (capacity > 0 ) {
      a = (Item[]) (new Object[capacity]);
      N = 0 ;
    } else {
      try {
        throw new Exception("The capacity of the stack must be greater 0");
      } catch (Exception e) {
        e.printStackTrace();
      }

    }
  }

  public boolean isEmpty() {
    return (N == 0) ;
  }

  public int size() {
    return N ;
  }

  public void pushItem(Item item) {

    if ( N == a.length) resize( 2 * a.length );
    a[N] = item ;
    N++;
  }

  public Item popItem() {
    Item item = null ;
    if ( N > 0 ) {
      N-- ;
      item = a[N];
      a[N] = null ;
    }

    if ( N > 0 && N == a.length/4) resize(a.length/2) ;
    return item ;
  }

  public void resize(int max) {

      try {
        throwExceptionIfInvalidSize(max) ;
        Item[] temp  = (Item[]) new Object[max];
        for (int i=0 ; i < N ; i++)
           temp[i] = a[i] ;
        a = temp ;
      } catch (Exception e) {
        e.printStackTrace();
      }
  }




}
