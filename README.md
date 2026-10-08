# Mini Hospital Emergency Management System Using Data Structures

## Project Overview

The Mini Hospital Emergency Management System is a Java-based application developed to manage patient records, emergency patients, treatment history, and patient visit history using fundamental data structures.

The main purpose of this project is to demonstrate the practical use of data structures in a hospital emergency management scenario.

The system uses the following data structures:

- Binary Search Tree (BST) - Patient Records
- Queue - Emergency Patient Management
- Stack - Treatment History
- Singly Linked List - Patient Visit History

---

## Objectives

The main objectives of this project are:

- Manage patient records efficiently.
- Search and delete patient records using Patient ID.
- Manage emergency patients using FIFO order.
- Store completed treatments using LIFO order.
- Maintain patient visit history using a singly linked list.
- Demonstrate the practical application of data structures in Java.

---

## Data Structures Used

### 1. Binary Search Tree (BST)

The Binary Search Tree is used to store and manage patient records.

Each patient is identified using a unique Patient ID.

Operations implemented:

- Insert patient
- Search patient by Patient ID
- Delete patient by Patient ID
- Display patients using In-order traversal

In-order traversal displays patient records in ascending order of Patient ID.

---

### 2. Queue

A Queue is used to manage emergency patients.

The Queue follows the FIFO (First In, First Out) principle.

Operations implemented:

- Enqueue patient
- Dequeue patient
- Display waiting patients
- Check whether the queue is empty

The first patient added to the emergency queue is treated first.

---

### 3. Stack

A Stack is used to maintain treatment history.

The Stack follows the LIFO (Last In, First Out) principle.

Operations implemented:

- Push completed treatment
- Pop latest treatment
- Display treatment history
- Check whether the stack is empty

The most recently completed treatment can be accessed first.

---

### 4. Singly Linked List

A Singly Linked List is used to maintain patient visit history.

Each visit contains:

- Visit ID
- Patient ID
- Date
- Doctor
- Diagnosis
- Treatment

Operations implemented:

- Add visit
- Search visit
- Remove visit
- Display visit history
- Check whether the list is empty

---

## System Features

### Patient Management

- Add patient records
- Search patient records
- Delete patient records
- Display patient records in ascending Patient ID order

### Emergency Management

- Add patients to emergency queue
- Treat the next waiting patient
- Display remaining emergency patients

### Treatment Management

- Add completed treatment records
- View treatment history
- Remove the latest treatment record

### Visit Management

- Add patient visits
- Search visit records
- Remove visit records
- Display patient visit history

---

## Patient Information

Each patient record contains:

- Patient ID
- Name
- Address
- Phone Number
- Email
- Age
- Medical Condition

---

## Treatment Information

Each treatment record contains:

- Treatment ID
- Patient ID
- Treatment Date
- Doctor Name
- Diagnosis
- Treatment

---

## Technologies Used

- Java
- Object-Oriented Programming
- Data Structures and Algorithms
- Git
- GitHub

---

## Project Structure

```text
Mini-Hospital-Emergency-Management-System
│
├── src
│   ├── Main.java
│   ├── Patient.java
│   ├── PatientBST.java
│   ├── EmergencyQueue.java
│   ├── Treatment.java
│   ├── TreatmentStack.java
│   ├── Visit.java
│   └── VisitLinkedList.java
│
└── README.md