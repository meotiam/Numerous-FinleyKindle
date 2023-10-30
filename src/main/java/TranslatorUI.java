import javax.swing.*;
public class TranslatorUI extends NumeralTranslator{
    public void Translator(){
        int number = Integer.parseInt(JOptionPane.showInputDialog("What number would you like to convert to roman numerals?"));
        String result = numeralTranslator(number);
        JOptionPane.showMessageDialog(null,"The roman numeral for " + number + " is " + result);

    }
}
