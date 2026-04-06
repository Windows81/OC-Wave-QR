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
public final class FloatingActionButtonKt$FloatingActionButton$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7885A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f7886B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ FloatingActionButtonElevation F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7887z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$3(Function0 function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, Function2 function2, int i2, int i3) {
        super(2);
        this.f7887z = function0;
        this.f7885A = modifier;
        this.f7886B = mutableInteractionSource;
        this.C = shape;
        this.D = j2;
        this.E = j3;
        this.F = floatingActionButtonElevation;
        this.G = function2;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        FloatingActionButtonKt.b(this.f7887z, this.f7885A, this.f7886B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
