package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Transition$animateTo$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f2740A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2741B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2742z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$2(Transition transition, Object obj, int i2) {
        super(2);
        this.f2742z = transition;
        this.f2740A = obj;
        this.f2741B = i2;
    }

    public final void b(Composer composer, int i2) {
        this.f2742z.e(this.f2740A, composer, RecomposeScopeImplKt.a(this.f2741B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
