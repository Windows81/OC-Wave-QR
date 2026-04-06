package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;

@MustBeDocumented
@Target
@Documented
@java.lang.annotation.Target({ElementType.TYPE, ElementType.TYPE_USE})
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface Serializable {
    Class with() default KSerializer.class;
}
