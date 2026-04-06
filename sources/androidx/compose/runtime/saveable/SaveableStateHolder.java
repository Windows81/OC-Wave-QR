package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public interface SaveableStateHolder {
    void a(Object obj);

    void c(Object obj, Function2 function2, Composer composer, int i2);
}
