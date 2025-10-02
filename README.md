# Signalized Intersection Simulator

**Technologies Used:**  
- **Backend:** Java, Spring Boot  
- **Frontend:** JavaScript, React
<p align="left">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="60" height="60"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="Spring Boot" width="60" height="60"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="JavaScript" width="60" height="60"/> 
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original.svg" alt="React" width="60" height="60"/>
</p>

---

## About

This project is a **Signalized Intersection Simulator** that lets you simulate vehicle traffic at an intersection. The simulator reads commands from a `.json` file to control the vehicles. There are two types of commands:

- **Add Vehicle** – Adds a new vehicle to a specific road.  
- **Step** – Advances the simulation using the traffic light algorithm described below.

Every time a `Step` command is processed, the program updates which vehicles can move and which traffic lights are green or red.

---

## How the Simulation Works

The simulator uses a **priority-based traffic algorithm**:

1. **Sort Roads by Priority:**  
   - Each road gets a priority score*  
   - Roads with higher priority get green lights first.
  
   *priority score = number of vehicles × waiting time of the first vehicle

2. **Set Traffic Lights:**  
   - Turn on the green light for the highest-priority road.  
   - For the other roads, check if letting the first vehicle move would collide with vehicles that already have a green light.  
   - If there’s a conflict, the light stays red; if not, it turns green.

3. **Repeat for All Roads:**  
   - Continue down the sorted list until every road has been processed.

4. **Move Vehicles:**  
   - Vehicles on roads with green lights can move through the intersection simultaneously.

---
<img src="frontend_image.png" alt="Opis alternatywny" width="1000"/>

