// Superclass
class Sport {
    String sportName;
    String location;

    //constructor

    void printInfo() {
        System.out.println("Sport Name : " + sportName);
        System.out.println("Location   : " + location);
    }
}

// Subclass 1
class Player extends Sport {
    String playerName;
    String team;

    void showPlayer() {
        printInfo();
        System.out.println("Player Name: " + playerName);
        System.out.println("Team       : " + team);
    }
}

// Subclass 2
class Coach extends Sport {
    String coachName;
    int experience;

    void showCoach() {
        printInfo();
        System.out.println("Coach Name : " + coachName);
        System.out.println("Experience : " + experience + " years");
    }
}

// Subclass 3 (turunan dari Player)
class FootballPlayer extends Player {
    String position;
    int goals;

    void showFootballStats() {
        showPlayer();
        System.out.println("Position   : " + position);
        System.out.println("Goals      : " + goals);
    }
}

