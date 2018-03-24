/*
  Coded By : Medi Assumani
  Language : Java
  Topic : Linked List

  Purpose : Implementing The Linked List Data Structure from scratch
*/
import java.util.*;
import java.io.IOException;
/*
  * The Node class acts as an helper class for the Linked List Class
  * @param AnyType : The generuc parameter type . e,g : Interger, String, Double
*/
class LinkedList<AnyType>{

  private static class Node<AnyType>{

      private AnyType data;
      private Node<AnyType> next;
      private static int counter = 0;

      public Node(AnyType data){
          this.data = data;
          this.next = null;
        }

  } //  end of the Node Class

  private Node<AnyType> head;

  public LinkedList(){
      head = null;
    }

  /*
  This function checks wheater or not the list is empty by returning a true or false value
  Time Complexity : 
  */
  public boolean isEmpty(){
      return this.head == null;
    }
/*
  public int length(){
    if(this.isEmpty){
      return 0;
    }else{
      for(int index = 0; index < )
    }
  }
  */

    /*inserts a new elemnt in the tail of the list
      Time Complexity :
    */
   public void append(AnyType data){
     if (this.isEmpty()) {
       this.prepend(data);
       return;

     }
     Node<AnyType> currentNode = this.head;
     while (currentNode.next != null){
       currentNode = currentNode.next;
     }
     currentNode.next = new Node<AnyType>(data);

   }
  /* Thisf function inserts new element at the head of the list
    Time Complexity :
  */
   public void prepend(AnyType data){

    Node <AnyType> new_node = new Node<AnyType> (data);
    new_node.next = this.head;
    head = new_node;
   }

   /*
   This funcion parses through each node and prints the element
   Time Complexity :

   */
   public void print(){

     if(this.isEmpty()){
       System.out.println("The list is Empty.");
     }

     try{

       Node<AnyType> temp = this.head;
       while(temp.next != null){
         temp = temp.next;
         System.out.println(temp.data);
       }
     } catch (NullPointerException e){
       System.out.println("Error Found : Null value");
     }

   }

}
