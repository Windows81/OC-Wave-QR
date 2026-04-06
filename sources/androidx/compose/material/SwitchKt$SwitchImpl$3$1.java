package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class SwitchKt$SwitchImpl$3$1 extends Lambda implements Function1<Density, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f8639z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$3$1(Function0 function0) {
        super(1);
        this.f8639z = function0;
    }

    public final long b(Density density) {
        return IntOffsetKt.a(MathKt.d(((Number) this.f8639z.invoke()).floatValue()), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((Density) obj));
    }
}
