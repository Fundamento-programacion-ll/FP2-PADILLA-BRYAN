var arreglo = [1,2,3,4,5];
var PalabraString =  "Bryan";


//var arregloPalabra = PalabraString.split("");
//var arregloDivido = arreglo.slice(2, 5);



//console.log(arregloDivido);

//arreglo.splice(0,1);

//console.log(arreglo);

//console.log(arregloPalabra.reverse());

//arreglo.push(6);
//arreglo.pop();

//for (let i = 0; i < arreglo.length; i++) {
   
  // console.log(arreglo[i]);
   
//}

//arreglo.forEach ((elemento, indice) => {

//console.log(elemento);

//})

/*var arregloMutado = arreglo.map((elemento, indice) => {
return elemento+" Hola";
});

console.log(arregloMutado); */

var Arreglojsons = [

   json1 = {Nombre : "Bryan",
       Edad : 20},
   json2 = {Nombre : "Paul",
   Edad : 22},
   json3 = {Nombre : "Luis",
   Edad : 24},
   json4 = {Nombre : "Esteban",
   Edad : 23},
   json5 = {Nombre : "Wendy",
   Edad : 19}

] 

var numeros = 0;

Arreglojsons.forEach((ele, indice) => {

    numeros += ele.Edad;

});


console.log(numeros);


