package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest
{
    @Test
    public void caesarValid1()
    {
        String result = new Caesar().caesarShiftCipher("abc", 3);
        Assertions.assertEquals("def",result);
    }

    @Test
    public void caesarValid2()
    {
        String result = new Caesar().caesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc",result);
    }

    @Test
    public void caesarValid3()
    {
        String result = new Caesar().caesarShiftCipher("x y z", 3);
        Assertions.assertEquals("a b c",result);
    }

    @Test
    public void caesarInvalid()
    {
        String result = new Caesar().caesarShiftCipher("Abc", 3);
        Assertions.assertEquals("invalid",result);
    }
}
