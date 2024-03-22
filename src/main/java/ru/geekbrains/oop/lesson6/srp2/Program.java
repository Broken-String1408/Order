package ru.geekbrains.oop.lesson6.srp2;

import ru.geekbrains.oop.lesson6.srp2.model.Order;
import ru.geekbrains.oop.lesson6.srp2.model.SaveOrder;
import ru.geekbrains.oop.lesson6.srp2.presenter.OrderPresenter;
import ru.geekbrains.oop.lesson6.srp2.presenter.Savable;
import ru.geekbrains.oop.lesson6.srp2.presenter.UserInput;
import ru.geekbrains.oop.lesson6.srp2.view.InputOrder;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */

    public static void main(String[] args) {
        OrderPresenter orderPresenter = new OrderPresenter(new InputOrder(), new SaveOrder());
        orderPresenter.getUserInputAndSave();

    }

}
