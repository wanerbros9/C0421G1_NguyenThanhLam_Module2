package _18_java_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        final  String PHONE_REGEX = "^[(]\\d{2}[)][-][(]\\d{10}[)]$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
    }
}
