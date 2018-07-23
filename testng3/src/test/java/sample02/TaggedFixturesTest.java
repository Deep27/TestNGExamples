package sample02;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaggedFixturesTest {

    // если в suite.xml укажем обе группы, то перед каждым тестом
    // эти обе группы методов @BeforeMethod и будут выполняться
    // для того, чтобы не было путаницы, используется аннотация @BeforeGroups (sample03.GroupFixturesTest)

    @BeforeMethod(groups = {"G12_1"})
    public void setUpG1() {
        System.out.println("setUpG12_1");
    }

    @BeforeMethod(groups = {"G12_2"})
    public void setUpG2() {
        System.out.println("setUpG12_2");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test(groups = {"G12_1"})
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = {"G12_2"})
    public void test2() {
        System.out.println("test2");
    }
}
