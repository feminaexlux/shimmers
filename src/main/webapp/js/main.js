/**
 * Created by lani on 5/10/17.
 */
(function () {
  var drawer = new mdc.drawer.MDCTemporaryDrawer(document.querySelector('.mdc-temporary-drawer'));
  document.querySelector('header button').addEventListener('click', function () {
    drawer.open = true;
  });
})();
