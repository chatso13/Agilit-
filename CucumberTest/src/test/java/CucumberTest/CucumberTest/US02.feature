Feature: US_02 Gerer les clans

En tant que tout puissant 
Je souhaite instaurer des clans ayant un chef, un nombre de membre et un pays de residence
Afin de créer des unités solidaires

Scenario Outline: calcul automatique du nombre de membres
Given Un animal ayant <nombreEnfants> et un clan ayant un <nombreMembres>
When L'animal est élu chef du clan
Then le <nouveauNombreMembres> doit être automatiquement calculé

Examples: 
|nombreEnfants|nombreMembres|nouveauNombreMembres|
|2|100|103|
|3|103|107|

Scenario Outline: refus d'élection d'un chef n'ayant pas d'enfants
Given Un animal ayant un nombre d'enfants à 0 et un clan ayant un <nombreMembres>
When L'animal est élu chef du clan
Then le système refuse d'élir le chef et il y a un code à -1 et le <nouveauNombrememnbres> ne change pas

Examples: 
|nombreMembres|nouveauNombrememnbres|
|100|100|
