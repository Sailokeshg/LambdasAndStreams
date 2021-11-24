package com.basics;

interface IMovie{
    public boolean check(int id);
}
public class MethodReferences {
    //static method reference
    public void testMovieStaticMethodRef(){
        IMovie m1= id -> id>100?true:false;
        IMovie m2 = MethodReferences::isClassic;
    }
    //Instance method reference usage
    private void testMovieInstanceMethodRef(){
        MethodReferences reference = new MethodReferences();
        IMovie m1 =id -> id<10?true:false;
        IMovie m2 = reference::isTop10;
    }
    public void testMovieArbitaryObjectMethod(){
        IMovie m1;
        m1 =SomeMethodReferences::isComedy;

    }
    public boolean isTop10(int movieId){
        return true;
    }
    public static boolean isClassic(int movieId){
        return true;
    }

    public static void main(String[] args) {
        MethodReferences client = new MethodReferences();
        System.out.println(client.isTop10(2));
    }

    }
class SomeMethodReferences{
    public static boolean isComedy(int id){
        return true;
    }
}
