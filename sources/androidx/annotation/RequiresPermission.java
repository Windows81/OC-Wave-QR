package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@MustBeDocumented
@Target
@Retention
@Documented
@java.lang.annotation.Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface RequiresPermission {

    @Target
    @java.lang.annotation.Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
    public @interface Read {
    }

    @Target
    @java.lang.annotation.Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
    public @interface Write {
    }
}
