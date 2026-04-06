package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public interface SaveableStateRegistry {

    @Metadata
    public interface Entry {
        void a();
    }

    boolean b(Object obj);

    Map d();

    Object e(String str);

    Entry f(String str, Function0 function0);
}
