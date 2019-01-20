package com.zipcodewilmington.assessment2.part5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqlTest {
    private SqlCommands commands;

    @Before
    public void test(){
        commands = new SqlCommands();
    }


    @Test
    public void testSelectAll() {
        String tableName = "Customers";

        String actual = commands.selectAll(tableName);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 1535198205;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectColumn() {
        String tableName = "Customers";
        String column = "Country";

        String actual = commands.selectColumn(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -260149487;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectColumn_forId() {
        String tableName = "Orders";
        String column = "OrderID";

        String actual = commands.selectColumn(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1878188228;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectWhereForCity() {
        String tableName = "Customers";
        String column = "City";
        String value = "Berlin";

        String actual = commands.selectWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 1966699786;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectWhereForOrderCustomerID() {
        String tableName = "Orders";
        String column = "CustomerID";
        String value = "3";

        String actual = commands.selectWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 1384815257;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectInDescendingOrder() {
        String tableName = "Customers";
        String column = "City";

        String actual = commands.selectInDescendingOrder(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 2103349252;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectInDescendingOrder_forOrder() {
        String tableName = "Orders";
        String column = "OrderDate";

        String actual = commands.selectInDescendingOrder(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 2112448581;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCount() {
        String tableName = "Customers";

        String actual = commands.count(tableName);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1098083244;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCount_forOrders() {
        String tableName = "Orders";

        String actual = commands.count(tableName);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 1456300870;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCountWhere() {
        String tableName = "Customers";
        String column = "Country";
        String value = "Germany";

        String actual = commands.countWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 1373829369;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCountWhere_forOrders() {
        String tableName = "Orders";
        String column = "ShipperID";
        String value = "1";

        String actual = commands.countWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -827485489;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    private int getHashCode(String actual) {
        String regex = "[\\s\'\"();]";
        return actual.replaceAll(regex, "").toLowerCase().hashCode();
    }
}
