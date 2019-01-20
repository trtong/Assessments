## Part 4 - Exception Handling 

## Section 1
In this section, you will parse a CSV file. A CSV is a file that contains values separated by commas. Each row is a set of data. You will parse this file and map each row to a user. Here are the methods you need to implements:

1. `parseRow(String row)` - Given a string, representing a row in a 
csv file, parse the string, and create a user using those fields. 
    1. The fields are separated by commas. 
    2. The fields are id, first name, last name, and email. It is always in that order.
    3. Sometimes the data is bad. In this case, throw BadDataException. Example of bad data: 
        1. The first field is not a number
        2. There is no data for the first field
        3. There is not enough data in the row (e.g. missing email)
2. `parseCSV(String csv)` -  Given a string, representing the whole 
CSV file, parse the String, and create users based on the data in the row. 
    1. Each row is separated by a new line `\n`. 
    2. The first row is the header. Ignore this row.
    3. If the row has bad data (e.g. no id), ignore this row.
    4. If a BadDataException is thrown while you're parsing, catch this exception and log it with a warning. Your message should say `"Unable to parse " + row` where row is the line you're trying to parse
3. `parseFile(String filePath)` - Given a path of a file, read the content of the file, and call `parseCSV` to parse the content.
    1. If there is an error reading the file, throw the exception. 
