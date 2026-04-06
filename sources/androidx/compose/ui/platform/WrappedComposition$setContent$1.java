package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class WrappedComposition$setContent$1 extends Lambda implements Function1<AndroidComposeView.ViewTreeOwners, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f17948A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f17949z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, Function2 function2) {
        super(1);
        this.f17949z = wrappedComposition;
        this.f17948A = function2;
    }

    public final void b(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        if (!this.f17949z.f17946B) {
            Lifecycle a2 = viewTreeOwners.a().a();
            this.f17949z.D = this.f17948A;
            if (this.f17949z.C == null) {
                this.f17949z.C = a2;
                a2.a(this.f17949z);
            } else if (a2.b().f(Lifecycle.State.CREATED)) {
                Composition H = this.f17949z.H();
                final WrappedComposition wrappedComposition = this.f17949z;
                final Function2 function2 = this.f17948A;
                H.p(ComposableLambdaKt.c(-2000640158, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if (composer.E((i2 & 3) != 2, i2 & 1)) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(-2000640158, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                            }
                            Object tag = wrappedComposition.I().getTag(R.id.K);
                            Set set = TypeIntrinsics.n(tag) ? (Set) tag : null;
                            if (set == null) {
                                ViewParent parent = wrappedComposition.I().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(R.id.K) : null;
                                set = TypeIntrinsics.n(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.k());
                                composer.a();
                            }
                            AndroidComposeView I = wrappedComposition.I();
                            boolean l2 = composer.l(wrappedComposition);
                            WrappedComposition wrappedComposition = wrappedComposition;
                            Object g2 = composer.g();
                            if (l2 || g2 == Composer.f14567a.a()) {
                                g2 = new WrappedComposition$setContent$1$1$1$1(wrappedComposition, (Continuation) null);
                                composer.N(g2);
                            }
                            EffectsKt.g(I, (Function2) g2, composer, 0);
                            AndroidComposeView I2 = wrappedComposition.I();
                            boolean l3 = composer.l(wrappedComposition);
                            WrappedComposition wrappedComposition2 = wrappedComposition;
                            Object g3 = composer.g();
                            if (l3 || g3 == Composer.f14567a.a()) {
                                g3 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition2, (Continuation) null);
                                composer.N(g3);
                            }
                            EffectsKt.g(I2, (Function2) g3, composer, 0);
                            ProvidedValue d2 = InspectionTablesKt.c().d(set);
                            final WrappedComposition wrappedComposition3 = wrappedComposition;
                            final Function2 function2 = function2;
                            CompositionLocalKt.c(d2, ComposableLambdaKt.e(-1193460702, true, new Function2<Composer, Integer, Unit>() {
                                public final void b(Composer composer, int i2) {
                                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                        if (ComposerKt.P()) {
                                            ComposerKt.Y(-1193460702, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                                        }
                                        AndroidCompositionLocals_androidKt.a(wrappedComposition3.I(), function2, composer, 0);
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
                            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
                }));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AndroidComposeView.ViewTreeOwners) obj);
        return Unit.f40552a;
    }
}
