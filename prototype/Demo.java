package prototype;

public class Demo {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("Blue", 4, 6);
		Rectangle clone = (Rectangle) rectangle.clone();
		if(rectangle.equals(clone)){
			System.out.println("cloned object is equal to the original object");
		}
		else
			System.out.println("not equal");
	}

}