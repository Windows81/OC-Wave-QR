package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InfiniteTransition$run$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f2597A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2598z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$2(InfiniteTransition infiniteTransition, int i2) {
        super(2);
        this.f2598z = infiniteTransition;
        this.f2597A = i2;
    }

    public final void b(Composer composer, int i2) {
        this.f2598z.k(composer, RecomposeScopeImplKt.a(this.f2597A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
