package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public interface Encoder {

    @Metadata
    public static final class DefaultImpls {
        public static CompositeEncoder a(Encoder encoder, SerialDescriptor serialDescriptor, int i2) {
            Intrinsics.i(serialDescriptor, "descriptor");
            return encoder.c(serialDescriptor);
        }

        public static void b(Encoder encoder) {
        }

        public static void c(Encoder encoder, SerializationStrategy serializationStrategy, Object obj) {
            Intrinsics.i(serializationStrategy, "serializer");
            if (serializationStrategy.a().c()) {
                encoder.e(serializationStrategy, obj);
            } else if (obj == null) {
                encoder.f();
            } else {
                encoder.q();
                encoder.e(serializationStrategy, obj);
            }
        }

        public static void d(Encoder encoder, SerializationStrategy serializationStrategy, Object obj) {
            Intrinsics.i(serializationStrategy, "serializer");
            serializationStrategy.d(encoder, obj);
        }
    }

    void D(long j2);

    void G(String str);

    SerializersModule a();

    CompositeEncoder c(SerialDescriptor serialDescriptor);

    void e(SerializationStrategy serializationStrategy, Object obj);

    void f();

    void i(double d2);

    void j(short s2);

    void k(byte b2);

    void l(boolean z2);

    void o(float f2);

    void p(char c2);

    void q();

    CompositeEncoder u(SerialDescriptor serialDescriptor, int i2);

    void v(SerialDescriptor serialDescriptor, int i2);

    void y(int i2);

    Encoder z(SerialDescriptor serialDescriptor);
}
