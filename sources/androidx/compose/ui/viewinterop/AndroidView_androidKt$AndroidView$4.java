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
public final class AndroidView_androidKt$AndroidView$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f19236A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f19237B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f19238z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(Function1 function1, Modifier modifier, Function1 function12, Function1 function13, Function1 function14, int i2, int i3) {
        super(2);
        this.f19238z = function1;
        this.f19236A = modifier;
        this.f19237B = function12;
        this.C = function13;
        this.D = function14;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidView_androidKt.b(this.f19238z, this.f19236A, this.f19237B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
