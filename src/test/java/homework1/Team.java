package homework1;

public class Team {
    private String name;
    private Members[] members;
    private boolean passed = false;                 //флаг прохождения курса

    public Team(String name, Members... members) {          //передаём название комманды и массив участников
        this.name = name;
        this.members = members;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getName() {
        return name;
    }

    public void showResults() {
        if (passed == true) {
            System.out.println("Комманда " + getName() + "прошла испытание");
        } else {
            System.out.println("Комманда " + getName() + " не прошла испытание");
        }
    }
}
