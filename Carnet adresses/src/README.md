# 📒 Carnet d’adresses – Java Console App

A simple command-line address book built in Java. This project allows users to manage contacts (name, phone number, and email) using basic object-oriented principles and standard Java libraries.

---

## 🚀 Features

- Add a new contact
- Remove an existing contact
- Display all saved contacts
- Simple menu-driven interface via console

---

## 🧱 Project Structure

CarnetAdresses/ 
                ├── src/ 
                    │ ├── model/ 
                    │ │ └── Contact.java 
                    │ ├── manager/ 
                    │ │ └── CarnetAdresses.java 
                    │ └── Main.java 
                    ├── .gitignore 
                    └── README.md


---

## 🛠️ How to Run

1. **Clone the repo**

```bash 
git clone https://github.com/votre-utilisateur/carnet-adresses-java.git
cd carnet-adresses-java 
```


2. **Compile the project**

```bash
javac -d out src/model/Contact.java src/manager/CarnetAdresses.java src/Main.java
``` 

3. **Run the app**

``` 
java -cp out Main
```


## 📚 Learning Goals / Takeaways
This project is designed to reinforce the following Java fundamentals:

✅ Understanding and applying Object-Oriented Programming (OOP) principles

✅ Creating and using custom classes (Contact)

✅ Managing collections with ArrayList

✅ Using loops, conditions, and switch statements

✅ Building a menu-based console interface

✅ Using packages and basic file structure in Java

✅ Safely modifying lists using Iterators