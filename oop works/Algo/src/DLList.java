
class DLList {
  class Node {
    // Each node object has these three fields
    private Object element;
    private Node previous;
    private Node next;

    // Constructor: Creates a Node object with element = e, previous = p and next = n
    Node(Object e, Node p, Node n) {
      element = e;
      previous = p;
      next = n;
    }

    // This function gets Object e as input and sets e as the element of the Node
    public void setElement(Object e) {
      element = e;
    }

    // This function returns the element variable of the Node
    public Object getElement() {
      return element;
    }

    // This function gets Node n as input and sets the next variable of the current Node object as n.
    public void setNext(Node n) {
      next = n;
    }

    // This function returns the next Node
    public Node getNext() {
      return next;
    }

    // This function gets Node p as input and sets the previous variable of the current Node object as p.
    public void setPrevious(Node p) {
      previous = p;
    }

    // This function returns the previous Node
    public Node getPrevious() {
      return previous;
    }
  }

  // Each object in DLList has one field head, which points to the starting Node of DLList.
  private Node head;
  // Each object in DLList has one field tail, which points to the final Node of DLList.
  private Node tail;

  /**
   * Constructor: initialises the head and tail fields as null
   * Done
   */
  public DLList() {
    head = null;
    tail = null;
  }

  /**
   * @return The element in the head Node of the DLL
   * Done
   */
  public Object getHead() {
    return head.next.getElement();
  }

  /**
   * @return The element in the tail Node of the DLL
   */
  public Object getTail() {
    return tail.previous.getElement();
  }

  /**
   * Adds element e in a new Node to the head of the list.
   *
   * @param e
   *     The element to add.
   *     
   *     Done
   */
  public void addFirst(Object e) {
    Node n = new Node (e , null ,null);
   if (head.equals(null)) {
	   head.next = n;
	   tail.previous=n;
	   
	   n.previous= head ;
	   n.next= tail;
   }else {
	  n.next = head.next;
	  n.previous=head;
	  head.next = n;
   }
    
  }

  /**
   * Remove the first Node in the list and return its element.
   *
   * @return The element of the head Node. If the list is empty, this method returns null.
   * Done
   */
  public Object removeFirst() {
	  if(this.size()!= 0) {
		  Object el = head.next.getElement();
		  Node n = head.next;
		  head.next = n.next;
		  n.next.previous= head;
		   
		  n.previous= null;
		  n.next= null;
		  return el;
	    
	  }else {
		  return null;
	  }
  }

  /**
   * Adds element e in a new Node to the tail of the list.
   *
   * @param e
   *     The element to add.
   *     
   * Done
   */
  public void addLast(Object e) {
    
     Node n = new Node(e,null,null);
     if (head == null) {
    	 head.next = n;
    	 tail.previous = n;
    	 
    	 n.next= tail;
    	 n.previous= head ;
     }else {
    	 n.next= tail;
    	 n.previous=tail.previous;
    	 tail.previous= n;
    	 
     }

  }

  /**
   * Remove the last Node in the list and return its element.
   *
   * @return The element of the tail Node. If the list is empty, this method returns null.
   * 
   * Done
   */
  public Object removeLast() {
	  if(this.size() != 0) {
    Node n = tail.previous;
    Object el = tail.previous.getElement();
    
    n.previous.next= tail;
    tail.previous= n.previous;
    
    n.next= null;
    n.previous= null;
    
    return el;
    //size--;
	  }else {
		  return null;
	  }
  }

  /**
   * @return the number of Nodes in the list
   */
  public int size() {
    return this.size();
  }

  /**
   * Adds element e in a new Node which is inserted at position pos.
   * The list is zero indexed, so the first element in the list corresponds to position 0.
   * This also means that addAtPosition(0, e) has the same effect as addFirst(e).
   * If there is no Node in position pos, this method adds it to the last position.
   *
   * @param pos
   *     The position to insert the element at.
   * @param e
   *     The element to add.
   */
  public void addAtPosition(int pos, Object e) {
	  Node temp = head;
	  Node addToPos = new Node(e, null, null);
	  if((this.size() > 0)&&(this.size()>= pos)) {
		  for(int i=0; i<pos;i++) {
			temp= temp.next;
					  
			  }
		  addToPos.next = temp.getNext();
		  addToPos.previous = temp.getPrevious();
		  Node temp2 = temp;
		  temp2= temp2.previous;
		  temp2.next= addToPos;
		  temp= temp.next;
		  temp.previous=addToPos;
		  
		  }else if (pos == 0) {
		    this.addFirst(e);
	  }else  {
		  this.addLast(e);
	  }
  }

  /**
   * Remove Node at position pos and return its element.
   * The list is zero indexed, so the first element in the list corresponds to position 0.
   * This also means that removeFromPosition(0) has the same effect as removeFirst().
   *
   * @param pos
   *     The position to remove the Node from.
   * @return The element of the Node in position pos. If there is no Node in position pos, this method returns null.
   */
  public Object removeFromPosition(int pos) {
    Node toRemove = head;
    Node temp;
    if((this.size() > 0)&&(this.size()>= pos)) {
		  for(int i=0; i<pos;i++) {
			toRemove= toRemove.next;
					  
			  }
			  
			  temp=toRemove.previous;
			  toRemove.previous=toRemove.next;
			  toRemove.next = temp;
			  return toRemove.element;
    }else{
      return null;
    }	  
  }

  /**
   * @return A new DLL that contains the elements of the current one in reversed order.
   */
  public DLList reverse() {
    Node temp;
    temp=this.head;
    this.head=this.tail;
    this.tail=temp;
    
    return this;
  }
}