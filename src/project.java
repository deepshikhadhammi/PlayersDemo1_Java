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
}
