
public class methods {

	public static void main(String[] args) {
		// only reference types can get null value. int is primitive type, so just
		// variable of int type cannot get null value. But here we have array and array is reference type
		Integer[] data = { 100, 200, 300, 400, null };
		data = transferValueNextPlace(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		System.out.println("________________________");
		data = transferValuePreviousPlace(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		System.out.println("________________________");
		data = transferValuePreviousPlace(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}

	}

// method which transfers the value on the next place in array
	// creates variable i which has value the same as last index in array
	// creates cycle which works until i is not 0
	// takes current place in array and post-decrements its i, so at the moment i
	// doesn't change
	// assigns current place in array the previous' value, because i changed only
	// now, after "="
	// assigns array's place with index 0 value null
	// tries to perform cycle again, but can not because i became 0
	public static Integer[] transferValueNextPlace(Integer[] array) {
		// the method didn't work because the array's length was 5, but index started
		// from zero, so the biggest index was 4, less than array's length
		for (int i = (array.length-1); i >0;) {
			array[i--] = array[i];
		array[i] = null;
	}
		return array;
	}
	
// method which transfers the value on the previous place in array
	public static Integer[] transferValuePreviousPlace(Integer[] array) {

		for (int i = 0; i <(array.length-1);) {
			array[i++] = array[i];
		
		array[i] = null;
	}
		return array;
	}

}
