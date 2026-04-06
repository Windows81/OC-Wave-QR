package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f7008A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7009B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7010z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$3(boolean z2, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i2) {
        super(2);
        this.f7010z = z2;
        this.f7008A = resolvedTextDirection;
        this.f7009B = textFieldSelectionManager;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        TextFieldSelectionManagerKt.a(this.f7010z, this.f7008A, this.f7009B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
