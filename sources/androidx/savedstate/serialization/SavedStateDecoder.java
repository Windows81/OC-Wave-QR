package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class SavedStateDecoder extends AbstractDecoder {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f22881a;

    /* renamed from: b  reason: collision with root package name */
    public final SavedStateConfiguration f22882b;

    /* renamed from: c  reason: collision with root package name */
    public String f22883c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f22884d;

    /* renamed from: e  reason: collision with root package name */
    public final SerializersModule f22885e;

    public SavedStateDecoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.i(bundle, "savedState");
        Intrinsics.i(savedStateConfiguration, "configuration");
        this.f22881a = bundle;
        this.f22882b = savedStateConfiguration;
        this.f22885e = savedStateConfiguration.c();
    }

    public static final boolean N(SerialDescriptor serialDescriptor, int i2) {
        return serialDescriptor.k(i2);
    }

    public static final boolean O(SavedStateDecoder savedStateDecoder, SerialDescriptor serialDescriptor, int i2) {
        return SavedStateReader.b(SavedStateReader.a(savedStateDecoder.f22881a), serialDescriptor.g(i2));
    }

    public Object C(DeserializationStrategy deserializationStrategy) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        Object Q = Q(deserializationStrategy);
        return Q == null ? super.C(deserializationStrategy) : Q;
    }

    public byte D() {
        return (byte) SavedStateReader.p(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public short E() {
        return (short) SavedStateReader.p(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public float F() {
        return SavedStateReader.n(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public double H() {
        return SavedStateReader.l(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final boolean[] K() {
        return SavedStateReader.f(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final char[] L() {
        return SavedStateReader.h(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final double[] M() {
        return SavedStateReader.m(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final float[] P() {
        return SavedStateReader.o(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final Object Q(DeserializationStrategy deserializationStrategy) {
        Object a2 = SavedStateDecoder_androidKt.a(this, deserializationStrategy);
        if (a2 != null) {
            return a2;
        }
        SerialDescriptor a3 = deserializationStrategy.a();
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.f())) {
            return S();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.i())) {
            return V();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.a())) {
            return K();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.b())) {
            return L();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.c())) {
            return M();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.d())) {
            return P();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.e())) {
            return R();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.g())) {
            return T();
        }
        if (Intrinsics.d(a3, SavedStateCodecUtilsKt.h())) {
            return U();
        }
        return null;
    }

    public final int[] R() {
        return SavedStateReader.q(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final List S() {
        return SavedStateReader.r(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final long[] T() {
        return SavedStateReader.u(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final String[] U() {
        return SavedStateReader.G(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final List V() {
        return SavedStateReader.H(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public final String W() {
        return this.f22883c;
    }

    public final Bundle X() {
        return this.f22881a;
    }

    public SerializersModule a() {
        return this.f22885e;
    }

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return Intrinsics.d(this.f22883c, "") ? this : new SavedStateDecoder(SavedStateReader.z(SavedStateReader.a(this.f22881a), this.f22883c), this.f22882b);
    }

    public boolean e() {
        return SavedStateReader.e(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public char f() {
        return SavedStateReader.g(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public int g(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        return SavedStateReader.p(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public int j() {
        return SavedStateReader.p(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public String n() {
        return SavedStateReader.F(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public long r() {
        return SavedStateReader.t(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public boolean u() {
        return !SavedStateReader.L(SavedStateReader.a(this.f22881a), this.f22883c);
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        int M = (Intrinsics.d(serialDescriptor.e(), StructureKind.LIST.f42059a) || Intrinsics.d(serialDescriptor.e(), StructureKind.MAP.f42060a)) ? SavedStateReader.M(SavedStateReader.a(this.f22881a)) : serialDescriptor.f();
        while (true) {
            int i2 = this.f22884d;
            if (i2 >= M || !N(serialDescriptor, i2) || O(this, serialDescriptor, this.f22884d)) {
                int i3 = this.f22884d;
            } else {
                this.f22884d++;
            }
        }
        int i32 = this.f22884d;
        if (i32 >= M) {
            return -1;
        }
        this.f22883c = serialDescriptor.g(i32);
        int i4 = this.f22884d;
        this.f22884d = i4 + 1;
        return i4;
    }
}
