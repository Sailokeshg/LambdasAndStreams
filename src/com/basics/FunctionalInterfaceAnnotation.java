package com.basics;

public class FunctionalInterfaceAnnotation {
    @FunctionalInterface
    interface Cruncher{
        int crunch(int i,int j);
    }
    public int cruncherService(int i,int j,Cruncher cruncher){
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();
       int ans= client.cruncherService(3,4,(p,q)->p*q);
        System.out.println("Answer:"+ans);

        ans= client.cruncherService(4,5,(p,q)->p+q);
        System.out.println("Answer:"+ans);

        ans= client.cruncherService(5,6,(p,q)->p-q);
        System.out.println("Answer:"+ans);

        ans= client.cruncherService(6,3,(p,q)->p/q);
        System.out.println("Answer:"+ans);
    }
}
