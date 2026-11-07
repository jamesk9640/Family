MY FAMILY APP - Android project
================================

EASIEST WAY (no Android Studio, free, about 5 minutes) - build with GitHub:
 1. Make a free account at github.com and create a NEW repository (Private is fine).
 2. Click "uploading an existing file" and upload EVERYTHING inside this folder
    (app, .github, build.gradle, settings.gradle, gradle.properties).
    IMPORTANT: folders starting with a dot (.github) are hidden and often
    NOT uploaded. So do step 2b as well.
 2b. In your repository click  Add file -> Create new file.
    In the name box type exactly:   .github/workflows/build.yml
    (typing the slashes creates the folders). Open the file "build.yml" from
    this zip, copy ALL its text, paste it in, then click "Commit changes".
 3. Open the "Actions" tab -> "Build APK" -> wait about 4-6 minutes for the green tick.
    (If it did not start: Actions -> Build APK -> Run workflow.)
 4. Click the finished run -> scroll to "Artifacts" -> download "MyFamily-apk".
 5. Unzip it, send app-debug.apk to your phone, tap it and allow "Install unknown apps".

ANDROID STUDIO WAY:
 File -> Open -> choose this folder -> wait for Gradle sync -> Build -> Build APK(s).

WHAT THE APP DOES NATIVELY
 - Backup / documents are saved to Downloads/MyFamily
 - Print opens Android's print screen (choose "Save as PDF")
 - WhatsApp share opens WhatsApp directly
 - Birthday reminders at 9 AM every day, even when the app is closed
 - Icons and PDF viewer are bundled, so it works offline
 - Your existing data does not carry over from another app/browser:
   use Backup (copy text) in the old version and Restore in this one.

The web app lives in app/src/main/assets/index.html
