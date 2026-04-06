package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PullToRefreshDefaults$Indicator$1 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f12600A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12601B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12602z;

    public PullToRefreshDefaults$Indicator$1(boolean z2, long j2, PullToRefreshState pullToRefreshState) {
        this.f12602z = z2;
        this.f12600A = j2;
        this.f12601B = pullToRefreshState;
    }

    public final void b(BoxScope boxScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(298232649, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:524)");
            }
            Boolean valueOf = Boolean.valueOf(this.f12602z);
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            final long j2 = this.f12600A;
            final PullToRefreshState pullToRefreshState = this.f12601B;
            CrossfadeKt.b(valueOf, (Modifier) null, b2, (String) null, ComposableLambdaKt.e(-2064098104, true, new Function3<Boolean, Composer, Integer, Unit>() {
                public static final float e(PullToRefreshState pullToRefreshState) {
                    return pullToRefreshState.b();
                }

                public final void c(boolean z2, Composer composer, int i2) {
                    if ((i2 & 6) == 0) {
                        i2 |= composer.d(z2) ? 4 : 2;
                    }
                    if (composer.E((i2 & 19) != 18, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-2064098104, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:528)");
                        }
                        if (z2) {
                            composer.X(-499784343);
                            ProgressIndicatorKt.n(SizeKt.t(Modifier.f15489d, PullToRefreshKt.u()), j2, PullToRefreshKt.f12608a, 0, 0, 0.0f, composer, 390, 56);
                            composer.M();
                        } else {
                            composer.X(-499540745);
                            boolean W = composer.W(pullToRefreshState);
                            PullToRefreshState pullToRefreshState = pullToRefreshState;
                            Object g2 = composer.g();
                            if (W || g2 == Composer.f14567a.a()) {
                                g2 = new g(pullToRefreshState);
                                composer.N(g2);
                            }
                            PullToRefreshKt.h((FloatProducer) g2, j2, composer, 0);
                            composer.M();
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    c(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, 24576, 10);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
