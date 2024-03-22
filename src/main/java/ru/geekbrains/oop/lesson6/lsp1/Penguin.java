package ru.geekbrains.oop.lesson6.lsp1;

public class Penguin extends Bird{
    public Penguin(){
        super(false);
        flySpeed = 0;
    }

    @Override
    public void fly() {
        //System.out.println("Пингвин не умеет летать!");
        throw new RuntimeException("Пингвин не умеет летать!");
    }
}
