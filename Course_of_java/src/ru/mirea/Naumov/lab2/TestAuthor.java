package ru.mirea.Naumov.lab2;
import java.lang.*;

public class TestAuthor {
   public static void main(String[] args){
       Author a1 = new Author("John", "john.novak@gmail.com", 'M');
       a1.setEmail("john.tester@gmail.com");
       System.out.println("Author's name is "+a1.getName());
       System.out.println("Author's email is "+a1.getEmail());
       System.out.println("Author's gender is "+a1.getGender()+'\n');
       Author a2 = new Author("Jane", "jane777@mail.com", 'F');
       System.out.println(a2);
       System.out.println();
       Author a3 = new Author("Jarred", "unknown@mail.com", 'U');
       System.out.println(a3.toString());
   }
}
