package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

@Metadata
@ExperimentalSerializationApi
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
    public final double A(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return H();
    }

    public Decoder B(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return z(serialDescriptor.j(i2));
    }

    public Object C(DeserializationStrategy deserializationStrategy) {
        return Decoder.DefaultImpls.a(this, deserializationStrategy);
    }

    public byte D() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) J).byteValue();
    }

    public short E() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) J).shortValue();
    }

    public float F() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J).floatValue();
    }

    public final float G(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return F();
    }

    public double H() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J).doubleValue();
    }

    public Object I(DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        return C(deserializationStrategy);
    }

    public Object J() {
        throw new SerializationException(Reflection.b(getClass()) + " can't retrieve untyped values");
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }

    public boolean e() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J).booleanValue();
    }

    public char f() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J).charValue();
    }

    public int g(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J).intValue();
    }

    public final long h(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return r();
    }

    public int j() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J).intValue();
    }

    public final int k(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return j();
    }

    public Void l() {
        return null;
    }

    public Object m(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(deserializationStrategy, "deserializer");
        return I(deserializationStrategy, obj);
    }

    public String n() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.String");
        return (String) J;
    }

    public int o(SerialDescriptor serialDescriptor) {
        return CompositeDecoder.DefaultImpls.a(this, serialDescriptor);
    }

    public final char p(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return f();
    }

    public final byte q(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return D();
    }

    public long r() {
        Object J = J();
        Intrinsics.g(J, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) J).longValue();
    }

    public final boolean s(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return e();
    }

    public final String t(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return n();
    }

    public boolean u() {
        return true;
    }

    public final Object v(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(deserializationStrategy, "deserializer");
        return (deserializationStrategy.a().c() || u()) ? I(deserializationStrategy, obj) : l();
    }

    public final short w(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return E();
    }

    public boolean y() {
        return CompositeDecoder.DefaultImpls.b(this);
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }
}
