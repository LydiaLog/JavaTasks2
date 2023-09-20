/*
 * 정수 저장 클래스
 */
public class Node<T> {
	private T nodeValue;
	private Node next;
	
	public Node() {
		
	}
	public Node(T nodeValue) {
		this.nodeValue = nodeValue;
	}
	public Node(T nodeValue, Node next) {
		this.nodeValue = nodeValue;
		this.next = next;
	}
	public T getNodeValue() {
		return nodeValue;
	}
	public Node getNextNode() {
		return next;
	}
	public void setNodeValue(T newValue) {
		nodeValue = newValue;
	}
	public void setNextNode(Node nextNode) {
		next = nextNode;
	}
	public String toString() {
		return "노드값 : " + nodeValue;
	}

}
