package 蓝桥杯.第八届蓝桥杯javaB组;

import java.util.*;

//f(x/10,k)
public class _05_取数位 {
	static int len(int x){  
        if(x<10) return 1;  
        return len(x/10)+1;  
    }  
  
    // 取x的第k位数字  
    static int f(int x, int k){  
        if(len(x)-k==0) return x%10;  
        return f(x/10,k);  //填空  
    }  
  
    public static void main(String[] args)  {  
        int x = 23513;  
        //System.out.println(len(x));  
        System.out.println(f(x,3));  
    }  

}
/**
 * 求1个整数的第k位数字有很多种方法。
以下的方法就是一种。
对于题目中的测试数据，应该打印5。
请仔细分析源码，并补充划线部分所缺少的代码。
注意：只提交缺失的代码，不要填写任何已有内容或说明性的文字。。 
*/
