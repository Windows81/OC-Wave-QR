package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    public CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return LimitedDispatcherKt.b(this, str);
    }

    public abstract MainCoroutineDispatcher H0();

    public final String J0() {
        MainCoroutineDispatcher mainCoroutineDispatcher;
        MainCoroutineDispatcher c2 = Dispatchers.c();
        if (this == c2) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = c2.H0();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this == mainCoroutineDispatcher) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String J0 = J0();
        if (J0 != null) {
            return J0;
        }
        return DebugStringsKt.a(this) + '@' + DebugStringsKt.b(this);
    }
}
