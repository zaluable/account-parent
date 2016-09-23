package com.juice.orange.account.captcha;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertFalse;

public class RandomGeneratorText {

	public void testGetRandomString() throws Exception {
		Set<String> randoms = new HashSet<String>(100);

		for (int i = 0; i < 100; i++) {
			String random = RandomGenerator.getRandomString();
			assertFalse(random.contains(random));
			randoms.add(random);
		}
	}
}
