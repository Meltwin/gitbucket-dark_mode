let css_link = document.createElement("link");
css_link.setAttribute('rel', 'stylesheet');
css_link.setAttribute('type', 'text/css');
css_link.setAttribute('href', `${base_path}/plugin-assets/darkbucket/dark-mode.css`);

document.head.appendChild(css_link);

document.getElementsByClassName("logo-mini")[0].children[0].src = `${base_path}/plugin-assets/darkbucket/logo.png`;
let lg_elems = document.getElementsByClassName("logo-lg")[0].children;
for (let i = 0; i < lg_elems.length; i++) {
  if (lg_elems[i].localName == "img") {
    lg_elems[i].src = `${base_path}/plugin-assets/darkbucket/logo.png`;
  }
  else if (lg_elems[i].localName == "span") {
    lg_elems[i].innerHTML = "InnoVault";
  }
}
