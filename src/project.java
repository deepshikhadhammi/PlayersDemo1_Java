
import java.util.*;

public class project {
    public static ArrayList<Integer> list=new ArrayList<Integer>();


    public static ArrayList createTeam()   //function to create a cricket team
    {

        ArrayList team;
        team=new ArrayList();

        return team;}

    /**
     *
     * @param team to store name of players in an arraylist
     * @return  name of player's in a cricket team
     */
    public static ArrayList addPlayersName(ArrayList team)  //function to add players name
    {

        System.out.println("There are 11 players in a cricket Team(All names are expected to be unique names) ");
        int i = 1;

        while (i < 12) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Players Name");
            String name = scanner.nextLine();
            team.add(name);
            i++;}

        return team;}

    public static void menu()     //menu to track details for cricket players
    {

        System.out.println(" Options Available to User");
        System.out.println("Tracking details for a cricket Team ");
        System.out.println(" Add a cricket team and Add player’s name");
        System.out.println("Press 1 to Add  age, experience, position ,weight");
        System.out.println("Press 2 to Add number of 6's by a player");
        System.out.println("Press 3 to Find top 3 wicket takers");
        System.out.println("Press 4 to Add number of catches taken by a player");
        System.out.println("Press 5 to find top  run scorers");
        System.out.println("Press 6 Number of man of the match awards");
        System.out.println("Press 7 Fitness- hours of practice for each player");
        System.out.println("Press 8 Number of centuries by a player");
        System.out.println("Press 9 Number of 5 wickets haul by a player");}

    /**
     *
     * @param name to link every player's name with his age in a hashmap
     * @return hashmap containing name as key and age as value
     */
    public static HashMap<String, Integer> addPlayersAge(ArrayList name){

        // using hashmaps to store players name and there age.

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" age");
            int age= sc.nextInt();
            map.put((String) player,age);}

        return map;}


    /**
     *
     * @param name to link every player's name with his experience in a hashmap
     * @return hashmap containing name as key and experience as value
     */
    public static HashMap<String, Integer> addPlayersExperience(ArrayList name){

        // using hashmaps to store players name and there experience

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" Experience");
            int experience= sc.nextInt();
            map.put((String) player,experience);}

        return map;}

    /**
     *
     * @param name to link every player's name with his position in a hashmap
     * @return hashmap containing name as key and position as value
     */

    public static HashMap<String, Integer> addPlayersPosition(ArrayList name){

        // using hashmaps to store players name and there position.

        System.out.println("Player is either a batsman or a bowler");
        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" position");
            int position= sc.nextInt();
            map.put((String) player,position);}

        return map;}

    /**
     *
     * @param name to link every player's name with his weight in a hashmap
     * @return hashmap containing name as key and weight as value
     */

    public static HashMap<String, Integer> addPlayersWeight(ArrayList name) {

        // using hashmaps to store players name and there weight.

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (Object player : name) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " " + "Weight");
            int weight = sc.nextInt();
            map.put((String) player, weight);}

        return map;}

    /**
     *
     * @param name to link every player's name with number of sixes made by a player in a hashmap
     * @return hashmap containing name as key and number of sixes as value
     */

    public static HashMap<String, Integer> addPlayersSixes(ArrayList name){

        // using hashmaps to store players name and sixes hit by them.

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" age");
            int sixes= sc.nextInt();
            map.put((String) player,sixes);}

        return map;}

    /**
     *
     * @param name to link every player's name with his wickets in a hashmap
     * @return hashmap containing name as key and wickets as value
     */
    public static HashMap addPlayersWickets(ArrayList name) {

        // using array list  to store  there wickets

        HashMap<String, Object> map = new HashMap<String, Object>();
        project.list = new ArrayList<Integer>();

        for (Object player : name) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " wickets");
            int wickets = sc.nextInt();
            project.list.add(wickets);}

        for (int i=0;i<name.size();i++ ) {
            map.put((String) name.get(i), project.list.get(i));}

        return map;}

    /**
     *
     * @param name that contains name of every player
     * @param wicket_list that contains number of wickets for every player
     * @return ArrayList of top 3 wicket takers
     */
    public static ArrayList<String> top_3_wicket_takers (ArrayList name,ArrayList wicket_list){

        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> top_wicket_takers= new ArrayList<String>();   //default arrayList
        //initialising arrayList with default values
        top_wicket_takers.add(0,"first");
        top_wicket_takers.add(1,"second");
        top_wicket_takers.add(2,"third");

        for (int i=0;i<name.size();i++ )     //loop to link every player's name with wicket_list in a hashmap
        {
            map.put((String) name.get(i), wicket_list.get(i));
        }

        Collections.sort(wicket_list);   //sort the wicket list
        Set key_set = map.keySet();      // take out all the keys from a hashmap
        System.out.println();

        for (Object key : key_set)      //loop to search for top 3 wicket takers
        {

            if (map.get(key).equals(wicket_list.get(10))) //searches for the 1st player
            {

                String key_1 = (String) key;
                top_wicket_takers.set(0,key_1);   // replaces the word "first" in arraylist with the name of first player in an arraylist at index 0


            }
            if (map.get(key).equals(wicket_list.get(9)))  //searches for the second player
            {

                String key_1 = (String) key;
                top_wicket_takers.set(1,key_1);//replaces the word "second" in arraylist with the name of second player in an arra

            }

            if (map.get(key).equals(wicket_list.get(8)))//search for the third player
            {
                String key_1 = (String) key;
                top_wicket_takers.set(2,key_1); //replaces the word "third" in arrayList with the name of third player
            }
        }

        return top_wicket_takers;   // returns the name of top 3 wicket takers
    }

    /**
     *
     * @param name to link every player's name with number of catches
     * @return  hashmap containing name as key and number of catches as value
     */
    public static HashMap<String, Integer> addPlayersCatches(ArrayList name){

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name)    //loop to get player's catches
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" catches");
            int catches= sc.nextInt();
            map.put((String) player,catches);}  //store name and catches in a hashmap

        return map;   //return a hashmap
    }

    /**
     *
     * @param name that contains name of every player in a cricket team
     * @return the hashmap containing every player's name as key and value as highest runs
     */
    public static HashMap addPlayersHighestRuns(ArrayList name) {

        // using array list  to store  there highest runs

        HashMap<String, Object> map = new HashMap<String, Object>();
        project.list = new ArrayList<Integer>();

        for (Object player : name)    //loop to store highest runs for every player
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " Highest Runs");
            int highest_runs = sc.nextInt();
            project.list.add(highest_runs);}

        for (int i=0;i<name.size();i++ )     //link name of a player with their highest runs in hashmap
        {
            map.put((String) name.get(i), project.list.get(i));}

        return map;}

    /**
     *
     * @param name contains the name of every player in a team
     * @param highest_run_list contains the highest runs
     * @return the top 3 highest run scorers
     */
    public static ArrayList<String> top_3_run_scorers(ArrayList name,ArrayList highest_run_list){

        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> top_run_scorers= new ArrayList<String>();
        //initialising arrayList with default values
        top_run_scorers.add(0,"first");
        top_run_scorers.add(1,"second");
        top_run_scorers.add(2,"third");

        for (int i=0;i<name.size();i++ ) {   //loop to link player's name with highest runs of a player in a hashmap
            map.put((String) name.get(i), highest_run_list.get(i));}
        Collections.sort(highest_run_list);
        Set key_set = map.keySet();
        System.out.println();

        for (Object key : key_set) {

            if (map.get(key).equals(highest_run_list.get(10)))  //search for first player
            {

                String key_1 = (String) key;

                top_run_scorers.set(0,key_1); //replace the word "first" in an arraylist with the name of first player

            }
            if (map.get(key).equals(highest_run_list.get(9))) {// search for second player

                String key_1 = (String) key;
                top_run_scorers.set(1,key_1);  //replace the word"second" in an arrayList with the name of second player

            }

            if (map.get(key).equals(highest_run_list.get(8)))  //search for third player
            {
                String key_1 = (String) key;
                top_run_scorers.set(2,key_1);   //replace the word"third" in an arraylist with the name of the third player
            }
        }

        return top_run_scorers;}    //return name of the top scorers

    /**
     *
     * @param name to link every player's name with the awards
     * @return hashmap with name as the key and value as the number of awards
     */

    public static HashMap addPlayersAwards(ArrayList name) {

        // using array list  to store  there awards

        HashMap<String, Object> map = new HashMap<String, Object>();
        project.list = new ArrayList<Integer>();

        for (Object player : name) {  //loop to store awards of every player
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + player + " Awards");
            int awards = sc.nextInt();
            project.list.add(awards);}

        for (int i=0;i<name.size();i++ ) {  //link name of a player with number of awards in a hashmap
            map.put((String) name.get(i), project.list.get(i));}

        return map;    //return a hashmap
    }

    /**
     *
     * @param name that contains name of every player
     * @param award_list that contains number of awards of every player
     * @return top 3 players with maximum awards
     */
    public static ArrayList<String> top_3_award_winners (ArrayList name,ArrayList award_list){

        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> top_award_winners= new ArrayList<String>();
        //initialising arraylisung with default values
        top_award_winners.add(0,"first");
        top_award_winners.add(1,"second");
        top_award_winners.add(2,"third");

        for (int i=0;i<name.size();i++ )   //link name with aawards in a hashmap
        {
            map.put((String) name.get(i), award_list.get(i));}

        Collections.sort(award_list);   //sorting
        Set key_set = map.keySet();    //take out all the keys in a hashmap
        System.out.println();

        for (Object key : key_set) {

            if (map.get(key).equals(award_list.get(10)))  //search for the first player
            {

                String key_1 = (String) key;
                top_award_winners.set(0,key_1);  //replace the word "first" in an arraylist with the name of first player


            }
            if (map.get(key).equals(award_list.get(9)))  //search for the second player
            {

                String key_1 = (String) key;
                top_award_winners.set(1,key_1);   //replace the word "second" in an arrayList with the name of second player

            }

            if (map.get(key).equals(award_list.get(8)))  //search for third player
            {
                String key_1 = (String) key;
                top_award_winners.set(2,key_1);   //replace the word "third" in an arrayList with the name of third player
            }
        }
        return top_award_winners;   //return top 3 award winners
    }

    /**
     *
     * @param name contains every player's name in a team
     * * @return hashmap containing name as key and number of practice hours of every player as value
     */
    public static HashMap<String, Integer> addPlayersPracticeHours(ArrayList name){

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name)   //loop to get number of practice hours for every player
        {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" practiceHours");
            int practiceHours= sc.nextInt();
            map.put((String) player,practiceHours);}  //link name with practice hours in a hashmap

        return map;}

    /**
     *
     * @param name that contains name of every player
     * @return hashmap containing name as key and centuries as value
     */
    public static HashMap<String, Integer> addPlayersCenturies(ArrayList name){

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){  //user input to store number of centuries
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" Centuries");
            int centuries= sc.nextInt();
            map.put((String) player,centuries);}   //link name with number of centuries in a hashmap

        return map;}

    /**
     *
     * @param name that contains name of every player in a team
     * @return  hashmap containing name as key and wicket haul as value
     */
    public static HashMap<String, Integer> addPlayersWicketHaul(ArrayList name){

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        for(Object player:name){ //user input to store every player's wickethauls
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+player+" WicketHaul");
            int WicketHaul= sc.nextInt();
            map.put((String) player,WicketHaul);}  //link player's name with thw wicket haul in a hashmap

        return map;}

    /**
     *
     * @param name that contains the name of every player in a team

     */
    public static void usersChoice(ArrayList name) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice");   //User input for choice
        String choice_str = scanner.nextLine();
        String choice="Y";

        while(choice=="Y")    //continue loop if user enters Y
        {

            switch (choice_str) {
                //calling different cases according to the user choice as mentioned in menu
                case "1":
                    System.out.println(addPlayersAge(name));
                    System.out.println(addPlayersExperience(name));
                    System.out.println(addPlayersWeight(name));
                    System.out.println(addPlayersPosition(name));
                    break;

                case "2":
                    System.out.println(addPlayersSixes(name));
                    break;

                case "3":
                    System.out.println(addPlayersWickets(name));
                    System.out.println("Do you want to see top 3 wicket takers(press Y)");
                    Scanner sc =new Scanner(System.in);
                    String confirmation=sc.nextLine();

                    if(confirmation.equals("Y")){
                        System.out.println("Top three wicket takers "+top_3_wicket_takers(name,project.list));}
                    break;

                case "4":
                    System.out.println(addPlayersCatches(name));
                    break;

                case "5":
                    System.out.println(addPlayersHighestRuns(name));
                    System.out.println("Do you want to see top 3 run scorers(press Y)");
                    Scanner abc =new Scanner(System.in);
                    String confirm=abc.nextLine();

                    if(confirm.equals("Y")){
                        System.out.println("Top three run scorers "+top_3_run_scorers(name,project.list));}
                    break;

                case "6":
                    System.out.println(addPlayersAwards(name));
                    System.out.println("Do you want to see top 3 award winner(press Y)");
                    Scanner ab =new Scanner(System.in);
                    String confirmed=ab.nextLine();

                    if(confirmed.equals("Y")){
                        System.out.println("Top three run scorers "+top_3_award_winners(name,project.list));}
                    break;

                case "7":
                    System.out.println(addPlayersPracticeHours(name));
                    break;

                case "8":
                    System.out.println(addPlayersCenturies(name));
                    break;

                case "9":
                    System.out.println(addPlayersWicketHaul(name));
                    break;}

            System.out.println("Do you want to continue (to continue press Y) ");
            String cont = scanner.nextLine();

            if (cont.equals("Y")) {
                choice = "Y";
                System.out.println("Enter Your Choice");
                choice_str = scanner.nextLine();}

            else{
                choice="N";}}}


    public static void main(String[] args)   //calling main function
    {
        menu();
        ArrayList team=createTeam();
        ArrayList playersName=addPlayersName(team);
        System.out.println(playersName);    //printing names of all the 11 players
        usersChoice(playersName);}}      //calling user's choice




