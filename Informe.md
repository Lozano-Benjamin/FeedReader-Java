# Laboratorio 2 Paradigmas de la Programación 

## Integrantes 
 - Ayala Facundo
 - Bonfils Gastón Tomas
 - Lozano Benjamin

## Diseño del proyecto
El skeleton del trabajo estaba bien separado por módulos por lo que fue fácil hacer la división de tareas. Pudimos empezar directamente haciendo el main y de ahí fueron surgiendo las ideas de diseño para cada módulo en especifico.   
Cada vez que agregabamos un modulo era facil de testear pues con correr el main ya preparado obteniamos un output directo.  


### Implementación del Parser
La clase `GeneralParser` fue implementada como una clase abstracta polimórfica definida con una única función abstracta `Parse`. Luego está clase fue extendida para realizar:
- `SubscriptionParser` la cual parsea un archivo JSON con las subscripciones del usuario y devuelve un objeto de clase `Subscription`
- `RssParser` el cual parsea una string `xml` para generar los articulos y devolverlos en un feed en un objeto de clase `Feed`
- `RedditParser` funciona similar al `SubscriptionParser` pues el feed de Reddit es en formato `JSON`. Se devuelve un objeto `Feed` con los posts parseados

### Implementación del Requester
El `httpRequester` lo definimos con un método por tipo de feed a parsear. 
- `getFeedRss` el cual dado un url hace un request a la página y devuelve el xml para ser parseado.
- `getFeedReddit` el cual tambien toma un url y devuelve una String del JSON que se parsea. Este requester fue mas dificl de implementar pues Reddit nos tiraba mensajes de error por cuestiones de seguridad.

### Entidades nombradas
Este modulo fue el mas complicado puesto que la consigna no estaba del todo clara; Puesto que estuvimos mucho tiempo sin saber bien que rumbo tomar. Iniciamos primero con definir la variable que usariamos para representar la Heuristica en `FeedReaderMain.java` de esta forma:`Heuristic heuristic = new QuickHeuristic();` De esta manera podemos cambiar rapidamente el tipo de heuristica a usar sin tener que hacer grandes cambios en el codigo.

Luego definimos las jerarquias de clases e interfaces pedidas en el enunciado. En el directorio `namedEntity` estan definidas las jerarquias de clases. Y en el directorio `temaInter` estan definidas las jerarquias de interfaces.

Una vez hecho esto, en la clase `NamedEntity` agregamos un campo `String tema`. Para que cada entidad nombrada ademas de categoria tenga tema. 

A raiz de lo anterior, implementamos dos metodos para asignar tema y categoria a cada entidad, las cuales se encuentran en `Article.java` y son:
`public void matchCategory(Heuristic h)` y `public void matchTheme(Heuristic h)`. El primer metodo accede al diccionario de Categorias que venia definido en el esqueleto en `Heuristic.java`, asigna una categoria a la entidad e inicializa un objeto en funcion de su categoria. Nos limitamos a definir solo objetos que salian en el diccionario a modo de ejemplo. En el segundo metodo accede a un diccionario creado por nosotros debajo del definido originalmente y asigna un tema a la entidad. Luego inicializa objetos que tienen definida la categoria y tema simulando una herencia multiple. Hicimos un par de ejemplos en el directorio `multiple`. Modificamos tambien los diccionarios para que los ejemplos se den bien. 

En algunos casos implementamos herencia cuando vimos que algunos atributos se repetian en la jerarquia de clases.
