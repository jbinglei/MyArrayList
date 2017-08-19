import java.lang.reflect.Array;
import java.util.Comparator;

/**
 * Created by JBL on 2017/8/19.
 */
public class MyArrayList<T>
{
    private int size;
    private int length = 0;
    private T[] array;
    //构造函数
    MyArrayList()
    {
        this.size = 6;
        array = (T[])new Object[size];
    }
    MyArrayList(int size)
    {
        if(size<=0)
        {
            throw new NegativeArraySizeException("size wrong!");
        }
        this.size = size;
        array = (T[])new Object[size];
    }
    //增加
    public void add(T element)
    {
        isHaveFree();
        array[length] = element;
        length++;
    }
    //删除
    public boolean delete(int index)
    {
        if(!isLegal(index))
        {
            System.out.println("input wrong for delete!");
            return false;
        }else
        {
            for(int i=index;i<length-1;i++)
            {
                array[i] = array[i+1];
            }
            length--;
            return true;
        }
    }

    //查找
    public T get(int index)
    {
        if(!isLegal(index))
        {
            System.out.println("input wrong for get!");
            return null;
        }else
        {
            return array[index];
        }
    }
    //修改
    public boolean modify(int index, T object)
    {
        if(!isLegal(index))
        {
            System.out.println("input wrong for modify!");
            return false;
        }else
        {
            array[index] = object;
            return true;
        }
    }
    //总容量
    public int getSize()
    {
        return size;
    }
    //当前元素个数
    public int getLength()
    {
        return length;
    }
    //打印
    public void printArray()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println("index : " + i + ", value : " + array[i]);
        }
    }
    //清空
    public void setEmpty()
    {
        length = 0;
        return;
    }

    //排序
    public void arraySort(String method)
    {
        SortMethod<T> sortMethod;
        if(method.equals("Bubble"))
        {
            sortMethod = new BubbleSort<T>(array,length);
        }else if(method.equals("Choice"))
        {
            sortMethod = new ChoiceSort<T>(array,length);
        }else
        {
            sortMethod = new QuickSort<T>(array,length);
        }
        sortMethod.arraySort();
    }

    //是否合法
    private boolean isLegal(int index)
    {
        if(index>=length || index<0)
        {
            return false;
        }else
        {
            return true;
        }
    }

    //是否有剩余空间
    private void isHaveFree()
    {
        if(length < size-1)
        {
            return;
        }else
        {
            T[] arrayTemp = array.clone();
            array = (T[])new Object[size+10];
            for(int i=0;i<arrayTemp.length;i++)
            {
                array[i] = arrayTemp[i];
            }
            size = size + 10;
        }
    }
}
