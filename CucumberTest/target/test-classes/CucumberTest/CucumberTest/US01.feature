Feature: US_01 Gerer les animaux

En tant que rêveur 
Je souhaite créer des animaux ayant un prénom et un nombre d'enfants
Afin de peupler mon nouveau monde

Scenario Outline: calcul automatique du nombre d'enfants
Given Un animal quelconque
When L'animal met au monde <n> nouveaux enfants
Then Le <total> d'enfants doit être automatiquement calculé

Examples: 
|n|total|
|2|2|
|3|3|

Scenario Outline: refus de mise au monde d'un nombre d'enfants négatif
Given Un animal quelconque
When L'animal essaye de mettre au monde <n> nouveaux enfants
Then le système refuse avec un code a -1

Examples: 
|n|
|-3|

