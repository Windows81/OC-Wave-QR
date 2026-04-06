package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$DialogHost$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f22487A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f22488z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$3(DialogNavigator dialogNavigator, int i2) {
        super(2);
        this.f22488z = dialogNavigator;
        this.f22487A = i2;
    }

    public final void b(Composer composer, int i2) {
        DialogHostKt.a(this.f22488z, composer, RecomposeScopeImplKt.a(this.f22487A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
