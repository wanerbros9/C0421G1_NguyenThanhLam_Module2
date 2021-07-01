package _18_java_string_regex.bai_tap.validate_class;

public class ValidateClassTest {
    public static void main(String[] args) {
        String[] valid = new String[]{"C0421G1"};
        String[] invalid = new String[]{"M0318G, P0323A"};
        ValidateClass validateClass = new ValidateClass();
        for (String string : valid) {
            boolean isValid = validateClass.validate(string);
            System.out.println("Name " + string + " isValid " + isValid);
        }
        for (String string : invalid) {
            boolean isValid = validateClass.validate(string);
            System.out.println("Name " + string + " isValid " + isValid);
        }
    }
}
