package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

@Target({})
@kotlin.annotation.Target
@Metadata
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonNames {

    @Metadata
    public /* synthetic */ class Impl implements JsonNames {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f42318a;

        public final /* synthetic */ String[] names() {
            return this.f42318a;
        }
    }

    String[] names();
}
