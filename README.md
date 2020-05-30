# Spring - AsyncEl proyecto es desarrollado con el fin de aprender a utilizar las tareas asíncronas con la anotación `@Async` la cual permitela ejeción de tareas en paralelo y permitiendo aprovechas los recursos de nuestras computadoras.## Requisitos Iniciales 🛠️* JAVA >= 1.8* MAVEN* Spring Framework 5* STS* Lombok## Descripción de la práctica ⚙️* Se procedió a crear dos clases que nos permiten reprentar opereciones que se ejecutarán de manera simultánea, una operación consiste enañadir en una lista una serie de números y en la otra clase se procedió a llenar una lista con letras.* Posteriormente se procedió a crear un método en cada clase que permite realizar la impresión en el log de la consola, los datos almacenadosen la lista, dichos métodos, fueron decorados con la anotación `@Async`, misma que permite realizar la práctica que queremos.* Para comprobar que la tarea fue un éxito, se procedió a realizar un test que nos permitió ver que sí se están ejecutando las tareas de manerasimultanea y permitiendo saber en qué hilo de ejecución se está implementando.📌 **NOTA**: *Hay que tener presente que antes de proceder a utiliar la anotación `@Async`, es necesario que en la claase de configuración habilites la utilización de tareas asíncronas.*