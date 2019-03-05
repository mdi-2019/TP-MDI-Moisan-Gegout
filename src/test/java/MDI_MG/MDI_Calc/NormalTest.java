package MDI_MG.MDI_Calc;

import junit.framework.TestCase;

public class NormalTest extends TestCase {

    Normal calcNormal = new Normal();

    public void testAdd() throws Exception
    {
        assertEquals(2.0,calcNormal.add(1,1));
    }

    public void testSub() throws Exception
    {
        assertEquals(0.0,calcNormal.sub(1,1));
    }

    public void testMult() throws Exception
    {
        assertEquals(2.0,calcNormal.mult(2,1));
    }
    public void testDiv() throws Exception
    {
        assertEquals(2.0,calcNormal.div(4,2));
    }
}