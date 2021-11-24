package com.basics;

public class ConstructorReferences {
    class Movie{
        public Movie(int id){

        }
        public Movie(int id,String name){

        }
    }
    interface MovieFactory {
    public Movie create(int id);
    }
    interface MovieFactory2{
        public Movie create(int id,String name);
    }

    MovieFactory m1=id -> new Movie(id);
    MovieFactory m2 = Movie::new;

    MovieFactory2 m3 =Movie::new;

    public static void main(String[] args) {
        ConstructorReferences client = new ConstructorReferences();

    }
}
