package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwitchKt$SwitchImpl$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8640A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8641B;
    public final /* synthetic */ SwitchColors C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ InteractionSource E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoxScope f8642z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$4(BoxScope boxScope, boolean z2, boolean z3, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, int i2) {
        super(2);
        this.f8642z = boxScope;
        this.f8640A = z2;
        this.f8641B = z3;
        this.C = switchColors;
        this.D = function0;
        this.E = interactionSource;
        this.F = i2;
    }

    public final void b(Composer composer, int i2) {
        SwitchKt.f(this.f8642z, this.f8640A, this.f8641B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
