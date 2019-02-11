package MDI_MG.MDI_Calc;

import java.util.*;
import MDI_MG.MDI_Calc.Normal;
import MDI_MG.MDI_Calc.Scientifique;

public class Calculate {


    //On choisi le mode de la calculatrice
    public static void main( String[] args )
    {
         boolean isOn = false;
         boolean mode = false; // false = normale et true = scientifique
         double prec = 0.0;
         int answer = 0;

        System.out.println("Bonjour, bienvenue sur la calcuatrice");
        isOn = true;
        Scanner scan = new Scanner(System.in);

        mode = ChooseCalculateMode(scan, mode);
        Normal nor = new Normal();
        Scientifique sci = new Scientifique();

        //Boucle de fonctionnement de la calculatrice
        while(isOn)
        {
            // On informe l'utilisateur du mode actuel
            if(!mode) {
                System.out.println("Mode Normal");
                prec = nor.init(prec,scan);
            }
            else {
                System.out.println("Mode Scientifique");
                prec = sci.init(prec,scan);
            }

            System.out.println("Le résultat est : "+prec);
        }
    }

    public static boolean ChooseCalculateMode(Scanner scan, boolean mode)
    {
        System.out.println("Rentrez le mode de la calculatrice que vous voulez utiliser : ");
        System.out.println("Appuyez sur 1 : Mode normale");
        System.out.println("Appuyez sur 2 : Mode scientifique");

        int answer = scan.nextInt();

        if(answer == 1)
        {
            mode = false;
        }
        else if(answer == 2)
        {
            mode = true;
        }
        else
        {
            System.out.println("Saisie incorrect");
        }

        return mode;
    }
}
