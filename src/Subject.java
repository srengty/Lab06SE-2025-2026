/**
 * JavaDoc: Represents Course in Year 2 IP.
 *   
 * Example: {@code Subject s = new Subject()}
 * 
 * @author Sreng
 * @author Flourbloom
 * @author Vattey
 * @since 1.0
 */
public class Subject{
    private String name;
    private int totalCredits = 1;
    private int totalHours = 50;
    public static final double MAX_ABSENCE_SCORE = 10;
    public String toString(){
        return String.format("%s (%d credits, %d hours)",name, totalCredits, totalHours);
    }
    /**
     * Find the scores of absences.
     * @param absences number of absences
     * @return absence score
     */
    public double calculateAbsencesScore(int absences){
        // if totalHours = 10, absences = 2 => score=8
        // if totalHours = 64, absences = 10 => score=?
        return MAX_ABSENCE_SCORE - (10.0*absences/totalHours);
    }
    public static void main(String[] args) {
        Subject sb = new Subject();
        sb.name = "Intro to SE";
        sb.totalCredits = 3;
        sb.totalHours = 64;
        System.out.println(sb);
        System.out.println("Absence score: "+ sb.calculateAbsencesScore(32));
    }
}