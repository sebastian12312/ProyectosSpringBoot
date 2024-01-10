function aceptar() {
    // Obtener todos los elementos con la clase "nombre-agregar"
    var elementos = document.querySelectorAll(".nombre-agregar");

    // Iterar sobre la lista de elementos y asignar el valor "hola" a cada uno
    elementos.forEach(function(elemento) {
        elemento.value = "hola";
    });
}
