package manualLesson1;

public class App {
    public static void main(String[] args) {
    Members [] members= getMembersArray();
    Barrier [] barriers = getBarriersArray();
    overcoming(barriers,members);

    }

    public static Barrier [] getBarriersArray(){
        Barrier [] barriers = new Barrier[5];

        Barrier wall1 = new Wall(0.66);
        Barrier wall2 = new Wall(1.2);
        Barrier wall3 = new Wall(0.99);

        Barrier route1 = new Route(2000);
        Barrier route2 = new Route(5000);

        barriers[0]=wall1;
        barriers[1]=wall2;
        barriers[2]=wall3;
        barriers[3]=route1;
        barriers[4]=route2;
        return barriers;
    }

    public static Members []getMembersArray(){
        Members [] members= new Members[10];

        Members robot1 = new Robot(0.25,10000);
        Members robocop = new Robot(0.14,29000);
        Members steelGiant = new Robot(0.22,9999999);
        Members dolores = new Robot(9999999,77000);

        Members cat1 = new Cat(2,1000);
        Members cat2 = new Cat(80, 700);
        Members cat3 = new Cat(1.2, 4000);

        Members human1 = new Human(1.0, 4000);
        Members human2 = new Human(0.8, 2500);
        Members human3 = new Human(1.4,5600);

        members[0] = robot1;
        members[1] = robocop;
        members[2] = steelGiant;
        members[3] = dolores;
        members[4] = cat1;
        members[5] = cat2;
        members[6] = cat3;
        members[7] = human1;
        members[8] = human2;
        members[9] = human3;
        return members;
    }

    public static void overcoming (Barrier [] barriers,Members [] members){
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                barriers[j].overcome((RunJump) members[i]);
            }
        }
    }
}
