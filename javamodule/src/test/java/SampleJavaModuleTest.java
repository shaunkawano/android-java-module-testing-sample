import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SampleJavaModuleTest {

  @Test public void testShouldFail() {

    assertThat(true, is(false));
  }
}
