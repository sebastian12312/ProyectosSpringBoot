const editUsuario = document.querySelectorAll('.valorEdit');
var tipo_documento = document.getElementById("tipo_documento");
var numero_documento = document.getElementById("numero_documento");
var nombre = document.getElementById("nombre");
var apellido = document.getElementById("apellido");
var telefono = document.getElementById("telefono");
var correo_personal = document.getElementById("correo_personal");
var contraseña = document.getElementById("contraseña");
var fecha_nacimiento = document.getElementById("fecha_nacimiento");
var id_dependencia = document.getElementById("id_dependencia");
var id_rol = document.getElementById("id_rol");
var estado_usuario = document.getElementById("estado_usuario");
// Función para abrir el modal
function abrirModal() {
    const modal = new bootstrap.Modal(document.getElementById('editarUsuario'));
    modal.show();
}
editUsuario.forEach((elemento) => {
    elemento.addEventListener("click", async (e) => {
        elemento.setAttribute("data-bs-toggle", "modal");
        elemento.setAttribute("data-bs-target", "#editarUsuario");
        const respuestaCodigo = elemento.getAttribute("value");
        const respuesta = await fetch('/API/buscar/' + respuestaCodigo, {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
        });
        const usuario = await respuesta.json();
        tipo_documento.value = usuario.tipo_documento;
        numero_documento.value = usuario.numero_documento;
        nombre.value = usuario.nombre;
        apellido.value = usuario.apellido;
        telefono.value = usuario.telefono;
        correo_personal.value = usuario.correo_personal;
        contraseña.value = usuario.contraseña;
        fecha_nacimiento.value = formatoFecha(usuario.fecha_nacimiento);
        id_dependencia.value = usuario.id_dependencia;
        id_rol.value = usuario.id_rol;
        estado_usuario.value = usuario.estado_usuario;
        abrirModal();
    });
});
function formatoFecha(fecha) {
    const fechaDate = new Date(fecha);
    const dia = fechaDate.getDate().toString().padStart(2, '0');
    const mes = (fechaDate.getMonth() + 1).toString().padStart(2, '0'); // Los meses son de 0 a 11
    const año = fechaDate.getFullYear();

    return {
        year: año,
        month: mes,
        day: dia
    };
}


var tiposDocumentos = document.querySelectorAll(".tipo_documento");

async function cargarOpciones(selectElement) {
    const respuestaDoc = await fetch('/API/tipodocumento', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
        const tiposDocs = await respuestaDoc.json();

        // Limpiar el contenido actual del select
        selectElement.innerHTML = "";

        // Agregar una opción predeterminada
        const optionDefault = document.createElement("option");
        optionDefault.value = ""; // Valor vacío
        optionDefault.text = "selecciona...";
        selectElement.appendChild(optionDefault);

        // Agregar opciones basadas en la respuesta AJAX
        tiposDocs.forEach(function(documento) {
            const option = document.createElement("option");
            option.value = documento.tipo_documento; // Establece el valor adecuado
            option.text = documento.nombre; // Establece el nombre del documento
            selectElement.appendChild(option);
        });
}

// Llamar a la función cargarOpciones para cada elemento select
tiposDocumentos.forEach(function(selectElement) {
    cargarOpciones(selectElement);
});
