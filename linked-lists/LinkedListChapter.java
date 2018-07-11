/*
 * 2.4 
 * Write code to partition a linked list around a value x, such that all nodes less than x
 * come before all nodes greater than or equal to x.
 */

 public class LinkedListChapter {
     
    private class MyLinkedList {
        private class MyNode {
            private int value;
            private MyNode next;

            public MyNode(int value) {
                this.value = value;
            }
        }   
        
        private MyNode head;

        public void append(MyNode link) {
            if (next == null)
                next = link;
            else
                next.append(link);            
        }

        public void prepend(MyNode link) {
            if (head == null)
                head = link;
            else {
                link.append(head);
                head = link;
            }
        }
    }

    
 }