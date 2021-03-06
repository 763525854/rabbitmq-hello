import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rhyme.HelloMqApplication;
import rhyme.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloMqApplication.class)
public class HelloMqApplicationTests {
	@Autowired
	private Sender sender;

	@Test
	public void hellomq() throws Exception {
		while (true) {
			Thread.sleep(1000);
			sender.send();
		}
	}

}
