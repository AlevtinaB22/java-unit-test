import org.junit.Assert;
import org.junit.Test;

public class ProgramWithoutParameterizedTest {
    @Test
    public void checkIsAdultWhenAgeIsMore18() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(55);
        Assert.assertTrue("Возраст меньше 18 лет", isAdult);
    }
    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        Assert.assertFalse("Должно вернуться false, так как пользователь несовершеннолетний", isAdult);
    }
    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        Assert.assertTrue("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }
}
