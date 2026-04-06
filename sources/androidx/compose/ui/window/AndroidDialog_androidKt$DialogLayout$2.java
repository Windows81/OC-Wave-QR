package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidDialog_androidKt$DialogLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f19274A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19275B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f19276z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$DialogLayout$2(Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f19276z = modifier;
        this.f19274A = function2;
        this.f19275B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidDialog_androidKt.c(this.f19276z, this.f19274A, composer, RecomposeScopeImplKt.a(this.f19275B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
