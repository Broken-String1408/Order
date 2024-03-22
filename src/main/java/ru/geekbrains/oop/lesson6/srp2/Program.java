package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */

    public static void main(String[] args) {
        Order order = new Order();
        InputOrder inputOrder = new InputOrder();
        SaveOrder saveOrder = new SaveOrder();
       inputOrder.inputFromConsole(order);
       saveOrder.saveToJson(order);

    }

}
