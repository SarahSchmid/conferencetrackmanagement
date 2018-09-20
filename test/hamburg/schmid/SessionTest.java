package hamburg.schmid;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SessionTest {

  @Test (expected = IllegalStateException.class)
  public void addTalk_should_throw_IllegalStateException_if_there_is_no_time_left_in_the_session()
      throws Exception {
    Session session = new Session(40, 0);
    Talk talk = new Talk("test name", 60, Duration.MINUTES);

    session.addTalk(talk);
  }

  @Test
  public void hasTimeLeft_should_return_false_if_there_is_not_enough_time_left()
      throws Exception {
    Session session = new Session(30, 0);
    Talk talk = new Talk("test name", 60, Duration.MINUTES);
    assertFalse(session.hasTimeLeft(talk));
  }

  @Test
  public void hasTimeLeft_should_return_true_if_there_is_enough_time_left()
      throws Exception {
    Session session = new Session(180, 0);
    Talk talk = new Talk("test name", 60, Duration.MINUTES);
    assertTrue(session.hasTimeLeft(talk));
  }
}