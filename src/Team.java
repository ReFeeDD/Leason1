public class Team {

    private String NameOfTeam;
    private Person[] NamePerson;

    public Team(String NameOfTeam, Person[] NamePerson) {
        this.NameOfTeam = NameOfTeam;
        this.NamePerson = NamePerson;
    }

    public String getName() {

        return NameOfTeam;
    }

    public Person[] getTeam() {
        return NamePerson;
    }
}
