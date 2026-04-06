package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@Target
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
@Retention
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface RequireKotlin {

    @Target
    @Retention
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Container {
    }
}
