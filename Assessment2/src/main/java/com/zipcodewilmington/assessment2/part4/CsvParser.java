package com.zipcodewilmington.assessment2.part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class CsvParser {
    private static final Logger LOGGER = Logger.getLogger(CsvParser.class.getName());

    /**
     * Given a string with fields separated by commas.
     * The fields are id, first name, last name, and email.
     * Parse the string and create a user using those fields.
     *
     * @param row String with fields separated by commas
     * @return User with data from the string
     * @throws BadDataException when the first field is not an integer
     *                          or when there are missing fields
     */
    protected User parseRow(String row) throws BadDataException {
        ArrayList<String> userInfo =  new ArrayList<>(Arrays.asList(row.trim().split(",")));
        User newUser = new User();

        try {
            newUser.setId(Integer.parseInt(userInfo.get(0)));
            newUser.setFirstName(userInfo.get(1).trim());
            newUser.setLastName(userInfo.get(2).trim());
            newUser.setEmail(userInfo.get(3).trim());
        } catch (Exception e) {
            throw new BadDataException();
        }

        return newUser;
    }

    /**
     * Given a string representing the content of a CSV file.
     * Each row is separated by "\n".
     * The first row is the header. Ignore this row.
     * Map each row to a user.
     * @param csv String content of the a CSV
     * @return List<User>
     */
    public List<User> parseCsvString(String csv) {

        ArrayList<String> allUsers = new ArrayList<>(Arrays.asList(csv.trim().split("\n")));

        ArrayList<User> users = new ArrayList<>();

        for (int i = 1; i < allUsers.size(); i++) {
            try {
                users.add(parseRow(allUsers.get(i)));
            } catch (BadDataException e) {
                LOGGER.warning("Unable to parse " + allUsers.get(i));
            }
        }
        return users;
    }

    /**
     * Given a file path, read the content of the file, and parse it into a list of User.
     * @param filePath
     * @return List<User>
     * @throws IOException when file is not found or cannot read content
     */
    public List<User> parseFile(String filePath) throws IOException {

        FileReader fReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fReader);

        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            LOGGER.warning("Unable to find " + filePath);
        }

        return parseCsvString(sb.toString());
    }
}
