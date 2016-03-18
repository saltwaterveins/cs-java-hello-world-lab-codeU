package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String s = System.getProperty("java.version");
        return Double.parseDouble(s.substring(0,3));
    }

    public static void main(String[] args) {
    }
}
