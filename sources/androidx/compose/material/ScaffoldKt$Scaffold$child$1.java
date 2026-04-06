package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScaffoldKt$Scaffold$child$1 extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f8265A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8266B;
    public final /* synthetic */ long C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function3 J;
    public final /* synthetic */ ScaffoldState K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f8267z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$child$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, long j2, long j3, boolean z2, int i2, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function3 function32, ScaffoldState scaffoldState) {
        super(3);
        this.f8267z = mutableWindowInsets;
        this.f8265A = windowInsets;
        this.f8266B = j2;
        this.C = j3;
        this.D = z2;
        this.E = i2;
        this.F = function2;
        this.G = function3;
        this.H = function22;
        this.I = function23;
        this.J = function32;
        this.K = scaffoldState;
    }

    public final void b(Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(modifier2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-219833176, i3, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
            }
            boolean W = composer2.W(this.f8267z) | composer2.W(this.f8265A);
            MutableWindowInsets mutableWindowInsets = this.f8267z;
            WindowInsets windowInsets = this.f8265A;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new ScaffoldKt$Scaffold$child$1$1$1(mutableWindowInsets, windowInsets);
                composer2.N(g2);
            }
            Modifier d2 = WindowInsetsPaddingKt.d(modifier2, (Function1) g2);
            long j2 = this.f8266B;
            long j3 = this.C;
            final boolean z2 = this.D;
            final int i4 = this.E;
            final Function2 function2 = this.F;
            final Function3 function3 = this.G;
            Function2 function22 = this.H;
            final Function2 function23 = function22;
            final MutableWindowInsets mutableWindowInsets2 = this.f8267z;
            final Function2 function24 = this.I;
            final Function3 function32 = this.J;
            final ScaffoldState scaffoldState = this.K;
            SurfaceKt.a(d2, (Shape) null, j2, j3, (BorderStroke) null, 0.0f, ComposableLambdaKt.e(1772955108, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1772955108, i2, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                        }
                        boolean z2 = z2;
                        int i3 = i4;
                        Function2 function2 = function2;
                        Function3 function3 = function3;
                        final Function3 function32 = function32;
                        final ScaffoldState scaffoldState = scaffoldState;
                        ScaffoldKt.c(z2, i3, function2, function3, ComposableLambdaKt.e(433906483, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(433906483, i2, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                                    }
                                    function32.d(scaffoldState.b(), composer, 0);
                                    if (ComposerKt.P()) {
                                        ComposerKt.X();
                                        return;
                                    }
                                    return;
                                }
                                composer.B();
                            }

                            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                b((Composer) obj, ((Number) obj2).intValue());
                                return Unit.f40552a;
                            }
                        }, composer, 54), function23, mutableWindowInsets2, function24, composer, 24576);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), composer, 1572864, 50);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
