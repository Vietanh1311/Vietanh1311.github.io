public class Linkedlist {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    static class MyLinkedList {
        public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.addAtHead(1);
            myLinkedList.print();
            myLinkedList.addAtTail(3);
            myLinkedList.print();
            myLinkedList.addAtIndex(1, 2);
            myLinkedList.print(); // linked list becomes 1->2->3
            myLinkedList.deleteAtIndex(1);
            myLinkedList.print();
            System.out.println(myLinkedList.get(1));

        }
        Node headNode;

        /** Initialize your data structure here. */
        public MyLinkedList() {

        }

        /**
         * Get the value of the index-th node in the linked list. If the index is
         * invalid, return -1.
         */
        public int get(int index) {
            Node temp = headNode;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    return temp.value;
                }
                count++;
                temp = temp.next;
            }
            return -1;
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            if (headNode == null) {
                newNode.next = headNode;
            }
            headNode = newNode;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            if (lastNode.next == null) {
                lastNode.next = newNode;
            }

        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
         */
        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                Node newNode = new Node(val);
                Node currentNode = headNode;
                int count = 0;
                while (currentNode != null) {
                    count++;
                    if (count == index) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;

                }
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (headNode == null) {
                print();
            }
            if (index == 0) {
                headNode = headNode.next;
            }
            Node currNode = headNode;
            Node prev = null;
            int count = 0;
            boolean found = false;
            while (currNode.next != null) {
                if (count == index) {
                    found = true;
                    break;
                }
                count++;
                prev = currNode;
                currNode = currNode.next;
            }
            if (found) {
                prev.next = currNode.next;
            }
        }

        public void print() {
            if (headNode == null) {
                System.out.println("List is empty");
            } else {
                Node temp = headNode;
                while (temp != null) {
                    System.out.print(temp.value);

                    temp = temp.next;
                    if (temp != null) {
                        System.out.print("-->");

                    } else {
                        System.out.println("");
                    }
                }
            }
        }

        
    }
}
