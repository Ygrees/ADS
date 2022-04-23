public class MyLinkedListA {
    private MyNode head;
    private MyNode tail;
    private int size;


    public MyLinkedListA(){

    }




    public void add(int newItem) {
        MyNode newNode = new MyNode(newItem);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

        public int get ( int index){
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        private static class MyNode {
            int data;
            MyNode next;

            MyNode(int data) {
                this.data = data;
            }
        }
    }

