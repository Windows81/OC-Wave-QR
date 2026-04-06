package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutItemContentFactoryKt$SkippableItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f4869A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4870B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemProvider f4871z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$2(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2, Object obj2, int i3) {
        super(2);
        this.f4871z = lazyLayoutItemProvider;
        this.f4869A = obj;
        this.f4870B = i2;
        this.C = obj2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyLayoutItemContentFactoryKt.a(this.f4871z, this.f4869A, this.f4870B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
