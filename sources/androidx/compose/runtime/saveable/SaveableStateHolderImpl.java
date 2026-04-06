package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final Saver E = SaverKt.e(new g(), new h());

    /* renamed from: A  reason: collision with root package name */
    public final MutableScatterMap f15199A;

    /* renamed from: B  reason: collision with root package name */
    public SaveableStateRegistry f15200B;
    public final Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final Map f15201z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return SaveableStateHolderImpl.E;
        }

        public Companion() {
        }
    }

    public SaveableStateHolderImpl(Map map) {
        this.f15201z = map;
        this.f15199A = ScatterMapKt.c();
        this.C = new i(this);
    }

    public static final DisposableEffectResult h(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateRegistryWrapper saveableStateRegistryWrapper, DisposableEffectScope disposableEffectScope) {
        if (!saveableStateHolderImpl.f15199A.b(obj)) {
            saveableStateHolderImpl.f15201z.remove(obj);
            saveableStateHolderImpl.f15199A.x(obj, saveableStateRegistryWrapper);
            return new SaveableStateHolderImpl$SaveableStateProvider$lambda$7$lambda$6$lambda$5$$inlined$onDispose$1(saveableStateHolderImpl, obj, saveableStateRegistryWrapper);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    public static final Unit i(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, Function2 function2, int i2, Composer composer, int i3) {
        saveableStateHolderImpl.c(obj, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Map j(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        return saveableStateHolderImpl.q();
    }

    public static final SaveableStateHolderImpl k(Map map) {
        return new SaveableStateHolderImpl(map);
    }

    public static final boolean p(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.f15200B;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.b(obj);
        }
        return true;
    }

    public void a(Object obj) {
        if (this.f15199A.u(obj) == null) {
            this.f15201z.remove(obj);
        }
    }

    public void c(Object obj, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(533563200);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(this) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(533563200, i3, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            q2.w(207, obj);
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                if (((Boolean) this.C.invoke(obj)).booleanValue()) {
                    g2 = new SaveableStateRegistryWrapper(SaveableStateRegistryKt.c((Map) this.f15201z.get(obj), this.C));
                    q2.N(g2);
                } else {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
            }
            SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) g2;
            CompositionLocalKt.d(new ProvidedValue[]{SaveableStateRegistryKt.g().d(saveableStateRegistryWrapper), LocalSavedStateRegistryOwnerKt.c().d(saveableStateRegistryWrapper)}, function2, q2, (i3 & 112) | ProvidedValue.f14769i);
            Unit unit = Unit.f40552a;
            boolean l2 = q2.l(this) | q2.l(obj) | q2.l(saveableStateRegistryWrapper);
            Object g3 = q2.g();
            if (l2 || g3 == companion.a()) {
                g3 = new e(this, obj, saveableStateRegistryWrapper);
                q2.N(g3);
            }
            EffectsKt.c(unit, (Function1) g3, q2, 6);
            q2.e();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new f(this, obj, function2, i2));
        }
    }

    public final Map q() {
        Map map = this.f15201z;
        MutableScatterMap mutableScatterMap = this.f15199A;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            r((SaveableStateRegistry) objArr2[i5], map, objArr[i5]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public final void r(SaveableStateRegistry saveableStateRegistry, Map map, Object obj) {
        Map d2 = saveableStateRegistry.d();
        if (d2.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, d2);
        }
    }

    public final void s(SaveableStateRegistry saveableStateRegistry) {
        this.f15200B = saveableStateRegistry;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveableStateHolderImpl(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
