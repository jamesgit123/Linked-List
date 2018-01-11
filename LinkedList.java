
public class LinkedList {
	public static Node head;
	
	public void addFront(int d) {
		Node addBeg = new Node(d);
		addBeg.next = head;
		head = addBeg;
	}
	
	public void addEnd(int d) {
		Node addend = new Node(d);
		Node current = head;
		if (current == null) {
			head = addend;
			return;
		}
		while (current.next!=null) {
			current = current.next;
		}
		addend.next = null;
		current.next = addend;
		return;
	}
	
	public void delete(int d) {
		Node curr = head;
		Node prev = null;
		
		if (curr!=null && curr.data == d) {
			head = curr.next;
			return;
		}
		
		else {
			while (curr!=null && curr.data!=d) {
				prev = curr;
				curr = curr.next;
			}
			
			prev.next = curr.next;
		}
	}
	
	 void deleteNode(int position)
	    {
	        // If linked list is empty
	        if (head == null)
	            return;
	 
	        // Store head node
	        Node temp = head;
	 
	        if (position == 0)
	        {
	            head = temp.next;  
	            return;
	        }
	 
	        // Find previous node of the node to be deleted
	        int jump = 0;
	        while (temp!=null && jump < position-1) {
	            temp = temp.next;
	            jump++;
	        }
	 
	        if (temp == null || temp.next == null)
	            return;

	        Node next = temp.next.next;
	 
	        temp.next = next;  
	    }

	public void reverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void printList(Node list) {
		Node curr = list;
		while (curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public void union(Node list1, Node list2) {
		Node l1 = list1;
		Node l2 = list2;
		LinkedList L = new LinkedList();
		while (l1!=null) {
			addEnd(l1.data);
			l1 = l1.next;
		}
		while (l2!=null) {
			if (!contains(head,l2.data)) {
			addEnd(l2.data);
			l2 = l2.next;
			}
		}
	}
	
	 boolean contains (Node head, int data)
	    {
	        Node t = head;
	        while (t != null)
	        {
	            if (t.data == data)
	                return true;
	            t = t.next;
	        }
	        return false;
	    }
	
	 public int length(Node list) {
		 int length = 0;
		 while(list!=null) {
			 length++;
			 list = list.next;
		 }
		return length;
		 
	 }
	 public void sort() {
	            for (int i = 0; i < length(head); i++ ) {
	            	 Node currentNode = head;
	                 Node next = head.next;
	                for (int j = 0; j < length(head) - 1; j++) {
	                    if (currentNode.data > next.data) {
	                        int temp = currentNode.data;
	                        currentNode.data = next.data;
	                        next.data = temp;
	                    } 
	                    currentNode = next;
	                    next = next.next;                   
	                } 
	            }
	    }

	public static void main(String[] args) {

    	LinkedList L = new LinkedList();
    	L.addEnd(5);
    	L.addEnd(4);
    	L.addEnd(40);
    	L.addEnd(400);
    	L.addEnd(80);
    	L.addFront(10);
    	L.printList(head);
    	LinkedList L2 = new LinkedList();
    	L2.addEnd(50);
    	L2.addEnd(4);
    	L2.addEnd(40);
    	L2.addEnd(400);
    	L2.addEnd(800);
    	LinkedList LUnion = new LinkedList();
    	LUnion.union(L.head, L2.head);
    	LUnion.printList(LUnion.head);
    	//L.printList(head);
    	//L.show();
    	//L.delete(4);
    	L.sort();
    	L.printList(head);
    	L.reverse(head);
    	//L.printList(head);
    	//L.union(L.head, L2.head);
    	//int[] jack = L.sortList(head);
    	//L.printList(head);
    	//L.DeleteNode(0);
    	//L.show();
	}
}
