Rendu REST SpringBoot Fabien Fleisch

## Installation
 - Cloner le projet
 - Ouvrir un invité de commande
 - Faire "cd SpringBoot_Rest_API"
 - Ouvrir artifact dans l'IDE JAVA de votre choix
 - Clique droit sur le fichier pom.xml -> Maven -> Reload project (pour charger les dépendances)
 - Build le projet
 - Clique droit sur le fichier RenduRestApplication.java -> Run

## Utilisation avec Postman -> Un gif est disponible montrant l'utilisation
 - Ouvrir Postman
 - Faire une requête GET sur http://localhost:8080/joueurs -> la liste des joueurs est retournée
 - Faire une requête GET sur http://localhost:8080/joueurs/{1} -> le joueur avec l'id 1 est retourné
 - Faire une requête POST sur http://localhost:8080/joueurs en indiquant dans le body un JSON (ex : {"nom": "Samwise", "prenom": "Fabien", "age": 22}) avec les attributs du joueur -> le joueur est créé
 - Faire une requête GET sur http://localhost:8080/joueurs -> la liste des joueurs est retournée avec le nouveau joueur
 - Faire une requête GET sur http://localhost:8080/equipes -> la liste des équipes est retournée
 - Faire une requête GET sur http://localhost:8080/equipes/{1} -> l'équipe avec l'id 1 est retourné
 - Faire une requête POST sur http://localhost:8080/equipes en indiquant dans le body un JSON (ex : {"nom": "EquipeFC", "ville": "Saint Etienne"}) avec les attributs de l'équipe -> l'équipe est créé
 - Faire une requête GET sur http://localhost:8080/equipes -> la liste des équipes est retournée avec la nouvelle équipe

## Utilisation avec le script NodeJS
 - Ouvrir un terminal a la racine du projet
 - Faire la commande `npm install axios` pour installer la dépendance axios
 - Faire la commande `node script.js` pour lancer le script

## GIF
![](https://github.com/LileFab/SpringBoot_Rest_API/blob/main/utilisation%20_postman.gif)
