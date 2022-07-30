package com.kodlamaio.namingconvetions;

public class Examples {
    //CLASS:
    //It should start with the uppercase letter.
    //It should be a noun such as Color, Button, System, Thread, etc.
    //Use appropriate words, instead of acronyms.
    class Employee {

    }

    //INTERFACE:
    //It should start with the uppercase letter.
    //It should be an adjective such as Runnable, Remote, ActionListener.
    //Use appropriate words, instead of acronyms.
    interface Printable
    {

    }

    //METHOD:
    //It should start with lowercase letter.
    //It should be a verb such as main(), print(), println().
    //If the name contains multiple words,
    //start it with a lowercase letter followed by an uppercase letter such as actionPerformed().
    void draw()
    {

    }
    void actionPerformed()
    {

    }

    //Variable:
    //It should start with a lowercase letter such as id, name.
    //It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
    //If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter
    //such as firstName, lastName.
    //Avoid using one-character variables such as x, y, z.
    int id;
    String lastName;

    //PACKAGE:
    //It should be a lowercase letter such as java, lang.
    //If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.

    //CONSTANT:
    //It should be in uppercase letters such as RED, YELLOW.
    //If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
    //It may contain digits but not as the first letter.
    static final int MIN_AGE=18;

}
