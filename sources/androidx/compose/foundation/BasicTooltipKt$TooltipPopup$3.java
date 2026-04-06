package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BasicTooltipKt$TooltipPopup$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2944A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2945B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f2946z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$TooltipPopup$3(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, CoroutineScope coroutineScope, boolean z2, Function2 function2, int i2) {
        super(2);
        this.f2946z = popupPositionProvider;
        this.f2944A = basicTooltipState;
        this.f2945B = coroutineScope;
        this.C = z2;
        this.D = function2;
        this.E = i2;
    }

    public final void b(Composer composer, int i2) {
        BasicTooltipKt.b(this.f2946z, this.f2944A, this.f2945B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
