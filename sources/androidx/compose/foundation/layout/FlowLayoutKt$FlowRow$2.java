package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowLayoutKt$FlowRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f3949A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f3950B;
    public final /* synthetic */ Alignment.Vertical C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f3951z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowRow$2(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, Function3 function3, int i4, int i5) {
        super(2);
        this.f3951z = modifier;
        this.f3949A = horizontal;
        this.f3950B = vertical;
        this.C = vertical2;
        this.D = i2;
        this.E = i3;
        this.F = function3;
        this.G = i4;
        this.H = i5;
    }

    public final void b(Composer composer, int i2) {
        FlowLayoutKt.d(this.f3951z, this.f3949A, this.f3950B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
