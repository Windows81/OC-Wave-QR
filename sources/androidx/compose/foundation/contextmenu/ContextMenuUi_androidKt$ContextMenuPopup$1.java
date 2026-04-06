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
public final class ContextMenuUi_androidKt$ContextMenuPopup$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f3280A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f3281B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f3282z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$1(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, Function1 function1, int i2, int i3) {
        super(2);
        this.f3282z = popupPositionProvider;
        this.f3280A = function0;
        this.f3281B = modifier;
        this.C = function1;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        ContextMenuUi_androidKt.d(this.f3282z, this.f3280A, this.f3281B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
