package com.zipcodewilmington.assessment2.part5;

public class SqlCommands {

    /**
     * EXAMPLE:
     *
     * Select all the record from a table
     * @param tableName table to retrieve the records
     * @return SQL statement to select all the records
     */
    public String selectAll(String tableName){
        String sqlStatement = "select * from " + tableName;
        return sqlStatement;
    }

    /**
     * Select all the data for a given column
     * @param tableName table to retrieve the records
     * @param column column to select
     * @return SQL statement to get the column data
     */
    public String selectColumn(String tableName, String column) {

      String sqlStatement = "select " + column + " from " + tableName;
      return sqlStatement;
    }

    /**
     * Select all the records whose column is the given value
     * @param tableName table to retrieve the records
     * @param column what to filter
     * @param value value to filter by
     * @return SQL statement to filter the data
     */
    public String selectWhere(String tableName, String column, String value) {
      String sqlStatement = "SELECT *" + " FROM " + tableName + " WHERE " + column + " = " + value;
        System.out.println(sqlStatement);
      return sqlStatement;

    }

    /**
     * Select all the records, order the records by the column given in descending order
     * @param tableName table to retrieve the records
     * @param columnToSort
     * @return SQL statement to select all the sorted records
     */
    public String selectInDescendingOrder(String tableName, String columnToSort) {
      String sqlStatement = "Select * from " + tableName + "order by " + columnToSort + "desc";
      return sqlStatement;
    }

    /**
     * Count how many record is in the table.
     * @param tableName table to retrieve the records
     * @return SQL statement to count the record
     */
    public String count(String tableName) {
      String sqlStatement = "Select Count(*) from " + tableName;
      return sqlStatement;
    }

    /**
     * Count how many record is in the table whose column is the given value
     * @param tableName table to retrieve the records
     * @param column what to filter
     * @param value value to filter by
     * @return SQL statement to count the record
     */
    public String countWhere(String tableName, String column, String value) {
      String sqlStatement = "Select count(*) from " + tableName + "where " + column + " = " + value;
      return sqlStatement;
    }

}
