package test1;

import org.testng.annotations.Test;

public class TestFun {
//@Test
public void test1()
{
    System.out.println("hi this from test1");
}


public void test2()
{
    System.out.println("hi this is jenkins1");
    System.out.println("hi this is jenkins3");
}
@Test
public void test3()
{
    System.out.println(System.getProperty("PARAM"));
}


}
