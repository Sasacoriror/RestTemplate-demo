async function CallAPI(){
    const response = await fetch("http://localhost:8080/api/v1/Person");

    const data = await response.json();
    const dropdownMenu = document.getElementById("dropdownMenu");

    data.forEach(person => {
        const listItem = document.createElement("li");
        listItem.innerHTML = `<a class="dropdown-item" href="#">${person.name}</a>`;
        dropdownMenu.appendChild(listItem);
    });

}
//document.addEventListener("DOMContentLoaded", APIcall);