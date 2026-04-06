package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class LayoutIdKt {
    public static final Object a(Measurable measurable) {
        Object t2 = measurable.t();
        LayoutIdParentData layoutIdParentData = t2 instanceof LayoutIdParentData ? (LayoutIdParentData) t2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.u0();
        }
        return null;
    }

    public static final Modifier b(Modifier modifier, Object obj) {
        return modifier.o0(new LayoutIdElement(obj));
    }
}
