package homework1;

public class App {
    public static void main(String[] args) {
        Members [] members= new Members[10];                         //создаём массив участников
        for (int i = 0; i < members.length; i++) {          //добавляем в него 10 участников
            members[i] = new Members();
        }
        Team team = new Team("Unbeatable",members);     //создаём команду
        Course c = new Course();
        c.dolt(team);                     //тк в команде я установил флаг на прохождение то передаю команду и ее участников
        team.showResults();

    }
}
