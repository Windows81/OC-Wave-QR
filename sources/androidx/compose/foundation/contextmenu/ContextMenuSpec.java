package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextMenuSpec {

    /* renamed from: a  reason: collision with root package name */
    public static final ContextMenuSpec f3252a = new ContextMenuSpec();

    /* renamed from: b  reason: collision with root package name */
    public static final float f3253b = Dp.m((float) 112);

    /* renamed from: c  reason: collision with root package name */
    public static final float f3254c = Dp.m((float) 280);

    /* renamed from: d  reason: collision with root package name */
    public static final float f3255d = Dp.m((float) 48);

    /* renamed from: e  reason: collision with root package name */
    public static final float f3256e = Dp.m((float) 3);

    /* renamed from: f  reason: collision with root package name */
    public static final float f3257f = Dp.m((float) 4);

    /* renamed from: g  reason: collision with root package name */
    public static final Alignment.Vertical f3258g = Alignment.f15444a.i();

    /* renamed from: h  reason: collision with root package name */
    public static final int f3259h = TextAlign.f19080b.f();

    /* renamed from: i  reason: collision with root package name */
    public static final float f3260i = Dp.m((float) 12);

    /* renamed from: j  reason: collision with root package name */
    public static final float f3261j = Dp.m((float) 8);

    /* renamed from: k  reason: collision with root package name */
    public static final float f3262k = Dp.m((float) 24);

    /* renamed from: l  reason: collision with root package name */
    public static final long f3263l = TextUnitKt.i(14);

    /* renamed from: m  reason: collision with root package name */
    public static final FontWeight f3264m = FontWeight.f18746A.f();

    /* renamed from: n  reason: collision with root package name */
    public static final long f3265n = TextUnitKt.i(20);

    /* renamed from: o  reason: collision with root package name */
    public static final long f3266o = TextUnitKt.h(0.1f);

    public final float a() {
        return f3254c;
    }

    public final float b() {
        return f3253b;
    }

    public final float c() {
        return f3257f;
    }

    public final float d() {
        return f3260i;
    }

    public final float e() {
        return f3262k;
    }

    public final Alignment.Vertical f() {
        return f3258g;
    }

    public final float g() {
        return f3255d;
    }

    public final float h() {
        return f3256e;
    }

    public final float i() {
        return f3261j;
    }

    public final TextStyle j(long j2) {
        int i2 = f3259h;
        return new TextStyle(j2, f3263l, f3264m, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, f3266o, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, i2, 0, f3265n, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (DefaultConstructorMarker) null);
    }
}
