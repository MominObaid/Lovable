📱 Lovable - 

Modern Productivity HubLovable is a sleek, modern Android productivity dashboard designed with a focus on user experience and "Glassmorphism" aesthetics. 

It features a robust authentication system and a high-performance home dashboard for tracking team activities, meetings, and tasks.

Android Kotlin Material3✨ 

Key Features•

🔐 Secure Authentication: Dynamic Login/Sign-up toggle with real-time validation and persistent session management.

•📊 Interactive Dashboard: A grid-based stats overview showing messages, online members, tasks, and meetings.

•📜 Activity Feed: Optimized RecyclerView with custom adapters to display real-time team updates (e.g., Sarah Chen posted in #general).

•🗂 Navigation Drawer: A fully functional Material Design side menu for seamless navigation across the app.

•💎 Modern UI/UX:•Glassmorphism: Semi-transparent card effects using high-alpha hex colors.

•Responsive Design: Uses ConstraintLayout and Guidelines to ensure perfect alignment across all screen sizes.

•Auto-Ellipsize: Smart text handling to prevent layout breaking on long channel names or hashtags.



🛠 Tech Stack

•Language: Kotlin

•UI Framework: XML with Material Components (M3)

•Architecture: View Binding for null-safe view interactions.

•Layouts:•ConstraintLayout (Complex UI positioning)

•DrawerLayout (Side menu implementation)

•ScrollView (Ensuring small-screen compatibility)


•Components:

•MaterialCardView (Custom shadows and corner radii)

•TextInputLayout (Outlined input fields with password toggles)

•RecyclerView (Efficient list rendering)



📸 Screenshots| Auth | Dashboard | Menu


Login/Sign Up Screen | ![IMG_20260308_164210](https://github.com/user-attachments/assets/2f257594-ee7a-414e-ad0e-93f8dc70d5a0)

![IMG_20260308_164233](https://github.com/user-attachments/assets/f9367e76-3e8b-44af-a681-b48e66a559f2)


Dashboard | ![IMG_20260308_164327](https://github.com/user-attachments/assets/186dc058-a1a2-4ce6-bb17-0382e1eb63fb)


Navigation Drawer |![IMG_20260308_164301](https://github.com/user-attachments/assets/2570da35-f967-450e-a29a-92021a287c09)



🚀 Getting Started Prerequisites

•Android Studio Ladybug or newer.

•JDK 17+.

•Android API Level 24 (Nougat) or higher.Installation


1.Clone the repository:Shell Scriptgit clone https://github.com/MominObaid/Lovable.git

2.Open the project in Android Studio.

3.Sync Project with Gradle Files.

4.Run on an emulator or physical device.


📂 Project Structure

•AuthActivity.kt: Handles Login/Registration logic and UI state toggling.

•HomeActivity.kt: Manages the main dashboard, RecyclerView initialization, and Navigation Drawer logic.

•SessionManager.kt: Helper class for user session persistence.

•AdapterRv.kt: Custom adapter for the "Recent Activity" feed.

•activity_home.xml: A complex layout utilizing nested layouts and guidelines for a perfect grid UI.

🤝 Contributing Feel free to fork this project, open issues, or submit pull requests to help improve the UI or add new features like Firebase integration!
