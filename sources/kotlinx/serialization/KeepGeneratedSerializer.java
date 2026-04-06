package kotlinx.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Retention;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Metadata
@ExperimentalSerializationApi
@Retention
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface KeepGeneratedSerializer {
}
