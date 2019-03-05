package MDI_MG.MDI_Calc;

import junit.framework.TestCase;

import java.util.Scanner;

/**
 * Created by 14014959 on 05/03/19.
 */
public class ScientifiqueTest extends TestCase {

    Scientifique scien = new Scientifique();
    Scanner scan = new Scanner(System.in);

    public void testCalc_sqrt() throws Exception {
        assertEquals(2.0,scien.calc_sqrt(4, scan));
    }

    public void testCalc_sin() throws Exception {
        org.apache.commons.math3.analysis.function.Sin sin = new org.apache.commons.math3.analysis.function.Sin();
        assertEquals(0.0,scien.calc_sin(0, scan));
    }

    public void testCalc_cos() throws Exception {
        org.apache.commons.math3.analysis.function.Cos cos = new org.apache.commons.math3.analysis.function.Cos();
        assertEquals(1.0,scien.calc_cos(0, scan));
    }

    public void testCalc_tan() throws Exception {
        org.apache.commons.math3.analysis.function.Tan tan = new org.apache.commons.math3.analysis.function.Tan();
        assertEquals(0.0,scien.calc_tan(0, scan));
    }

}