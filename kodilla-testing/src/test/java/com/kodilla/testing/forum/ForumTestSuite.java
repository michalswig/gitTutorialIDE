package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("test suite: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("test suite: end");
    }

    @DisplayName(
            "When creating SimpleUser with realName, " +
                    "then getRealName should return real user name."
    )

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When

        String result = simpleUser.getRealName();
        System.out.println("testing: " + result);
        //Then
        Assertions.assertEquals("John Smith", result);

    }

    @DisplayName(
            "When creating SimpleUser with name, " +
                    "then getUsername should return correct name."
    )

    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
