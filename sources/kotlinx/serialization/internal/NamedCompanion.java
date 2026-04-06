package kotlinx.serialization.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlinx.serialization.InternalSerializationApi;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Metadata
@Retention
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@InternalSerializationApi
public @interface NamedCompanion {
}
