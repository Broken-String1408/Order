package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */

    public static void main(String[] args) {
        Order order = new Order();
        UserInput inputOrder = new InputOrder();
        Savable saveOrder = new SaveOrder();
       inputOrder.orderInput(order);
       saveOrder.saveOrder(order);

    }

}
