import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JBL on 2017/8/19.
 */
public class TestMyArrayList
{
    @Test
    public void test01()
    {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(3);
        myArrayList.add(10);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(13);
        Assert.assertEquals(6, (int) myArrayList.get(2));
        myArrayList.modify(2, 7);
        Assert.assertEquals(7, (int) myArrayList.get(2));
        myArrayList.delete(2);
        Assert.assertEquals(2, (int) myArrayList.get(2));
        Assert.assertEquals(5, myArrayList.getLength());
        Assert.assertEquals(13, myArrayList.getSize());
        int[] newArray = new int[5];
        newArray[0] = 2;
        newArray[1] = 5;
        newArray[2] = 9;
        newArray[3] = 10;
        newArray[4] = 13;
        myArrayList.arraySort("Bubble");
        for(int i=0;i<5;i++)
        {
            Assert.assertEquals(newArray[i], (int)myArrayList.get(i));
        }
    }

    @Test
    public void test02()
    {
        MyArrayList<String> myArrayList = new MyArrayList<String>(4);
        myArrayList.add("str7");
        myArrayList.add("str4");
        myArrayList.add("str1");
        myArrayList.add("str3");
        myArrayList.add("str9");
        myArrayList.add("str2");
        Assert.assertEquals("str1", (String) myArrayList.get(2));
        myArrayList.modify(2, "str5");
        Assert.assertEquals("str5", (String) myArrayList.get(2));
        myArrayList.delete(2);
        Assert.assertEquals("str3", (String) myArrayList.get(2));
        Assert.assertEquals(5, myArrayList.getLength());
        Assert.assertEquals(14, myArrayList.getSize());
        String[] newArray = new String[5];
        newArray[0] = "str2";
        newArray[1] = "str3";
        newArray[2] = "str4";
        newArray[3] = "str7";
        newArray[4] = "str9";
        myArrayList.arraySort("Quick");
        for(int i=0;i<5;i++)
        {
            Assert.assertEquals(newArray[i], (String)myArrayList.get(i));
        }
    }
}
