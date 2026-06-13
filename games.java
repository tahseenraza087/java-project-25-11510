class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        
        Player[] players = {
            new Player("Rahul", 95),
            new Player("Ankit", 88),
            new Player("Priya", 82)
        };

        
        System.out.println("--- GAME SCOREBOARD ---");
        for (Player p : players) {
            System.out.println("Player: " + p.getName() + " | Score: " + p.getScore());
        }
    }
}
