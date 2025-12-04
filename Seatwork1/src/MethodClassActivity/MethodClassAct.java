package MethodClassActivity;


class Book {
	String title;
	
	void read() {
		System.out.println("Book Title:" + title);
	}
}


class House {
	String style;
	
	void build() {
		System.out.println("This is" + style);
	}
}

class Tree {
	int height;
	
	void grow() {
		height++;
		System.out.println("This measures:" + height + "ft");
	}
}
public class MethodClassAct {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book();
		myBook.title=" Harry Potter";
		myBook.read();
		
		House myHouse = new House();
		myHouse.style=" Bungalow";
		myHouse.build();
		
		Tree myTree = new Tree();
		myTree.height= 7;
		myTree.grow();
		
		
	}

}
