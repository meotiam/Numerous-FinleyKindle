import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralTranslatorTest extends NumeralTranslator{
   @Test
   public void TranslateNumeral(){
      String converted = numeralTranslator(846);
      Assertions.assertEquals("DCCCXLVI",converted);
   }
}
