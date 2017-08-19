/**
 * Created by JBL on 2017/8/19.
 */
public class QuickSort<T> extends SortMethod<T>
{
    QuickSort(T[] newArray,int len)
    {
        array = newArray;
        length = len;
    }

    public <T> void arraySort()
    {
        System.out.println("sort by Quick method!");
        if(length<=0)
        {
            return;
        }
        sort(array,0,length-1);
        printArray();
        System.out.println("Quick method end!");
    }

    public void sort(T[] a,int low,int high)
    {
        int start = low;
        int end = high;
        T key = a[low];
        while(end>start)
        {
            while(end>start && ((Comparable<T>)a[end]).compareTo((T)key)>=0 )
            {
                end--;
            }
            if( ((Comparable<T>)a[end]).compareTo((T)key)<0 )
            {
                a[length+1] = a[end];
                a[end] = a[start];
                a[start] = a[length+1];
            }
            while( end>start && ((Comparable<T>)a[start]).compareTo((T)key)<=0 )
            {
                start++;
            }
            if(((Comparable<T>)a[start]).compareTo((T)key)>0)
            {
                a[length+1] = a[start];
                a[start] = a[end];
                a[end] = a[length+1];
            }
        }
        if(start>low)
        {
            sort(a,low,start-1);
        }
        if(end<high)
        {
            sort(a,end+1,high);
        }
    }

}
