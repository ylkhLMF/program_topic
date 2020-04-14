package offer;

import org.junit.Test;

/**
 * @author dreamFly
 * @date 23:30 2020/4/14
 * @className offer.SolutionFirst
 * @description 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class SolutionFirst {


    public static void main(String[] args) {

    }

    /**
     * 方法一：左上开始查找
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        if(null == array ){
            return false;
        }
        // 行
        int row = 0;
        // 列的最大下标值
        int column = array[0].length-1;
        //遍历二位数组 条件行必须小于数组的长度 ，列的下标最小值为0
        while(row < array.length && column >=0){
            //当每组的 最后一个数字 等于输入的数字返回true,依次递减，若最小值扔大于则行数加 1
            if(array[row][column] == target){
                return true;
            }
            if(array[row][column] > target){
                column--;
            }else{
                row++;
            }
        }

        return false;
    }

    /**
     * 方法二
     * @param target
     * @param array
     * @return
     */
    public boolean Find2(int target, int [][] array) {

        if(null == array){
            return false;
        }
        for(int row = 0; row < array.length; row++){

            for( int column =0; column < array[0].length;column++){
                if(target == array[row][column]){
                    return true;
                }
            }
        }
        return false;
    }


}
