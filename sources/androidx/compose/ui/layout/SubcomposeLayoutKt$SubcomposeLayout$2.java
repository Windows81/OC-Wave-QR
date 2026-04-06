package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeLayoutKt$SubcomposeLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f17157A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f17158B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f17159z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$2(Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f17159z = modifier;
        this.f17157A = function2;
        this.f17158B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        SubcomposeLayoutKt.a(this.f17159z, this.f17157A, composer, RecomposeScopeImplKt.a(this.f17158B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
