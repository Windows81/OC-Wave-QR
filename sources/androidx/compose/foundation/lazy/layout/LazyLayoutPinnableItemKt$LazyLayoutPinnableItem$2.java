package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4904A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPinnedItemList f4905B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f4906z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(Object obj, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, Function2 function2, int i3) {
        super(2);
        this.f4906z = obj;
        this.f4904A = i2;
        this.f4905B = lazyLayoutPinnedItemList;
        this.C = function2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyLayoutPinnableItemKt.a(this.f4906z, this.f4904A, this.f4905B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
