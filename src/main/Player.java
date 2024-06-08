public class Player {
    private int health;
    private int strength;
    private int attack;

    // Constructor to initialize a new player with health, strength, and attack values
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter method to return the player's current health
    public int getHealth() {
        return health;
    }

    // Getter method to return the player's strength
    public int getStrength() {
        return strength;
    }

    // Getter method to return the player's attack power
    public int getAttack() {
        return attack;
    }

    // Method to reduce the player's health by the given damage amount
    public void takeDamage(int damage) {
        health -= damage; // Subtract damage from health
        if (health < 0) { // Ensure health does not go below 0
            health = 0;
        }
    }

    // Method to check if the player is still alive (health > 0)
    public boolean isAlive() {
        return health > 0;
    }

    // Method to simulate rolling a die, returns a random number between 1 and 6
    public int rollDie() {
        return rand(1, 6); // Calls the rand method with lower bound 1 and upper bound 6
    }

    // Helper method to generate a random number between lower and higher (inclusive)
    public int rand(int lower, int higher) {
        return lower + (int) (Math.random() * (higher - lower + 1)); // Math.random() generates a number between 0.0 and 1.0
    }
}
