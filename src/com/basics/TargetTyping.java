package com.basics;

import java.awt.*;

public class TargetTyping {
    public interface Email{
        String constructEmail(String name);
    }
    Email email = (String name)->name + "@gmail.com";
    public  void getEmail(String name, Email email){
        return;
    }
    public static void main(String[] args) {
        new TargetTyping().getEmail("lokesh",(String name)->name + "@gmail.com");
    }
}
