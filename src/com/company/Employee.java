package com.company;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYears){ // Employee kurucu (constructor) metot olup 4 parametre alacaktır.
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYears;
    }

   double tax (){
        double taxRate=0;
        if (this.salary > 1000){
            taxRate= (this.salary * 0.03); // %3 ü kadar uygulanacak vergiyi hesaplıyoruz.
            System.out.println("The taxRate is: " +taxRate);
        }
            return taxRate;
        }

   double bonus() {
            int bonusPay=0;
            if(this.workHours > 40){
                bonusPay= (this.salary + (workHours-40)*30);
                System.out.println("The salary with bonus pay but without tax is: " +bonusPay);
            }
   return bonusPay;
       }

       double raiseSalary(){
       double newSalary=0;
        if((2021-this.hireYear) < 10){
          newSalary=(this.salary + (this.salary*0.05));
            System.out.println("The new raise salary is: " +newSalary);
        }
        else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20 ){
            newSalary=(this.salary + (this.salary*0.10));
            System.out.println("The new raise salary is: " +newSalary);
        }
        else if (2021-this.hireYear>19){
               newSalary=(this.salary + (this.salary*0.15));
               System.out.println("The new raise salary is: " +newSalary);
           }
        return newSalary; }

       public String toString(){
              double totalSalary= this.salary+this.raiseSalary();
              double taxBonus= this.salary+this.bonus()-this.tax();
              System.out.println(" ");
              System.out.println("---------------------");
              System.out.println(" ");
              return "NAME:" +this.name + "\nSALARY: " +this.salary + "\nWORK HOURS: " +workHours +"\nHIRE YEAR: "+hireYear +"\nTAX : "+this.tax()+ "\nBONUS: "+this.bonus()+"\nSALARY INCREASE : "+ (totalSalary-this.salary)+ "\nCURRENT SALARY WITH TAX AND BONUS: " +taxBonus+ "\nTOTAL SALARY : "+totalSalary;

    }

       }


