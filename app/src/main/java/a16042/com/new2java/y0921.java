package a16042.com.new2java;

public class y0921 {
    public static void main(String[] args) {

        //异常  （异常捕获）
        try{
            int result=divide(4,2);
            System.out.println(result);
        }
        catch (Exception e){
            //System.out.println("你找的异常是："+e.getMessage());
            e.printStackTrace();//打印捕获的异常
            //结束这个方法
            //return;
        }
        //寻找异常结束后实现后面的代码
        //不受 异常和return的影响
        finally {
            System.out.println("后面代码");
        }
        //上面的return能结束这句话 不让这句运行出来
        System.out.println("程序继续运行下去...（上面的return能结束这句话 不让这句运行出来）");
    }

    //在不明白异常错误在那时候 使用抛出异常（方法后面加throws）
    public static int divide(int x,int y)throws Exception{
        int result=x/y;
        return result;
    }
}
//自定义异常-----
