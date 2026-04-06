package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target
@Retention
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface RequiresOptIn {

    @Metadata
    public enum Level {
        WARNING,
        ERROR
    }
}
