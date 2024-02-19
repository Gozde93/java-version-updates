import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDoubled(items);

        System.out.println("------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");
       // liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        Team<String> brokenTeam = new Team<>("what kind of team is this?");

        Team<Integer> t2 = new Team<>("Very weird");






    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int i : items){
            System.out.println(i * 2);
        }
    }
}
