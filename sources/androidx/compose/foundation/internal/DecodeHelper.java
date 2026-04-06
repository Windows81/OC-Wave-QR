package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DecodeHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Parcel f3696a;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.f3696a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.f3696a.dataAvail();
    }

    public final float b() {
        return BaselineShift.e(e());
    }

    public final byte c() {
        return this.f3696a.readByte();
    }

    public final long d() {
        return Color.i(p());
    }

    public final float e() {
        return this.f3696a.readFloat();
    }

    public final int f() {
        byte c2 = c();
        return c2 == 0 ? FontStyle.f18724b.b() : c2 == 1 ? FontStyle.f18724b.a() : FontStyle.f18724b.b();
    }

    public final int g() {
        byte c2 = c();
        return c2 == 0 ? FontSynthesis.f18728b.b() : c2 == 1 ? FontSynthesis.f18728b.a() : c2 == 3 ? FontSynthesis.f18728b.c() : c2 == 2 ? FontSynthesis.f18728b.d() : FontSynthesis.f18728b.b();
    }

    public final FontWeight h() {
        return new FontWeight(i());
    }

    public final int i() {
        return this.f3696a.readInt();
    }

    public final Shadow j() {
        long d2 = d();
        float e2 = e();
        float e3 = e();
        return new Shadow(d2, Offset.e((((long) Float.floatToRawIntBits(e2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(e3)))), e(), (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        r4 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.text.SpanStyle k() {
        /*
            r22 = this;
            androidx.compose.foundation.internal.MutableSpanStyle r15 = new androidx.compose.foundation.internal.MutableSpanStyle
            r0 = r15
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20)
            r0 = r22
        L_0x0024:
            android.os.Parcel r1 = r0.f3696a
            int r1 = r1.dataAvail()
            r2 = 1
            if (r1 <= r2) goto L_0x0045
            byte r1 = r22.c()
            r3 = 8
            if (r1 != r2) goto L_0x0049
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0045
            long r1 = r22.d()
            r4 = r21
            r4.c(r1)
            goto L_0x0024
        L_0x0045:
            r4 = r21
            goto L_0x0116
        L_0x0049:
            r4 = r21
            r5 = 2
            r6 = 5
            if (r1 != r5) goto L_0x005f
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0116
            long r1 = r22.o()
            r4.e(r1)
        L_0x005c:
            r21 = r4
            goto L_0x0024
        L_0x005f:
            r5 = 3
            r7 = 4
            if (r1 != r5) goto L_0x0071
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            androidx.compose.ui.text.font.FontWeight r1 = r22.h()
            r4.h(r1)
            goto L_0x005c
        L_0x0071:
            if (r1 != r7) goto L_0x0085
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0116
            int r1 = r22.f()
            androidx.compose.ui.text.font.FontStyle r1 = androidx.compose.ui.text.font.FontStyle.c(r1)
            r4.f(r1)
            goto L_0x005c
        L_0x0085:
            if (r1 != r6) goto L_0x0099
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0116
            int r1 = r22.g()
            androidx.compose.ui.text.font.FontSynthesis r1 = androidx.compose.ui.text.font.FontSynthesis.e(r1)
            r4.g(r1)
            goto L_0x005c
        L_0x0099:
            r2 = 6
            if (r1 != r2) goto L_0x00a4
            java.lang.String r1 = r22.l()
            r4.d(r1)
            goto L_0x005c
        L_0x00a4:
            r2 = 7
            if (r1 != r2) goto L_0x00b5
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0116
            long r1 = r22.o()
            r4.i(r1)
            goto L_0x005c
        L_0x00b5:
            if (r1 != r3) goto L_0x00c9
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            float r1 = r22.b()
            androidx.compose.ui.text.style.BaselineShift r1 = androidx.compose.ui.text.style.BaselineShift.d(r1)
            r4.b(r1)
            goto L_0x005c
        L_0x00c9:
            r2 = 9
            if (r1 != r2) goto L_0x00db
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0116
            androidx.compose.ui.text.style.TextGeometricTransform r1 = r22.n()
            r4.l(r1)
            goto L_0x005c
        L_0x00db:
            r2 = 10
            if (r1 != r2) goto L_0x00ee
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0116
            long r1 = r22.d()
            r4.a(r1)
            goto L_0x005c
        L_0x00ee:
            r2 = 11
            if (r1 != r2) goto L_0x0101
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            androidx.compose.ui.text.style.TextDecoration r1 = r22.m()
            r4.k(r1)
            goto L_0x005c
        L_0x0101:
            r2 = 12
            if (r1 != r2) goto L_0x005c
            int r1 = r22.a()
            r2 = 20
            if (r1 < r2) goto L_0x0116
            androidx.compose.ui.graphics.Shadow r1 = r22.j()
            r4.j(r1)
            goto L_0x005c
        L_0x0116:
            androidx.compose.ui.text.SpanStyle r1 = r4.m()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.internal.DecodeHelper.k():androidx.compose.ui.text.SpanStyle");
    }

    public final String l() {
        return this.f3696a.readString();
    }

    public final TextDecoration m() {
        int i2 = i();
        TextDecoration.Companion companion = TextDecoration.f19089b;
        boolean z2 = false;
        boolean z3 = (companion.b().e() & i2) != 0;
        if ((i2 & companion.d().e()) != 0) {
            z2 = true;
        }
        return (!z3 || !z2) ? z3 ? companion.b() : z2 ? companion.d() : companion.c() : companion.a(CollectionsKt.p(companion.b(), companion.d()));
    }

    public final TextGeometricTransform n() {
        return new TextGeometricTransform(e(), e());
    }

    public final long o() {
        byte c2 = c();
        long b2 = c2 == 1 ? TextUnitType.f19181b.b() : c2 == 2 ? TextUnitType.f19181b.a() : TextUnitType.f19181b.c();
        return TextUnitType.g(b2, TextUnitType.f19181b.c()) ? TextUnit.f19177b.a() : TextUnitKt.a(e(), b2);
    }

    public final long p() {
        return ULong.f(this.f3696a.readLong());
    }
}
