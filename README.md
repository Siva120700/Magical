This is a simple game which simulates a Magical Arena in which two players will fight each other until one wins(other player health reaches till zero). 

Each player has attributes of health, attack and strength. Each player will roll the die when their turn comes.

The player with less health starts the game first. There will be two dies :- one is attacking die and the other is defending die. The player who is starting that player will start with attacking die and the other with defending die. This continues untill one's health reaches to zero.

### Classes

### Player Class

The `Player` class represents a participant in the arena. Each player has three main attributes:

- **Health**: The player's current health. If this reaches zero, the player dies.
- **Strength**: The player's defensive capability, used to reduce incoming damage.
- **Attack**: The player's offensive capability, used to determine damage dealt to the opponent.

#### Key Methods

- `Player(int health, int strength, int attack)`: Constructor to initialize a player with specified health, strength, and attack values.
- `int getHealth()`: Returns the current health of the player.
- `int getStrength()`: Returns the strength of the player.
- `int getAttack()`: Returns the attack value of the player.
- `void takeDamage(int damage)`: Reduces the player's health by the specified damage amount. Health cannot go below zero.
- `boolean isAlive()`: Checks if the player is still alive (health > 0).
- `int rollDie()`: Simulates rolling a six-sided die, returning a random value between 1 and 6.
- `int rand(int lower, int higher)`: Generates a random number between the specified lower and higher bounds (inclusive).


### MagicalArena Class

The `MagicalArena` class simulates the battle between two players. The battle continues until one of the players dies.

#### Key Methods

- `void fight(Player playerA, Player playerB)`: Conducts a fight between two players until one of them dies. The player with the lower health attacks first. The attacker and defender take turns until one player's health reaches zero.

## Running the Code

To run this project, follow these steps:

1. **Open the Project in a Local Editor or IDE**:
    Open the `main` folder in your preferred local editor or IDE (e.g., Visual Studio Code, IntelliJ IDEA, Eclipse).

2. **Navigate to the `main` Directory**:

    ```bash
    cd path/to/main
    ```

3. **Compile the Code**:

    ```bash
    javac Main.java Player.java MagicalArena.java
    ```

4. **Run the Program**:

    ```bash
    java Main
    ```

### Example Output

When you run the program, you should see output similar to the following:

(Input Player A (health:50,Strength: 5, attack: 10))
(Input Player B (health:100,Strength: 10, attack: 5))



Attacker: Player A
Defender: Player B
Attack Roll: 5, Attack Damage: 50
Defend Roll: 2, Defend Strength: 20
Player B takes 30 damage, Health: 70
Attacker: Player B
Defender: Player A
Attack Roll: 4, Attack Damage: 20
Defend Roll: 3, Defend Strength: 15
Player A takes 5 damage, Health: 45
...
Player A wins!                




### Unit Tests

Unit tests are provided in the `MagicalArenaTest` class. To run the tests, follow these steps:

1. **Ensure JUnit is Available**: Download JUnit from [JUnit's official site](https://junit.org/junit5/).

2. **Place JUnit Jar in Project Directory**: Place the downloaded JUnit jar file in the `lib` directory of your project.

3. **Navigate to the Project Root**:

    ```bash
    cd project-root
    ```

4. **Compile the Code and Tests**:

    ```bash
    javac -cp lib/junit-platform-console-standalone-1.8.1.jar src/main/*.java src/test/*.java
    ```

5. **Run the Tests**:

    ```bash
    java -jar lib/junit-platform-console-standalone-1.8.1.jar --class-path src/main:src/test --scan-class-path
    ```

