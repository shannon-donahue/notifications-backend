package com.redhat.cloud.notifications.processors.webclient;

import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Use this qualifier to inject a {@link io.vertx.mutiny.ext.web.client.WebClient WebClient} instance that will verify
 * SSL server certificates.
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD})
public @interface SslVerificationEnabled {
}
