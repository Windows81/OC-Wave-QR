package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$visibleEntries$2$1 extends Lambda implements Function0<List<? extends NavBackStackEntry>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f22581z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$visibleEntries$2$1(State state) {
        super(0);
        this.f22581z = state;
    }

    /* renamed from: b */
    public final List invoke() {
        ArrayList arrayList = new ArrayList();
        for (Object next : NavHostKt.k(this.f22581z)) {
            if (Intrinsics.d(((NavBackStackEntry) next).g().u(), "composable")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
