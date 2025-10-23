public class PalindromeChecker{
    public static boolean isPalindrome(String text) {
        String lowerCaseText = text.toLowerCase();

        String replaceText = lowerCaseText.replaceAll("[^a-z0-9а-я]", "");

        String reversedText = new StringBuilder(replaceText).reverse().toString();
        return replaceText.equals(reversedText);
    }

    public static void main(String[] args) {
        String test1 = "шалаш";
        String test2 = "а роЗа упала на лапу азора??!!!";
        String test3 = "madam";
        String test4 = "билет";

        System.out.println("-------- Проверка началась --------");
        System.out.println("'" + test1 + "': " + isPalindrome(test1));
        System.out.println("'" + test2 + "': " + isPalindrome(test2));
        System.out.println("'" + test3 + "': " + isPalindrome(test3));
        System.out.println("'" + test4 + "': " + isPalindrome(test4));
    }
}
