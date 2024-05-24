let anterior = document.getElementById("anterior");
let siguiente = document.getElementById("siguiente");
let img = [
  "img/alan1.jpg",
  "img/alan2.jpeg",
  "img/alan3.jpg",
  "img/alan4.jpg",
  "img/alan5.jpeg",
];

function mostrar(indice) {
  let contenedor = document.querySelector(".carousel-slide");

  while (contenedor.firstChild) {
    contenedor.removeChild(contenedor.firstChild);
  }

  let img1 = document.createElement("img");
  img1.src = img[indice];
  img1.alt = "Autos deportivos";
  contenedor.appendChild(img1);
}

let contador = 0;

siguiente.addEventListener("click", () => {
  if (contador >= img.length - 1) return;
  contador++;
  mostrar(contador);
});

anterior.addEventListener("click", () => {
  if (contador <= 0) return;
  contador--;
  mostrar(contador);
});

mostrar(contador);
