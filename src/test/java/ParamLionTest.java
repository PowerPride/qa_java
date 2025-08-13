import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ParamLionTest {

    @ParameterizedTest
    @CsvSource({"Самец, true","Самка, false"})

    public void doesHaveManeParamTest(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assertions.assertEquals(expected, lion.doesHaveMane(), () -> ("Проверка для пола") + sex);
    }
}
