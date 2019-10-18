$(document).ready(() => {
  $(".table .eBtn").on("click", function(event){
    event.preventDefault();
      var href = $(this).attr('href');

   
  //  console.log(href);

    $.get(href, (country, status) => {
      console.log(country.id);
      $(".myForm #id").val(country.id);
      $(".myForm #name").val(country.name);
      $(".myForm #capital").val(country.capital);
    });

    $(".myForm #exampleModal").modal();
  });
});
