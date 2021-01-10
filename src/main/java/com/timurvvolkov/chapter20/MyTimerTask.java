package com.timurvvolkov.chapter20;

import java.util.TimerTask;

class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Задание по таймеру выполняется.");
    }
}
