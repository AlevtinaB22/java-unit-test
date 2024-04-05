import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProgramWithParameterizedTest {
    @Parameterized.Parameter(0)
    public int age;
    @Parameterized.Parameter(1)
    public boolean result;
    @Parameterized.Parameters(name = "{index} : age {0}, result {1}")
    public static Object[][] getTextData() {
        return new Object[][] {
                {22,true},
                {19,true},
                {18,true},
                {17,false},
        };
    }
    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        Assert.assertEquals("Неверный рассчет ",result,isAdult );
    }
}

