package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "John", 'M', LocalDate.of(1980, 3, 27), 23));
        theForumUserList.add(new ForumUser(2, "Adam", 'M', LocalDate.of(1990, 4, 27), 23));
        theForumUserList.add(new ForumUser(3, "Jack", 'M', LocalDate.of(2000, 5, 27), 23));
        theForumUserList.add(new ForumUser(4, "Julia", 'F', LocalDate.of(2000, 6, 27), 23));
        theForumUserList.add(new ForumUser(5, "Janet", 'F', LocalDate.of(2002, 7, 27), 23));
        theForumUserList.add(new ForumUser(6, "Patrick", 'M', LocalDate.of(2004, 8, 27), 23));


    }

    public List<ForumUser> getTheForumUserList() {
        return theForumUserList;
    }

}
