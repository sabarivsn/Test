$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Check the poc",
  "description": "",
  "id": "check-the-poc",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check poc is working",
  "description": "",
  "id": "check-the-poc;check-poc-is-working",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I do this",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "it should be like this",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_do_this()"
});
formatter.result({
  "duration": 682311858,
  "status": "passed"
});
formatter.match({
  "location": "steps.it_should_be_like_this()"
});
formatter.result({
  "duration": 58667,
  "status": "passed"
});
});