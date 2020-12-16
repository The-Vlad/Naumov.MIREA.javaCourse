package ru.mirea.Naumov.lab11;

public class test {
    public int lol = 3;
    public int kek = 5;
    public test(){
        //this.test(lol, kek);
    }
    public test(int lol, int kek){
        this.lol = lol;
        this.kek = kek;
    }

    public static void main(String[] args){
        test t = new test();
    }
}
