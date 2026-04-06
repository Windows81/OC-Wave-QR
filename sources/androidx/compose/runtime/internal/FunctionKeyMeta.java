package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@ComposeCompilerApi
@Target
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
@Retention
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface FunctionKeyMeta {

    @Target
    @Retention
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
    public @interface Container {
    }
}
