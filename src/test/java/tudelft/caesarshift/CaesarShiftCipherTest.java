package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

  private CaesarShiftCipher ceasar;

  @BeforeEach
  public void initialize() {
    this.ceasar = new CaesarShiftCipher();
  }

  @Test // BUG 1
  public void simple() {
    String result = ceasar.CaesarShiftCipher("hal", 1);
    Assertions.assertEquals("ibm", result);
  }
}
