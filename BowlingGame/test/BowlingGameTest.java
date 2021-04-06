import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;

public class BowlingGameTest {
	protected Game g;
	
	@Before
	public void setUp() {
		g = new Game();
	}
	
	@Test
	public void testGullterGame() {
		for(int i=0; i<20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}
	

	@Test
	public void testAllOneGame() {
		for(int i=0; i<20; i++) {
			g.roll(1);
		}
		assertEquals(20, g.score());
	}

}
