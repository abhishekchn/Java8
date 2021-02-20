package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class checkelementIfpresent {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(checkelementIfpresent.class.getName());

		List<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("bcd");
		al.add("kld");
		al.add("abc");

		if (al.contains("abc")) {
			logger.info("i found");
		}
		for (int i = 1; i < al.size(); i++) {
			if (al.get(0) == al.get(i)) {
				logger.info("match found");
				
			}
			else {
				logger.info("no match elements");
			}
		}
	}

}
