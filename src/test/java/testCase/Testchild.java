package testCase;

import org.testng.annotations.Test;

import child.child;
import child.writeFile;

public class Testchild {

	@Test
public void testingfunction() {
	child c=new child();
	c.check("Ram");
	writeFile wr=new writeFile();
	wr.writefile("Ram");
}


}
