package MDI_MG.MDI_Calc;

import java.util.*;

public class Normal {

    int answer;
    double value;

    public Normal() {
    }

    public double init(double prec, Scanner scan) {

        System.out.println("Choisissez une fonction : ");
        System.out.println("Appuyez sur 1 : Addition");
        System.out.println("Appuyez sur 2 : Soustraction");
        System.out.println("Appuyez sur 3 : Multiplication");
        System.out.println("Appuyez sur 4 : Division");
        System.out.println("Appuyez sur 5 : Remettre à 0 la valeur precédente ("+prec+")");

        answer = scan.nextInt();
        double result = 0.0;

        System.out.println("Veuillez choisir une valeur : ");

        //Choix de la fonction
        switch(answer)
        {
            case 1 :
                System.out.println("Addition : "+prec+" + ");
                value = scan.nextDouble();
                result = add(prec, value);
                break;
            case 2 :
                System.out.println("Soustraction : "+prec+" - ");
                value = scan.nextDouble();
                result = sub(prec, value);
                break;
            case 3 :
                System.out.println("Multiplication : "+prec+" * ");
                value = scan.nextDouble();
                result = mult(prec, value);
                break;
            case 4 :
                System.out.println("Division : "+prec+" / ");
                value = scan.nextDouble();
                result = div(prec, value);
                break;
            case 5 :
                prec = 0;
                break;
            default :

                break;
        }

        return result; //retourne le résultat
    }

    public double add(double prec, double valeur)
    {
        double result = prec + valeur;
        return result;
    }

    public double sub(double prec, double valeur)
    {
        double result = prec - valeur;
        return result;
    }

    public double mult(double prec, double valeur)
    {
        double result = prec * valeur;
        return result;
    }

    public double div(double prec, double valeur)
    {
        if(valeur != 0)
        {
            double result = prec / valeur;
            return result;
        }
        System.out.println("Erreur : division par 0 !");
        return prec;
    }

    public void codemort()
    {
        System.out.println("Ceci est un code mort");
    }
}

