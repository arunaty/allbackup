package example;

public class MethodOverLoad {
	public static void main(String[] args) {
		reverse();
		reverse("AMRUTA");
		reverse("I Love India", "hi");
	}

	public static void reverse() {
		int num = 1234;
		String num1 = Integer.toString(num);
		String rev = "";

		for (int i = num1.length() - 1; i >= 0; i--) {
			rev = rev + num1.charAt(i);
		}

		System.out.println(rev);
	}

	public static void reverse(String str) {
		String str1 = str;
		String rev = "";
		for (int j = str1.length() - 1; j >= 0; j--) {
			rev = rev + str1.charAt(j);
		}
		System.out.println(rev);
	}

	public static void reverse(String str, String call) {
		String str1 = str;
		String rev1 = " ";
		String arr[] = str1.split(" ");
		
		for (int n = arr.length-1; n >= 0; n--) {
			rev1 = rev1 + arr[n];
		}
		System.out.println(rev1);
	}

}