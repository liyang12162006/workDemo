package com.yiWeiYunSuan;

/**
 * @author yangyangl
 * @date 2018-09-26 10:35
 */
public class test {

    public static void main(String[] args) {
                 int number = 10;
                 //原始数二进制
                 printInfo(number);
                 number = number << 1;
                 //左移一位
                 printInfo(number);
                 number = number >> 1;
                 //右移一位
                 printInfo(number);
             }

             /**
       * 输出一个int的二进制数
       * @param num
       */
             private static void printInfo(int num){
                 System.out.println(Integer.toBinaryString(num));
             }
}
