package game;

import java.util.Objects;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: CollectionsDeal
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 17:50 2020/3/20
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 17:50       liumf           v1.1.0
 */
public class CollectionsDeal {


    public static void main(String[] args) {
        int arr[] = {1,2};

        getElements(arr,5);

    }


    public static void getElements(int[] arr, int index){
        try{
            int i = arr[index];
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }finally {
            System.out.println("finally执行");
        }
        System.out.println("后续代码执行");
    }


    public static int getElement(int[] arr,int index){
        if (null==arr){
            int[] ints = Objects.requireNonNull(arr);
            throw new NullPointerException("空指针");
        }
        if (arr.length<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        int i = arr[index];
        return i;
    }
}