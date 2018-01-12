package com.e2.Abs;


    abstract class Person{
        String present;
        Person(String present) {
            this.present =present;
        }
        void givePresent(){
            System.out.println("give"+present);
            }
        void givePresent(String present){
            System.out.println("givee  "+present);
        }
        

    }