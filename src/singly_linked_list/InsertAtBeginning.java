package singly_linked_list;

import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null, tail=null;
        while (true){
            Node n = new Node();
            System.out.print("Enter Data: ");
            n.data=sc.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }
            else {
                tail.address=n;
                tail=n;
            }
            System.out.println("Do you want to create node\n1)Yes\n2)No");
            int ch = sc.nextInt();
            if(ch!=1){
                break;
            }

        }
        Node n = new Node();
        System.out.print("\nEnter data to insert: ");
        n.data=sc.nextInt();
        n.address=head;
        head=n;
        System.out.println("\nAfter inserting data at beg-");
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
    }
}
