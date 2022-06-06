public class Course {

    String result;
    private int jumpHeight;
    private int runDistance;
    private int swimDistance;

    public Course(int jumpHeight, int runDistance, int swimDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String doCourse (Team team){

        result = "Team " + team.getName() + " " + '\n';
        for (Person person: team.getTeam()){
            result += person.getName() + " " + '\n';
            int value1 = person.getCanJumpHeight();
            int value2 = person.getCanRunDistance();
            int value3 = person.getCanSwimDistance();
            testJumpHeight(value1);
            testRunDistance(value2);
            testSwimDistance(value3);
        }

        return result;

    }


    private void testJumpHeight(int value1){
        if(value1 < jumpHeight) result += "Ne smog" + '\n';
        else result += "Smog proyti" + '\n';
    }

    private void testRunDistance(int value2){
        if(value2 < runDistance) result += "Ne dobezhal" + '\n';
        else result += "Dobezhal" + '\n';
    }

    private void testSwimDistance(int value3){
        if(value3 < swimDistance) result += "Ytonyl" + '\n';
        else result += "Doplil" + '\n';
    }

}
