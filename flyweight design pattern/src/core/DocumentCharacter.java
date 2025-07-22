package core;
public class DocumentCharacter implements ILetter {
    private char character;
    private String font;
    private int size;

    public DocumentCharacter(char character, String font, int size) {
        this.character = character;
        this.font = font;
        this.size = size;
    }

    // only getter methods.
    @Override
    public void display(int row, int col) {
        System.out.println("Displaying character '" + character + "' at position (" + row + ", " + col + ") with font '" + font + "' and size " + size);
    }
}
