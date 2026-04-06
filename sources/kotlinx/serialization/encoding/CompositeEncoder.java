package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public interface CompositeEncoder {

    @Metadata
    public static final class DefaultImpls {
        public static boolean a(CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, int i2) {
            Intrinsics.i(serialDescriptor, "descriptor");
            return true;
        }
    }

    void A(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj);

    void B(SerialDescriptor serialDescriptor, int i2, short s2);

    void C(SerialDescriptor serialDescriptor, int i2, double d2);

    void E(SerialDescriptor serialDescriptor, int i2, long j2);

    void F(SerialDescriptor serialDescriptor, int i2, char c2);

    void b(SerialDescriptor serialDescriptor);

    void g(SerialDescriptor serialDescriptor, int i2, byte b2);

    Encoder h(SerialDescriptor serialDescriptor, int i2);

    void m(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj);

    void n(SerialDescriptor serialDescriptor, int i2, float f2);

    void r(SerialDescriptor serialDescriptor, int i2, int i3);

    void s(SerialDescriptor serialDescriptor, int i2, boolean z2);

    void t(SerialDescriptor serialDescriptor, int i2, String str);

    boolean w(SerialDescriptor serialDescriptor, int i2);
}
