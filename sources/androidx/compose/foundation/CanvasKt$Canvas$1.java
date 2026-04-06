package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CanvasKt$Canvas$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f2991A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2992B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f2993z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$1(Modifier modifier, Function1 function1, int i2) {
        super(2);
        this.f2993z = modifier;
        this.f2991A = function1;
        this.f2992B = i2;
    }

    public final void b(Composer composer, int i2) {
        CanvasKt.b(this.f2993z, this.f2991A, composer, RecomposeScopeImplKt.a(this.f2992B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
