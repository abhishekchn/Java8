package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ArrayToListConversion {

	public static <T> List<T> ArrayToList(T array[]) {
		List<T> list = new ArrayList<T>();
		for (T t : array) {
			list.add(t);
		}
		return list;

	}

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ArrayToListConversion.class.getName());
		// declaring an array
		String[] arrayString = { "abhishek", "pandey", "ankleshwar" };
		logger.info(arrayString.toString());
		System.out.println("arrays" + Arrays.toString(arrayString));
		List<String> StringList = ArrayToList(arrayString);
		logger.info(StringList.toString());

	}

}
