package com.shawn.configserver;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/22 0022
 */
public class ArraySort implements Runnable{

    private int number = 0;

    public ArraySort(int number){
        this.number = number;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{100,500,200,15,36,80,2500};
        for(int number : numbers){
            new Thread(new ArraySort(number)).start();
        }
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.number);
            System.out.println(this.number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
