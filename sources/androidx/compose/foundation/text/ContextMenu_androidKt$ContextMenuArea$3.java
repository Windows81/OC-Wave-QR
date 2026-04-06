package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenu_androidKt$ContextMenuArea$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f5646A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f5647B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5648z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$3(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i2) {
        super(2);
        this.f5648z = textFieldSelectionManager;
        this.f5646A = function2;
        this.f5647B = i2;
    }

    public final void b(Composer composer, int i2) {
        ContextMenu_androidKt.c(this.f5648z, this.f5646A, composer, RecomposeScopeImplKt.a(this.f5647B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
