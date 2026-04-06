package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Metadata
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonClassDiscriminator {

    @Metadata
    public /* synthetic */ class Impl implements JsonClassDiscriminator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f42289a;

        public final /* synthetic */ String discriminator() {
            return this.f42289a;
        }
    }

    String discriminator();
}
