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


Instructions: 
TBD

Class List:
- Resource
- GoodResource
- BadResource
- GameDisplay

Team Responsibility:
- Ojas: Game Display, Resource, GoodResource, BadResource
- Bharath: GoodResource, BadResource, UML, ReadMe

Known Bugs/Workarounds:
- Bug: Object was Null at actionPerformed and we realized the reason they were null is because actionPerformed was being called on before the class was     instantiated
- Workaround: Creating a time variable that counts the ammount of actions that happened and our object that wasan't being instantiated would only be called on when a certain time was reached. Also allows us to call objects at later times so that they get drawn in later. 

Key Learnings: 
