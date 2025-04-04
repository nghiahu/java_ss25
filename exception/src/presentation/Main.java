package presentation;

import util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập vào số nguyên: ");
            System.out.println("Số nguyên vừa nhập: " + Validator.valueInt(scanner));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        scanner.nextLine();
        try {
            System.out.print("Nhập vào số thực float: ");
            System.out.println("Số thực vừa nhập: " + Validator.valueFloat(scanner));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        scanner.nextLine();
        try {
            System.out.print("Nhập vào số thực double: ");
            System.out.println("Số thực vừa nhập: " + Validator.valueDouble(scanner));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        scanner.nextLine();
        try {
            System.out.print("Nhập vào giá trị bolean: ");
            System.out.println("Giá trị vừa nhập: " + Validator.validateBolean(scanner));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Nhập vào một chuỗi: ");
            System.out.println("Chuỗi vừa nhập: " + Validator.validateString(scanner,1,100));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Nhập vào một email: ");
            System.out.println("email vừa nhập: " + Validator.validateEmail(scanner));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Nhập vào một số điệ thoai: ");
            System.out.println("Số điện thoại vừa nhập: " + Validator.validatePhone(scanner));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
