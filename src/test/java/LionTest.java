import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Test
    public void kittensBackFromFelineTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        Assertions.assertEquals(1,lion.getKittens());
    }

    @Test
    public void doesHaveManeMaleExceptTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        Assertions.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleExceptTest() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        Assertions.assertFalse(lion.doesHaveMane());
    }



    @Mock
    Feline feline;

    @Test
    public void getFoodBackMeatTest() throws Exception{
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        Lion lion = new Lion("Самец", feline);
        Assertions.assertEquals(List.of("Мясо"), lion.getFood());
        Mockito.verify(feline).getFood("Хищник");
    }

}
