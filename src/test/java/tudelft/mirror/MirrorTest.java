package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest
{
    @Test
    public void mirrorEnds()
    {
        String result = new Mirror().mirrorEnds("aba") ;
        Assertions.assertEquals("a",result);
    }
}
