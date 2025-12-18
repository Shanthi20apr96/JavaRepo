package stringpack;

public class StringBufMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("Worldxxxxxxxxxxx");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		sb1.insert(5,"java");
		System.out.println(sb1);
		sb1.replace(1, 5, "java");
		System.out.println(sb1);
		sb1.delete(0, 5);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.substring(0,5));
		String normal = sb1.toString();
		System.out.println(normal);
		
		
	}

}
