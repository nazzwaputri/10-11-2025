//main program
public class sportTest {
    public static void main(String[] args) {
        //membuat objek Footballplayer
        FootballPlayer fp = new FootballPlayer();
        fp.sportName = "Sepak Bola";
        fp.location = "Stadion Nasional";
        fp.playerName = "Rizky";
        fp.team = "Garuda Muda";
        fp.position = "Penyerang";
        fp.goals = 12;

        System.out.println("===== data pemain sepak bola===");
        fp.showFootballStats();

        //membuat objek coach 
        System.out.println("\n===data pelatih==");
        Coach c = new Coach();
        c.sportName = "sepak bola";
        c.location = "lapangan utama";
        c.coachName = "coach andi";
        c.experience = 8;
        c.showCoach();

    }
}
