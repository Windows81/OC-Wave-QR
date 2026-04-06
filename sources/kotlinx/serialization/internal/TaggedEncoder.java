package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
@InternalSerializationApi
public abstract class TaggedEncoder<Tag> implements Encoder, CompositeEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f42201a = new ArrayList();

    private final boolean H(SerialDescriptor serialDescriptor, int i2) {
        c0(a0(serialDescriptor, i2));
        return true;
    }

    public void A(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(serializationStrategy, "serializer");
        if (H(serialDescriptor, i2)) {
            e(serializationStrategy, obj);
        }
    }

    public final void B(SerialDescriptor serialDescriptor, int i2, short s2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        U(a0(serialDescriptor, i2), s2);
    }

    public final void C(SerialDescriptor serialDescriptor, int i2, double d2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        M(a0(serialDescriptor, i2), d2);
    }

    public final void D(long j2) {
        R(b0(), j2);
    }

    public final void E(SerialDescriptor serialDescriptor, int i2, long j2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        R(a0(serialDescriptor, i2), j2);
    }

    public final void F(SerialDescriptor serialDescriptor, int i2, char c2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        L(a0(serialDescriptor, i2), c2);
    }

    public final void G(String str) {
        Intrinsics.i(str, "value");
        V(b0(), str);
    }

    public void I(SerializationStrategy serializationStrategy, Object obj) {
        Encoder.DefaultImpls.c(this, serializationStrategy, obj);
    }

    public void J(Object obj, boolean z2) {
        W(obj, Boolean.valueOf(z2));
    }

    public void K(Object obj, byte b2) {
        W(obj, Byte.valueOf(b2));
    }

    public void L(Object obj, char c2) {
        W(obj, Character.valueOf(c2));
    }

    public void M(Object obj, double d2) {
        W(obj, Double.valueOf(d2));
    }

    public void N(Object obj, SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        W(obj, Integer.valueOf(i2));
    }

    public void O(Object obj, float f2) {
        W(obj, Float.valueOf(f2));
    }

    public Encoder P(Object obj, SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "inlineDescriptor");
        c0(obj);
        return this;
    }

    public void Q(Object obj, int i2) {
        W(obj, Integer.valueOf(i2));
    }

    public void R(Object obj, long j2) {
        W(obj, Long.valueOf(j2));
    }

    public void S(Object obj) {
    }

    public void T(Object obj) {
        throw new SerializationException("null is not supported");
    }

    public void U(Object obj, short s2) {
        W(obj, Short.valueOf(s2));
    }

    public void V(Object obj, String str) {
        Intrinsics.i(str, "value");
        W(obj, str);
    }

    public void W(Object obj, Object obj2) {
        Intrinsics.i(obj2, "value");
        throw new SerializationException("Non-serializable " + Reflection.b(obj2.getClass()) + " is not supported by " + Reflection.b(getClass()) + " encoder");
    }

    public void X(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public final Object Y() {
        return CollectionsKt.p0(this.f42201a);
    }

    public final Object Z() {
        return CollectionsKt.q0(this.f42201a);
    }

    public SerializersModule a() {
        return SerializersModuleBuildersKt.a();
    }

    public abstract Object a0(SerialDescriptor serialDescriptor, int i2);

    public final void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (!this.f42201a.isEmpty()) {
            b0();
        }
        X(serialDescriptor);
    }

    public final Object b0() {
        if (!this.f42201a.isEmpty()) {
            ArrayList arrayList = this.f42201a;
            return arrayList.remove(CollectionsKt.o(arrayList));
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    public CompositeEncoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this;
    }

    public final void c0(Object obj) {
        this.f42201a.add(obj);
    }

    public void e(SerializationStrategy serializationStrategy, Object obj) {
        Encoder.DefaultImpls.d(this, serializationStrategy, obj);
    }

    public void f() {
        T(b0());
    }

    public final void g(SerialDescriptor serialDescriptor, int i2, byte b2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        K(a0(serialDescriptor, i2), b2);
    }

    public final Encoder h(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return P(a0(serialDescriptor, i2), serialDescriptor.j(i2));
    }

    public final void i(double d2) {
        M(b0(), d2);
    }

    public final void j(short s2) {
        U(b0(), s2);
    }

    public final void k(byte b2) {
        K(b0(), b2);
    }

    public final void l(boolean z2) {
        J(b0(), z2);
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
        O(a0(serialDescriptor, i2), f2);
    }

    public final void o(float f2) {
        O(b0(), f2);
    }

    public final void p(char c2) {
        L(b0(), c2);
    }

    public void q() {
        S(Y());
    }

    public final void r(SerialDescriptor serialDescriptor, int i2, int i3) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Q(a0(serialDescriptor, i2), i3);
    }

    public final void s(SerialDescriptor serialDescriptor, int i2, boolean z2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        J(a0(serialDescriptor, i2), z2);
    }

    public final void t(SerialDescriptor serialDescriptor, int i2, String str) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(str, "value");
        V(a0(serialDescriptor, i2), str);
    }

    public CompositeEncoder u(SerialDescriptor serialDescriptor, int i2) {
        return Encoder.DefaultImpls.a(this, serialDescriptor, i2);
    }

    public final void v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        N(b0(), serialDescriptor, i2);
    }

    public boolean w(SerialDescriptor serialDescriptor, int i2) {
        return CompositeEncoder.DefaultImpls.a(this, serialDescriptor, i2);
    }

    public final void y(int i2) {
        Q(b0(), i2);
    }

    public Encoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return P(b0(), serialDescriptor);
    }
}
