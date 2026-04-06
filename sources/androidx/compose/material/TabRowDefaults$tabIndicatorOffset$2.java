package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TabPosition f8693z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.f8693z = tabPosition;
    }

    public static final float e(State state) {
        return ((Dp) state.getValue()).t();
    }

    /* access modifiers changed from: private */
    public static final float f(State state) {
        return ((Dp) state.getValue()).t();
    }

    public final Modifier c(Modifier modifier, Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-398757863);
        if (ComposerKt.P()) {
            ComposerKt.Y(-398757863, i2, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
        }
        Composer composer3 = composer;
        State c2 = AnimateAsStateKt.c(this.f8693z.c(), AnimationSpecKt.n(250, 0, EasingKt.d(), 2, (Object) null), (String) null, (Function1) null, composer3, 0, 12);
        State c3 = AnimateAsStateKt.c(this.f8693z.a(), AnimationSpecKt.n(250, 0, EasingKt.d(), 2, (Object) null), (String) null, (Function1) null, composer3, 0, 12);
        Modifier modifier2 = modifier;
        Modifier E = SizeKt.E(SizeKt.h(modifier, 0.0f, 1, (Object) null), Alignment.f15444a.d(), false, 2, (Object) null);
        boolean W = composer2.W(c3);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new TabRowDefaults$tabIndicatorOffset$2$1$1(c3);
            composer2.N(g2);
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
