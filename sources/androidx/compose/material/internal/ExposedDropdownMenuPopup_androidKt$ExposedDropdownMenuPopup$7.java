package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f8979A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8980B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f8981z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7(Function0 function0, PopupPositionProvider popupPositionProvider, Function2 function2, int i2, int i3) {
        super(2);
        this.f8981z = function0;
        this.f8979A = popupPositionProvider;
        this.f8980B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        ExposedDropdownMenuPopup_androidKt.a(this.f8981z, this.f8979A, this.f8980B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
