package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionContainerKt$SelectionContainer$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Selection f6817A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f6818B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f6819z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$6(Modifier modifier, Selection selection, Function1 function1, Function2 function2, int i2, int i3) {
        super(2);
        this.f6819z = modifier;
        this.f6817A = selection;
        this.f6818B = function1;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        SelectionContainerKt.b(this.f6819z, this.f6817A, this.f6818B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
