package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$Tab$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8664A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8665B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8666z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$4(boolean z2, Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, long j2, long j3, Function3 function3, int i2, int i3) {
        super(2);
        this.f8666z = z2;
        this.f8664A = function0;
        this.f8665B = modifier;
        this.C = z3;
        this.D = mutableInteractionSource;
        this.E = j2;
        this.F = j3;
        this.G = function3;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        TabKt.c(this.f8666z, this.f8664A, this.f8665B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
