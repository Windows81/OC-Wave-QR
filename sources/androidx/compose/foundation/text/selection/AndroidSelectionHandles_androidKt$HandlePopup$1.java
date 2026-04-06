package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Alignment f6697A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f6698B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f6699z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$HandlePopup$1(OffsetProvider offsetProvider, Alignment alignment, Function2 function2, int i2) {
        super(2);
        this.f6699z = offsetProvider;
        this.f6697A = alignment;
        this.f6698B = function2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        AndroidSelectionHandles_androidKt.a(this.f6699z, this.f6697A, this.f6698B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
