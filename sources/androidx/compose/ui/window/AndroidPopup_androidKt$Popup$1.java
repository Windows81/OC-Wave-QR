package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f19280A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f19281B;
    public final /* synthetic */ PopupProperties C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment f19282z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(Alignment alignment, long j2, Function0 function0, PopupProperties popupProperties, Function2 function2, int i2, int i3) {
        super(2);
        this.f19282z = alignment;
        this.f19280A = j2;
        this.f19281B = function0;
        this.C = popupProperties;
        this.D = function2;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidPopup_androidKt.c(this.f19282z, this.f19280A, this.f19281B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
