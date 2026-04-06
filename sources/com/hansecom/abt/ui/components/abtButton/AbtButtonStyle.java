package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AbtButtonStyle {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f37880f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f37881a;

    /* renamed from: b  reason: collision with root package name */
    public final long f37882b;

    /* renamed from: c  reason: collision with root package name */
    public final long f37883c;

    /* renamed from: d  reason: collision with root package name */
    public final float f37884d;

    /* renamed from: e  reason: collision with root package name */
    public final float f37885e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbtButtonStyles a(Composer composer, int i2) {
            composer.X(381089815);
            if (ComposerKt.P()) {
                ComposerKt.Y(381089815, i2, -1, "com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.Companion.<get-Type> (AbtButtonStyle.kt:20)");
            }
            AbtButtonStyles a2 = AbtTheme.f38851a.a(composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return a2;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AbtButtonStyle(long j2, long j3, long j4, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, f2, f3);
    }

    public final long a() {
        return this.f37883c;
    }

    public final float b() {
        return this.f37884d;
    }

    public final long c() {
        return this.f37881a;
    }

    public final long d() {
        return this.f37882b;
    }

    public final float e() {
        return this.f37885e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbtButtonStyle)) {
            return false;
        }
        AbtButtonStyle abtButtonStyle = (AbtButtonStyle) obj;
        return Color.n(this.f37881a, abtButtonStyle.f37881a) && Color.n(this.f37882b, abtButtonStyle.f37882b) && Color.n(this.f37883c, abtButtonStyle.f37883c) && Dp.o(this.f37884d, abtButtonStyle.f37884d) && Dp.o(this.f37885e, abtButtonStyle.f37885e);
    }

    public int hashCode() {
        return (((((((Color.t(this.f37881a) * 31) + Color.t(this.f37882b)) * 31) + Color.t(this.f37883c)) * 31) + Dp.p(this.f37884d)) * 31) + Dp.p(this.f37885e);
    }

    public String toString() {
        String u2 = Color.u(this.f37881a);
        String u3 = Color.u(this.f37882b);
        String u4 = Color.u(this.f37883c);
        String r2 = Dp.r(this.f37884d);
        String r3 = Dp.r(this.f37885e);
        return "AbtButtonStyle(containerColor=" + u2 + ", contentColor=" + u3 + ", borderColor=" + u4 + ", borderWidth=" + r2 + ", cornerRadius=" + r3 + ")";
    }

    public AbtButtonStyle(long j2, long j3, long j4, float f2, float f3) {
        this.f37881a = j2;
        this.f37882b = j3;
        this.f37883c = j4;
        this.f37884d = f2;
        this.f37885e = f3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbtButtonStyle(long j2, long j3, long j4, float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, (i2 & 4) != 0 ? j3 : j4, (i2 & 8) != 0 ? Dp.f19144A.c() : f2, (i2 & 16) != 0 ? Dp.m((float) 4) : f3, (DefaultConstructorMarker) null);
    }
}
