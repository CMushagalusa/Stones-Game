# Stones Game

## 📌 Description
**Stones Game** is a simple two-player game implemented in **Java**, where players take turns picking stones from a pile following specific rules. The game ensures a fair and structured way for players to interact, enforcing conditions to maintain gameplay integrity.

## 🎮 How to Play
1. Players start by choosing an **odd number of stones** greater than 1.
2. Each player is prompted to enter their **name**.
3. The **first player** selects a number of stones from the pile (between 1 and half of the total available stones).
4. The **second player** can take **up to twice** the number of stones the first player took.
5. Players continue taking turns until there are **no stones left**.
6. The **winner** is determined based on the number of stones collected:
   - If the total number of stones collected by a player is **odd**, they **win**.
   - Otherwise, the other player wins.

## 🚀 Features
✅ **Input validation** to ensure correct values are entered  
✅ **Turn-based gameplay** with fairness conditions  
✅ **Dynamic range adjustment** for stone selection  
✅ **Simple console-based interface** for easy interaction  
✅ **Victory conditions based on final stone count**  

## 📂 File Structure
- `StonesGames.java` – The main Java program implementing the game logic

## 🛠 How to Run the Program
### **Prerequisites**
- Install **Java Development Kit (JDK)** (Java 8 or later)
- Ensure you have a **Java compiler** (e.g., `javac`)

### **Run the Game**
1. **Compile the program**:
   ```sh
   javac StonesGames.java
   ```
2. **Run the game**:
   ```sh
   java StonesGames
   ```
3. **Follow the on-screen prompts** to enter the number of stones and play the game.

## 📜 Example Output
```
How many stones do you want to play with?
Type the number here: 11

We now need to register the two players.
The first player: Alice
The second player: Bob

There are 11 stones in the pile.
Alice has 0 stones.
Bob has 0 stones.

Alice, choose between 1 and 5.
Type the number here: 3

There are 8 stones in the pile.
Alice has 3 stones.
Bob has 0 stones.

Bob, choose between 1 and 6.
Type the number here: 5

There are 3 stones in the pile.
Alice has 3 stones.
Bob has 5 stones.

Alice, choose between 1 and 3.
Type the number here: 2

There are 1 stones in the pile.
Alice has 5 stones.
Bob has 5 stones.

Bob, choose between 1 and 1.
Type the number here: 1

There are no more stones in the pile. The game is over.
Alice has 5 stones.
Bob has 6 stones.

Bob wins with 6 stones.
Congratulations Bob!
It was an amazing game!!!
```

## 🔥 Possible Enhancements
- Implement a **GUI version** using Java Swing or JavaFX
- Add **AI opponent** for single-player mode
- Introduce **scoring system** with leaderboards
- Improve **game logic and validation checks**

---
🚀 **Contributions are welcome!** Feel free to improve the game and submit pull requests! 🎮

Clovis Mushagalusa CIRUBAKADERHA

