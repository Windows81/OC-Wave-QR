package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
public final class NoOpEncoder extends AbstractEncoder {

    /* renamed from: a  reason: collision with root package name */
    public static final NoOpEncoder f42154a = new NoOpEncoder();

    /* renamed from: b  reason: collision with root package name */
    public static final SerializersModule f42155b = SerializersModuleBuildersKt.a();

    public void D(long j2) {
    }

    public void G(String str) {
        Intrinsics.i(str, "value");
    }

    public void J(Object obj) {
        Intrinsics.i(obj, "value");
    }

    public SerializersModule a() {
        return f42155b;
    }

    public void f() {
    }

    public void i(double d2) {
    }

    public void j(short s2) {
    }

    public void k(byte b2) {
    }

    public void l(boolean z2) {
    }

    public void o(float f2) {
    }

    public void p(char c2) {
    }

    public void v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
    }

    public void y(int i2) {
    }
}
