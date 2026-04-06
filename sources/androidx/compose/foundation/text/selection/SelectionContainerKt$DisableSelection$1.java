package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionContainerKt$DisableSelection$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6797A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f6798z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$DisableSelection$1(Function2 function2, int i2) {
        super(2);
        this.f6798z = function2;
        this.f6797A = i2;
    }

    public final void b(Composer composer, int i2) {
        SelectionContainerKt.a(this.f6798z, composer, RecomposeScopeImplKt.a(this.f6797A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
