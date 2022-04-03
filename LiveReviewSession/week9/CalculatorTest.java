package week9;

import day16_forLoop_String.RemovingDuplicate;
import day24Custommethodes_Return.Palondrime;
import day24Custommethodes_Return.RemoveDuplicatedCharacters;
import day24Custommethodes_Return.ReverseReturn;
import week6.Fibonacci;

public class CalculatorTest {
    public static void main(String[] args) {
        //call methods from
        System.out.println(Calculator.add(4.5,5.2));
        System.out.println(ReverseReturn.reverse("Java"));
        System.out.println(Palondrime.isPalidrome("Level"));
        System.out.println(RemoveDuplicatedCharacters.removeDuplicate("Java is the best"));
        System.out.println(CombineStrings.combineString("Java","apple"));
    }
}
