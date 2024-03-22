package ru.geekbrains.oop.lesson6.srp2.presenter;

import ru.geekbrains.oop.lesson6.srp2.model.Order;
import ru.geekbrains.oop.lesson6.srp2.model.SaveOrder;
import ru.geekbrains.oop.lesson6.srp2.view.InputOrder;

public class OrderPresenter {
    private UserInput userInput;
    private Savable savable;

    public OrderPresenter(UserInput userInput, Savable savable){
        this.userInput = userInput;
        this.savable = savable;
    }

    public void getUserInputAndSave(){
        Order order = new Order();
        userInput.orderInput(order);
        savable.saveOrder(order);
    }
}
