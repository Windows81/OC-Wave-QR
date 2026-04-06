package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntriesKt;

@MustBeDocumented
@Target
@ExperimentalSerializationApi
@Documented
@java.lang.annotation.Target({})
@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface EncodeDefault {

    @Metadata
    @ExperimentalSerializationApi
    public enum Mode {
        ALWAYS,
        NEVER;

        static {
            Mode[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }
}
