public class Person {
    private String name;
    private int Jump;
    private int Run;
    private int Swim;

    public Person(String name, int Jump, int Run, int Swim) {
        this.name = name;
        this.Jump = Jump;
        this.Run = Run;
        this.Swim = Swim;
    }

    public String getName() {
        return name;
    }

    public int getCanJumpHeight() {
        return
                Jump;
    }

    public int getCanRunDistance() {
        return
                Run;
    }

    public int getCanSwimDistance() {
        return
                Swim;
    }


}
