package org.example;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String testText = "Hello, World!";
        String reverseText = StringUtils.reverse(testText);
        System.out.println(reverseText);

    }
}