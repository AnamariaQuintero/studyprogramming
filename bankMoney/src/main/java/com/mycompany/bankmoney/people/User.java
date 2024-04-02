package com.mycompany.bankmoney.people;

public class User {
    private String name;
    private double money;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public User(String name) {
        this.name = name;
        this.money = 0;
    }

    public String getName() {
        return name;
    }

    /*
    public void setName(String name) {
        this.name = name;
    }
    */

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void consigMoney(double qty){
        if (qty < 0){
            System.out.println("Consignación no valida");
            return;
        }
        this.money += qty;
        System.out.println("Consignación realizada");
    }
    
    public void withdrawMoney(double qty){
        if (qty > this.money){
            System.out.println("Saldo insufiente");
            return;
        }
        this.money -= qty;
        System.out.println("Retiro realizado");
    }
    
    
}
