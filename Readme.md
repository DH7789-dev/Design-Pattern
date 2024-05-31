# Cas d'utilisation des design patterns

## Contexte : un système de gestion de commandes pour un café en ligne

## Singleton
Nous utilisons le pattern Singleton pour gérer la connexion à notre base de données de stockage des produits. En utilisant un Singleton, nous nous assurons qu'il n'existe qu'une seule instance de la classe responsable de la gestion de la base de données, évitant ainsi les problèmes de concurrence et assurant la cohérence des données.

## Factory Method
Nous utilisons le pattern Factory Method pour créer différentes instances de boissons en fonction des commandes des clients. Par exemple, nous pouvons avoir une fabrique de boissons chaudes et une fabrique de boissons froides, chacune responsable de créer des instances appropriées de boissons telles que café, thé, limonade, etc.

## Builder
Lorsqu'un client passe une commande, nous utilisons le pattern Builder pour construire dynamiquement l'objet Commande. Le client peut personnaliser sa commande en choisissant les types et les quantités de boissons, ainsi que les extras tels que le sucre, la crème, etc. Le builder nous permet de créer des commandes complexes tout en cachant les détails de construction au client.

## Observer
Nous utilisons le pattern Observer pour informer les clients de l'état de leur commande en temps réel. Chaque fois qu'il y a un changement d'état dans une commande (par exemple, en cours de préparation, en cours de livraison, livrée), le système notifie automatiquement le client concerné.

## Decorator
Nous utilisons le pattern Decorator pour permettre aux clients de personnaliser leurs boissons avec différents extras tels que la crème fouettée, le sirop, etc. Chaque extra est un décorateur qui enveloppe une instance de boisson de base et ajoute une fonctionnalité supplémentaire.

## Proxy
Nous utilisons le pattern Proxy pour contrôler l'accès à certaines fonctionnalités du système, telles que la modification des commandes passées. Le proxy agit comme une interface intermédiaire entre le client et le système, vérifiant les autorisations avant de permettre l'accès aux fonctionnalités sensibles.


## Abstract Factory
Nous utilisons le pattern Abstract Factory pour fournir une interface permettant de créer des familles d'objets liés, tels que différents types de boissons et leurs accessoires correspondants. Par exemple, une fabrique de boissons chaudes peut créer un café avec ou sans lait, avec différentes intensités, tandis qu'une fabrique de boissons froides peut créer des limonades avec différents arômes.

## Bridge
Nous utilisons le pattern Bridge pour séparer l'abstraction des implémentations, permettant ainsi aux clients de choisir différents types de boissons sans modifier leur code. Par exemple, un client peut commander une boisson sans se soucier de savoir si elle est chaude ou froide. La classe abstraite Boisson agit comme une abstraction, tandis que les classes concrètes BoissonChaude et BoissonFroide représentent les implémentations spécifiques.

## Composite
Nous utilisons le pattern Composite pour représenter les commandes de manière hiérarchique. Une commande peut être composée de plusieurs sous-commandes, chacune représentant une boisson individuelle ou un ensemble de boissons avec des extras. Cela permet de traiter les commandes simples et complexes de manière uniforme.

## Strategy
Nous utilisons le pattern Strategy pour permettre aux clients de choisir différentes stratégies de livraison en fonction de leurs préférences et de la disponibilité des services de livraison. Par exemple, un client peut choisir une livraison standard, express ou à emporter. Chaque stratégie implémente une manière différente de livrer les commandes.

## Command
Nous utilisons le pattern Command pour encapsuler les commandes passées par les clients en tant qu'objets, permettant ainsi de les traiter, de les annuler ou de les modifier facilement. Chaque commande est une instance d'une classe concrète implémentant l'interface Command, ce qui facilite la gestion des différentes actions à effectuer sur les commandes.

## Iterator
Nous utilisons le pattern Iterator pour permettre aux clients de parcourir séquentiellement les éléments d'une commande, tels que les boissons et leurs extras, sans exposer la structure interne de la commande. Cela rend la manipulation des commandes plus facile et plus sûre, en évitant les accès directs aux éléments de la commande.

## Chain of Responsibility
Nous utilisons le pattern Chain of Responsibility pour gérer les demandes de modification des commandes. Chaque maillon de la chaîne représente un gestionnaire responsable de traiter une catégorie spécifique de demandes, telles que l'ajout d'un extra, la modification d'une boisson, etc. Les demandes sont transmises le long de la chaîne jusqu'à ce qu'elles soient traitées ou rejetées.

## State
Nous utilisons le pattern State pour modéliser l'état des commandes, telles que "en attente", "en préparation", "en cours de livraison", etc. Chaque état est représenté par une classe concrète implémentant l'interface State, ce qui permet à une commande de changer dynamiquement d'état en fonction des actions effectuées sur elle.

## Producer-Consumer
Nous utilisons le pattern Producer-Consumer pour gérer la communication entre les clients passant des commandes (producteurs) et les employés préparant et livrant les commandes (consommateurs). Les commandes sont produites par les clients et consommées par les employés, assurant ainsi un flux continu et efficace des opérations.

## Reader-Writer Lock
Nous utilisons le pattern Reader-Writer Lock pour contrôler l'accès concurrentiel aux données partagées, telles que les informations sur les produits et les commandes. Les opérations de lecture peuvent être exécutées par plusieurs threads simultanément, tandis que les opérations d'écriture sont exécutées par un seul thread à la fois, garantissant la cohérence des données.

## Thread Pool
Nous utilisons le pattern Thread Pool pour gérer l'exécution des tâches de traitement des commandes dans un environnement concurrentiel. Un pool de threads réutilisables est utilisé pour exécuter les différentes étapes du traitement des commandes, telles que la préparation des boissons, la gestion des extras, etc., améliorant ainsi les performances et l'efficacité du système.

## Conclusion

Ce scénario d'utilisation démontre comment chaque design pattern est appliqué dans le contexte d'un système de gestion de commandes de café en ligne, contribuant à sa conception modulaire, à sa flexibilité et à sa facilité de maintenance. Chaque pattern résout des problèmes spécifiques et contribue à la construction d'un système logiciel robuste et évolutif.
