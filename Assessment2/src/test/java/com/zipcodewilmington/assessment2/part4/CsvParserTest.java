package com.zipcodewilmington.assessment2.part4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class CsvParserTest {

    private CsvParser parser;

    @Before
    public void setup(){
        parser = new CsvParser();
    }

    @Test
    public void testParseRow_withGoodData() throws BadDataException {
        String row = "1, Ada, Lovelace, ada@firstprogrammer.com\n";

        User user = parser.parseRow(row);

        Assert.assertEquals(1, user.getId());
        Assert.assertEquals("Ada", user.getFirstName());
        Assert.assertEquals("Lovelace", user.getLastName());
        Assert.assertEquals("ada@firstprogrammer.com", user.getEmail());
    }

    @Test
    public void testParseRow_withNoSpace() throws BadDataException {
        String row = "1,Ada,Lovelace,ada@firstprogrammer.com\n";

        User user = parser.parseRow(row);

        Assert.assertEquals(1, user.getId());
        Assert.assertEquals("Ada", user.getFirstName());
        Assert.assertEquals("Lovelace", user.getLastName());
        Assert.assertEquals("ada@firstprogrammer.com", user.getEmail());
    }

    @Test(expected = BadDataException.class)
    public void testParseRow_withBadId() throws BadDataException {
        String row = "a, Ada, Lovelace, ada@firstprogrammer.com\n";

        User user = parser.parseRow(row);
    }

    @Test(expected = BadDataException.class)
    public void testParseRow_withNoId() throws BadDataException {
        String row = ", Ada, Lovelace, ada@firstprogrammer.com\n";

        User user = parser.parseRow(row);
    }

    @Test(expected = BadDataException.class)
    public void testParseRow_withNoEmail() throws BadDataException {
        String row = "a, Ada, Lovelace\n";

        User user = parser.parseRow(row);
    }


    @Test
    public void testParse_withOneRow(){
        String csv = "id, first name, last name, email\n"
                    + "1, Ada, Lovelace, ada@firstprogrammer.com\n";

        List<User> users = parser.parseCsvString(csv);

        Assert.assertEquals(1, users.size());

        User user = users.get(0);
        Assert.assertEquals(1, user.getId());
        Assert.assertEquals("Ada", user.getFirstName());
        Assert.assertEquals("Lovelace", user.getLastName());
        Assert.assertEquals("ada@firstprogrammer.com", user.getEmail());
    }

    @Test
    public void testParse_withMultipleRows(){
        String csv = "id, first name, last name, email\n"
                + "1, Ada, Lovelace, ada@firstprogrammer.com\n"
                + "2, Grace, Hopper, compiler@developer.com\n";

        List<User> users = parser.parseCsvString(csv);

        Assert.assertEquals(2, users.size());

        User user = users.get(1);
        Assert.assertEquals(2, user.getId());
        Assert.assertEquals("Grace", user.getFirstName());
        Assert.assertEquals("Hopper", user.getLastName());
        Assert.assertEquals("compiler@developer.com", user.getEmail());
    }

    @Test
    public void testParse_withBadRow(){
        String csv = "id, first name, last name, email\n"
                + ", Ada, Lovelace\n"
                + "39, Barbara, Liskov, first@womandoctorate.com\n";

        List<User> users = parser.parseCsvString(csv);

        Assert.assertEquals(1, users.size());

        User user = users.get(0);
        Assert.assertEquals(39, user.getId());
        Assert.assertEquals("Barbara", user.getFirstName());
        Assert.assertEquals("Liskov", user.getLastName());
        Assert.assertEquals("first@womandoctorate.com", user.getEmail());
    }

    @Test
    public void testParseFile() throws IOException {
        String filePath = "./src/main/resources/users.csv";

        List<User> users = parser.parseFile(filePath);

        Assert.assertEquals(10, users.size());
        Assert.assertEquals("Sudha", users.get(5).getFirstName());
        Assert.assertEquals("ward@cs.com", users.get(9).getEmail());
    }

    @Test(expected = IOException.class)
    public void testParseFile_withBadFile() throws IOException {
        String filePath = "doesnotexist.csv";

        List<User> users = parser.parseFile(filePath);
    }
}
