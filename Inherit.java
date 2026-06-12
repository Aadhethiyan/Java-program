class cricket {
    void batsmans() {
        System.out.println("Batting");
    }
}

class Batsman extends cricket {
    void bowler() {
        System.out.println("Bowling");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Batsman d = new Batsman();

        d.batsmans();
        d.bowler();
    }
}