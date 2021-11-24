package com.basics;

public class ArrayReferences {
        interface StringArray{
            String[] create(int size);
        }
      public void testArrayConstructorReferences(){
            StringArray sArray =size->new String[size];
            StringArray sArray2 = String[]::new;
      }

    public static void main(String[] args) {
    ArrayReferences arrayReferences = new ArrayReferences();
    arrayReferences.testArrayConstructorReferences();

    }
    }

