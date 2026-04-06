package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SimpleLayoutKt$SimpleLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f6959A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f6960B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f6961z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleLayoutKt$SimpleLayout$2(Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f6961z = modifier;
        this.f6959A = function2;
        this.f6960B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        SimpleLayoutKt.a(this.f6961z, this.f6959A, composer, RecomposeScopeImplKt.a(this.f6960B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
