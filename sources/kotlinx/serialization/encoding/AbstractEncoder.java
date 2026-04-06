package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NoOpEncoder;

@Metadata
@ExperimentalSerializationApi
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
    public void A(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(serializationStrategy, "serializer");
        if (H(serialDescriptor, i2)) {
            e(serializationStrategy, obj);
        }
    }

    public final void B(SerialDescriptor serialDescriptor, int i2, short s2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            j(s2);
        }
    }

    public final void C(SerialDescriptor serialDescriptor, int i2, double d2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            i(d2);
        }
    }

    public void D(long j2) {
        J(Long.valueOf(j2));
    }

    public final void E(SerialDescriptor serialDescriptor, int i2, long j2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            D(j2);
        }
    }

    public final void F(SerialDescriptor serialDescriptor, int i2, char c2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            p(c2);
        }
    }

    public void G(String str) {
        Intrinsics.i(str, "value");
        J(str);
    }

    public boolean H(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return true;
    }

    public void I(SerializationStrategy serializationStrategy, Object obj) {
        Encoder.DefaultImpls.c(this, serializationStrategy, obj);
    }

    public void J(Object obj) {
        Intrinsics.i(obj, "value");
        throw new SerializationException("Non-serializable " + Reflection.b(obj.getClass()) + " is not supported by " + Reflection.b(getClass()) + " encoder");
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public CompositeEncoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }

    public void e(SerializationStrategy serializationStrategy, Object obj) {
        Encoder.DefaultImpls.d(this, serializationStrategy, obj);
    }

    public void f() {
        throw new SerializationException("'null' is not supported by default");
    }

    public final void g(SerialDescriptor serialDescriptor, int i2, byte b2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            k(b2);
        }
    }

    public final Encoder h(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return H(serialDescriptor, i2) ? z(serialDescriptor.j(i2)) : NoOpEncoder.f42154a;
    }

    public void i(double d2) {
        J(Double.valueOf(d2));
    }

    public void j(short s2) {
        J(Short.valueOf(s2));
    }

    public void k(byte b2) {
        J(Byte.valueOf(b2));
    }

    public void l(boolean z2) {
        J(Boolean.valueOf(z2));
    }

    public void m(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(serializationStrategy, "serializer");
        if (H(serialDescriptor, i2)) {
            I(serializationStrategy, obj);
        }
    }

    public final void n(SerialDescriptor serialDescriptor, int i2, float f2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            o(f2);
        }
    }

    public void o(float f2) {
        J(Float.valueOf(f2));
    }

    public void p(char c2) {
        J(Character.valueOf(c2));
    }

    public void q() {
        Encoder.DefaultImpls.b(this);
    }

    public final void r(SerialDescriptor serialDescriptor, int i2, int i3) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            y(i3);
        }
    }

    public final void s(SerialDescriptor serialDescriptor, int i2, boolean z2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i2)) {
            l(z2);
        }
    }

    public final void t(SerialDescriptor serialDescriptor, int i2, String str) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(str, "value");
        if (H(serialDescriptor, i2)) {
            G(str);
        }
    }

    public CompositeEncoder u(SerialDescriptor serialDescriptor, int i2) {
        return Encoder.DefaultImpls.a(this, serialDescriptor, i2);
    }

    public void v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        J(Integer.valueOf(i2));
    }

    public boolean w(SerialDescriptor serialDescriptor, int i2) {
        return CompositeEncoder.DefaultImpls.a(this, serialDescriptor, i2);
    }

    public void y(int i2) {
        J(Integer.valueOf(i2));
    }

    public Encoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }
}
