package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutKt$LazyLayout$1 extends Lambda implements Function3<SaveableStateHolder, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f4876A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f4877B;
    public final /* synthetic */ State C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4878z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, Function2 function2, State state) {
        super(3);
        this.f4878z = lazyLayoutPrefetchState;
        this.f4876A = modifier;
        this.f4877B = function2;
        this.C = state;
    }

    public final void b(SaveableStateHolder saveableStateHolder, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1488997347, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:56)");
        }
        State state = this.C;
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(state));
            composer.N(g2);
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.N(g3);
        }
        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) g3;
        if (this.f4878z != null) {
            composer.X(204281539);
            PrefetchScheduler d2 = this.f4878z.d();
            if (d2 == null) {
                composer.X(6591363);
                d2 = PrefetchScheduler_androidKt.a(composer, 0);
            } else {
                composer.X(6590278);
            }
            composer.M();
            Object[] objArr = {this.f4878z, lazyLayoutItemContentFactory, subcomposeLayoutState, d2};
            boolean W = composer.W(this.f4878z) | composer.l(lazyLayoutItemContentFactory) | composer.l(subcomposeLayoutState) | composer.l(d2);
            LazyLayoutPrefetchState lazyLayoutPrefetchState = this.f4878z;
            Object g4 = composer.g();
            if (W || g4 == companion.a()) {
                g4 = new LazyLayoutKt$LazyLayout$1$1$1(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, d2);
                composer.N(g4);
            }
            EffectsKt.d(objArr, (Function1) g4, composer, 0);
            composer.M();
        } else {
            composer.X(204710145);
            composer.M();
        }
        Modifier b2 = LazyLayoutPrefetchStateKt.b(this.f4876A, this.f4878z);
        boolean W2 = composer.W(lazyLayoutItemContentFactory) | composer.W(this.f4877B);
        Function2 function2 = this.f4877B;
        Object g5 = composer.g();
        if (W2 || g5 == companion.a()) {
            g5 = new LazyLayoutKt$LazyLayout$1$2$1(lazyLayoutItemContentFactory, function2);
            composer.N(g5);
        }
        SubcomposeLayoutKt.b(subcomposeLayoutState, b2, (Function2) g5, composer, SubcomposeLayoutState.f17164f, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SaveableStateHolder) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
