
/**
 * Created by JBL on 2017/8/19.
 */
public class SortMethod<T> implements Comparable<T>
{
    public T[] array;
    public int length;
    SortMethod()
    {

    }
    SortMethod(T[] newArray,int length)
    {
        array = newArray;
    }
    public <T> void arraySort()
    {

    }

    public int compareTo(T o)
    {
        // 这里要实现比较两个对象的大小
        return 0;
    }

    public void printArray()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println("index : " + i + ", value : " + array[i]);
        }
    }
}
