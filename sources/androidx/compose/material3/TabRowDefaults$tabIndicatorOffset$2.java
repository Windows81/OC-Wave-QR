package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TabRowDefaults$tabIndicatorOffset$2 implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TabPosition f11297z;

    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        this.f11297z = tabPosition;
    }

    private static final float e(State state) {
        return ((Dp) state.getValue()).t();
    }

    private static final float f(State state) {
        return ((Dp) state.getValue()).t();
    }

    public static final IntOffset g(State state, Density density) {
        return IntOffset.c(IntOffset.f((((long) density.P1(f(state))) << 32) | (((long) 0) & 4294967295L)));
    }

    public final Modifier c(Modifier modifier, Composer composer, int i2) {
        composer.X(-1541271084);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1541271084, i2, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1108)");
        }
        float d2 = this.f11297z.d();
        MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
        Composer composer2 = composer;
        State c2 = AnimateAsStateKt.c(d2, MotionSchemeKt.b(motionSchemeKeyTokens, composer, 6), (String) null, (Function1) null, composer2, 0, 12);
        State c3 = AnimateAsStateKt.c(this.f11297z.b(), MotionSchemeKt.b(motionSchemeKeyTokens, composer, 6), (String) null, (Function1) null, composer2, 0, 12);
        Modifier E = SizeKt.E(SizeKt.h(modifier, 0.0f, 1, (Object) null), Alignment.f15444a.d(), false, 2, (Object) null);
        boolean W = composer.W(c3);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new T6(c3);
            composer.N(g2);
        }
        Modifier y2 = SizeKt.y(OffsetKt.a(E, (Function1) g2), e(c2));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return y2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return c((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
