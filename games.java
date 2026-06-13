class Main {
    private String name;
    private int score;

    public Main(String name, int score) {
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
        Main[] players = {
            new Main("Rahul", 95),
            new Main("Ankit", 88),
            new Main("Priya", 82)
        };
        
        System.out.println("--- GAME SCOREBOARD ---");
        for (Main p : players) {
            System.out.println("Player: " + p.getName() + " | Score: " + p.getScore());
        }
    }
}
