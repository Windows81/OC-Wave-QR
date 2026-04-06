package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$SelectionToolbarAndHandles$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5717A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f5718B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5719z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$SelectionToolbarAndHandles$2(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2) {
        super(2);
        this.f5719z = textFieldSelectionManager;
        this.f5717A = z2;
        this.f5718B = i2;
    }

    public final void b(Composer composer, int i2) {
        CoreTextFieldKt.d(this.f5719z, this.f5717A, composer, RecomposeScopeImplKt.a(this.f5718B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
