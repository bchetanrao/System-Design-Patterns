package core;
import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, ILetter> letterMap = new HashMap<>();

    public static ILetter createLetter(char character) {
        if (letterMap.containsKey(character)) {
            return letterMap.get(character);
        }
        DocumentCharacter newLetter = new DocumentCharacter(character, "Arial", 12);
        letterMap.put(character, newLetter);
        return newLetter;
    }
    
    /**
     * Overloaded method for adding more font styles and sizes.
     * Uncomment the following lines to test the overloaded method
     */

    // private static Map<String, ILetter> letterMap = new HashMap<>();
    // public static ILetter createLetter(char character, String font, int size) {
    //     String key = character + "_" + font + "_" + size;
    //     if (letterMap.containsKey(key)) {
    //         return letterMap.get(key);
    //     }
    //     DocumentCharacter newLetter = new DocumentCharacter(character, font, size);
    //     letterMap.put(key, newLetter);
    //     return newLetter;
    // }
    
}
