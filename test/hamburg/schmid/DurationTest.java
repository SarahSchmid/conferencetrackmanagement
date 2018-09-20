package hamburg.schmid;

import static hamburg.schmid.Duration.LIGHTNING;
import static hamburg.schmid.Duration.MINUTES;
import static org.junit.Assert.*;

import org.junit.Test;

public class DurationTest {

  @Test
  public void inMinutes_should_return_the_duration_in_minutes() throws Exception {
    assertEquals(60, MINUTES.inMinutes(60));
    assertEquals(45, LIGHTNING.inMinutes(9));
  }
}