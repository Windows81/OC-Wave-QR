package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenu_androidKt$ContextMenuArea$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5653A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f5654B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5655z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$6(TextFieldSelectionState textFieldSelectionState, boolean z2, Function2 function2, int i2) {
        super(2);
        this.f5655z = textFieldSelectionState;
        this.f5653A = z2;
        this.f5654B = function2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        ContextMenu_androidKt.a(this.f5655z, this.f5653A, this.f5654B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
