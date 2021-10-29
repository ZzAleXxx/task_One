package com.company;
import java.util.Scanner;

class Stack<T extends Object> {
    private int maxSize;
    private T[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArr = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == maxSize - 1);
    }

    public void push(T elements) {
        if (this.isStackFull()) {
            System.out.println(("Stack is full"));
        }
        System.out.println("В стек добавлен элемент: " + elements);
        this.stackArr[++top] = elements;
    }

    public void pop() {
        if (this.isStackEmpty()) {
            System.out.println("Stack is empty");
        }
        T elements = this.stackArr[top--];
        System.out.println("Удалённый элемент: " + elements);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>(n);
        for (int i = 0; i < mass.length; i++) {
            stack.push(mass[i]);
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
    }
}
