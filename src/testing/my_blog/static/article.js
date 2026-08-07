(function () {
  var params = new URLSearchParams(window.location.search);
  var first = params.values().next();
  var wanted = first.done ? null : first.value;

  var records = document.querySelectorAll("#article-data .article-record");
  var match = null;
  for (var i = 0; i < records.length; i++) {
    if (wanted === null || records[i].dataset.code === wanted) { match = records[i]; break; }
  }
  if (!match) { return; }

  document.getElementById("detail-title").textContent = match.dataset.title;
  document.getElementById("detail-meta").textContent =
      "by " + match.dataset.author + " - " + match.dataset.views + " views";
  document.getElementById("detail-body").textContent = match.dataset.body;
})();
