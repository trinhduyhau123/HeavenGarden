public class World {

    public static void main(String[] args) {
        Human man = new Human("Hau", true);
        Human women = new Human("HauG", false);
        God god = new God();
         god.say("Ko dc an tao.. An se chet");
        Snack snack = new Snack();
        snack.say("An di. ko chet dau");
        man.apple.weight = 5;
        while (man.apple.isEmpty() == false) {
            man.eat();
            women.eat();
            System.out.println(man.apple.weight);
        }

        man.sleep();
        women.sleep();

        god.say("Eva phai sinh conn... Nguoi dan onng quoc dat");
    }
}
