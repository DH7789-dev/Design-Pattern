## Design Patterns

### Creational Patterns (Patrons de création) :

Singleton : Garantit l'existence d'une seule instance d'une classe et fournit un point d'accès global à cette instance.

Factory Method : Définit une interface pour créer un objet, mais laisse aux sous-classes le choix des classes concrètes à instancier.

Abstract Factory : Fournit une interface pour créer des familles d'objets liés ou dépendants sans spécifier leurs classes concrètes.

Builder : Permet de construire un objet complexe étape par étape. Utile lorsque la création directe de l'objet est difficile ou peu pratique.

Prototype : Utilise une instance existante comme prototype pour créer de nouveaux objets en copiant simplement cet objet.

### Structural Patterns (Patrons structurels) :

Adapter : Permet à des objets avec des interfaces incompatibles de travailler ensemble.

Bridge : Découple une abstraction de son implémentation afin que les deux puissent varier indépendamment.

Composite : Permet de composer des objets dans des structures arborescentes pour représenter une hiérarchie tout en traitant les objets individuels et les compositions d'objets de manière uniforme.

Decorator : Attache de nouvelles fonctionnalités à un objet en fournissant une alternative souple à l'héritage pour étendre les fonctionnalités.

Facade : Fournit une interface unifiée à un ensemble d'interfaces dans un sous-système. Simplifie l'utilisation de ce sous-système.

Proxy : Fournit un substitut ou un espace réservé pour un autre objet afin de contrôler l'accès à celui-ci.

### Behavioral Patterns (Patrons comportementaux) :

Observer : Définit une dépendance un-à-plusieurs entre objets, de sorte que lorsque l'objet observé change d'état, tous ses observateurs sont notifiés et mis à jour automatiquement.

Strategy : Définit une famille d'algorithmes, encapsule chacun d'eux et les rend interchangeables. Permet de choisir l'algorithme à utiliser au moment de l'exécution.

Command : Encapsule une requête en tant qu'objet, ce qui permet de paramétrer des clients avec des requêtes, de mettre en file d'attente des requêtes et de logguer les requêtes, ainsi que de supporter l'annulation des opérations.

Iterator : Fournit un moyen de parcourir séquentiellement les éléments d'une collection sans exposer la représentation sous-jacente.

Chain of Responsibility : Permet de passer une requête le long d'une chaîne de gestionnaires. Lorsqu'une requête est reçue, chaque gestionnaire décide de la traiter ou de la transmettre au gestionnaire suivant de la chaîne.

State : Permet à un objet de changer son comportement lorsqu'il change son état interne. L'objet paraît changer de classe.

### Concurrency Patterns (Patrons de concurrence) :

Producer-Consumer : Gère la communication entre des processus qui produisent des données et des processus qui les consomment.

Reader-Writer Lock : Contrôle l'accès à une ressource partagée entre plusieurs processus, en accordant l'accès en lecture à plusieurs processus simultanément, mais en accordant l'accès en écriture à un seul processus à la fois.

Thread Pool : Gère un ensemble de threads réutilisables pour exécuter un ensemble de tâches parallèles.
