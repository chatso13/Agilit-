Feature: US_03 Gerer les pays et l'installation de clans

En tant que politicien
Je souhaite créer des pays
Afin d'installer des clans dessus

Scenario Outline: emmenagement d'un clan dans un pays
Given Etant donné un pays avec <n> clans et un nouveau clan quelconque
When On fait emmenager le clan sur le pays
Then le nombre de clan sur le pays doit avoir été incrémenté de 1

Examples: 
|n|
|2|
|4|

Scenario Outline: demmenagement d'un clan d'un pays
Given Etant donné un pays avec <n> clans 
When On fait demmenager le premier clan du pays
Then le nombre de clan sur le pays doit avoir été décrémenté de 1

Examples: 
|n|
|3|
|5|

Scenario Outline: refus d'emmenagement d'un clan étant déjà présent sur un pays
Given Etant donné un pays avec <n> clans et un nouveau clan ayant déjà une résidence quelconque
When On fait emmenager le clan sur le pays
Then le système refuse le changement et renvoie le code -1

Examples: 
|n|
|2|
