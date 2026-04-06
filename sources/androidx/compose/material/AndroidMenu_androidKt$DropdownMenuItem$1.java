package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
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
public final class AndroidMenu_androidKt$DropdownMenuItem$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7135A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7136B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7137z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenuItem$1(Function0 function0, Modifier modifier, boolean z2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3) {
        super(2);
        this.f7137z = function0;
        this.f7135A = modifier;
        this.f7136B = z2;
        this.C = paddingValues;
        this.D = mutableInteractionSource;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidMenu_androidKt.c(this.f7137z, this.f7135A, this.f7136B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
