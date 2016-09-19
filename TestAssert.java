public class TestAssert
{
    public static String main(String[] args)
    {
        return("Hello world!");
    }

	@Test
	public void testMainEquals()
	{
		String[] t;
		assertEquals("Hello world!", TestAssert.main(t));
	}
}
