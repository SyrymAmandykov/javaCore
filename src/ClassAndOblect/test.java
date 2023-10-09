package ClassAndOblect;

public class test {
    public static void main(String[] args) {
        Player player1 = new Player(3,"aibek","damenov","attack");
        Player player2 = new Player(2,"ayan","salykov","defender");
        Player player3 = new Player(5,"temir","myrzayev","attack");

        Player[] players1 = {player1};
        Player[] players2 = {player2};
        Player[] players3 = {player3};

        Club club1 = new Club("kairat","KZ",2,players1);
        Club club2 = new Club("semey","KZ",3,players2);
        Club club3 = new Club("astana","KZ",4,players3);

        Club[] clubs = {club1,club2,club3};
        //Club[] clubs2 = {club2};
        //Club[] clubs3 = {club3};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
            System.out.println();
        }
    }
}
