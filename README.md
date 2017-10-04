Welcome to the Home for Homeless Virtual Pets

*Unless you are a virtual cat... no virtual cats allowed.

To start the game the following pets are available for adoption in the shelter:

	Buck	|A fun loving Mutt that just wants to run and play

	Gracie	|A sweet Puggle that could stand to lose a few pounds

	Molly	|A Jug who would love to rip the face off the mailman

	Frankie	|An Italian Greyhound who likes long walks along the Scioto


Attributes (instance variables)

	HungerLevel

	BoredomLevel

	ThirstLevel

These are the statuses of the inital pets in the shelter whene the game begins:


	Name 	|Hunger 	|Thirst 	|Boredom

	Buck	|6		|10		|3

	Gracie	|3		|8		|10

	Molly	|5		|9		|7

	Frankie	|8		|7		|5


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










