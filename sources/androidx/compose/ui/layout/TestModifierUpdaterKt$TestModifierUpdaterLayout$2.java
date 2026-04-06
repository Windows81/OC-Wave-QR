package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f17176A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f17177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(Function1 function1, int i2) {
        super(2);
        this.f17177z = function1;
        this.f17176A = i2;
    }

    public final void b(Composer composer, int i2) {
        TestModifierUpdaterKt.a(this.f17177z, composer, RecomposeScopeImplKt.a(this.f17176A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
