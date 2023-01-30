package session6;

public class Session6Main {
    public static void main(String[] args){
//        Human h = new Human();
        Asian a = new Asian();
        American am = new American();
        Human h = new Human() { // anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };
        
    }
}
