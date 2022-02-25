import java.util.*;

public class project {

    public static ArrayList createTeam() {
        ArrayList team;
        team = new ArrayList();
        return team;
    }

    public static ArrayList addPlayersName(ArrayList team) {
        System.out.println("There are 11 players in a cricket Team");
        int i = 1;
        while (i < 12) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Players Name");
            String name = scanner.nextLine();
            team.add(name);
            i++;

        }
        return team;
    }

    public static void menu() {
        System.out.println(" Options Available to User");
        System.out.println("Tracking details for a cricket Team ");
        System.out.println(" Add a cricket team and Add player’s name");
        System.out.println("Press 1 to Add  age, experience, position ,weight");
        System.out.println("Press 2 to Add number of 6's by a player");
        System.out.println("Press 3 to Add number of wickets by a player");
        System.out.println("Press 4 to Add number of catches taken by a player");
        System.out.println("Press 5 to find top  run scorers");
        System.out.println("Press 6 Number of man of the match awards");
        System.out.println("Press 7 Fitness- hours of practice for each player");
        System.out.println("Press 8 Number of centuries by a player");
        System.out.println("Press 9 Number of 5 wickets haul by a player");
    }

    public static HashMap<String, Integer> addPlayersAge(ArrayList name) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Object player : name) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " age");
            int age = sc.nextInt();
            map.put((String) player, age);
        }
        return map;

    }

    public static HashMap<String, Integer> addPlayersPosition(ArrayList name) {
        System.out.println("Player is either a batsman or a bowler");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Object player : name) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " position");
            int position = sc.nextInt();
            map.put((String) player, position);
        }
        return map;

    }

    public static HashMap<String, Integer> addPlayersWeight(ArrayList name) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Object player : name) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " " + "Weight");
            int weight = sc.nextInt();
            map.put((String) player, weight);
        }
        return map;
    }
}