package MDI_MG.MDI_Calc;

import java.util.*;
import MDI_MG.MDI_Calc.Normal;
import MDI_MG.MDI_Calc.Scientifique;

public class Calculate {
    private boolean isOn = false;
    private boolean mode = false; // false = normale et true = scientifique
    private double prec = 0.0;
    private int answer = 0;

    //On choisi le mode de la calculatrice
    void main()
    {
        System.out.println("Bonjour, bienvenue sur la calcuatrice");
        isOn = true;
        Scanner scan = new Scanner(System.in);

        ChooseCalculateMode(scan);
        Normal nor = new Normal();
        Scientifique sci = new Scientifique();

        //Boucle de fonctionnement de la calculatrice
        while(isOn)
        {
            // On informe l'utilisateur du mode actuel
            if(!mode) {
                System.out.println("Mode Normal");
                prec = nor.init(prec);
            } else {
                System.out.println("Mode Scientifique");
                prec = sci.init(prec);
            }




        }
    }

    public void ChooseCalculateMode(Scanner scan)
    {
        System.out.println("Rentrez le mode de la calculatrice que vous voulez utiliser : ");
        System.out.println("Appuyez sur 1 : Mode normale");
        System.out.println("Appuyez sur 2 : Mode scientifique");

        answer = scan.nextInt();

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
    }
}
