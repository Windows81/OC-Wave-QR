package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuUi_androidKt$ContextMenuPopup$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f3288A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f3289B;
    public final /* synthetic */ ContextMenuColors C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f3290z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$3(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i2, int i3) {
        super(2);
        this.f3290z = popupPositionProvider;
        this.f3288A = function0;
        this.f3289B = modifier;
        this.C = contextMenuColors;
        this.D = function1;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        ContextMenuUi_androidKt.c(this.f3290z, this.f3288A, this.f3289B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
