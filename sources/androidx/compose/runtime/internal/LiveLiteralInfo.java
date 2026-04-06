package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Retention;

@Target({ElementType.METHOD})
@ComposeCompilerApi
@kotlin.annotation.Target
@Metadata
@Retention
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface LiveLiteralInfo {
}
