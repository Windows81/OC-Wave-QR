package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;

@Target({ElementType.METHOD})
@kotlin.annotation.Target
@Metadata
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
public @interface JvmDefault {
}
