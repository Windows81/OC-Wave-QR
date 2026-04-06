package com.hansecom.abt.ui.theme;

import androidx.activity.SystemBarStyle;
import com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme;
import com.hansecom.abt.ui.theme.colorScheme.ColorSchemes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class OctaColorSchemes implements ColorSchemes {

    /* renamed from: b  reason: collision with root package name */
    public static final OctaColorSchemes f38891b = new OctaColorSchemes();

    /* renamed from: c  reason: collision with root package name */
    public static final SystemBarStyle f38892c = SystemBarStyle.f114e.c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final AbtColorScheme f38893d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f38894e = 8;

    static {
        OctaColorPalette octaColorPalette = OctaColorPalette.f38865a;
        long b2 = octaColorPalette.b();
        long m2 = octaColorPalette.m();
        long b3 = octaColorPalette.b();
        long m3 = octaColorPalette.m();
        long j2 = octaColorPalette.j();
        long l2 = octaColorPalette.l();
        long m4 = octaColorPalette.m();
        long m5 = octaColorPalette.m();
        long w2 = octaColorPalette.w();
        long h2 = octaColorPalette.h();
        long j3 = octaColorPalette.j();
        f38893d = new AbtColorScheme(false, b2, m2, b3, m3, octaColorPalette.r(), octaColorPalette.m(), octaColorPalette.u(), octaColorPalette.r(), octaColorPalette.e(), octaColorPalette.m(), octaColorPalette.f(), octaColorPalette.e(), octaColorPalette.o(), octaColorPalette.m(), octaColorPalette.p(), octaColorPalette.n(), octaColorPalette.b(), octaColorPalette.a(), octaColorPalette.c(), octaColorPalette.a(), octaColorPalette.l(), octaColorPalette.g(), j2, l2, m4, m5, h2, j3, w2, (DefaultConstructorMarker) null);
    }

    public AbtColorScheme a() {
        return f38893d;
    }

    public AbtColorScheme b() {
        OctaColorPalette octaColorPalette = OctaColorPalette.f38865a;
        long q2 = octaColorPalette.q();
        long a2 = octaColorPalette.a();
        long v2 = octaColorPalette.v();
        long a3 = octaColorPalette.a();
        long j2 = octaColorPalette.j();
        long g2 = octaColorPalette.g();
        long m2 = octaColorPalette.m();
        long i2 = octaColorPalette.i();
        long h2 = octaColorPalette.h();
        long m3 = octaColorPalette.m();
        long k2 = octaColorPalette.k();
        return new AbtColorScheme(true, q2, a2, v2, a3, octaColorPalette.t(), octaColorPalette.s(), octaColorPalette.r(), octaColorPalette.u(), octaColorPalette.d(), octaColorPalette.e(), octaColorPalette.e(), octaColorPalette.w(), octaColorPalette.o(), octaColorPalette.m(), octaColorPalette.n(), octaColorPalette.w(), octaColorPalette.v(), octaColorPalette.a(), octaColorPalette.b(), octaColorPalette.w(), octaColorPalette.g(), octaColorPalette.l(), j2, g2, m2, i2, m3, k2, h2, (DefaultConstructorMarker) null);
    }

    public AbtColorScheme c(boolean z2) {
        return ColorSchemes.DefaultImpls.a(this, z2);
    }
}
