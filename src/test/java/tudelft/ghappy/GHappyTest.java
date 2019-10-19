package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

  private GHappy gh;

  @BeforeEach
  public void initialize() {
    this.gh = new GHappy();
  }

  @Test  // BUG 1
  public void noGs() {
    boolean result = gh.gHappy("hey");
    Assertions.assertEquals(false, result);
  }

  @Test  // BUG 2
  public void emptyString() {
    boolean result = gh.gHappy("");
    Assertions.assertEquals(false, result);
  }

  @Test  // BUG 3
  public void startWithHappyG() {
    boolean result = gh.gHappy("ggotcha");
    Assertions.assertEquals(true, result);
  }

  @Test
  public void endwithHapppyG() {
    boolean result = gh.gHappy("somethingg");
    Assertions.assertEquals(true, result);
  }

  @Test  // BUG 4
  public void capitalGs() {
    boolean result = gh.gHappy("=GG=gg=");
    Assertions.assertEquals(false, result);
  }

  @Test
  public void multipleHappyGs() {
    boolean result = gh.gHappy("agg gggg_gg!");
    Assertions.assertEquals(true, result);
  }

  @Test
  public void happyGsAndNormalGs() {
    boolean result = gh.gHappy("xgg^g(GG)");
    Assertions.assertEquals(false, result);
  }
}
