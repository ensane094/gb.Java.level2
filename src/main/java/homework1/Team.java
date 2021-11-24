package homework1;

public class Team implements Members{
    private String name;
    private Members[] members;
    private int passedMembers;

    public Team(String name, Members... members) {
        this.name = name;
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void showResults() {
        System.out.println(getPassedMembers()+" участников команды "+getName()+" прошли курс");
    }

    public int getPassedMembers() {
        return passedMembers;
    }

    public void setPassedMembers(int passedMembers) {
        this.passedMembers = passedMembers;
    }

    public Members[] getMembers() {
        return members;
    }
}
