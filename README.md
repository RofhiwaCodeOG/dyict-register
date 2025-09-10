# dyict-register
Attendance Register System - Java to Web
# DYICT Register

Welcome to the DYICT Register — an Attendance Register System built from Java to the Web.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

DYICT Register is a web-based attendance management system designed for classes and facilitators. It provides a mobile-inspired interface, allowing students, facilitators, and admins to mark and manage attendance easily.

## Features

- **Role Selection**: Student, Facilitator, or Admin roles.
- **Class Selection**: Choose from available classes (Safari, Opera, Hanna, Mozilla).
- **Student Attendance**: Students mark attendance by entering their assigned number.
- **Facilitator Attendance**: Facilitators can mark their own attendance.
- **Admin Panel**: Admins can log in to view, export, and manage attendance records.
- **Attendance Export**: Export records in CSV format.
- **Password Management**: Admins can change their password securely.
- **Mobile-Friendly UI**: Designed to mimic a modern smartphone interface.

## Getting Started

### Prerequisites

- Modern web browser (Chrome, Firefox, Safari, Edge)
- Optionally, a local HTTP server for file access if loading external JSON

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/RofhiwaCodeOG/dyict-register.git
   ```

2. Place the repository files in your web server directory, or open `index.html` directly in your browser.

3. Ensure `students.json` exists in the project root. This file should contain the list of students per class.

### Running

- Open `index.html` in your browser.
- Select your role and follow the prompts.
- Admin login uses default credentials:
  - Username: `admin`
  - Password: `1234` (can be changed after login)

## Usage

- **Student**: Select your class, enter your student number, and mark attendance.
- **Facilitator**: Select your class and mark your attendance.
- **Admin**: Log in to view, export, or manage attendance records. Change password as necessary.

## Project Structure

```
dyict-register/
├── index.html         # Main application UI
├── students.json      # Student data (required)
├── images/
│   └── DYCT_LOGO.png  # Logo image displayed in the app
├── README.md          # This file
```

## Contributing

Contributions, suggestions, and improvements are welcome! Please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

---

**Contact**: For support or questions, reach out via GitHub Issues.

