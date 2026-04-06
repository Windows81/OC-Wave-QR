package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@MustBeDocumented
@Target
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
@Retention
@Documented
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface RequiresExtension {

    @Target
    @Retention
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.CLASS)
    public @interface Container {
    }
}
