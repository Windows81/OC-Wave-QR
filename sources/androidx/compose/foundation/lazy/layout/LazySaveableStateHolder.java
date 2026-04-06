package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final SaveableStateHolder f4934A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableScatterSet f4935B;

    /* renamed from: z  reason: collision with root package name */
    public final SaveableStateRegistry f4936z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
            return SaverKt.e(LazySaveableStateHolder$Companion$saver$1.f4940z, new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry, saveableStateHolder));
        }

        public Companion() {
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        this.f4936z = saveableStateRegistry;
        this.f4934A = saveableStateHolder;
        this.f4935B = ScatterSetKt.a();
    }

    public void a(Object obj) {
        this.f4934A.a(obj);
    }

    public boolean b(Object obj) {
        return this.f4936z.b(obj);
    }

    public void c(Object obj, Function2 function2, Composer composer, int i2) {
        composer.X(-697180401);
        if (ComposerKt.P()) {
            ComposerKt.Y(-697180401, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
        }
        int i3 = i2 & 14;
        this.f4934A.c(obj, function2, composer, i2 & 126);
        boolean l2 = composer.l(this) | composer.l(obj);
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new LazySaveableStateHolder$SaveableStateProvider$1$1(this, obj);
            composer.N(g2);
        }
        EffectsKt.c(obj, (Function1) g2, composer, i3);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public Map d() {
        MutableScatterSet mutableScatterSet = this.f4935B;
        Object[] objArr = mutableScatterSet.f1967b;
        long[] jArr = mutableScatterSet.f1966a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            this.f4934A.a(objArr[(i2 << 3) + i4]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return this.f4936z.d();
    }

    public Object e(String str) {
        return this.f4936z.e(str);
    }

    public SaveableStateRegistry.Entry f(String str, Function0 function0) {
        return this.f4936z.f(str, function0);
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map map, SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.c(map, new Function1<Object, Boolean>() {
            /* renamed from: b */
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry = saveableStateRegistry;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.b(obj) : true);
            }
        }), saveableStateHolder);
    }
}
