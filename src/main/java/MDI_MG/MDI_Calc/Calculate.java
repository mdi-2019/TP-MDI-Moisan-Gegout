package MDI_MG.MDI_Calc;

import java.util.*;

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

        //Boucle de fonctionnement de la calculatrice
        while(isOn)
        {
            if()
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
