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
	
	ShelterLitterBoxCleanliness

These are the statuses of the inital pets in the shelter whene the game begins:


	Organic Dogs:

	Name 	|Health 	|Happiness 	|Hunger 	|Thirst 	|Cleanliness

	Buck	|10		|10		|6		|10		|9

	Frankie |10		|5		|8		|7		|6


	Organic Cats:

	Name 	|Health 	|Happiness 	|Hunger 	|Thirst 	|ShelterLitterBox

	Gracie	|10		|10		|3		|8		|8


	Robotic Dogs:

	Name 	|Health 	|Happiness 	|Maintenance

	Molly	|10		|8		|7


	Robotic Cats:

	Name 	|Health 	|Happiness 	|Maintenance

	Kitty	|10		|4		|9


The game ends when all of the available pets have been adopted.

Activities (methods)

1.  Let's Eat - feed all the organic pets

		hungerLevel + 10 (dogs)

		thirstLevel - 1 (dogs)

		hungerLevel + 9 (cats)

		thirstLevel - 2 (cats)


2.  Let's Drink - water all the organic pets

		thirstLevel + 8


3.  Let's Play - select a pet to play with

		happinessLevel + 10

4.  Let's Maintain the Robots - oil all the robotic pets

		maintenanceLevel + 10 (dogs)

		maintenanceLevel + 8 (cats)

5.  Let's Clean the Dog Cages - clean all the organic dog cages

		cleanlinessLevel + 9

6.  Let's Clean the Shelter Litter Box - clean the shared litter box

		shelterLitterBoxCleanliness + 7

7.  Let's Walk the Dogs - walk all the dogs in the shelter

		happinessLevel + 7

		cleanlinessLevel +3 (organic dogs)		

8.  Admit an organic dog to the shelter

		Enter a new organic dog by providing their name and description


9.  Admit an organic cat to the shelter

		Enter a new organic cat by providing their name and description


10.  Admit a robotic dog to the shelter
	
		Enter a new robotic dog by providing their name and description


11.  Admit a robotic cat to the shelter

		Enter a new robotic cat by providing their name and description


12.  Adopt a pet from the shelter

		Adopt a pet from the shelter by removing them from the collection


13.  Exit the program.

Tick Method

After each turn - all the organic dogs in the shelter have their levels adjusted by the following amounts:

	hungerLevel - 1

	thirstLevel - 1

	cleanlinessLevel - 1

	happinessLevel - 2

After each turn - all of the organic cats in the shelter have their levels adjusted by the following amounts:

	hungerLevel - 1

	thirstLevel - 1

	happinessLevel - 2

After each turn - all of the robotic dogs in the shelter have their levels adjusted by the following amounts:

	maintenanceLevel - 1

	happinessLevel - 1

After each turn - all of the robotic cats in the shelter have their levels adjusted by the following amounts:

	maintenanceLevel - 1

	happinessLevel - 2

After each turn the shelterLitterBoxCleanliness is decreased by 1










