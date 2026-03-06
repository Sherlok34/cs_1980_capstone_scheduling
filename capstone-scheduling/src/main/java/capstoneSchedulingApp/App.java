package capstoneSchedulingApp;


public class App {
    public static void main(String[] args) {
        Parser.parseFile("schedule.db","capstone-scheduling\\src\\main\\java\\capstoneSchedulingApp\\Mock_Schedule_Correct_Classrooms.csv", ",");
        //System.out.print(sched.toString());
    }
}
