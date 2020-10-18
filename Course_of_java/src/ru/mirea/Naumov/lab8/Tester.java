package ru.mirea.Naumov.lab8;

import ru.mirea.Naumov.lab6.Student;

public class Tester {
   public static void main(String[] args){
      WaitList list = new WaitList();
      BoundedWaitList boundedList = new BoundedWaitList(3);
      UnfairWaitList unfairList = new UnfairWaitList();

      list.add(new Student(1));
      list.add(new Student(2));
      System.out.println(list.toString());

      list.remove();
      System.out.println(list.toString()+"\n");


      boundedList.add(new Student(21));
      boundedList.add(new Student(22));
      boundedList.add(new Student(23));
      boundedList.add(new Student(24));
      System.out.println(boundedList.toSrtring()+"\n");

      Student std53 = new Student((53));
      Student std52 = new Student((53));
      unfairList.add(new Student((51)));
      unfairList.add(std52);
      unfairList.add(std53);
      unfairList.add(new Student((54)));
      unfairList.add(new Student((55)));

      unfairList.moveToBack(std53);
      System.out.println(unfairList.toString()+"\n");

      unfairList.remove(std52);
      System.out.println(unfairList.toString()+"\n");
   }
}
