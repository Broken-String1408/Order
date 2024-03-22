package ru.geekbrains.oop.lesson6.srp2.view;

import ru.geekbrains.oop.lesson6.srp2.model.Order;
import ru.geekbrains.oop.lesson6.srp2.presenter.UserInput;

import java.util.Scanner;

public class InputOrder implements UserInput {

    private Scanner scanner = new Scanner(System.in);


    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }



    @Override
    public void orderInput(Order order) {
        System.out.println("Укажите параметры заказа:");
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }
}
