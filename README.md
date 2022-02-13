# Git Tutorial
In this tutorial, I will be using a simple java hello world project to help walk through how to use command line git. So, start out by opening your choice of IDE and creating a project as normal, this is the project that will be used for both the local and remote repository. Open a terminal window, for Mac OS this can be found using the magnifying glass in the top bar of your computer and typing in terminal.  

## Initializing Project
Now that we are in the terminal you will be using command line instructions, start by changing your directory to the project. The common used to change directories is `$ cd ~/(name of project)` if that does not work you can look on your IDE for a path to your project and you can put that in place of the name. 

## Initializing Local Repository
After you have a project made you will use the `$ git init` command to initialize your local repository, this will be used to keep track of changes locally, to check your directory status you can use `$ git status`

## Add to Staging
In your java project you will have classes, to commit those classes and changes to your repo you will need to stage them first. You will use the `$ git add (path to file)` command to do that, for the file you will want the path to the file, this again can also be found in your IDE it could look something like this `/Users/yourName/ProjectName/src/className.java` but you’ll probably only need `src/className.java` to add it to the staging area. 
![enter image description here](GitTutorial/Screen Shot 2022-02-12 at 2.26.24 PM.png)
