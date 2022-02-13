# Git Tutorial
In this tutorial, I will be using a simple java hello world project to help walk through how to use command line git. So, start out by opening your choice of IDE and creating a project as normal, this is the project that will be used for both the local and remote repository. Open a terminal window, for Mac OS this can be found using the magnifying glass in the top bar of your computer and typing in terminal.  

## Initializing Project
Now that we are in the terminal you will be using command line instructions, start by changing your directory to the project. The common used to change directories is `$ cd ~/(name of project)` if that does not work you can look on your IDE for a path to your project and you can put that in place of the name. 

## Initializing Local Repository
After you have a project made you will use the `$ git init` command to initialize your local repository, this will be used to keep track of changes locally, to check your directory status you can use `$ git status`

## Add to Staging
In your java project you will have classes, to commit those classes and changes to your repo you will need to stage them first. You will use the `$ git add (path to file)` command to do that, for the file you will want the path to the file, this again can also be found in your IDE it could look something like this `/Users/yourName/ProjectName/src/className.java` but you’ll probably only need `src/className.java` to add it to the staging area. 
![](https://github.com/amthreatt/GitTutorial/blob/b7c67564c653513d0d3f80d0a5a507188e68b151/Screen%20Shot%202022-02-12%20at%204.27.12%20PM.png)Now if you want to add all the files to the staging area you could use `$ git add -A` this will add every file in your project, if you just want to add the java files/class files use `$ git add *.java`

In the event, you want to remove every file from your staging area use $ git reset this will not fully delete the file from your computer it will just unstage them at the moment. 

## Committing to Repository
Committing a file means the current version of the file in the repo will be overridden, adding a message describing the commit is recommended for keeping track of everything. Everything is the staging area will be committed to the repository at once, the command to do this is `$ git commit -m “Message”`
![](https://github.com/amthreatt/GitTutorial/blob/b7c67564c653513d0d3f80d0a5a507188e68b151/Screen%20Shot%202022-02-12%20at%204.35.29%20PM.png)
If after committing you are taken to a separate command window to add a message, simply input your message for the commit in a line without “#” and once you are done perform hit `Esc=> type :wq=> enter` this should take you back to the original terminal window. 

## Working in Remote Repository (GitHub)
In this section we will be connecting to a remote repository through grit hub, there are other remote repo options git Kraken serves the same purposes for example. But for this tutorial, we will be using git hub. 

So first once you get to your GitHub page, you'll need to **make a new repository**. Click the plus sign and then go to the place where it says New repository
![](https://github.com/amthreatt/GitTutorial/blob/b7c67564c653513d0d3f80d0a5a507188e68b151/Screen%20Shot%202022-02-12%20at%202.26.24%20PM.png)
Once you create your new repository, name it, and fill in the description it will propt you to quick set up, create a new repo on the common line, or **push an existing repo from the command line**. Git hub gives you the option to copy and past the command line code to perform these actions here we will be pushing an existing repo that we had made earlier for our project to git hub so we will be copying the following code. 
![](https://github.com/amthreatt/GitTutorial/blob/5ebaec4e26fedc337b463498d5425f9a2bdb9fac/Screen%20Shot%202022-02-12%20at%202.31.36%20PM.png)
