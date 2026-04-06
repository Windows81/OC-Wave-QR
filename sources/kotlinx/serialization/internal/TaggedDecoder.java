package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
@InternalSerializationApi
public abstract class TaggedDecoder<Tag> implements Decoder, CompositeDecoder {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f42199a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f42200b;

    public static final Object K(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        return (deserializationStrategy.a().c() || taggedDecoder.u()) ? taggedDecoder.M(deserializationStrategy, obj) : taggedDecoder.l();
    }

    public static final Object L(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        return taggedDecoder.M(deserializationStrategy, obj);
    }

    public final double A(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return Q(b0(serialDescriptor, i2));
    }

    public final Decoder B(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return T(b0(serialDescriptor, i2), serialDescriptor.j(i2));
    }

    public Object C(DeserializationStrategy deserializationStrategy) {
        return Decoder.DefaultImpls.a(this, deserializationStrategy);
    }

    public final byte D() {
        return O(d0());
    }

    public final short E() {
        return X(d0());
    }

    public final float F() {
        return S(d0());
    }

    public final float G(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return S(b0(serialDescriptor, i2));
    }

    public final double H() {
        return Q(d0());
    }

    public Object M(DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        return C(deserializationStrategy);
    }

    public boolean N(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) Z).booleanValue();
    }

    public byte O(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) Z).byteValue();
    }

    public char P(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) Z).charValue();
    }

    public double Q(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) Z).doubleValue();
    }

    public int R(Object obj, SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) Z).intValue();
    }

    public float S(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) Z).floatValue();
    }

    public Decoder T(Object obj, SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "inlineDescriptor");
        e0(obj);
        return this;
    }

    public int U(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) Z).intValue();
    }

    public long V(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) Z).longValue();
    }

    public boolean W(Object obj) {
        return true;
    }

    public short X(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) Z).shortValue();
    }

    public String Y(Object obj) {
        Object Z = Z(obj);
        Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.String");
        return (String) Z;
    }

    public Object Z(Object obj) {
        throw new SerializationException(Reflection.b(getClass()) + " can't retrieve untyped values");
    }

    public SerializersModule a() {
        return SerializersModuleBuildersKt.a();
    }

    public final Object a0() {
        return CollectionsKt.q0(this.f42199a);
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public abstract Object b0(SerialDescriptor serialDescriptor, int i2);

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }

    public final ArrayList c0() {
        return this.f42199a;
    }

    public final Object d0() {
        ArrayList arrayList = this.f42199a;
        Object remove = arrayList.remove(CollectionsKt.o(arrayList));
        this.f42200b = true;
        return remove;
    }

    public final boolean e() {
        return N(d0());
    }

    public final void e0(Object obj) {
        this.f42199a.add(obj);
    }

    public final char f() {
        return P(d0());
    }

    public final Object f0(Object obj, Function0 function0) {
        e0(obj);
        Object invoke = function0.invoke();
        if (!this.f42200b) {
            d0();
        }
        this.f42200b = false;
        return invoke;
    }

    public final int g(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        return R(d0(), serialDescriptor);
    }

    public final long h(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return V(b0(serialDescriptor, i2));
    }

    public final int j() {
        return U(d0());
    }

    public final int k(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return U(b0(serialDescriptor, i2));
    }

    public final Void l() {
        return null;
    }

    public final Object m(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(deserializationStrategy, "deserializer");
        return f0(b0(serialDescriptor, i2), new l(this, deserializationStrategy, obj));
    }

    public final String n() {
        return Y(d0());
    }

    public int o(SerialDescriptor serialDescriptor) {
        return CompositeDecoder.DefaultImpls.a(this, serialDescriptor);
    }

    public final char p(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return P(b0(serialDescriptor, i2));
    }

    public final byte q(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return O(b0(serialDescriptor, i2));
    }

    public final long r() {
        return V(d0());
    }

    public final boolean s(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return N(b0(serialDescriptor, i2));
    }

    public final String t(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return Y(b0(serialDescriptor, i2));
    }

    public boolean u() {
        Object a0 = a0();
        if (a0 == null) {
            return false;
        }
        return W(a0);
    }

    public final Object v(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(deserializationStrategy, "deserializer");
        return f0(b0(serialDescriptor, i2), new m(this, deserializationStrategy, obj));
    }

    public final short w(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return X(b0(serialDescriptor, i2));
    }

    public boolean y() {
        return CompositeDecoder.DefaultImpls.b(this);
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return T(d0(), serialDescriptor);
    }
}
