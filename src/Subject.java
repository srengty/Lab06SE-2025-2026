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
    public String toString(){
        return String.format("%s (%d credits, %d hours)",name, totalCredits, totalHours);
    }
    public static void main(String[] args) {
        Subject sb = new Subject();
        sb.name = "Intro to SE";
        sb.totalCredits = 3;
        sb.totalHours = 64;
        System.out.println(sb);

    }
}