Welcome to the Home for Homeless Virtual Pets

*Now accepting cats because we have to.

To start the game the following pets are available for adoption in the shelter:

	Buck	|A fun loving Mutt that just wants to run and play

	Gracie	|A sweet tabby cat that could stand to lose a few pounds

	Molly	|A robotic dog who would love to rip the face off the mailman

	Frankie	|An Italian Greyhound who likes long walks along the Scioto

	Kitty	|A robotic cat who doesn't like you


Attributes For All Pets (instance variables)

	HealthLevel

	HappinessLevel

Attributes For Organic Dogs (instance variables)

	HungerLevel

	ThirstLevel

	Cleanliness

Attributes For Organic Cats (instance variables)

	HungerLevel

	ThirstLevel

Attributes For Robotic Pets (instance variables)

	MaintenanceLevel

Attributes For the Shelter (instance variable)
	
	ShelterLitterBox

These are the statuses of the inital pets in the shelter whene the game begins:


	Organic Dogs:

	Name 	|Health 	|Happiness 	|Hunger 	|Thirst 	|Cleanliness

	Buck	|10			|10			|6			|10			|9

	Frankie |10			|5			|8			|7			|6


	Organic Cats:

	Name 	|Health 	|Happiness 	|Hunger 	|Thirst 	|ShelterLitterBox

	Gracie	|10			|10			|3			|8			|8

	Robotic Dogs:

	Name 	|Health 	|Happiness 	|Maintenance

	Molly	|10			|8			|7

	Robotic Cats:

	Kitty	|10			|4			|9


The game ends when all of the available pets have been adopted.

Activities (methods)

1.  Let's Eat - feed all the pets

		hungerLevel + 6

		thirstLevel - 1


2.  Let's Drink - water all the pets

		thirstLevel + 5

		hungerLevel - 1

		boredomLevel -1


3.  Let's Play - select a pet to play with

		boredomLevel + 10

		thirstLevel - 2

4.  Admit a pet to the shelter

		Enter a new virtual pet by providing their name and description

		The tick method runs

5.  Adopt a pet from the shelter

		Adopt a pet from the shelter by removing them from the collection

		The tick method runs

6.  Exit the program.

Tick Method

After each turn - all the virtual pets in the shelter have their levels adjusted by the following amounts:

	hungerLevel - 1

	boredomLevel - 2

	thirstLevel - 1










