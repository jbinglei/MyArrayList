
/**
 * Created by JBL on 2017/8/19.
 */
public class Entry
{
    public static void main(String[] args)
    {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(3);
        //增加
        myArrayList.add(10);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(13);
        //查找
        System.out.println(myArrayList.get(2));
        //修改
        if(myArrayList.modify(2,7))
        {
            System.out.println(myArrayList.get(2));
        }
        //删除
        if(myArrayList.delete(2))
        {
            System.out.println(myArrayList.get(2));
        }

        /*
        System.out.println(myArrayList.getLength());
        System.out.println(myArrayList.getSize());
        myArrayList.printArray();
        myArrayList.setEmpty();
        */

        //排序
        myArrayList.arraySort("Bubble");
        myArrayList.arraySort("Choice");
        myArrayList.arraySort("Quick");
    }
}
