package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenu_androidKt$ContextMenuArea$8 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f5657A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f5658B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f5659z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$8(SelectionManager selectionManager, Function2 function2, int i2) {
        super(2);
        this.f5659z = selectionManager;
        this.f5657A = function2;
        this.f5658B = i2;
    }

    public final void b(Composer composer, int i2) {
        ContextMenu_androidKt.b(this.f5659z, this.f5657A, composer, RecomposeScopeImplKt.a(this.f5658B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
