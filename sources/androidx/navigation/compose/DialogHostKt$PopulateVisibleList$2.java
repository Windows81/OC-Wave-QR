package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$PopulateVisibleList$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Collection f22492A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f22493B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f22494z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$2(List list, Collection collection, int i2) {
        super(2);
        this.f22494z = list;
        this.f22492A = collection;
        this.f22493B = i2;
    }

    public final void b(Composer composer, int i2) {
        DialogHostKt.d(this.f22494z, this.f22492A, composer, RecomposeScopeImplKt.a(this.f22493B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
