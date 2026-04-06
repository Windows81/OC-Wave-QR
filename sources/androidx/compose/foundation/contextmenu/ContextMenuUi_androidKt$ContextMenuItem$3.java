package androidx.compose.foundation.contextmenu;

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
public final class ContextMenuUi_androidKt$ContextMenuItem$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f3277A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f3278B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f3279z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuItem$3(String str, boolean z2, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i2, int i3) {
        super(2);
        this.f3279z = str;
        this.f3277A = z2;
        this.f3278B = contextMenuColors;
        this.C = modifier;
        this.D = function3;
        this.E = function0;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        ContextMenuUi_androidKt.b(this.f3279z, this.f3277A, this.f3278B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
