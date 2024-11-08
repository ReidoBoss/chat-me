# ChatMe

ChatMe is a real-time social media and messaging application built with Play Framework on the backend and Vue.js with Composition API and TypeScript on the frontend. Designed for seamless, instant communication, ChatMe enables users to connect, share, and chat in real-time with friends, alongside a growing set of social media features.

> **Note:** ChatMe is currently under development. This README will be updated as the app evolves.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Development Setup](#development-setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [Roadmap](#roadmap)
- [License](#license)

---

## Features

### Priority 0: MVP Features (In Development)
- **User Registration and Login**: Register with a username, password, full name, and email; log in to access your account.
- **Password Recovery**: Reset password via email and a one-time password (OTP).
- **Basic Profile**: Upload profile pictures, view friends' profiles, and add or accept friend requests.
- **Real-Time Chat**: Chat with friends in real-time and see their online/offline status.
- **Basic Posting**: Post text and images, view friends’ posts.

### Priority 1: Upcoming Features
- **Enhanced Chat Experience**: Typing indicators for active conversations.
- **Social Interaction**: Like, react to, and comment on friends’ posts.
- **Notifications**: Real-time notifications for new messages, likes, comments, and friend requests.
- **Privacy and Blocking**: Control visibility of your profile and block unwanted users.

### Priority 2: Future Enhancements
- **Extended Profile Customization**: Update profile and cover photos.
- **Search and Mutual Friends**: Search users by name and view mutual friends on profiles.
- **Advanced Notifications**: Mute notifications for specific friends or groups.

---

## Tech Stack

- **Backend**: Play Framework, PostgreSQL
- **Frontend**: Vue.js with Composition API, TypeScript, Pinia (for state management)
- **Testing**: Vitest
- **Other**: WebSockets for real-time messaging

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ChatMe.git
   cd ChatMe
   ```

2. Install backend dependencies:
   ```bash
   sbt compile
   ```

3. Install frontend dependencies:
   ```bash
   cd client
   npm install
   ```

## Development Setup

1. **Start the backend server**:
   ```bash
   sbt run
   ```
   This will start the Play Framework server at `http://localhost:9000`.

2. **Start the frontend development server**:
   ```bash
   cd client
   npm run dev
   ```
   The frontend will be accessible at `http://localhost:3000`.

3. **Environment Variables**: Set up environment variables as required in the `.env` file for both the backend and frontend configurations (such as database connection strings and API endpoints).

## Usage

1. Register with a new account and log in.
2. Add friends, initiate real-time chat, and start posting updates.
3. Access the profile settings to customize your profile picture and personal details.
4. Monitor updates and notifications as features are rolled out in real-time.

> **Note**: Features are being added progressively. See the [Roadmap](#roadmap) for current development priorities.

## Contributing

I welcome contributions! To contribute:

1. Fork the repository and create a new branch for your feature or bug fix.
2. Make your changes and ensure that tests are passing.
3. Submit a pull request with a clear description of your changes.

For more details, see [CONTRIBUTING.md](CONTRIBUTING.md) (to be created).

## Roadmap

- **Phase 1**: Core MVP features - User registration, login, basic profile setup, friend management, and real-time chat.
- **Phase 2**: Social interaction and notifications - Posting, likes, comments, typing indicators, and notifications.
- **Phase 3**: Advanced features - Profile customization, search functionality, privacy settings, and blocking users.

> For a complete list of planned features, refer to the [Features](#features) section above.


**Note**: As ChatMe is in active development, the roadmap and features list will be updated frequently. Stay tuned for new releases and updates!

