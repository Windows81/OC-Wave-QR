package kotlinx.parcelize;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;
import kotlinx.parcelize.Parceler;

@Target
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
@Retention
@java.lang.annotation.Target({ElementType.TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface TypeParceler<T, P extends Parceler<? super T>> {

    @Target
    @Retention
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Container {
    }
}
