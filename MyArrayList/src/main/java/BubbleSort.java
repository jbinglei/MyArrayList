
/**
 * Created by JBL on 2017/8/19.
 */
public class BubbleSort<T> extends SortMethod<T>
{
    BubbleSort(T[] newArray,int len)
    {
        array = newArray;
        length = len;
    }

    public <T> void arraySort()
    {
        System.out.println("sort by Bubble method!");
        if(length<=0)
        {
            return;
        }
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-i-1;j++)
            {
                if( ((Comparable<T>)array[j]).compareTo((T)array[j+1]) > 0 )
                {
                    array[length+1] = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array[length+1];
                }
            }
        }
        printArray();
        System.out.println("Bubble method end!");
    }



}
