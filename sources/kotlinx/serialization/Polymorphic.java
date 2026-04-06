package kotlinx.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.TYPE, ElementType.TYPE_USE})
@kotlin.annotation.Target
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface Polymorphic {
}
