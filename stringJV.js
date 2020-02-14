//var nombre = "Bryan Flores";
//console.log(nombre.length);

//var cont = nombre.length;

//var n = nombre.charAt(2);

//console.log(n);

//var reves = "";

//for (var i = 0; i <= nombre.length; i++) {
   
  // reves = reves + nombre.charAt(nombre.length - i)   
   
//}

//var nombre2 = "";

//console.log(reves);
//console.log(nombre.split(" "));

//var arreglo = nombre.split("");

//for (var i = 0; i < nombre.length; i++) {
   
//nombre2 =  nombre2+ arreglo[i] + "," 
   
//}

//console.log(nombre2);








/*
Primera palabra mayuscula, inicio mitad final
contar cuantos ; o , o .
espacion con *-*
*/

var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'


var arregloNoticia = noticia.split(" ");

arregloNoticia[0] = arregloNoticia[0].toLocaleUpperCase();

var mitad1 = (arregloNoticia.length / 2)-0.5;
var mitad2 = (arregloNoticia.length / 2)+0.5;

arregloNoticia[mitad1] = arregloNoticia[mitad1].toLocaleUpperCase(); 
arregloNoticia[mitad2] = arregloNoticia[mitad2].toLocaleUpperCase(); 

var final = arregloNoticia.length;

arregloNoticia[final-1] = arregloNoticia[final-1].toLocaleUpperCase(); 

var puntos = noticia.split(".");
var comas = noticia.split(",");

var contarPuntos = puntos.length - 1; 
var contarComas = comas.length - 1;

var noticiaCompleta = "";

for (var i = 0; i < arregloNoticia.length; i++) {
   
 noticiaCompleta =  noticiaCompleta + arregloNoticia[i] + "*-*" ;
   
}

console.log(noticiaCompleta);
console.log("Total de Puntos: "+contarPuntos);
console.log("Total de Comas: "+contarComas);