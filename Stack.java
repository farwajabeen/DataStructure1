  import java.util
  public class Stack
  {  private int top;
     private int[] element;
      
       public Stack()
      {
      element=new int[10];
      top=-1;
      }
      
      void push(int item)
      {top++;
      if(top==9)
          System.out.println("Overflow");
      else
              {
               top++;
      element[top]=item;

      }

      void pop()
      {if(top==-1)
          System.out.println("Underflow");
      else  
      top--;
      }
      void display()
      {
          System.out.println("\nTop="+top+"\nElement="+element[top]);
      }

      public static void main(String args[])
      {
        stack s1=new stack();
        s1.push(10);
        s1.display();
        s1.push(20);
        s1.display();
        s1.push(30);
        s1.display();
        s1.pop();
        s1.display();
      }

  }
