package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7877A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7878B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ FloatingActionButtonElevation H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7879z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$2(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, int i2, int i3) {
        super(2);
        this.f7879z = function2;
        this.f7877A = function0;
        this.f7878B = modifier;
        this.C = function22;
        this.D = mutableInteractionSource;
        this.E = shape;
        this.F = j2;
        this.G = j3;
        this.H = floatingActionButtonElevation;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        FloatingActionButtonKt.a(this.f7879z, this.f7877A, this.f7878B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
