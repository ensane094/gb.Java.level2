package homework1;

public class Course {
    private int [] barrier = new int[20];


    public void dolt (Team team){

        for (int i = 0; i < team.members.length; i++) {

            for (int j = 0; j < barrier.length ; j++) {         //внутренний луп где прогоняется каждый участник
                if(j == barrier.length-1){                      //участник прогоняется по массиву и на последнем круге меняется его флаг
                    System.out.println("Участник номер: "+ i + " прошёл "+ barrier.length + " испытаний!");
                    team.members[i].setPass(true);
                    System.out.println("Статус прохождения: "+ team.members[i].isPass());
                }
            }
            if(i == team.members.length-1){             //когда всех участников прогнало меняем флаг команды на тру
                System.out.println("Комманда "+team.getName()+" прошла "+ barrier.length + " испытаний!");
                team.setPassed(true);
                System.out.println("Статус коммандного прохождения: "+ team.isPassed());
            }
        }
    }
}