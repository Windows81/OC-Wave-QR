package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlertDialogKt$AlertDialogBaselineLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7050A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7051B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColumnScope f7052z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$3(ColumnScope columnScope, Function2 function2, Function2 function22, int i2) {
        super(2);
        this.f7052z = columnScope;
        this.f7050A = function2;
        this.f7051B = function22;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        AlertDialogKt.a(this.f7052z, this.f7050A, this.f7051B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
