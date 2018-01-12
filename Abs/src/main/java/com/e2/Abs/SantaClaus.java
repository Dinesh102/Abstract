package com.e2.Abs;

 class SantaClaus extends Person{
    public SantaClaus(String present){
        super(present);
    }
    void givePresent(){
        System.out.println("giveee   "+present);
    }
}