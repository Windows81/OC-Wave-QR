package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target
@Retention
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata
@Deprecated
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface Experimental {

    @Metadata
    public enum Level {
        WARNING,
        ERROR
    }
}
