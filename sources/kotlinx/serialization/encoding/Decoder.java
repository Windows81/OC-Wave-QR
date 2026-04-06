package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public interface Decoder {

    @Metadata
    public static final class DefaultImpls {
        public static Object a(Decoder decoder, DeserializationStrategy deserializationStrategy) {
            Intrinsics.i(deserializationStrategy, "deserializer");
            return deserializationStrategy.c(decoder);
        }
    }

    Object C(DeserializationStrategy deserializationStrategy);

    byte D();

    short E();

    float F();

    double H();

    SerializersModule a();

    CompositeDecoder c(SerialDescriptor serialDescriptor);

    boolean e();

    char f();

    int g(SerialDescriptor serialDescriptor);

    int j();

    Void l();

    String n();

    long r();

    boolean u();

    Decoder z(SerialDescriptor serialDescriptor);
}
