package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextFieldRootBox$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5714A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f5715B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f5716z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextFieldRootBox$2(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i2) {
        super(2);
        this.f5716z = modifier;
        this.f5714A = textFieldSelectionManager;
        this.f5715B = function2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        CoreTextFieldKt.c(this.f5716z, this.f5714A, this.f5715B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
