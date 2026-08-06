/*
 * Picks the record this page should show.
 *
 * The generator emitted every product once, as data-* attributes on hidden
 * .product-record elements, and the link that led here carries the id in the
 * query string. Nothing is fetched: the data is already in the page.
 */
(function () {
  "use strict";

  function selectedId() {
    var params = new URLSearchParams(window.location.search);
    // Use whichever URL parameter the route declared, without naming it here.
    var first = params.values().next();
    return first.done ? null : first.value;
  }

  function findRecord(id) {
    var records = document.querySelectorAll("#product-data .product-record");
    if (records.length === 0) {
      return null;
    }
    for (var i = 0; i < records.length; i++) {
      if (records[i].dataset.id === id) {
        return records[i];
      }
    }
    return records[0]; // no id given, or an unknown one: show the first product
  }

  function fill(record) {
    var data = record.dataset;

    var image = document.getElementById("detail-image");
    image.src = data.image;
    image.alt = data.name;

    document.getElementById("detail-name").textContent = data.name;
    document.getElementById("detail-price").textContent = "$" + data.price;
    document.getElementById("detail-description").textContent = data.description;
    document.title = data.name;

    var form = document.getElementById("delete-form");
    if (form) {
      form.dataset.productId = data.id;
    }
  }

  function show() {
    var record = findRecord(selectedId());
    if (record) {
      fill(record);
    } else {
      document.getElementById("detail-name").textContent = "Product not found";
    }
  }

  if (document.readyState === "loading") {
    document.addEventListener("DOMContentLoaded", show);
  } else {
    show();
  }
})();
