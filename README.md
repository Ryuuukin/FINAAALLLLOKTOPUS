# NAME OF THE FINAL PROJECT: **ASA MUSIC APP**
## **GROUP: SE-2213**
---
### **MEMBERS:**
### 1. Suluzhan Izbaeva
### 2. Akzerim Askerbekkyzy
### 3. Aruzhan Kineshova

## **PROJECT OVERVIEW**

### **PROJECT INFORMATION:**
---
>The Music App is a Java-based application designed to offer various functionalities for *`music playback, artist selection, options management, and system adaptability`*. The project incorporates multiple design patterns to ensure modularity, extensibility, and maintainability.

### **PROJECT IDEA:**
---
>The project's concept is to develop `an analog Apple Music program` with many features for controlling preferences, *`playing back music, choosing artists, and customizing the system`*. To guarantee flexibility, extensibility, and ease of maintenance, the program makes use of several design patterns.

### **PURPOSE OF THE WORK:**
---
>The primary goal of this project is to present a `robust music application` that demonstrates the application of essential design patterns in software development. By employing design patterns, the project aims to enhance code *`flexibility, scalability, and maintainability`*, promoting good software engineering practices.

### **OBJECTIVES OF THE WORK:**
---
- Implement and showcase the *Adapter, Decorator, Factory, Observer, State, and Facade* design patterns within the music application.
- Create a `user-friendly interface` that allows interaction with various music-related functionalities.
- Develop a codebase that is flexible to allow for `upcoming improvements`.


## **MAIN BODY**
---
---
---

 - [X] **ADAPTER PATTERN**
 >- `AdapterOS` Class: Bridges functionalities between different operating systems (`IOS` and `Android`) by adapting `Android` functionalities to utilize specific features from `IOS`.

### Explanation: The `AdapterOS` class acts as an adapter to facilitate interaction between different OS functionalities, enabling compatibility and seamless usage across platforms.

![The screenshot of Adapter DP](screenshots/Adapter.PNG)

---
 - [X] **DECORATOR PATTERN**
 >- `Comparision` Class: Provides the ability to add background sounds (`Rain`, `DarkNoise`, `Ocean`) to songs.

### Explanation: Using decorator classes (`Rain`, `DarkNoise`, `Ocean`) extending the base `SongDecorator`, it augments the base functionality of songs with additional background sounds.

![The screenshot of Decorator DP](screenshots/Decorator.PNG)

---
 - [X] **FACTORY PATTERN**
 >- `ChooseArtist` Class: Facilitates the creation of artist instances (`OliviaArtist`, `BrunoArtist`, `ArianaArtist`) based on user selection.

### Explanation: Acts as a factory, creating instances of different artists based on user input, promoting flexible instantiation of artist objects.

![The screenshot of Factory DP](screenshots/Factory.PNG)

---
 - [X] **OBSERVER PATTERN**
 >- `Begin` Class: Demonstrates the Observer pattern, registering `User` observers to receive updates from `Artists` subjects about artist news.

### Explanation: Establishes a relationship where observers (`User`) are notified by subjects (`Artists`) about updates, ensuring seamless information propagation.

![The screenshot of Observer DP](screenshots/Observer.PNG)   

---
 - [X] **STATE PATTERN**
 >- `MusicPlayer` Class: Enables the music player to transition between states (`Play`, `Stop`, `Next`, `Previous`) based on user commands.

### Explanation: Implements a state machine allowing the music player to change behavior dynamically according to different states set by user input.

![The screenshot of State DP](screenshots/State.PNG)   

---
 - [X] **FACADE PATTERN**
 >- `PlayerOptions` Class: Acts as a simplified interface providing methods (`turnonSave`, `turnonShareInstagram`, `turnonLike`) for managing complex player operations.

### Explanation: Provides a unified and simplified interface to access diverse player functionalities, enhancing user convenience.

![The screenshot of Facade DP](screenshots/Facade.PNG)   

---

## **UML DIAGRAM:**
![The structure of the Project](screenshots/MergedUML/MergedUML-1.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-2.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-3.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-4.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-5.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-6.png)

---

![The structure of the Project](screenshots/MergedUML/MergedUML-7.png)

## **CONCLUSION**
---
>`The Music App project` effectively integrates multiple design patterns, `*ensuring scalability, flexibility, and maintainability*`. Each design pattern serves specific purposes, contributing to a modular and well-structured application architecture.

### **Outcomes & Challenges**
> The project integrated patterns for a cohesive app despite initial challenges in synchronizing functionalities and user interaction. It achieved synergy between patterns, improved user experience, and maintained a clear code structure.

### **Future Improvements**
> Opportunities for future enhancements include `adding more features, refining the user interface, optimizing performance, and extending compatibility to other platforms`. Overall, the project lays a solid foundation for further improvements and innovations.

## **REFERENCES**
 ---
>1. Freeman, E., & Robson, E. (2004). `Head First Design Patterns. O'Reilly Media. Retrieved from O'Reilly`
>2. Аleksandr Shvets (2018). `Погружение в паттерны проектирования.`
>3. [Refactoring Guru]. (n.d.). `Adapter Design Pattern.` Retrieved from Refactoring Guru
>4. [Refactoring Guru]. (n.d.). `Observer Design Pattern.` Retrieved from Refactoring Guru
>5. [Refactoring Guru]. (n.d.). `Factory Method Design Pattern.` Retrieved from Refactoring Guru
>6. [Refactoring Guru]. (n.d.). `Facade Design Pattern.` Retrieved from Refactoring Guru
>7. [Refactoring Guru]. (n.d.). `Decorator Design Pattern.` Retrieved from Refactoring Guru
>8. [Refactoring Guru]. (n.d.). `State Design Pattern.` Retrieved from Refactoring Guru