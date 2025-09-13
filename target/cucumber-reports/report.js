$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EmployeeCRUD.feature");
formatter.feature({
  "line": 1,
  "name": "Employee CRUD and Search Operations",
  "description": "",
  "id": "employee-crud-and-search-operations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I am able to add edit and search and delete the  employee",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@executeallfromJenkins"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Add employee with  first name as \"\u003cfName\u003e\" and mname as \"\u003cmName\u003e\" and lName as \"\u003cLname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  verify employeeAdded in list with  first name as \"\u003cfName\u003e\" and mname as \"\u003cmName\u003e\" and lName as \"\u003cLname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Edit button and update below values and save the Data",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "updatedmName",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "updatedLname",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I search the employee and ensure that it is searched using below values",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "AutUserFname1"
      ],
      "line": 13
    },
    {
      "cells": [
        "updatedmName",
        "AutUserMname1"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select and Delete the Updated Employee and verify employee is not  in search result",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;",
  "rows": [
    {
      "cells": [
        "fName",
        "mName",
        "Lname"
      ],
      "line": 18,
      "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;1"
    },
    {
      "cells": [
        "AutUserFname",
        "AutUserMname",
        "AutUserLname"
      ],
      "line": 19,
      "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "I am able to add edit and search and delete the  employee",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@executeallfromJenkins"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Add employee with  first name as \"AutUserFname\" and mname as \"AutUserMname\" and lName as \"AutUserLname\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  verify employeeAdded in list with  first name as \"AutUserFname\" and mname as \"AutUserMname\" and lName as \"AutUserLname\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Edit button and update below values and save the Data",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "updatedmName",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "updatedLname",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I search the employee and ensure that it is searched using below values",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "AutUserFname1"
      ],
      "line": 13
    },
    {
      "cells": [
        "updatedmName",
        "AutUserMname1"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select and Delete the Updated Employee and verify employee is not  in search result",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeCRUD.navigate_to_PIM_after_log_in_with_Admin_user()"
});
formatter.result({
  "duration": 116053201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutUserFname",
      "offset": 36
    },
    {
      "val": "AutUserMname",
      "offset": 64
    },
    {
      "val": "AutUserLname",
      "offset": 92
    }
  ],
  "location": "EmployeeCRUD.i_Add_employee_with_first_name_as_and_mname_as_and_lName_as(String,String,String)"
});
formatter.result({
  "duration": 3611100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutUserFname",
      "offset": 53
    },
    {
      "val": "AutUserMname",
      "offset": 81
    },
    {
      "val": "AutUserLname",
      "offset": 109
    }
  ],
  "location": "EmployeeCRUD.i_verify_employeeAdded_in_list_with_first_name_as_and_mname_as_and_lName_as(String,String,String)"
});
formatter.result({
  "duration": 233600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUD.i_click_on_Edit_button_and_update_below_values_and_save_the_Data(DataTable)"
});
formatter.result({
  "duration": 1527500,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUD.i_search_the_employee_and_ensure_that_it_is_searched_using_below_values(DataTable)"
});
formatter.result({
  "duration": 106700,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUD.i_select_and_Delete_the_Updated_Employee_and_verify_employee_is_not_in_search_result()"
});
formatter.result({
  "duration": 57301,
  "status": "passed"
});
});