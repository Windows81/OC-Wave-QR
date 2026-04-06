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
@ExperimentalSerializationApi
@Documented
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaSerializable {
}
