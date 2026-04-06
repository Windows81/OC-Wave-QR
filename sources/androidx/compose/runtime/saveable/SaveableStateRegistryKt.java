package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

@Metadata
public final class SaveableStateRegistryKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f15211a = CompositionLocalKt.j(new k());

    public static final SaveableStateRegistry b() {
        return null;
    }

    public static final SaveableStateRegistry c(Map map, Function1 function1) {
        return new SaveableStateRegistryImpl(map, function1);
    }

    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.c(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static final ProvidableCompositionLocal g() {
        return f15211a;
    }

    public static final MutableScatterMap h(Map map) {
        MutableScatterMap mutableScatterMap = new MutableScatterMap(map.size());
        mutableScatterMap.t(map);
        return mutableScatterMap;
    }
}
