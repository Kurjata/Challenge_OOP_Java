# Audio Management Project

This project is a challenge developed to manage audio files, including music and podcasts, using **Object-Oriented Programming (OOP)** principles. The goal is to build a structured and scalable codebase that models real-world audio objects with properties and behaviors, enabling users to play, like, and classify audio content.

## Project Structure

The project is organized with a base `Audio` class, which is extended by the specific audio types `Music` and `Podcast`. Each class follows OOP principles, promoting inheritance, encapsulation, and method overriding.

### Key Classes

- **Audio**: The base class representing shared properties of any audio content, such as `title`, `totalPlays`, `totalLikes`, and `rating`. It includes methods for playing (`play`) and liking (`like`) the audio.

- **Music**: Extends `Audio` and adds specific properties like `album`, `singer`, and `genre`. It overrides the `getRating` method to provide a custom rating based on the number of plays.

- **Podcast**: Also extends `Audio`, with additional attributes such as `host` and `description`. The class provides a custom rating calculation based on the number of likes.

- **MyFavorites**: A helper class to manage favorite audios, providing a method to add audio items to a list of favorites and displaying a message based on the audio's rating.

## How to Run

1. Clone this repository.
2. Make sure you have Java installed.
3. Compile and run the `Main` class from the `main` package to test the functionalities.

## Example Usage

The main class (`Main`) demonstrates the instantiation of `Music` and `Podcast` objects, simulating plays and likes. It also shows how to add these objects to the `MyFavorites` collection to determine if they are classified as popular.

## OOP Principles Used

- **Encapsulation**: Properties are private and accessed through public getter and setter methods.
- **Inheritance**: `Music` and `Podcast` inherit from the base `Audio` class.
- **Polymorphism**: Methods like `getRating` are overridden in subclasses to provide specific behavior based on the audio type.

## Author

Felipe Kurjata
