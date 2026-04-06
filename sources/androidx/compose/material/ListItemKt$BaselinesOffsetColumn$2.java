package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ListItemKt$BaselinesOffsetColumn$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7916A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7917B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f7918z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaselinesOffsetColumn$2(List list, Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f7918z = list;
        this.f7916A = modifier;
        this.f7917B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        ListItemKt.a(this.f7918z, this.f7916A, this.f7917B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
