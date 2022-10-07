import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Appli {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Veuillez saisir le nom de la commande à executer : Quel exercice ? Saisissez :\n" +
                    "1. Discriminant\n" +
                    "2. Parite d'un nombre\n" +
                    "3. Calcul d'extremum\n" +
                    "4. Egalite entre chaines de caracteres\n" +
                    "5. Factorielle\n" +
                    "6. Compte a rebours\n" +
                    "7. Valeurs de carres\n" +
                    "8. Table de multiplication\n" +
                    "9. Division d'entiers\n" +
                    "10. Regle graduee\n" +
                    "11. Nombres premiers\n" +
                    "12. Manipulations sur un tableau\n");
                int reponse = scanner.nextInt();
                switch(reponse){
                    case 1 :
                        discriminant();
                        break;
                    case 2 :
                        parite();
                        break;
                    case 3 :
                        min();
                        max();
                        break;
                    case 4 :
                        egaliteStr();
                        break;
                    case 5 :
                        factorielle();
                        break;
                    case 6:
                        countdown();
                        break;
                    case 7:
                        carres();
                        break;
                    case 8:
                        tableMultiplication();
                        break;
                    case 9:
                        division();
                        break;
                    case 10:
                        regle();
                        break;
                    case 11:
                        nombrePremier();
                        break;
                    case 12:
                        initialisationTableau();
                        break;
                    default:
                        System.out.printf("Cette commande n'existe pas");
                }
            }
    }

    private static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta > 0) {
            // 2 racines réelles
            float x0 = (-b + (float) Math.sqrt(delta))/(2*a);
            float x1 = (-b - (float) Math.sqrt(delta))/(2*a);
            System.out.println(x0);
            System.out.println(x1);
        } else if (delta == 0){
            // 1 racine réelle
            float x0 = -b/2*a;
            System.out.println(x0);
        }
        else{
            // 2 racines complexes
            Complex x0 = new Complex((-b)/2*a,(float) Math.sqrt(-delta)/(2*a));
            Complex x1 = new Complex((-b)/2*a, (float) - Math.sqrt(-delta)/(2*a));
            System.out.println(x0.toString());
            System.out.println(x1.toString());
        }
    }

    private static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nb = scanner.nextInt();
        if(nb%2 == 0){
            System.out.println("Votre entier " + nb + " est pair");
        }else{
            System.out.println("Votre entier " + nb + " est impair");
        }
    }

    private static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int a = scanner.nextInt();
        System.out.println("Entrez un 2ème nombre");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(a + " est plus grand que " + b);
        } else{
            System.out.println(b + " est plus grand que " + a);
        }
    }

    private static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int a = scanner.nextInt();
        System.out.println("Entrez un 2ème nombre");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(b + " est plus petit que " + a);
        } else{
            System.out.println(a + " est plus petit que " + b);
        }
    }

    private static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères");
        String str1 = scanner.nextLine();
        System.out.println("Entrez une autre chaîne de caractères");
        String str2 = scanner.nextLine();
        if(str1.equals(str2)){
            System.out.println("Les chaînes de caractères sont identiques");
        }else{
            System.out.println("Les chaînes de caractères ne sont pas identiques");
        }
    }

    private static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; ++i) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    private static void countdown(){
        Countdown cntd = new Countdown(10);
        cntd.run();
    }

    private static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int x = scanner.nextInt();
        System.out.println("x = " + x + "\t x**2 = " + x*x);
    }

    private static void tableMultiplication(){
        for(int i = 1; i <= 10; ++i){
            for(int j = 1; j <= 10; ++j){
                System.out.print(i*j + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int a = scanner.nextInt();
        int b;
        do{
            System.out.println("Entrez un 2ème entier");
            b = scanner.nextInt();
        }while(b == 0);

        System.out.println("Le résultat est : " + a/b);
    }

    private static void regle(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Entrez un entier strictement positif");
            n = scanner.nextInt();
        } while(n <= 0);
        for(int i = 0; i < n; ++i){
            if(i % 10 == 0){
                System.out.print("|");
            }
            System.out.print("_");
        }
    }

    private static void nombrePremier(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Entrez un entier strictement positif");
            n = scanner.nextInt();
        } while(n <= 0);
        int cpt = 0;
        for(int i = 1; i <= n; ++i){
            if(n%i == 0 || n%i == n){
                cpt++;
            }
        }
        if(cpt == 2){
            System.out.println("Le nombre " + n + " est premier");
        }else{
            System.out.println("Le nombre " + n + " n'est pas premier");
        }
    }

    private static void initialisationTableau() {
        //Init
        int dim = 5;
        int[] tableau = new int[dim];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        //Min et max, somme, parité
        int min = tableau[0];
        int max = tableau[0];
        int somme = 0;
        int cptPair = 0;
        for(int item : tableau){
            if(item < min){
                min = item;
            }else if (item > max){
                max = item;
            }
            somme += item;
            if(item%2 == 0){
                System.out.print("Element pair : " + item + "\n");
            }
        }
        System.out.println("Le minimum est : " + min + " et le maximum est " + max);
        System.out.println("La somme est : " + somme);

        for(int i = 0; i < tableau.length; ++i){
            if(i%2 == 0){
                System.out.println(tableau[i]);
            }
        }
        inverseTableau(tableau);
    }

    private static void inverseTableau(int[] tableau){
        int[] tabInverse = new int[tableau.length];
        int cpt = 0;
        for(int i = tableau.length - 1; i >= 0; --i){
            tabInverse[cpt] = tableau[i];
            cpt++;
        }
        for(int item : tabInverse){
            System.out.print(item + "\t");
        }
    }
}
