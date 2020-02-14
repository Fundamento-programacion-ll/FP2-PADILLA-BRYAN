var json = {

nombre : "Bryan",
edad : 24,
casado: false,
mascota:['Cachetes','Pelo'],

colegio:{

NombreColegio: "Mejia",
telefono: 5112608

}

};

console.log(json.nombre);
console.log(json["mascota"]);
console.log(json.colegio.NombreColegio)

var arreglo = [1 , "Oveja" , true , { sexo : "M" }]

console.log(arreglo)

var jsonB = {

    Nombre : "Bryan",
    Apellido : "Flores",
    Edad : 20,
    Sexo : "3 Veces al Día",
    Casado : "Gracias a Dios NO",
    Sector : "Comité del Pueblo"

}

console.log(json+jsonB);

console.log(typeof json.nombre);

var numero = 1;

console.log(json + numero);
console.log(true + numero);
console.log(undefined + numero);
console.log(undefined + "numero");
console.log(undefined + false);

var miFuncion = function () {

    console.log("Funcion 1");

    return "a";
};

//miFuncion();
console.log(miFuncion());

var miFuncion2 = (n1,n2) => {

    return n1+n2;

};

console.log(miFuncion2(1,1));

var jsonFunciones = {

      suma : () => {

        return 1+2;

     },
     resta : () => {

        return 3-6;

     },
     multi : () => {

        return 5*8;

     },
     div : () => {

        return 0/0;

     }

};

console.log(jsonFunciones.suma());
console.log(jsonFunciones.resta());
console.log(jsonFunciones.multi());
console.log(jsonFunciones.div());