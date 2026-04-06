package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoxKt$Box$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f3784A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f3785z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$Box$2(Modifier modifier, int i2) {
        super(2);
        this.f3785z = modifier;
        this.f3784A = i2;
    }

    public final void b(Composer composer, int i2) {
        BoxKt.a(this.f3785z, composer, RecomposeScopeImplKt.a(this.f3784A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
