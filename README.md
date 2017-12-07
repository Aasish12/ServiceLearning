# 103
Section 1 - Team 3

### Group Members
* Ani Amirova
* Aasish Basani
* Kofi Collins-Sibley
* Bailey Kay
* Josh Peyok

### Tech Stack
* Front End: AngularJS + Bootstrap HTML/CSS
* Back End: Java Rest API using Jersey
* Database: MySQL

### How To Use
- **Install Java**
    - Windows:
        - Follow these [instructions.](https://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html)
    - Mac:
        - Follow these [instructions.](https://www.java.com/en/download/help/mac_install.xml)
- **Install Maven**
    - Windows:
        - Download Maven from [apache downloads.](http://maven.apache.org/download.cgi)
        - Follow these [instructions.](https://www.mkyong.com/maven/how-to-install-maven-in-windows/)
        - run 'mvn install'
    - Mac:
        - Maven is [pre-installed.](https://stackoverflow.com/questions/8826881/maven-install-on-mac-os-x)
        
**Install Tomcat**
- Follow these [instructions.](https://www.ntu.edu.sg/home/ehchua/programming/howto/Tomcat_HowTo.html)
  
**Clone repository to local directory**
 - Open project in Intellij.
 - Framework Detected notification should appear in bottom-right corner; Click configure.
 - Click 'OK' on popup.
 - Go to File>Project Structure...> (Ctrl+Alt+Shift+S on windows).
 - Go to Artifacts.
 - Hit green + to add a new artifact.
   - Select "Web Application: Exploded"
   - Select "From Modules..."
   - Click 'OK' on popup.
   - If there there are any Maven elements in "Available Elements", right click, click "Put into /WEB-INF/lib"
   - **BE SURE TO CHECK "Include this in project build" CHECKBOX**
   - Click 'OK' to create artifact

 - Go to Run>Edit Configuration...
 - Click the grenn + to add a configuration
 - Scroll down to select Tomcast Server>local
 - Name your local server whatever you want
 - Click the "Deployment" tab
 - Click the green +, then click "Artifact"
 - Click 'OK' to create run configuration
 - Run your local server by clicking the play icon in the top right (Shift+F10 on windows)

- **SCP File to Web Server** 

- **Run Jar**

### Resources
* Jira: https://cs5500-jira.ccs.neu.edu/projects/SD103/ 
