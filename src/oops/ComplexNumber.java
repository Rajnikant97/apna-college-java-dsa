package oops;

import java.util.Scanner;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        int r = this.getReal() + c.getReal();
        int i = this.getImaginary() + c.getImaginary();
        return new ComplexNumber(r, i);
    }

    public ComplexNumber subtract(ComplexNumber c) {
        int r = this.getReal() - c.getReal();
        int i = this.getImaginary() - c.getImaginary();
        return new ComplexNumber(r, i);
    }

    public ComplexNumber multiply(ComplexNumber c) {
        int r = this.getReal() * c.getReal() - (this.getImaginary() * c.getImaginary());
        int i = this.getReal() * c.getImaginary() + this.getImaginary() * c.getReal();
        return new ComplexNumber(r, i);
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "[real = " + this.real + ", imaginary = " + this.imaginary + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Enter second complex number");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));
    }
}
