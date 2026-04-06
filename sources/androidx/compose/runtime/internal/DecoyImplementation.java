package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@kotlin.annotation.Target
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface DecoyImplementation {
}
