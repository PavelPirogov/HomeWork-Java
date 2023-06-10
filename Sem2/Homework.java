public class Homework {

    public static void main(String[] args) {

    /**
     * ToDo: 08.06.2023
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */
    
    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */

    System.out.println(isPalindrome("abcdedcba"));
    System.out.println(isPalindrome("a"));
    System.out.println(isPalindrome("abc"));
    System.out.println(isPalindrome("abcd"));
    System.out.println(isPalindrome("abba"));
    System.out.println();

    System.out.println(isPalindrome2("abcdedcba"));
    System.out.println(isPalindrome2("a"));
    System.out.println(isPalindrome2("abc"));
    System.out.println(isPalindrome2("abcd"));
    System.out.println(isPalindrome2("abba"));

    }

    static boolean isPalindrome(String source) {
        for (int i = 0; i < source.length() / 2; i++ ) {
            if (source.charAt(i) != source.charAt(source.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        return str.equals(new StringBuffer().append(str).reverse().toString());
    }

}