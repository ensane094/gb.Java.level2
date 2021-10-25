package homework1;

public class Course {


    public void dolt (Barrier []barrier,Team team){
        int passedCount =0;
        boolean isPassed = false;
        for (int i = 0; i <team.getMembers().length ; i++) {
            isPassed = false;
            for (int j = 0; j < barrier.length; j++) {
              if(barrier[j].overcome(team.getMembers()[i])){
                 isPassed = true;
              }
            }
            if (isPassed == true){
                passedCount ++;
            }
            team.setPassedMembers(passedCount);
        }
    }
}


