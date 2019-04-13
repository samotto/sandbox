package com.og;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(StringEscapeUtils.escapeHtml4("here is a <p> tag"));
    }
}
