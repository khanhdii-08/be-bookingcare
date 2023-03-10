package com.iuh.bookingcare;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.iuh.bookingcare.config.AsyncSyncConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JHipsterRegistryApp.class, AsyncSyncConfiguration.class })
@ActiveProfiles(profiles = { "native" })
public @interface IntegrationTest {
}
