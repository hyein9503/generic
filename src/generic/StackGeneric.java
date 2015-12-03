package generic;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());//2
		System.out.println(stackInteger.pop());//1
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	Node<T>  top;

	Stack (){
		top = null;
	}
	
	public T  pop() {
		T temp = top.getData();
		top = top.getNext();
		return temp;
	}
	
	public void push (T data) {
		
		
		Node<T> node=new Node<T>(data,top);
	
		top=node;
		
		
	}
}

class Node<T> {
	Node<T> next;
	  T data;
	
	public Node(T data,Node<T> next) {
		this.data=data;
		this.next=next;	
        }
	
	public T getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> n) {
		next = n;
	}
}


