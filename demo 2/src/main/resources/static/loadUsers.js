async function loadUsers(){
    let response =  await fetch('./users.json');
    console.log(response);
    let users = response.json();
    console.log(users.users);

    return users;

}