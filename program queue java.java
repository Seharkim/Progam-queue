/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
 
       static void printQueueVertically(Queue<String>queue){
       System.out.println("---");
       Iterator<String> i = queue.iterator();
       while (i.hasNext()) {
       String s = i.next();
       System.out.println(s);
       }
       System.out.println("---");
       }
 
       static void printQueueHorizontally(Queue<String>queue){
       if(!queue.isEmpty()){
       System.out.println("---");
       System.out.println("Queue elements : " + queue);
       System.out.println("---");
       }
       else{
       System.out.println("---");
       System.out.println("Queue is empty!");
       System.out.println("---");
       }
    }
 
          public static void main(String[] args) {
 
               Queue<String> queue = new LinkedList<String>(); // create queue
               // add elements into queue
               queue.add("MIE BAKSO");
               queue.add("BEBEK GORENG");
               queue.add("DENDENG SAPI BALADO");
               queue.add("UDANG SAUS TIRAM");
               queue.add("SATE IKAN");
               queue.add("SEMUR AYAM"); 
 
               System.out.println("Daftar element(s) vertically :");
               printQueueVertically(queue); // print the elements of queue
               printQueueHorizontally(queue);
               System.out.println("The queue contain "+ queue.size() + " elements");
               // return the item at the head (without removing it)
               System.out.println("The head element (peek) : " + queue.peek());
 
               // delete the bottom element of a queue
               System.out.println("Delete (poll) element : " + queue.poll());
               System.out.println("Daftarelement(s) after poll :");
               printQueueHorizontally(queue);
               System.out.println("Delete (remove) element : " + queue.remove());
               System.out.println("Daftarelement(s) after remove :");
               printQueueHorizontally(queue);
 
               System.out.println("Delete all element : " + queue.removeAll(queue)); // delete all
               printQueueHorizontally(queue);
               System.out.println("Queue: " + queue);
 
       } //main
}//class