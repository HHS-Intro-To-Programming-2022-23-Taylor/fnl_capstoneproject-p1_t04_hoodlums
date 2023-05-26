# fnl_CapstoneProject

Team Name: Hoodlums

Team Members: Ojas Khandelwal, Bharath Jayadev

Revision Dates: 4/25

Program Purpose: 
A way to educate a younger audience about natural and harmful resources using a fun, familiar, game-centric model. 
Our program works by having users select renewable resources to make progress in the game, and loses when the user selects non renewable and harmful 
resources. Overtime the game develops a familiarity and spreads awareness of renewable and harmful resources. 

Target User Profile:
A younger audience who enjoy fast paced single player games.

Feature List: 
- Shuffle between Images
- Create different parabolic paths for the resources
  - Generate a random vertex
  - Generate a random slope
- Check if click is within the image
- Redraw and Reshuffle if resource is clicked
- Play animation after resource is clicked dependning on which type of resource
- Update points depending on what resource is clicked
  - +10 for GoodResource
  - -30 for BadResource
  - -10 if you forget to click a GoodResource



Instructions: 
Click the resources that benefit the envoirnment for points and don't click the resources that pollute the enviornment or else you lose points. If you fail to click the renewable resources, you will lose points. 

Class List:
- Resource
- GoodResource
- BadResource
- GameDisplay

Team Responsibility:
- Ojas: Game Display, Resource, GoodResource, BadResource
- Bharath: GoodResource, BadResource, UML, ReadMe

Known Bugs/Workarounds:
- Bug:Object was Null at actionPerformed and we realized the reason they were null is because actionPerformed was being called on before the class was         instantiated
- Workaround: Creating a time variable that counts the ammount of actions that happened and our object that wasan't being instantiated would only be called on when a certain time was reached. Also allows us to call objects at later times so that they get drawn in later.
- Bug: B1 couldn't be set to the image we wanted.
- Workaround:We realized this is because the image wasn't initialized as a field and couldn't be set to an image. 

Key Learnings: 
- Graphhics is unessesarily complicated
- Always need more methods than you think you do 
- Don't spend too much time on trying to fix your graphics when you haven't finished your code's main purpose

Credits List: 
- Adobe background remover
- Adobe image rescaler
- Adobe gif background and rescaler
- Google
- FCP GUI Draw and Scale
- Snackbar Lab 
