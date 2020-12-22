package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idUser;
    private final String username;
    private final char sex;
    LocalDate dateOfBirth;
    private final int publishedPostsNmb;

    public ForumUser(final int idUser, final String username, final char sex, final LocalDate dateOfBirth, final int publishedPostsNmb) {
        this.idUser = idUser;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.publishedPostsNmb = publishedPostsNmb;
    }


    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return dateOfBirth;
    }

    public int getPublishedPostsNmb() {
        return publishedPostsNmb;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", date=" + dateOfBirth +
                ", publishedPostsNmb=" + publishedPostsNmb +
                '}';
    }
}
