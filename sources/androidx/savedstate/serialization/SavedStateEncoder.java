package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class SavedStateEncoder extends AbstractEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f22886a;

    /* renamed from: b  reason: collision with root package name */
    public final SavedStateConfiguration f22887b;

    /* renamed from: c  reason: collision with root package name */
    public String f22888c = "";

    /* renamed from: d  reason: collision with root package name */
    public final SerializersModule f22889d;

    public SavedStateEncoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.i(bundle, "savedState");
        Intrinsics.i(savedStateConfiguration, "configuration");
        this.f22886a = bundle;
        this.f22887b = savedStateConfiguration;
        this.f22889d = savedStateConfiguration.c();
    }

    public void D(long j2) {
        SavedStateWriter.u(SavedStateWriter.a(this.f22886a), this.f22888c, j2);
    }

    public void G(String str) {
        Intrinsics.i(str, "value");
        SavedStateWriter.E(SavedStateWriter.a(this.f22886a), this.f22888c, str);
    }

    public boolean H(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        String g2 = serialDescriptor.g(i2);
        this.f22888c = g2;
        K(this.f22886a, g2);
        return true;
    }

    public final void K(Bundle bundle, String str) {
        if (this.f22887b.a() == 1) {
            boolean b2 = SavedStateReader.b(SavedStateReader.a(bundle), "type");
            boolean d2 = Intrinsics.d(str, "type");
            if (b2 && d2) {
                String F = SavedStateReader.F(SavedStateReader.a(bundle), "type");
                throw new IllegalArgumentException("SavedStateEncoder for " + F + " has property '" + str + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    public final void L(boolean[] zArr) {
        SavedStateWriter.g(SavedStateWriter.a(this.f22886a), this.f22888c, zArr);
    }

    public final void M(char[] cArr) {
        SavedStateWriter.i(SavedStateWriter.a(this.f22886a), this.f22888c, cArr);
    }

    public final void N(double[] dArr) {
        SavedStateWriter.n(SavedStateWriter.a(this.f22886a), this.f22888c, dArr);
    }

    public final void O(float[] fArr) {
        SavedStateWriter.p(SavedStateWriter.a(this.f22886a), this.f22888c, fArr);
    }

    public final boolean P(SerializationStrategy serializationStrategy, Object obj) {
        if (SavedStateEncoder_androidKt.a(this, serializationStrategy, obj)) {
            return true;
        }
        SerialDescriptor a2 = serializationStrategy.a();
        if (Intrinsics.d(a2, SavedStateCodecUtilsKt.f())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            R((List) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.i())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            U((List) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.a())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.BooleanArray");
            L((boolean[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.b())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.CharArray");
            M((char[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.c())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
            N((double[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.d())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.FloatArray");
            O((float[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.e())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.IntArray");
            Q((int[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtilsKt.g())) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.LongArray");
            S((long[]) obj);
            return true;
        } else if (!Intrinsics.d(a2, SavedStateCodecUtilsKt.h())) {
            return false;
        } else {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            T((String[]) obj);
            return true;
        }
    }

    public final void Q(int[] iArr) {
        SavedStateWriter.r(SavedStateWriter.a(this.f22886a), this.f22888c, iArr);
    }

    public final void R(List list) {
        SavedStateWriter.s(SavedStateWriter.a(this.f22886a), this.f22888c, list);
    }

    public final void S(long[] jArr) {
        SavedStateWriter.v(SavedStateWriter.a(this.f22886a), this.f22888c, jArr);
    }

    public final void T(String[] strArr) {
        SavedStateWriter.F(SavedStateWriter.a(this.f22886a), this.f22888c, strArr);
    }

    public final void U(List list) {
        SavedStateWriter.G(SavedStateWriter.a(this.f22886a), this.f22888c, list);
    }

    public final String V() {
        return this.f22888c;
    }

    public final Bundle W() {
        return this.f22886a;
    }

    public final void X(SavedStateConfiguration savedStateConfiguration, SerialDescriptor serialDescriptor, Bundle bundle) {
        if (savedStateConfiguration.a() != 1 || SavedStateReader.b(SavedStateReader.a(bundle), "type")) {
            return;
        }
        if (Intrinsics.d(serialDescriptor.e(), StructureKind.CLASS.f42058a) || Intrinsics.d(serialDescriptor.e(), StructureKind.OBJECT.f42061a)) {
            SavedStateWriter.E(SavedStateWriter.a(bundle), "type", serialDescriptor.a());
        }
    }

    public SerializersModule a() {
        return this.f22889d;
    }

    public CompositeEncoder c(SerialDescriptor serialDescriptor) {
        Pair[] pairArr;
        Intrinsics.i(serialDescriptor, "descriptor");
        if (Intrinsics.d(this.f22888c, "")) {
            X(this.f22887b, serialDescriptor, this.f22886a);
            return this;
        }
        Map h2 = MapsKt.h();
        if (h2.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(h2.size());
            for (Map.Entry entry : h2.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a2 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.a(a2);
        SavedStateWriter.A(SavedStateWriter.a(this.f22886a), this.f22888c, a2);
        X(this.f22887b, serialDescriptor, a2);
        return new SavedStateEncoder(a2, this.f22887b);
    }

    public void e(SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serializationStrategy, "serializer");
        if (!P(serializationStrategy, obj)) {
            super.e(serializationStrategy, obj);
        }
    }

    public void f() {
        SavedStateWriter.w(SavedStateWriter.a(this.f22886a), this.f22888c);
    }

    public void i(double d2) {
        SavedStateWriter.m(SavedStateWriter.a(this.f22886a), this.f22888c, d2);
    }

    public void j(short s2) {
        SavedStateWriter.q(SavedStateWriter.a(this.f22886a), this.f22888c, s2);
    }

    public void k(byte b2) {
        SavedStateWriter.q(SavedStateWriter.a(this.f22886a), this.f22888c, b2);
    }

    public void l(boolean z2) {
        SavedStateWriter.f(SavedStateWriter.a(this.f22886a), this.f22888c, z2);
    }

    public void o(float f2) {
        SavedStateWriter.o(SavedStateWriter.a(this.f22886a), this.f22888c, f2);
    }

    public void p(char c2) {
        SavedStateWriter.h(SavedStateWriter.a(this.f22886a), this.f22888c, c2);
    }

    public void v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        SavedStateWriter.q(SavedStateWriter.a(this.f22886a), this.f22888c, i2);
    }

    public boolean w(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this.f22887b.b();
    }

    public void y(int i2) {
        SavedStateWriter.q(SavedStateWriter.a(this.f22886a), this.f22888c, i2);
    }
}
