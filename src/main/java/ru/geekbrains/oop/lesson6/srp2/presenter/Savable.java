package ru.geekbrains.oop.lesson6.srp2.presenter;

import ru.geekbrains.oop.lesson6.srp2.model.Order;

public interface Savable {

    public void saveOrder(Order order);
}
