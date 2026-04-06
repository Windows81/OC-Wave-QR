package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;

@MustBeDocumented
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@kotlin.annotation.Target
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface ExperimentalSerializationApi {
}
