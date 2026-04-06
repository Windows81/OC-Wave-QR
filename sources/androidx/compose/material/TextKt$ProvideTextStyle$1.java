package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextKt$ProvideTextStyle$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8864A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8865B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStyle f8866z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$ProvideTextStyle$1(TextStyle textStyle, Function2 function2, int i2) {
        super(2);
        this.f8866z = textStyle;
        this.f8864A = function2;
        this.f8865B = i2;
    }

    public final void b(Composer composer, int i2) {
        TextKt.a(this.f8866z, this.f8864A, composer, RecomposeScopeImplKt.a(this.f8865B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
