package data_structure;

import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import testbase.TestBase;

public class SetXorMinTest extends TestBase {

	@Test
	void case1() {
		check("6\n" + "0 6\n" + "0 7\n" + "2 5\n" + "1 7\n" + "1 10\n" + "2 7", "2" + LF + "1");
	}

	@Test
	void case2() {
		check("2\n" + "0 1073741823\n" + "2 0", "1073741823");
	}

	@TestFactory
	Collection<DynamicTest> external() {
		return checkExternal("data_structure/set_xor_min");
	}
}
