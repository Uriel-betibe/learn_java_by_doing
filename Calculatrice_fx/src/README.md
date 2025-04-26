# 📊 Calculatrice - JavaFX (Pure Code) Project

A fully functional calculator application built in JavaFX **without FXML**, using only pure Java code. This project is designed to strengthen your understanding of GUI development, event handling, and clean Java programming.

---

## 🌟 Features

- Basic operations: Addition (+), Subtraction (-), Multiplication (*), Division (/)
- Number input (0-9)
- Clear function (C button)
- Error handling (e.g., division by zero)
- Simple and clean user interface

---

## 🔧 Project Structure

```
calculatrice/
├── src/main/java/com/yourname/calculatrice/
│   ├── CalculatriceApp.java       # Main JavaFX Application
│   ├── Controleur.java            # (Optional) Logic handler
│   └── CalculatriceUtils.java     # (Optional) Helper methods
├── src/main/resources/            # (Optional) For future assets
└── module-info.java               # JavaFX module configuration
```

---

## 🔮 How to Run

1. Install JavaFX SDK if you haven't already.
2. Configure your IntelliJ project:
    - Add JavaFX SDK to Libraries.
    - Add VM options:

   ```
   --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
   ```

3. Compile and run `CalculatriceApp.java`.

---

## 📚 Development Steps

### Step 1: Basic JavaFX Setup
- Create a `Stage` and `Scene`.
- Use a `VBox` to organize the layout vertically.

### Step 2: Adding the Display
- Add a `TextField` to show numbers and results.
- Make the `TextField` non-editable.

### Step 3: Adding Buttons
- Use a `GridPane` to arrange number and operation buttons.
- Create buttons dynamically based on a predefined layout.

### Step 4: Handling Button Actions
- Use `setOnAction` with lambda expressions.
- Concatenate numbers.
- Store and use operators for calculations.

### Step 5: Performing Calculations
- Implement basic math operations (+, -, *, /).
- Handle division by zero errors.

### Step 6: Polishing
- Handle display reset after result.
- Manage clear operation.
- Prepare for future enhancements.

---

## 📝 Key Learnings

- Creating and managing layouts with VBox and GridPane.
- Handling JavaFX events with `setOnAction` and lambda expressions.
- Managing program state (first number, operator, second number).
- Error detection (such as division by zero).
- Writing clean, organized, and scalable Java code.

---

## 🌐 Future Improvements

- Add decimal point support (".")
- Implement keyboard input
- Allow continuous operations without pressing '='
- Enhance UI design (styling with CSS)

---

## 👨‍💻 Author

Project built and structured by **Uriel** as part of a Java learning journey. 🚀

Feel free to fork, improve, and build on this calculator!

