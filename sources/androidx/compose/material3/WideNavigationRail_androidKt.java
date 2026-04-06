package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class WideNavigationRail_androidKt {
    public static final Function2 a(State state) {
        return (Function2) state.getValue();
    }

    public static final ModalWideNavigationRailProperties c() {
        return new ModalWideNavigationRailProperties(false, 1, (DefaultConstructorMarker) null);
    }
}
