var arreglo = [

  {

nombre : "Bryan",
edad : 20,

  },
  {

    nombre : "Paul",
    edad : 23,
    
      },
      {

        nombre : "Kevin",
        edad : 24,
        
          }

];

var buscarUsuario= (arreglo, usuarioABuscar, apellido, edad) => {

var usuarioEncontrado = arreglo.find((usuario) => {

  return usuario.nombre === usuarioABuscar;
})


if (usuarioEncontrado == null) {

  AgregarUsuario(usuarioABuscar, apellido, edad);
  
} else {

  console.log(usuarioEncontrado);
  
}

}

var AgregarUsuario = (nombre, apellido, edad) => {


 arreglo.push({nombre, apellido, edad});

  console.log("Usuario Agregado");
  console.log(arreglo);


}

var EliminarUsuario = (nombre) => {

 var i = arreglo.indexOf(nombre);

 console.log(i)

var nuevoArreglo =[ arreglo.slice(0, i-1) , arreglo.slice(i+1, arreglo.length)];

console.log(nuevoArreglo);

}

console.log(AgregarUsuario("Jose", "Obando", 20));
console.log(buscarUsuario(arreglo, "Kevin", "Melo", 30));
console.log(EliminarUsuario("Bryan"));


