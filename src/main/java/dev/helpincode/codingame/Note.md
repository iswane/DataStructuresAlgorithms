- Dans le contexte du conteneur IoC (Inversion of Control) de Spring, les objets qui sont instanciés, gérés et détruits sont généralement des beans Spring. Les beans sont des objets Java qui sont créés par le conteneur Spring et dont le cycle de vie est pris en charge par ce dernier.


- Le protocole basé sur du texte utilisé par Spring Framework pour envoyer des messages via WebSockets est appelé STOMP (Simple Text Oriented Messaging Protocol). STOMP est un protocole de messagerie simple et facile à utiliser, conçu pour être utilisé avec les serveurs de messagerie, les clients et les bibliothèques. Il fournit une couche de communication abstraite sur les protocoles WebSocket, permettant ainsi aux applications de communiquer de manière asynchrone en temps réel.


- À partir de Spring Security 5, l'annotation @Secured a été remplacée par l'annotation @PreAuthorize. L'annotation @PreAuthorize fournit une fonctionnalité plus puissante et flexible pour sécuriser les méthodes dans Spring Framework.


- L'expression @Pointcut("within(org.sport..*)") est utilisée dans Spring AOP pour définir un point de coupe (pointcut en anglais) basé sur le package des classes.
Le point de coupe définit les endroits spécifiques du code où les conseils (advices) de l'aspect seront appliqués. Dans cet exemple, l'expression within(org.sport..*) indique que le point de coupe comprendra toutes les classes situées dans le package "org.sport" et dans tous ses sous-packages.
Explication de l'expression :
within : C'est un mot-clé utilisé pour définir un point de coupe basé sur les classes dans un package spécifique.
org.sport..* : C'est le pattern utilisé pour spécifier le package et ses sous-packages. Le point .. indique que tous les sous-packages sont inclus.
Ainsi, toutes les classes situées dans le package "org.sport" et dans ses sous-packages seront concernées par le point de coupe, et les conseils de l'aspect associé à ce point de coupe seront appliqués à ces classes lors de l'exécution.
Il est important de noter que cette expression est utilisée en conjonction avec d'autres annotations et configurations pour définir un aspect complet dans Spring AOP. Par exemple, vous pouvez utiliser @Before, @After, @Around, etc., pour définir les conseils qui seront exécutés avant, après ou autour des méthodes correspondant au point de coupe défini par cette expression.


- Authentication authentication = SecurityContextHolder.getContext().getAuthentication();


- Lorsqu'une méthode annotée avec @Transactional est appelée depuis un autre bean dans Spring, et que cette méthode se termine par une exception non gérée (unchecked exception), la transaction en cours sera généralement marquée comme "rollback" (annulation).
Le comportement par défaut de Spring avec @Transactional est de déclencher un rollback lorsque l'une des exceptions suivantes (ou leurs sous-classes) est levée : 
RuntimeException (et ses sous-classes, y compris DataAccessException qui en fait partie).
Error et ses sous-classes (cela inclut généralement les exceptions graves qui indiquent des problèmes irrécupérables, telles que OutOfMemoryError ou StackOverflowError).
Toutes les autres exceptions vérifiées (qui ne sont pas des sous-classes de RuntimeException) ne déclencheront pas automatiquement de rollback. 
Lorsque l'exception est levée, la transaction est annulée, ce qui signifie que toutes les modifications de base de données effectuées pendant l'exécution de la méthode annotée @Transactional seront annulées (rollback) pour revenir à l'état précédent la méthode. Cela garantit l'intégrité des données et évite les incohérences si une erreur se produit.
Pour personnaliser le comportement du rollback, vous pouvez utiliser l'attribut rollbackFor de l'annotation @Transactional. Par exemple, si vous voulez que certaines exceptions vérifiées déclenchent également un rollback, vous pouvez les spécifier dans l'attribut rollbackFor. Voici un exemple :
java
Copy code
@Transactional(rollbackFor = { SQLException.class, CustomException.class })
public void myTransactionalMethod() {
// Code pouvant générer une SQLException ou CustomException
}
Dans cet exemple, en plus des exceptions RuntimeException par défaut, la transaction sera annulée si l'une des exceptions SQLException ou CustomException est levée dans la méthode annotée @Transactional.