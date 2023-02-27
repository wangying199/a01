package script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GitTest01 {
    @Test
    public void test() {
        int res = 3 + 4;
        int excepted = 7;
        Assert.assertEquals(res, excepted);
    }

    @DataProvider
    public Object[][] dataResult() {
        return new Object[][]{

            { "火星哥", 22, "男"},
            { "霉霉", 23, "女"}

        };

    }

    @Test(dataProvider = "dataResult") //值为方法名
    public void test(String name, int age, String sex) {
        System.out.println(name + age + sex);
    }
    @Test
    public void testA()  {
        System.out.println("testA");
        Assert.assertEquals(1,1);
    }

    @Test
    public void testB(){
        System.out.println("testB");
        Assert.assertEquals(2,2);

}}
