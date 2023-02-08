import java.util.Arrays;

// Each class should be responsible for a single part or functionality of the system.
public class SingleResponsibilityPrinciple {
    public class TextManipulator {
        private String text;
        public TextManipulator(String text) {
            this.text = text;
        }
        public String getText() {
            return text;
        }
        public void appendText(String newText) {
            text = text.concat(newText);
        }
        public String findWordAndReplace(String word, String replacementWord) {
            if (text.contains(word)) {
                text = text.replace(word, replacementWord);
            }
            return text;
        }
        public String findWordAndDelete(String word) {
            if (text.contains(word)) {
                text = text.replace(word, "");
            }
            return text;
        }
       //Here we have two responsibilities: manipulating and printing the text.
       /* public void printText() {
            System.out.println(getText());
        }*/
    }
    //Single Responsibility Principle
    public class TextPrinter {
        TextManipulator textManipulator;

        public TextPrinter(TextManipulator textManipulator) {
            this.textManipulator = textManipulator;
        }

        public void printText() {
            System.out.println(textManipulator.getText());
        }

        public void printOutEachWordOfText() {
            System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
        }

        public void printRangeOfCharacters(int startingIndex, int endIndex) {
            System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
        }
    }
}
