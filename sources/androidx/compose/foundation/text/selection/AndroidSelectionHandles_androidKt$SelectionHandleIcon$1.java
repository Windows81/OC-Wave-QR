package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$SelectionHandleIcon$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f6714A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f6715B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f6716z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandleIcon$1(Modifier modifier, Function0 function0, boolean z2, int i2) {
        super(2);
        this.f6716z = modifier;
        this.f6714A = function0;
        this.f6715B = z2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        AndroidSelectionHandles_androidKt.c(this.f6716z, this.f6714A, this.f6715B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
