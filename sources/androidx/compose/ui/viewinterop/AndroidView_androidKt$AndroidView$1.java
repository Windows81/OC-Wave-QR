package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$AndroidView$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f19228A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f19229B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f19230z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$1(Function1 function1, Modifier modifier, Function1 function12, int i2, int i3) {
        super(2);
        this.f19230z = function1;
        this.f19228A = modifier;
        this.f19229B = function12;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidView_androidKt.a(this.f19230z, this.f19228A, this.f19229B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
