package homework1;

public class Course {


    public void dolt (Barrier []barrier,Team team){
        for (int i = 0; i <team.getMembers().length ; i++) {
            for (int j = 0; j < barrier.length; j++) {
              barrier[j].overcome(team.getMembers()[i]);
            }
            team.setPassedMembers(i+1);
        }
    }
}


