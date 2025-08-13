import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundCatTst(){
        Cat cat = new Cat(feline);
        String soundOfCat = cat.getSound();
        Assertions.assertEquals("Мяу", soundOfCat);
    }
    @Test
    public void getCatFoodBackTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
