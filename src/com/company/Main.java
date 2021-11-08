package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Hanry",2000, 45, 1985);
        System.out.println(employee.toString()); // toString metodu ile üst metotlardan bilgileri override ederek bilgileri toString metodu içerisinde kullanarak talimatları gerçekleştirdik. Bu sebeple tekrardan tax(),bonus() metotlarını main classı içerisinde çağırma gereğinde bulunmadık.
    }
}
