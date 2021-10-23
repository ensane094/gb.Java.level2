package homework1;

public class Team {
    private String name;
    private Members [] members;
    private boolean passed = false;
    public Team (String name, Members ...members){
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

    public void showResults(){
        if (passed == true){
            System.out.println("Комманда прошла испытание");
        }else {
            System.out.println("Комманда не прошла испытание");
        }
    }
}
