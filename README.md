# Mini-Paint

🎨 Java Swing Drawing Application
📌 Overview

This is a simple Java Swing-based drawing application that allows users to create and manage different geometric shapes interactively. The app provides a GUI where users can:

Add new shapes (Circle, Rectangle, Square, Line Segment).

Set coordinates and dimensions for each shape.

Colorize shapes (with separate border and fill color).

Delete shapes from the canvas.

Select and manage shapes from a dropdown list.

The project demonstrates OOP principles, Swing GUI programming, and basic drawing logic in Java.
======================================================================================================================
⚡ Features

✅ Create shapes by entering properties (coordinates, size).
✅ Supported shapes:

Circle
Rectangle
Square
Line Segment

✅ Select and colorize shapes (border + fill color).
✅ Delete shapes dynamically from the canvas.
✅ Shape list management via JComboBox.
✅ Error handling for invalid inputs.
====================================================================================================================
🛠️ Tech Stack

Java SE

Swing (javax.swing) for GUI
AWT (java.awt) for drawing and colors

====================================================================================================================

📂 Project Structure
├── Frontend
│   ├── MainWindow.java         # Main GUI (canvas + buttons)
│   ├── CircleCreation.java     # Circle creation form
│   ├── RectangleCreation.java  # Rectangle creation form
│   ├── SquareCreation.java     # Square creation form
│   ├── LineCreation.java       # Line creation form
│
├── backend
│   ├── ShapeInterface.java     # Shape abstraction
│   ├── Rectangle.java          # Rectangle class
│   ├── Square.java             # Square class
│   ├── Line.java               # Line class
│   ├── Circle.java             # Circle class
│   ├── Draw.java               # Drawing engine
│
└── README.md                   # Project documentation

====================================================================================================================
🚀 How to Run

Clone the repo or copy the source code.

Open the project in NetBeans or IntelliJ IDEA.

Run the MainWindow class.

Start adding shapes, colorizing, and deleting them!

====================================================================================================================
🎯 Example Workflow

Click Circle, enter center coordinates and radius, then press Add.

The shape is added to the canvas and the dropdown.

Select the shape from the dropdown → Click Colorize → Choose colors.

To delete, select the shape and click Delete.

====================================================================================================================
ScreenShots
<img width="1808" height="1055" alt="image" src="https://github.com/user-attachments/assets/9135d9dd-99ef-4577-8c5f-39ebaee08379" />

<img width="597" height="462" alt="image" src="https://github.com/user-attachments/assets/fa45fc6c-7217-4715-b0d3-acac6d5c7b1f" />


<img width="911" height="551" alt="image" src="https://github.com/user-attachments/assets/80646d28-020f-4aaa-b79f-a7f9262bf0b4" />

<img width="910" height="547" alt="image" src="https://github.com/user-attachments/assets/76d0618c-73d1-4c37-a160-8a7bbeeb4e78" />
<img width="1800" height="1054" alt="image" src="https://github.com/user-attachments/assets/e6c3cfc3-6ab9-4991-aabc-37fe1dbcf5de" />



