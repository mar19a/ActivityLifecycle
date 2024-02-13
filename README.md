# Android Activity Lifecycle Demo

## Overview

<img width="191" alt="Screenshot 2024-02-13 at 12 16 46 AM" src="https://github.com/mar19a/ActivityLifecycle/assets/84360137/0cbec358-fdfe-4419-991e-3434b6428350">

This Android application serves as a practical demonstration of the Android Activity Lifecycle. Designed to help developers and students alike understand the sequence of callbacks invoked as an Activity progresses through different states in its lifecycle, this app provides real-time logging of lifecycle event callbacks. This includes user-initiated events such as rotating the device, pressing the home button, switching to another app, and returning to the app.

## Features

- **Lifecycle Logging**: Logs each callback of the Activity lifecycle (`onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onDestroy()`, `onRestart()`) to Android's Logcat.
- **State Preservation**: Demonstrates how to preserve the state of UI elements (`EditText` and `TextView`) across configuration changes like screen rotations.
- **User Interaction**: Allows users to interact with the application through basic UI elements to see how these interactions affect the Activity's lifecycle.

## How It Works

The app includes a simple user interface with an `EditText` for input, a `TextView` to display text, and a `Button`. When the user enters text into the `EditText` and presses the button, the text is reflected in the `TextView`. The app logs each lifecycle event to Logcat, making it easy to follow the lifecycle as the user interacts with the app or when configuration changes occur.


<img width="184" alt="Screenshot 2024-02-13 at 12 16 56 AM" src="https://github.com/mar19a/ActivityLifecycle/assets/84360137/8979a01a-fdeb-42be-b064-fcde1c59457f">

### Handling Configuration Changes

One key aspect of this app is demonstrating how to handle configuration changes, such as screen rotations, without losing user input or state. It utilizes the `onSaveInstanceState` and `onRestoreInstanceState` methods to save and restore the application state across these changes.


<img width="468" alt="Screenshot 2024-02-13 at 12 17 45 AM" src="https://github.com/mar19a/ActivityLifecycle/assets/84360137/ee070fde-7597-4ec6-a32a-38d13e11df5a">

### Testing Lifecycle Events

Users are encouraged to:

- Rotate the device to trigger configuration changes.
- Press the home button and then return to the app to see the stop and restart lifecycle events.
- Open another app and then return to this app to observe the stop and restart events without destruction.
- Press the back button and relaunch the app to see the full destruction and recreation process.

## Getting Started

To get started with this project, clone this repository and open it in Android Studio. Run the application on an emulator or a physical device to see the Activity lifecycle in action.
