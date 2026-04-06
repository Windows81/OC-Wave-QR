package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f4863A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4864z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.f4864z = lazyLayoutItemContentFactory;
        this.f4863A = cachedItemContent;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1403994769, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:87)");
            }
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4864z.d().invoke();
            int f2 = this.f4863A.f();
            if ((f2 >= lazyLayoutItemProvider.b() || !Intrinsics.d(lazyLayoutItemProvider.c(f2), this.f4863A.g())) && (f2 = lazyLayoutItemProvider.e(this.f4863A.g())) != -1) {
                this.f4863A.f4860c = f2;
            }
            int i3 = f2;
            if (i3 != -1) {
                composer.X(-660404355);
                LazyLayoutItemContentFactoryKt.a(lazyLayoutItemProvider, StableValue.a(this.f4864z.f4854a), i3, StableValue.a(this.f4863A.g()), composer, 0);
                composer.M();
            } else {
                composer.X(-660169871);
                composer.M();
            }
            Object g2 = this.f4863A.g();
            boolean l2 = composer.l(this.f4863A);
            LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.f4863A;
            Object g3 = composer.g();
            if (l2 || g3 == Composer.f14567a.a()) {
                g3 = new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1(cachedItemContent);
                composer.N(g3);
            }
            EffectsKt.c(g2, (Function1) g3, composer, 0);
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
}
