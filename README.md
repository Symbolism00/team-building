# Team-Building Application

## Overview

Team-Building is a web-based application designed to facilitate team engagement and voluntary collaboration within organizations, associations, or groups. It connects **team members** with **activity providers** who need help performing various tasks, encouraging collaboration, skill sharing, and social interaction.

The application focuses on:  
- Creating and managing teams across organizations.  
- Matching team members to activities based on availability and preferences.  
- Supporting voluntary participation and post-activity feedback.

---

## Key Concepts

- **Team Member**: A user who can join one or multiple teams and participate in activities.  
- **Activity Provider**: A user who can propose activities that require help from teams.  
- **Team**: A group of members within an organization, optionally specialized in certain types of activities.  
- **Activity**: A task or challenge posted by an activity provider that can be completed by a team.  
- **Feedback**: After an activity, both the team and the provider can rate each other to maintain trust and improve engagement.

---

## Features

1. **User Management**  
   - Account creation and role selection (Team Member or Activity Provider).  
   - Profile management.  

2. **Team & Organization Management**  
   - Create teams within organizations.  
   - Assign members to multiple teams.  
   - Optionally, specialize teams for specific types of activities.  

3. **Activity Management**  
   - Activity providers can post tasks with date, time, and description.  
   - Team members can view available activities and indicate availability.  
   - Providers approve or decline participation.  

4. **Scheduling & Notifications**  
   - Schedule activities with agreed date, time, and location.  
   - Notify participants of updates or confirmations.  

5. **Feedback & Ratings**  
   - Post-activity evaluations by both teams and providers.  
   - Maintain accountability and improve trust for future collaborations.

---

## Technologies

- **Frontend**: React + Tailwind CSS  
- **Backend**: Java (Micronaut) with Gradle  
- **Database**: MongoDB  

Optional future enhancements: real-time notifications, activity recommendation engine, and team analytics dashboard.

---

## Example Workflow

1. A provider posts a request for help (e.g., home renovation, beach cleanup).  
2. Members of teams see the activity and indicate availability.  
3. Provider approves or declines participants.  
4. Activity occurs on the scheduled date and time.  
5. Post-activity, both the provider and the team rate each other.  

---

## Architecture

The application is organized in a modular architecture:  

- **Frontend**:  
  - User registration and login.  
  - Team and activity dashboards.  
  - Feedback forms.  

- **Backend**:  
  - REST APIs for user, team, and activity management.  
  - Business logic for scheduling and availability checks.  
  - Data storage in MongoDB with appropriate indexing.  

---

## Getting Started

### Prerequisites
- Java 21
- Gradle  
- Node.js 18+  
- MongoDB  

### Installation
1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/team-building-app.git
