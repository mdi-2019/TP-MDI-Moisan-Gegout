package MDI_MG.MDI_Calc;
import org.apache.commons.math3.*;
import sun.security.x509.X500Name;

import java.util.Scanner;

public class Scientifique {
    public Scientifique() {
    }

    public double init(double prec, Scanner scan) {
        System.out.println("Choississez la fonction que vous voulez appliquer sur " + prec);
        System.out.println("1 : racine carré\n2 : sinus\n3 : cosinus\n4 : tangente\n5 : puissance");
        int answer = scan.nextInt();

        double out = 0;
        switch (answer){
            case 1: out = calc_sqrt(prec,scan);
                break;
            case 2: out = calc_sin(prec,scan);
                break;
            case 3: out = calc_cos(prec,scan);
                break;
            case 4: out = calc_tan(prec,scan);
                break;
            case 5: out = calc_power(prec,scan);
                break;
            default: System.out.println("Saisie incorrecte");
        }

        return out; //retourne le résultat
    }



    // Fonction de racine carré
    private double calc_sqrt(double in, Scanner scan){
        org.apache.commons.math3.analysis.function.Sqrt sqrt = new org.apache.commons.math3.analysis.function.Sqrt();
        return sqrt.value(in);
    }

    // Fonction de sinus
    private double calc_sin(double in, Scanner scan){
        org.apache.commons.math3.analysis.function.Sin sin = new org.apache.commons.math3.analysis.function.Sin();
        return sin.value(in);
    }

    // Fonction de cosinus
    private double calc_cos(double in, Scanner scan){
        org.apache.commons.math3.analysis.function.Cos cos = new org.apache.commons.math3.analysis.function.Cos();
        return cos.value(in);
    }

    // Fonction de tangente
    private double calc_tan(double in, Scanner scan){
        org.apache.commons.math3.analysis.function.Tan tan = new org.apache.commons.math3.analysis.function.Tan();
        return tan.value(in);
    }

    //
    private double calc_power(double in, Scanner scan){
        System.out.println("Choissisez la puissance à appliquer");
        int answer = scan.nextInt();
        org.apache.commons.math3.analysis.function.Power power = new org.apache.commons.math3.analysis.function.Power(answer);
        return power.value(in);
    }
}
