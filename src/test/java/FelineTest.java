import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;


public class FelineTest {
    @Test
    public void getFamilyFelineTest(){
        Feline feline = new Feline();
        Assertions.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getFoodFelineTest() throws Exception {
        Feline feline = new Feline();
        List<String> Food = List.of("Животные", "Птицы", "Рыба");
        Assertions.assertEquals(Food, feline.eatMeat());
    }

    @Test
    public void getKittensFelineTest(){
        Feline feline = new Feline();
        Assertions.assertEquals(1, feline.getKittens());
    }
}
