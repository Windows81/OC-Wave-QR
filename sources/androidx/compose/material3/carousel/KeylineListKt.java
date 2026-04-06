package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class KeylineListKt {
    public static final KeylineList a() {
        return KeylineList.G.a();
    }

    public static final KeylineList b(float f2, float f3, int i2, float f4, Function1 function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.c(f2, f3, i2, f4);
    }

    public static final Keyline c(Keyline keyline, Keyline keyline2, float f2) {
        int i2 = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        return new Keyline(MathHelpersKt.b(keyline.e(), keyline2.e(), f2), MathHelpersKt.b(keyline.d(), keyline2.d(), f2), MathHelpersKt.b(keyline.f(), keyline2.f(), f2), i2 < 0 ? keyline.h() : keyline2.h(), i2 < 0 ? keyline.g() : keyline2.g(), i2 < 0 ? keyline.i() : keyline2.i(), MathHelpersKt.b(keyline.c(), keyline2.c(), f2));
    }

    public static final KeylineList d(KeylineList keylineList, KeylineList keylineList2, float f2) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(c((Keyline) keylineList.get(i2), keylineList2.get(i2), f2));
        }
        return new KeylineList(arrayList);
    }
}
