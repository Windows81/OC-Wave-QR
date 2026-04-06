package kotlinx.android.parcel;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlinx.android.parcel.Parceler;

@Target({ElementType.TYPE_USE})
@kotlin.annotation.Target
@Metadata
@Retention
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface WriteWith<P extends Parceler<?>> {
}
