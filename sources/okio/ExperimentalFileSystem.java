package okio;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.Retention;

@Target({ElementType.TYPE, ElementType.METHOD})
@kotlin.annotation.Target
@Metadata
@Deprecated
@Retention
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface ExperimentalFileSystem {
}
