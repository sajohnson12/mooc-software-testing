package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest
{
    @Test
    public void hHappyMiddle()
    {
        boolean result = new GHappy().gHappy("xxggxx");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void hHappyBegin()
    {
        boolean result = new GHappy().gHappy("ggxxxx");
        Assertions.assertEquals(true,result);
    }
}
