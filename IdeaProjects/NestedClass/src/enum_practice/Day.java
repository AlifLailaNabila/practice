package enum_practice;

public class Day {
    Week week;
    public Day(){
    }
    public Day(Week week){
       this.week=week;
    }
    public void whatToDo(Week week){
        this.week= week;
        switch(week){
            case SATURDAY:
                System.out.println("Strat working on codelab");
                break;
            case SUNDAY:
                System.out.println("Strat working on DISCUSSION");
                break;
            case MONDAY:
                System.out.println("Strat working on GOSSIPPING");
                break;
            case TUESDAY:
                System.out.println("Strat working on STUDY");
                break;
            case WEDNESDAY:
                System.out.println("Strat working on HOMEWORK");
                break;
            case THURSDAY:
                System.out.println("Strat working on HOLIDAY");
                break;
            case FRIDAY:
                System.out.println("Strat working on EXERCISE");
                break;
            default:
                System.out.println("Are you out of your mind! No more days");
                break;

        }
    }
}
