package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FontWeight implements Comparable<FontWeight> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f18746A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final FontWeight f18747B;
    public static final FontWeight C;
    public static final FontWeight D;
    public static final FontWeight E;
    public static final FontWeight F;
    public static final FontWeight G;
    public static final FontWeight H;
    public static final FontWeight I;
    public static final FontWeight J;
    public static final FontWeight K;
    public static final FontWeight L;
    public static final FontWeight M;
    public static final FontWeight N;
    public static final FontWeight O;
    public static final FontWeight P;
    public static final FontWeight Q;
    public static final FontWeight R;
    public static final FontWeight S;
    public static final List T;

    /* renamed from: z  reason: collision with root package name */
    public final int f18748z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontWeight a() {
            return FontWeight.S;
        }

        public final FontWeight b() {
            return FontWeight.Q;
        }

        public final FontWeight c() {
            return FontWeight.R;
        }

        public final FontWeight d() {
            return FontWeight.L;
        }

        public final FontWeight e() {
            return FontWeight.M;
        }

        public final FontWeight f() {
            return FontWeight.O;
        }

        public final FontWeight g() {
            return FontWeight.N;
        }

        public final FontWeight h() {
            return FontWeight.P;
        }

        public final FontWeight i() {
            return FontWeight.K;
        }

        public final FontWeight j() {
            return FontWeight.E;
        }

        public final FontWeight k() {
            return FontWeight.F;
        }

        public final FontWeight l() {
            return FontWeight.G;
        }

        public Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f18747B = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        C = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        D = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        E = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        F = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        G = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        H = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        I = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        J = fontWeight9;
        K = fontWeight;
        L = fontWeight2;
        M = fontWeight3;
        N = fontWeight4;
        O = fontWeight5;
        P = fontWeight6;
        Q = fontWeight7;
        R = fontWeight8;
        S = fontWeight9;
        T = CollectionsKt.p(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i2) {
        this.f18748z = i2;
        boolean z2 = false;
        if (1 <= i2 && i2 < 1001) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontWeight) && this.f18748z == ((FontWeight) obj).f18748z;
    }

    public int hashCode() {
        return this.f18748z;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f18748z + ')';
    }

    /* renamed from: x */
    public int compareTo(FontWeight fontWeight) {
        return Intrinsics.k(this.f18748z, fontWeight.f18748z);
    }

    public final int y() {
        return this.f18748z;
    }
}
