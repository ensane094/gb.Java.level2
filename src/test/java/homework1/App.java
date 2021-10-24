package homework1;

public class App {
public static void main(String[] args) {
        Members [] members= getMembersArray();
        Barrier [] barriers = getBarrierArray();

        Team team = new Team("Unbeatable",members);
        Course c = new Course();

        c.dolt(barriers,team);
        team.showResults();
    }
    public static Members [] getMembersArray (){
        Members [] members= new Members[6];
        Members child1 = new Children(5);
        Members child2 = new Children(30);
        Members child3 = new Children(48);
        Members stud1 = new Students(50);
        Members stud2 = new Students(70);
        Members stud3 = new Students(9999);

        members[0]=child1;
        members[1]=child2;
        members[2]=child3;
        members[3]=stud1;
        members[4]=stud2;
        members[5]=stud3;

        return members;
    }

    public static Barrier [] getBarrierArray(){
    Barrier [] barriers = new Barrier[9];

    Barrier lection1 = new lections();
    Barrier lection2 = new lections();
    Barrier lection3 = new lections();
    Barrier lection4 = new lections();
    Barrier lection5 = new lections();
    Barrier lection6 = new lections();
    Barrier lection7 = new lections();
    Barrier lection8 = new lections();
    Barrier lection9 = new lections();

    barriers[0]=lection1;
    barriers[1]=lection2;
    barriers[2]=lection3;
    barriers[3]=lection4;
    barriers[4]=lection5;
    barriers[5]=lection6;
    barriers[6]=lection7;
    barriers[7]=lection8;
    barriers[8]=lection9;

    return barriers;
    }
}
