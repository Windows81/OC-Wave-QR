package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Untainted
@Retention(RetentionPolicy.RUNTIME)
public @interface Detainted {
}
