const menu = document.querySelector('#mobile');
const menulinks=document.querySelector('.navmenu');
menu.addEventListener('click',function(){
menu.classList.toggle('is-active');
menulinks.classList.toggle('active');
});