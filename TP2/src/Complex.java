public class Complex {
    float pr; //Partie réelle
    float pi; //Partie imaginaire

    public Complex(float pr, float pi){
        this.pr = pr;
        this.pi = pi;
    }

    @Override
    public String toString(){
        return pr + " + " + pi + "i";
    }
}
