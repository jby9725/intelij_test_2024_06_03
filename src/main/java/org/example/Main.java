package org.example;

public class Main {
    public static void main(String[] args) {
        myObject obj = new myObject();
        obj.intNum = 100;
        obj.doubleNum = 123.456;
        obj.str = "문자열";
        obj.tf = true;
        obj.arr = new int[3];
        for (int i = 0; i < obj.arr.length; i++) {
            obj.arr[i] = i + 1;
        }

        System.out.println(obj.intNum);
        System.out.println(obj.doubleNum);
        System.out.println(obj.str);
        System.out.println(obj.tf);

        for (int i = 0; i < obj.arr.length; i++) {
            System.out.println(obj.arr[i]);
        }

    }
}

class myObject {
    int intNum;
    double doubleNum;
    String str;
    boolean tf;
    int[] arr;
}