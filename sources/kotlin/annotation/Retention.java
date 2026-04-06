package kotlin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.ANNOTATION_TYPE})
@Target
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface Retention {
}
