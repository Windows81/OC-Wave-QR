package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;

@Metadata
public final class EncodeHelper {

    /* renamed from: a  reason: collision with root package name */
    public Parcel f3697a = Parcel.obtain();

    public final void a(byte b2) {
        this.f3697a.writeByte(b2);
    }

    public final void b(float f2) {
        this.f3697a.writeFloat(f2);
    }

    public final void c(int i2) {
        this.f3697a.writeInt(i2);
    }

    public final void d(Shadow shadow) {
        m(shadow.c());
        b(Float.intBitsToFloat((int) (shadow.d() >> 32)));
        b(Float.intBitsToFloat((int) (shadow.d() & 4294967295L)));
        b(shadow.b());
    }

    public final void e(SpanStyle spanStyle) {
        long g2 = spanStyle.g();
        Color.Companion companion = Color.f15975b;
        if (!Color.n(g2, companion.f())) {
            a((byte) 1);
            m(spanStyle.g());
        }
        long k2 = spanStyle.k();
        TextUnit.Companion companion2 = TextUnit.f19177b;
        if (!TextUnit.e(k2, companion2.a())) {
            a((byte) 2);
            j(spanStyle.k());
        }
        FontWeight n2 = spanStyle.n();
        if (n2 != null) {
            a((byte) 3);
            f(n2);
        }
        FontStyle l2 = spanStyle.l();
        if (l2 != null) {
            int i2 = l2.i();
            a((byte) 4);
            o(i2);
        }
        FontSynthesis m2 = spanStyle.m();
        if (m2 != null) {
            int m3 = m2.m();
            a((byte) 5);
            l(m3);
        }
        String j2 = spanStyle.j();
        if (j2 != null) {
            a((byte) 6);
            i(j2);
        }
        if (!TextUnit.e(spanStyle.o(), companion2.a())) {
            a((byte) 7);
            j(spanStyle.o());
        }
        BaselineShift e2 = spanStyle.e();
        if (e2 != null) {
            float j3 = e2.j();
            a((byte) 8);
            k(j3);
        }
        TextGeometricTransform u2 = spanStyle.u();
        if (u2 != null) {
            a((byte) 9);
            h(u2);
        }
        if (!Color.n(spanStyle.d(), companion.f())) {
            a((byte) 10);
            m(spanStyle.d());
        }
        TextDecoration s2 = spanStyle.s();
        if (s2 != null) {
            a((byte) 11);
            g(s2);
        }
        Shadow r2 = spanStyle.r();
        if (r2 != null) {
            a((byte) 12);
            d(r2);
        }
    }

    public final void f(FontWeight fontWeight) {
        c(fontWeight.y());
    }

    public final void g(TextDecoration textDecoration) {
        c(textDecoration.e());
    }

    public final void h(TextGeometricTransform textGeometricTransform) {
        b(textGeometricTransform.b());
        b(textGeometricTransform.c());
    }

    public final void i(String str) {
        this.f3697a.writeString(str);
    }

    public final void j(long j2) {
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        byte b2 = 0;
        if (!TextUnitType.g(g2, companion.c())) {
            if (TextUnitType.g(g2, companion.b())) {
                b2 = 1;
            } else if (TextUnitType.g(g2, companion.a())) {
                b2 = 2;
            }
        }
        a(b2);
        if (!TextUnitType.g(TextUnit.g(j2), companion.c())) {
            b(TextUnit.h(j2));
        }
    }

    public final void k(float f2) {
        b(f2);
    }

    public final void l(int i2) {
        FontSynthesis.Companion companion = FontSynthesis.f18728b;
        byte b2 = 0;
        if (!FontSynthesis.h(i2, companion.b())) {
            if (FontSynthesis.h(i2, companion.a())) {
                b2 = 1;
            } else if (FontSynthesis.h(i2, companion.d())) {
                b2 = 2;
            } else if (FontSynthesis.h(i2, companion.c())) {
                b2 = 3;
            }
        }
        a(b2);
    }

    public final void m(long j2) {
        n(j2);
    }

    public final void n(long j2) {
        this.f3697a.writeLong(j2);
    }

    public final void o(int i2) {
        FontStyle.Companion companion = FontStyle.f18724b;
        byte b2 = 0;
        if (!FontStyle.f(i2, companion.b()) && FontStyle.f(i2, companion.a())) {
            b2 = 1;
        }
        a(b2);
    }

    public final String p() {
        return Base64.encodeToString(this.f3697a.marshall(), 0);
    }

    public final void q() {
        this.f3697a.recycle();
        this.f3697a = Parcel.obtain();
    }
}
