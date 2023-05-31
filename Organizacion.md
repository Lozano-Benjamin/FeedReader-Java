
## 3-05-2023
### Analisís de código y División de las tareas
Divimos las tareas de la siguiente manera
- General parser: entre varios
- Parser json: a definir
- http request: a definir
- parser xml: a definir
- heuristica, 3: no se
  
## 10-05-2023
Gastón:
Para compilar podes hacer desde la carpeta src
```
javac FeedReader.java
```
desde la terminal

### Ideas para el general parser
Atributos:
- archivo a parsear

Metodos:
- parser

## 11-05-2023
Gastón:
Ahí estuve renegando como compilar con un Makefile. Para compilar hay que 
pararse desde la carpeta root del proyecto y hacer `make` desde la terminal.  
Para probar que compile hice un código básico en el susbcriptionParser y unos cambios al main  
Además, agregué cosas al .gitignore.

### Ideas para el parse
- parse toma el subscriptions
- va creando suscripciones individuales
- las va agregar a subscriptions

_FALTA: ver que se pasen bien los paraemtros_

Facu: (esto no lo escribe facu pero se lo escribo yo porque se colgó)
  - Resolvió el problema de parametros cambiando el SingleSubscription

Gastón y Benja:
- Eliminamos la definición abstracta de parse en general parser

Gastón:
- Hice un main, cuando las cosas se vayan completando este deberia ir andando
- ahi mejoré el main

Gastón 22:32:
Soy el único que completa esto xd
Ahí arranque con el informe

### entiddades nombradas
ahi agregue tema a todo, incluyendo en article.java para redefinir el compute bla bla

### Reddit parser
ahi ta todo lo de reddi, god