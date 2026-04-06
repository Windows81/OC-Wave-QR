package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ColorsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7519a = CompositionLocalKt.j(ColorsKt$LocalColors$1.f7520z);

    public static final long a(Colors colors, long j2) {
        return Color.n(j2, colors.j()) ? colors.g() : Color.n(j2, colors.k()) ? colors.g() : Color.n(j2, colors.l()) ? colors.h() : Color.n(j2, colors.m()) ? colors.h() : Color.n(j2, colors.c()) ? colors.e() : Color.n(j2, colors.n()) ? colors.i() : Color.n(j2, colors.d()) ? colors.f() : Color.f15975b.f();
    }

    public static final long b(long j2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(441849991, i2, -1, "androidx.compose.material.contentColorFor (Colors.kt:311)");
        }
        composer.X(-702388415);
        long a2 = a(MaterialTheme.f7937a.a(composer, 6), j2);
        if (a2 == 16) {
            a2 = ((Color) composer.C(ContentColorKt.a())).v();
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public static final ProvidableCompositionLocal c() {
        return f7519a;
    }

    public static final long d(Colors colors) {
        return colors.o() ? colors.j() : colors.n();
    }

    public static final Colors e(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, true, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Colors f(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        int i3 = i2;
        return e((i3 & 1) != 0 ? ColorKt.d(4284612846L) : j2, (i3 & 2) != 0 ? ColorKt.d(4281794739L) : j3, (i3 & 4) != 0 ? ColorKt.d(4278442694L) : j4, (i3 & 8) != 0 ? ColorKt.d(4278290310L) : j5, (i3 & 16) != 0 ? Color.f15975b.g() : j6, (i3 & 32) != 0 ? Color.f15975b.g() : j7, (i3 & 64) != 0 ? ColorKt.d(4289724448L) : j8, (i3 & 128) != 0 ? Color.f15975b.g() : j9, (i3 & 256) != 0 ? Color.f15975b.a() : j10, (i3 & 512) != 0 ? Color.f15975b.a() : j11, (i3 & 1024) != 0 ? Color.f15975b.a() : j12, (i3 & 2048) != 0 ? Color.f15975b.g() : j13);
    }

    public static final void g(Colors colors, Colors colors2) {
        colors.x(colors2.j());
        colors.y(colors2.k());
        colors.z(colors2.l());
        colors.A(colors2.m());
        colors.p(colors2.c());
        colors.B(colors2.n());
        colors.q(colors2.d());
        colors.u(colors2.g());
        colors.v(colors2.h());
        colors.s(colors2.e());
        colors.w(colors2.i());
        colors.t(colors2.f());
        colors.r(colors2.o());
    }
}
