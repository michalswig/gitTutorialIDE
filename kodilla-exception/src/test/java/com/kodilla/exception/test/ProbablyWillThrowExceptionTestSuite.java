package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyWillThrowExceptionTestSuite {

    @Test
    void probablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                () -> assertThrows(SecondChallengeException.class, () -> secondChallenge.probablyIWillThrowException(0.9, 5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,5))
        );

    }
}
