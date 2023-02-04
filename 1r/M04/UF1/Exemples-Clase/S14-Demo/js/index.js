// Obtenir l'idioma de la URL si existeix i executar la funció "changeLanguage"
const querystring = window.location.search; // Si la url és: https://miweb.es?lang=es , retorna ?lang=es
const urlParams = new URLSearchParams(querystring);
if (urlParams.get('lang')){
  const lang = urlParams.get('lang');
  changeLanguage(lang);
}

async function changeLanguage(lang) {
  // Guardar l'idioma a la URL
  const newURL = window.location.protocol + '//' + window.location.host + window.location.pathname + '?lang=' + lang;
  window.history.replaceState({}, '', newURL);

  // Obtenir el fitxer json corresponent
  const response = await fetch(`./i18n/${lang}.json`);
  const data = await response.json();

  // Canviar els texts (Aquesta és la part que heu de modificar)
  document.getElementById('t_first_name').innerHTML = data.firstname.text;
  document.getElementById('first-name').placeholder = data.firstname.placeholder;
  document.getElementById('t_last_name').innerHTML = data.lastname.text;
  document.getElementById('last-name').placeholder = data.lastname.placeholder;
  document.getElementById('t_email').innerHTML = data.t_email;
  document.getElementById('t_password').innerHTML = data.t_password;
  document.getElementById('t_welcome_message').innerHTML = data.t_welcome_message;
  document.getElementById('t_age').innerHTML = data.t_age;
  document.getElementById('t_birthday').innerHTML = data.t_birthday;
  document.getElementById('t_gender').innerHTML = data.t_gender;
  document.getElementById('t_male').innerHTML = data.t_male;
  document.getElementById('t_female').innerHTML = data.t_female;
  document.getElementById('t_interests').innerHTML = data.t_interests;
  document.getElementById('t_cars').innerHTML = data.t_cars;
  document.getElementById('t_city').innerHTML = data.t_city;
  document.getElementById('t_register').innerHTML = data.t_register;
}