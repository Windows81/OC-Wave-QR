package androidx.compose.ui.tooling.preview;

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
@java.lang.annotation.Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface Preview {

    @Target
    @Retention
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.CLASS)
    public @interface Container {
    }
}
