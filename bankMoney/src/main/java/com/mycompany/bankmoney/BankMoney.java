package com.mycompany.bankmoney;

import com.mycompany.bankmoney.people.User;

public class BankMoney {

    public static void main(String[] args) {
        User user1 = new User("Anamaria", 50000);
        User user2 = new User("Samuel");
        
        user1.consigMoney(55_000);
        System.out.println("El cliente tiene: $" + user1.getMoney());
        
        user2.withdrawMoney(10_000);
        System.out.println("El cliente tiene: $" + user2.getMoney());
        
        user2.consigMoney(25000);
        System.out.println("El cliente tiene: $" + user2.getMoney());
        
        user2.withdrawMoney(30_000);
        System.out.println("El cliente tiene: $" + user2.getMoney());
        
        
    }
}
