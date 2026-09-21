public class ArrowLabelsAndSwitchExpression {
    public static void main(String[] args) {
        //switch as an expression
       /* String day="Monday";
        String result=switch(day) {
            case "Monday", "Friday", "Sunday" -> "Rest day";
            case "Tuesday" -> "Workday";
            case "Thursday", "Saturday" -> "Leisure day";
            case "Wednesday" -> "Midweek";
            default -> "Unknown day";
        };
        System.out.println(result);
     */
     //switch as an return expression
        /* Error
        String day="Tuesday";
        return switch(day){
            case "Monday", "Friday", "Sunday" -> "Rest day";
            case "Tuesday" -> "Workday";
            case "Thursday", "Saturday" -> "Leisure day";
            case "Wednesday" -> "Midweek";
            default -> "Unknown day";
        }; */
    }
}
