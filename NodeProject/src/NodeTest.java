
public class NodeTest {

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(100);
		Node<Integer> n2 = new Node<Integer>(200);
		n1.setNextNode(n2);
		n2.setNextNode(new Node(300));

		 System.out.println( n1.toString() );
		 System.out.println( n1.getNextNode() );
		 System.out.println(n1.getNextNode().getNextNode());
		 

	}

}
