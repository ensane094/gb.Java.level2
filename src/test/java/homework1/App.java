package homework1;

public class App {
    public static void main(String[] args) {
        Members [] members= getMembersArray(10);
        Team team = new Team("Unbeatable",members);     //создаём команду
        Course c = new Course();
        c.dolt(team);
        team.showResults();
    }
    public static Members [] getMembersArray (int length){      //метод для генерации массива участников
        Members [] members= new Members[length];
        for (int i = 0; i < members.length; i++) {
            members[i] = new Members();
        }
        return members;
    }
}
