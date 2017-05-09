package com.company.Test3a;
import java.util.*;
class StackFullException extends Exception {}

class StackEmptyException extends Exception {}

class Stack<E> {
    private E[] stackItems;
    private int insertionIndex = 0;
    private int capacity;

    Stack(int capacity) {
        stackItems = (E[]) new Object[capacity];
        this.capacity = capacity;
    }

    void push(E element ) throws StackFullException {
        if (insertionIndex >= capacity) {
            throw new StackFullException();
        }

        stackItems[insertionIndex] = element;
        insertionIndex++;
    }

    E pop () throws StackEmptyException {
        if (insertionIndex == 0) {
            throw new StackEmptyException();
        }

        E returnElement = stackItems[insertionIndex - 1];
        insertionIndex--;
        return returnElement;
    }
}


public class Main {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>(2);
        try {
            strings.push("Hello");
            strings.push("World");
            System.out.println(strings.pop());
            System.out.println(strings.pop());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
    }
}


