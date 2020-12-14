package com.timurvvolkov.chapter15;

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
