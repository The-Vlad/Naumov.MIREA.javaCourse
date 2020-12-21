package ru.mirea.Naumov.lab12.task4;

public class NewString {
    public static String normalize(String str) {
        if (str.length()>12 || str.length()<11 || (!str.startsWith("+") && !str.startsWith("8")))
            return "incorrect input";
        StringBuffer temp = new StringBuffer(str);
        if (str.startsWith("8"))
            temp.replace(0,1,"+7");
        temp.insert(5, "-");
        temp.insert(9, "-");
        return temp.toString();
    }
}