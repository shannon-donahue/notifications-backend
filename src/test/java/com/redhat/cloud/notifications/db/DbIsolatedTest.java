package com.redhat.cloud.notifications.db;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.redhat.cloud.notifications.Constants.INTERNAL;
import static io.restassured.RestAssured.given;

/**
 * When a test class extends {@link DbIsolatedTest}, all of its tests are individually preceded and followed by a
 * complete database records reset. The tests are therefore isolated in terms of stored data.
 */
public abstract class DbIsolatedTest {

    @BeforeEach
    @AfterEach
    void cleanDatabase() {
        given()
                .basePath(INTERNAL)
                .delete("/db_cleaner")
                .then()
                .statusCode(204);
    }
}
