//Read a character from the keyboard.
class KbIn {
   public static void main (String args [] )
     throws java.io.IoException {

       char ch;

       System.out.print("Press a key followed by Enter: ");

       ch = (char) System.in.read();// get a char

       System.out.println("your key is: " + ch);
      
     }
   }