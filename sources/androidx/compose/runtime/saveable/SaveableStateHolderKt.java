package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(15454635, i2, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        composer.X(1967008021);
        Object[] objArr = new Object[0];
        Saver a2 = SaveableStateHolderImpl.D.a();
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new j();
            composer.N(g2);
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.i(objArr, a2, (Function0) g2, composer, 384);
        saveableStateHolderImpl.s((SaveableStateRegistry) composer.C(SaveableStateRegistryKt.g()));
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return saveableStateHolderImpl;
    }

    public static final SaveableStateHolderImpl c() {
        return new SaveableStateHolderImpl((Map) null, 1, (DefaultConstructorMarker) null);
    }
}
