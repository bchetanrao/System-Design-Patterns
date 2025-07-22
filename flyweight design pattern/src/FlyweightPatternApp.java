import core.ILetter;
import core.LetterFactory;

public class FlyweightPatternApp {
    public static void main(String[] args) throws Exception {
        ILetter letterA = LetterFactory.createLetter('A');
        letterA.display(0, 0);

        ILetter letterB = LetterFactory.createLetter('B');
        letterB.display(0, 1);

        ILetter letterC = LetterFactory.createLetter('C');
        letterC.display(0, 2);

        /**
         * Uncomment the following lines to test the overloaded method
         * */

        // ILetter letterA = LetterFactory.createLetter('A', "Arial", 12);
        // letterA.display(0, 0);

        // ILetter letterB = LetterFactory.createLetter('B', "Arial", 12);
        // letterB.display(0, 1);

        // ILetter letterC = LetterFactory.createLetter('C', "Courier", 16);
        // letterC.display(0, 2);
    }
}
