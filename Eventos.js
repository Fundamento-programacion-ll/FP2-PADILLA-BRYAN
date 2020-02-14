const EventEmitter = require("events");

class evento1 extends EventEmitter{
}

var instanciaEvento1 = new evento1();

instanciaEvento1.on("Saludar", respuesta => {

  console.log(`Hola V: ${respuesta} jajajaja     jajajaja`);
 
});

instanciaEvento1.emit("Saludar", "Bryan");

