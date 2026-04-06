package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public interface CompositeDecoder {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42066a = new Companion();
    }

    @Metadata
    public static final class DefaultImpls {
        public static int a(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor) {
            Intrinsics.i(serialDescriptor, "descriptor");
            return -1;
        }

        public static boolean b(CompositeDecoder compositeDecoder) {
            return false;
        }

        public static /* synthetic */ Object c(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj, int i3, Object obj2) {
            if (obj2 == null) {
                if ((i3 & 8) != 0) {
                    obj = null;
                }
                return compositeDecoder.m(serialDescriptor, i2, deserializationStrategy, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    double A(SerialDescriptor serialDescriptor, int i2);

    Decoder B(SerialDescriptor serialDescriptor, int i2);

    float G(SerialDescriptor serialDescriptor, int i2);

    SerializersModule a();

    void b(SerialDescriptor serialDescriptor);

    long h(SerialDescriptor serialDescriptor, int i2);

    int k(SerialDescriptor serialDescriptor, int i2);

    Object m(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj);

    int o(SerialDescriptor serialDescriptor);

    char p(SerialDescriptor serialDescriptor, int i2);

    byte q(SerialDescriptor serialDescriptor, int i2);

    boolean s(SerialDescriptor serialDescriptor, int i2);

    String t(SerialDescriptor serialDescriptor, int i2);

    Object v(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj);

    short w(SerialDescriptor serialDescriptor, int i2);

    int x(SerialDescriptor serialDescriptor);

    boolean y();
}
