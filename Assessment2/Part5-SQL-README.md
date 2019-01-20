## Part5 SQL

Given this table in the database, write the command to execute on the table.
You can test out your code on [w3school](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_join)

NOTE:
1. If you tested your code on w3school and it works, but the test doesn't pass, THAT IS OK! Send Nhu a slack message with your code.

### The tables
Imagine if this Customers table exists in the database

|CustomerID	|CustomerName|ContactName|Address| City	| PostalCode| Country|
|-----------|------------|-----------|-------|------|-----------|---------|
|1|Alfreds Futterkiste|Maria Anders|Obere Str. 57|Berlin|12209|Germany|
|2|Ana Trujillo|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312 |México D.F.|05023|Mexico|

And an Orders table

|OrderID | CustomerID | EmployeeID | OrderDate | ShipperID |
|--------|------------|------------|-----------|-----------|
|10248 | 1 |5 | 1996-07-04 | 3 |
|10249 | 1 |6 | 1996-07-05 | 1 |
|10250 | 2 |4 | 1996-07-08 | 2 |
|10251 | 3 |3 | 1996-07-08 | 1 |

Implement the following methods in `src/main/java/com/zipcodewilmington/part5/SqlCommands`.

1. `selectColumn` - Given a table name and a column, return all the data from that column.
For example, given the above table, `selectColumn("Customers", "PostalCode)` will return 12209, 05021,  05023.
2. `selectInDescendingOrder` - Given a table name and a column, return EVERYTHING from the table with the data sorted by the column in descending order.
For example, given the table above `selectInDescendingOrder("Customers", "PostalCode")` will return:

|CustomerID	|CustomerName|ContactName|Address| City	| PostalCode| Country|
|-----------|------------|-----------|-------|------|-----------|---------|
|2|Ana Trujillo|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312 |México D.F.|05023|Mexico|
|1|Alfreds Futterkiste|Maria Anders|Obere Str. 57|Berlin|12209|Germany|

3. `count` - Given a table name, count how many entries it has. For example, the Customer table above has 3 entries. But the Customers table on [w3school](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_join) has 91 entries. User * for the count.
3. `countWhere` - Given a table name, a column, and a value, count how many entries the table has which matches the value. For example, calling `countWhere("Customers", "Country", "Mexico")` on the Customer table above will return `2`. But the Customers table on [w3school](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_join) will return 5. Use * for the count.
4. `selectWhere` - Given a table name, a column, and a value, return EVERYTHING from the table which information matches the given value.
For example, `selectWhere("Customers", "CustomerID", "2")` will return the customer information with the id 2.
Calling `selectWhere("Customers", "Country", "Mexico")` will return customers from Mexico

|CustomerID	|CustomerName|ContactName|Address| City	| PostalCode| Country|
|-----------|------------|-----------|-------|------|-----------|---------|
|2|Ana Trujillo|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312 |México D.F.|05023|Mexico|
