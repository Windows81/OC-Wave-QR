package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LookaheadScopeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function2 f17101a = LookaheadScopeKt$defaultPlacementApproachInProgress$1.f17108z;

    public static final void a(Function3 function3, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1078066484);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1078066484, i3, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new LookaheadScopeImpl((Function0) null, 1, (DefaultConstructorMarker) null);
                q2.N(g2);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) g2;
            LookaheadScopeKt$LookaheadScope$1 lookaheadScopeKt$LookaheadScope$1 = LookaheadScopeKt$LookaheadScope$1.f17102z;
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(lookaheadScopeKt$LookaheadScope$1);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.e(b2, LookaheadScopeKt$LookaheadScope$2$1.f17103z);
            Updater.g(b2, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.f17104z);
            function3.d(lookaheadScopeImpl, q2, Integer.valueOf((i3 << 3) & 112));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new LookaheadScopeKt$LookaheadScope$4(function3, i2));
        }
    }

    public static final long b(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        LayoutCoordinates f2 = lookaheadScope.f(layoutCoordinates);
        LayoutCoordinates f3 = lookaheadScope.f(layoutCoordinates2);
        return f2 instanceof LookaheadLayoutCoordinates ? f2.I(f3, j2, z2) : f3 instanceof LookaheadLayoutCoordinates ? Offset.e(f3.I(f2, j2, z2) ^ -9223372034707292160L) : f2.I(f2, j2, z2);
    }
}
