package org.nau.Task2;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "I like Java !!!";
        String str2 = "Я вивчаю Java!";

        System.out.println("Последний символ в строке \"" + str1 + "\": " + str1.charAt(str1.length() - 1));

        System.out.println("Строка \"" + str1 + "\" заканчивается подстрокой \"!!!\": " + str1.endsWith("!!!"));

        System.out.println("Строка \"" + str1 + "\" начинается подстрокой \"I like\": " + str1.startsWith("I like"));

        System.out.println("Строка \"" + str1 + "\" содержит подстроку \"Java\": " + str1.contains("Java"));

        String replacedStr = str1.replace('a', 'o');
        System.out.println("Строка после замены всех символов 'a' на 'o': " + replacedStr);

        String cutStr = str1.substring(0, str1.indexOf("Java")) + str1.substring(str1.indexOf("Java") + 4);
        System.out.println("Строка после удаления подстроки \"Java\": " + cutStr);
    }
}
