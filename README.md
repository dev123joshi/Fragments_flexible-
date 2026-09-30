# Build an Android Application Using Fragments for Flexible UI

## Experiment Title

**Build an Android Application Using Fragments for Flexible UI**

---

## Aim

To develop an Android application using Fragments and demonstrate how Fragments can be used to create a flexible and reusable user interface.

---

## Objective

The objective of this experiment is to understand the concept of Android Fragments and implement navigation between multiple Fragments within a single Activity.

---

## Technologies Used

* Android Studio
* Kotlin
* XML
* Android SDK
* AndroidX Fragment Library

---

## Concept

A **Fragment** is a reusable part of an Android application's user interface. A Fragment has its own lifecycle and can be added, removed, or replaced within an Activity.

Fragments are useful for creating flexible user interfaces because different parts of the screen can be managed independently.

In this application, two Fragments are used:

### 1. HomeFragment

The Home Fragment displays:

* Student name
* USN
* View Details button

### 2. DetailsFragment

The Details Fragment displays:

* Experiment details
* Subject information
* Back to Home button

The user can navigate between the two Fragments without opening another Activity.

---

## Scenario

A **Student Information and Experiment Details application** is developed to demonstrate the use of Fragments.

When the application starts, the **Home Fragment** is displayed. It shows the student's name and USN.

When the user clicks the **View Details** button, the Home Fragment is replaced with the **Details Fragment**.

The user can click the **Back to Home** button to return to the Home Fragment.

This demonstrates how Fragments can be dynamically replaced within an Activity.

---
###   Screenshot
<img width="1860" height="965" alt="image" src="https://github.com/user-attachments/assets/192931d0-f3a3-4423-b6b7-c92861138803" />


## Fragment Navigation

```text
MainActivity
     |
     ↓
HomeFragment
     |
     | Click "View Details"
     ↓
DetailsFragment
     |
     | Click "Back to Home"
     ↓
HomeFragment
```

---

## Project Folder Structure

```text
FragmentFlexibleUI/
│
├── app/
│   │
│   └── src/
│       │
│       └── main/
│           │
│           ├── java/
│           │   └── com.example.fragmentflexibleui/
│           │       ├── MainActivity.kt
│           │       ├── HomeFragment.kt
│           │       └── DetailsFragment.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activit
```
