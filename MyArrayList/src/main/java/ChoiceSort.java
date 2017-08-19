/**
 * Created by JBL on 2017/8/19.
 */
public class ChoiceSort<T> extends SortMethod<T>
{
    ChoiceSort(T[] newArray,int len)
    {
        array = newArray;
        length = len;
    }

    public <T> void arraySort()
    {
        System.out.println("sort by Choice method!");
        if(length<=0)
        {
            return;
        }
        for (int i = 0; i < length; i++)
        {
            int min = i;
            for (int j = i + 1; j < length; j++)
            {
                if (((Comparable<T>)array[min]).compareTo((T)array[j]) > 0)
                {
                    min = j;
                }
            }
            if (i != min)
            {
                array[length+1] = array[min];
                array[min] = array[i];
                array[i] = array[length+1];
            }
        }
        printArray();
        System.out.println("Choice method end!");
    }
}
