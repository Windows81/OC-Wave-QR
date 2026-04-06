package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IconButtonKt$IconButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7891A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7892B;
    public final /* synthetic */ MutableInteractionSource C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7893z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$2(Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Function2 function2, int i2, int i3) {
        super(2);
        this.f7893z = function0;
        this.f7891A = modifier;
        this.f7892B = z2;
        this.C = mutableInteractionSource;
        this.D = function2;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        IconButtonKt.a(this.f7893z, this.f7891A, this.f7892B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
