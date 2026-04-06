package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowDefaults$tabIndicatorOffset$2$1$1 extends Lambda implements Function1<Density, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8694z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2$1$1(State state) {
        super(1);
        this.f8694z = state;
    }

    public final long b(Density density) {
        return IntOffsetKt.a(density.P1(TabRowDefaults$tabIndicatorOffset$2.f(this.f8694z)), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((Density) obj));
    }
}
