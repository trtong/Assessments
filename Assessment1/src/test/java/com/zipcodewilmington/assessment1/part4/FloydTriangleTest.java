package com.zipcodewilmington.assessment1.part4;

import org.junit.Assert;
import org.junit.Test;

public class FloydTriangleTest {

    @Test
    public void generateTriangleTest() {
        // Given
        Integer input = 1;
        String expected = "1";

        // When
        String actual = FloydTriangle.generateTriangle(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateTriangleTest2() {
        // Given
        Integer input = 3;
        String expected = "1\n2 3\n4 5 6";

        // When
        String actual = FloydTriangle.generateTriangle(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateRowTest() {
        // Given
        Integer input = 3;
        String expected = "4 5 6";

        // When
        String actual = FloydTriangle.getNthRow(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateRowTest2() {
        // Given
        Integer input = 63;
        String expected = "1954 1955 1956 1957 1958 1959 1960 1961 1962 1963 1964 1965 1966 1967 1968 1969 1970 1971 1972 1973 1974 1975 1976 1977 1978 1979 1980 1981 1982 1983 1984 1985 1986 1987 1988 1989 1990 1991 1992 1993 1994 1995 1996 1997 1998 1999 2000 2001 2002 2003 2004 2005 2006 2007 2008 2009 2010 2011 2012 2013 2014 2015 2016";

        // When
        String actual = FloydTriangle.getNthRow(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

}

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
