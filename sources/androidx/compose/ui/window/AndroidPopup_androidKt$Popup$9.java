package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$9 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f19296A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PopupProperties f19297B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f19298z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$9(PopupPositionProvider popupPositionProvider, Function0 function0, PopupProperties popupProperties, Function2 function2, int i2, int i3) {
        super(2);
        this.f19298z = popupPositionProvider;
        this.f19296A = function0;
        this.f19297B = popupProperties;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidPopup_androidKt.a(this.f19298z, this.f19296A, this.f19297B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
