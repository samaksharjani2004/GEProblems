package LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        System.out.println("Welcome to Linked List Program");

        LinkedList list = new LinkedList();

        // UC-1 / UC-2
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

        // UC-3
        LinkedList list2 = new LinkedList();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        list2.display();

        // UC-4
        LinkedList list3 = new LinkedList();
        list3.append(56);
        list3.append(70);
        list3.insertAfter(56, 30);
        list3.display();

        // UC-5
        list3.pop();
        list3.display();

        // UC-6
        LinkedList list4 = new LinkedList();
        list4.append(56);
        list4.append(30);
        list4.append(70);
        list4.popLast();
        list4.display();

        // UC-7
        System.out.println("Search 30: " + list4.search(30));

        // UC-8
        list4.insertAfter(30, 40);
        list4.display();

        // UC-9
        list4.delete(40);
        list4.display();
        System.out.println("Size: " + list4.size());

        // UC-10
        LinkedList sortedList = new LinkedList();
        sortedList.addSorted(56);
        sortedList.addSorted(30);
        sortedList.addSorted(40);
        sortedList.addSorted(70);
        sortedList.display();
    }
}

