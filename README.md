<img width="452" height="170" alt="image" src="https://github.com/user-attachments/assets/06927070-ac92-4f37-acc1-7a3e71b0a7f0" />

El Sistema de Notificaciones Omnicanal

 Descripción
Este proyecto consiste en un sistema en Java que permite enviar notificaciones a través de diferentes canales, como correo electrónico, SMS y notificaciones push. El gestor de alertas utiliza una interfaz común para enviar mensajes sin depender de un canal específico.

Clases
- **CanalNotificacion:** interfaz que define el método `enviar(String destinatario, String mensaje)`, encargado de establecer la operación común de envío.
- **NotificadorEmail:** simula el envío de mensajes por correo electrónico.
- **NotificadorSMS:** simula el envío de mensajes mediante SMS.
- **NotificadorPush:** simula el envío de notificaciones push a un dispositivo.
- **GestorAlertas:** contiene una lista de canales y permite enviar notificaciones a través de uno o varios de ellos.

Funcionamiento
En el `main` se crea un gestor de alertas y se agregan los diferentes canales de notificación. Luego, se simula el envío de una alerta corporativa, que puede difundirse por todos los canales o enviarse mediante uno específico. Finalmente, se muestra por consola el resultado de cada envío.

Recorrido del mensaje
1. El programa crea los notificadores de correo electrónico, SMS y notificaciones push.
2. Se agregan los canales al gestor de alertas.
3. El gestor recibe el mensaje que se desea enviar y el destinatario correspondiente.
4. Se selecciona un canal específico o se inicia una difusión masiva.
5. El gestor invoca el método `enviar()` de cada canal seleccionado.
6. Cada notificador procesa el mensaje según su propio funcionamiento.
7. Finalmente, se muestran por consola los canales utilizados y los resultados de los envíos.

 Validaciones
El sistema debe comprobar que el destinatario y el mensaje no estén vacíos. Además, cada canal puede aplicar sus propias validaciones antes de simular el envío de la notificación.

Objetivo
Practicar el uso de interfaces, la abstracción, el polimorfismo y las colecciones, permitiendo incorporar nuevos canales de notificación sin modificar la lógica principal del gestor.
