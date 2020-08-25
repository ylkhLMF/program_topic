package offer;

import java.util.Scanner;

/**
 * @author dreamFly
 * @date 21:44 2020/8/25
 * @className Test
 * @description 第一个数字是4,第二个数字是3,从第三位数字开始每个数字是前两个数字乘积的个位数,求出第98个数字为多少,并求出所有数字的和
 */

public class CountNum {


    public static void main(String[] args) {
        System.out.println("请输入第几个数:");
        Scanner scanner = new Scanner(System.in);
        int indexNum = scanner.nextInt();
        int initA =4;
        int initB =3;
        int temNum =0;
        int count =7;
        for (int i=2;i<indexNum;i++){
            temNum =initA*initB;
            String num2String =String.valueOf(temNum);
            int intC = Integer.parseInt(num2String.substring(num2String.length()-1));
            initA = initB;
            initB = intC;
            System.out.println("第"+(i+1)+"个数是======>"+intC);
            count+=intC;
            System.out.println("所有数字的和为"+(count));
        }
    }
}
