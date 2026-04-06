package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ListItemKt$OffsetToBaselineOrCenter$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7926A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7927B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7928z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$OffsetToBaselineOrCenter$2(float f2, Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f7928z = f2;
        this.f7926A = modifier;
        this.f7927B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        ListItemKt.c(this.f7928z, this.f7926A, this.f7927B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
