
import java.util.*;
import java.io.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
    
}

public class Main {

    static void insertNode(Node head, int data) {

        Node temp = head;
        
        while(temp.next != head) {
            temp = temp.next;
        }

        Node nn = new Node(data);
        temp.next = nn;
        nn.next = head;
        
    }



    static void printLL(Node head) {
       
        Node temp = head;
        
        while(temp.next != head) {
            
            System.out.print(temp.data+" ");
            temp = temp.next;
        }  
        
        System.out.print(temp.data+" ");
        
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        Node head = null;
        Node temp = null;
        for(int i = 0; i < n; i++) {
            int curr = s.nextInt();

            if(head == null) {
                head = new Node(curr);
                temp = head;
            }
            else {

                temp.next = new Node(curr);
                temp  = temp.next;
            }
            
        }

        temp.next = head;

        int x = s.nextInt();

        insertNode(head, x);

        printLL(head);
        
        
        
        
        
    }
}
