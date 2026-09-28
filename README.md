# Experiment 7: Adaptive UI using ListView and ImageView

## Student Details
**Name:** Prince kumar  
**USN:** 25MCAR0112

---

## 📖 Experiment Overview

### Objective
Create an adaptive UI using `ListView` and `ImageView` in an Android application.

### Concept / Technology Behind It
An **Adaptive UI** in Android is designed to provide a consistent and optimal user experience across various screen sizes, orientations, and form factors. In this experiment, we utilize standard Android layout paradigms to ensure responsiveness.
- **ListView**: A view group that displays a list of scrollable items. It uses an `Adapter` to pull data from a source (such as arrays or databases) and convert each item into a row in the list.
- **ImageView**: A view used to display arbitrary images, such as icons or photographs, loaded from various sources (resources, content providers, or the internet).
- **Custom Adapter**: By extending `ArrayAdapter`, we create a custom layout for each row containing both an `ImageView` and a `TextView`. The adapter dynamically binds our data arrays to the custom list item layout.
- **ConstraintLayout / LinearLayout**: We utilize weight attributes and adaptable dimensions (`match_parent`, `0dp`, `wrap_content`) so that our UI elements size proportionately on different displays and orientations.

### Scenario
The app demonstrates a "Student Information & Course Details" dashboard. It presents a scrollable list of entities, each showcasing an icon (`ImageView`) alongside a title and a subtitle (`TextView`). The primary test scenario highlights the student's **Name and USN** as the first entry in the list, followed by other informative items related to Android Development.

---

## 📂 Project Structure

```text
D:/MyApplicationEXP7
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── AndroidManifest.xml          # Declares app configuration and permissions
│   │   │   ├── java/com/shareplate/myapplicationexp_7
│   │   │   │   ├── MainActivity.java        # Main activity hosting the ListView
│   │   │   │   └── CustomAdapter.java       # Custom ArrayAdapter to bind data to views
│   │   │   └── res
│   │   │       ├── drawable                 # Vector assets (ic_person, ic_android, etc.)
│   │   │       ├── layout
│   │   │       │   ├── activity_main.xml    # Main layout containing the ListView
│   │   │       │   └── list_item.xml        # Custom layout for individual ListView rows
│   │   │       ├── mipmap                   # Application icons
│   │   │       └── values                   # Colors, strings, themes
│   └── build.gradle.kts                     # App-level build configurations
├── build.gradle.kts                         # Project-level build configurations
└── README.md                                # This documentation file
```

---

## 📸 Output Screenshot

*(Please replace this placeholder with the actual screenshot of the app running)*

![Output Screenshot](screenshots/output.png)

---

## 🧪 Test Cases

### Test Case 1: Student USN and Name Display
- **Description:** Verify that the first item in the list correctly displays the student's Name and USN.
- **Expected Result:** The list item shows "Prince kumar" as the title and "USN: 25MCAR0112" as the subtitle, accompanied by a person icon.
- **Screenshot:** *(Replace with actual screenshot)*  
  ![Test Case 1](screenshots/test_case_1.png)

### Test Case 2: ListView Scrollability
- **Description:** Verify that the `ListView` allows vertical scrolling when the number of items exceeds the screen height (or in landscape mode).
- **Expected Result:** The user can swipe up and down smoothly to reveal hidden list items without any layout distortion.
- **Screenshot:** *(Replace with actual screenshot)*  
  ![Test Case 2](screenshots/test_case_2.png)

### Test Case 3: Adaptive UI / Landscape Mode
- **Description:** Verify that the application layout gracefully adapts to device orientation changes (Portrait to Landscape).
- **Expected Result:** The `ListView` items adjust their width to `match_parent` automatically, ensuring the text is readable and the image maintains its aspect ratio in landscape orientation.
- **Screenshot:** *(Replace with actual screenshot)*  
  ![Test Case 3](screenshots/test_case_3.png)