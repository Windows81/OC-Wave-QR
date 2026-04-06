package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuArea_androidKt$ContextMenuArea$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f3230A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f3231B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f3232z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuArea_androidKt$ContextMenuArea$3(ContextMenuState contextMenuState, Function0 function0, Function1 function1, Modifier modifier, boolean z2, Function0 function02, Function2 function2, int i2, int i3) {
        super(2);
        this.f3232z = contextMenuState;
        this.f3230A = function0;
        this.f3231B = function1;
        this.C = modifier;
        this.D = z2;
        this.E = function02;
        this.F = function2;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        ContextMenuArea_androidKt.b(this.f3232z, this.f3230A, this.f3231B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
