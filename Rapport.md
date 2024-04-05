# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : GRANDY Guillaume | 

## Exercices 1

Quel patron de conception reflète ce modèle ?

Le patron de conception qui reflète ce modèle est le "Composite". 
On traite un véhicule avec son groupe d'objets. Pour calculer la masse d'un véhicule, on fait la somme de toutes les 
masses des objets mobiles associés. Un objet mobile a une masse individuelle.

Il n'est pas utile de réécrire les méthodes, car pour calculer la vitesse / masse on se sert de la liste des composants 
mobiles d'un véhicule donc d'un vélo et donc d'un `TagAlongBike`. En effet, on parcourt la liste des composants pour 
ajouter les masses individuelles au véhicule. Pareil pour la vitesse à quelque chose près vu qu'on fait le somme pondéré.

## Exercices 2

Le patron de conception utilisé pour `getVelocity()` est le patron de conception **Itérateur**

Ce patron de conception permet de parcourir l'ensemble des `MobileObject` en s'adaptant à la structure de voisinage

Chaque feuille, `MobileObject`, connaît son poids et sa vitesse. Le Vélo, peut ainsi faire le parcours des composants
et calculer la vitesse et le poids total.

On peut modifier le type de collection pour stocker les composants. On ne doit pas modifier la méthode `getVelocity()` 
grâce au patron de conception `Itérateur` qui nous permet d'explorer la collection de composants toujours de la même 
façon.

## Exercices 3

1. Mettre le constructeur de Clock en private. Il ne doit plus être possible de créer librement une nouvelle instance de 
Clock.
2. Ajouter un attribut et un accesseur sur l'instance de la clock qui vérifie si l'attribut est déjà instancié avant de 
la créer
3. Remplacer le `new Clock()` par un `Clock.getInstance()` dans `Wheel` pour créer ou récupérer l'instance de `Clock`

## Exercices 4

Les classes `Bike` et `Wheel` n'appartiennent pas au même paquetage. `Bike` appartient à `*.cycling` et `Wheel` à 
`*.transport`
Il y a une dépendance cyclique entre les 2 classes. Cela pose un problème si l'on utilise une `Wheel` sans avoir 
l'association avec un `Bike`.

`Wheel` utilise la fonction `getPush()` de `Bike` quand on veut calculer la vitesse.
Oui, il existe une abstraction de la classe `Bike` qui isole la fonctionnalité : la classe `Vehicle`. Le paquetage où se 
trouve cette fonctionnalité est `*.transport`.

La solution adoptée est de changer le type de l'attribut `drive` de `Bike` vers `Vehicle` => plus de dépendances 
cycliques

## Exercices 5

Dans `NamedLogger` nous avons créé une fonction `log()` qui formate le message puis appelle la méthode 
`writeLog(message)` qui définit concrètement où "rendre" le message (dans la console ou dans un fichier à l'heure 
actuelle) selon l'implémentation des enfants.

## Exercices 6

La différence entre un Singleton et la méthode Fabrique réside dans le fait que le Singleton permet de partager une 
instance unique au contraire de la méthode Fabrique qui peut permettre de créer de multiples instances d'une même classe

## Exercices 7

Nous avons créé la classe `TimestampedLoggerDecorator` héritant de `NamedLogger`. Celui-ci contient un `Logger` 
(`FileLogger` ou `NameLogger`).
Nous avons modifié notre méthode static pour `new TimestampedLoggerDecorator(name, new ConsoleLogger(name))`. 
Notre logger est encapsulé dans notre décorateur qui ajoute la date au début du message à afficher.

## Exercices 8

Le patron de conception utilisé est Facade qui sert à proposer un accès simplifié à la classe `ServiceLoader`

## Exercice 9


