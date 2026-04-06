package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public interface BottomAppBarState {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f9261a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final Saver f9262b = ListSaverKt.b(new E(), new F());

        public static final List c(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
            return CollectionsKt.p(Float.valueOf(bottomAppBarState.f()), Float.valueOf(bottomAppBarState.b()), Float.valueOf(bottomAppBarState.c()));
        }

        public static final BottomAppBarState d(List list) {
            return AppBarKt.p(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    float a();

    float b();

    float c();

    void d(float f2);

    void e(float f2);

    float f();
}
