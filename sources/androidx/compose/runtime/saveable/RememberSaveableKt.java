package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RememberSaveableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15194a = 36;

    public static final String d(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Saver e(Saver saver) {
        Intrinsics.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.e(new c(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    public static final MutableState f(Saver saver, SaverScope saverScope, MutableState mutableState) {
        if (mutableState instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
            Object b2 = saver.b(saverScope, snapshotMutableState.getValue());
            if (b2 == null) {
                return null;
            }
            SnapshotMutationPolicy d2 = snapshotMutableState.d();
            Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.i(b2, d2);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
    }

    public static final MutableState g(Object[] objArr, Saver saver, Function0 function0, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-746165481, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:208)");
        }
        MutableState mutableState = (MutableState) h(Arrays.copyOf(objArr, objArr.length), e(saver), (String) null, function0, composer, ((i2 << 3) & 7168) | 384, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (r0 == r7.a()) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(java.lang.Object[] r9, androidx.compose.runtime.saveable.Saver r10, java.lang.String r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0008
            androidx.compose.runtime.saveable.Saver r10 = androidx.compose.runtime.saveable.SaverKt.f()
        L_0x0008:
            r15 = r15 & 4
            r0 = 0
            if (r15 == 0) goto L_0x000e
            r11 = r0
        L_0x000e:
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x001d
            r15 = -1
            java.lang.String r1 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)"
            r2 = 441892779(0x1a56bfab, float:4.440899E-23)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r15, r1)
        L_0x001d:
            r15 = 0
            long r1 = androidx.compose.runtime.ComposablesKt.b(r13, r15)
            if (r11 == 0) goto L_0x002a
            int r3 = r11.length()
            if (r3 != 0) goto L_0x0039
        L_0x002a:
            int r11 = f15194a
            int r11 = kotlin.text.CharsKt.a(r11)
            java.lang.String r11 = java.lang.Long.toString(r1, r11)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r1)
        L_0x0039:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.g(r10, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.g()
            java.lang.Object r1 = r13.C(r1)
            r6 = r1
            androidx.compose.runtime.saveable.SaveableStateRegistry r6 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r6
            java.lang.Object r1 = r13.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r7.a()
            if (r1 != r2) goto L_0x0076
            if (r6 == 0) goto L_0x0061
            java.lang.Object r1 = r6.e(r11)
            if (r1 == 0) goto L_0x0061
            java.lang.Object r0 = r10.a(r1)
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            java.lang.Object r0 = r12.invoke()
        L_0x0067:
            r4 = r0
            androidx.compose.runtime.saveable.SaveableHolder r8 = new androidx.compose.runtime.saveable.SaveableHolder
            r0 = r8
            r1 = r10
            r2 = r6
            r3 = r11
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r13.N(r8)
            r1 = r8
        L_0x0076:
            androidx.compose.runtime.saveable.SaveableHolder r1 = (androidx.compose.runtime.saveable.SaveableHolder) r1
            java.lang.Object r0 = r1.c(r9)
            if (r0 != 0) goto L_0x0082
            java.lang.Object r0 = r12.invoke()
        L_0x0082:
            r12 = r0
            boolean r0 = r13.l(r1)
            r2 = r14 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 32
            if (r2 <= r3) goto L_0x0095
            boolean r2 = r13.l(r10)
            if (r2 != 0) goto L_0x0099
        L_0x0095:
            r14 = r14 & 48
            if (r14 != r3) goto L_0x009b
        L_0x0099:
            r14 = 1
            goto L_0x009c
        L_0x009b:
            r14 = r15
        L_0x009c:
            r14 = r14 | r0
            boolean r0 = r13.l(r6)
            r14 = r14 | r0
            boolean r0 = r13.W(r11)
            r14 = r14 | r0
            boolean r0 = r13.l(r12)
            r14 = r14 | r0
            boolean r0 = r13.l(r9)
            r14 = r14 | r0
            java.lang.Object r0 = r13.g()
            if (r14 != 0) goto L_0x00bd
            java.lang.Object r14 = r7.a()
            if (r0 != r14) goto L_0x00cb
        L_0x00bd:
            androidx.compose.runtime.saveable.b r14 = new androidx.compose.runtime.saveable.b
            r0 = r14
            r2 = r10
            r3 = r6
            r4 = r11
            r5 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.N(r14)
        L_0x00cb:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.runtime.EffectsKt.h(r0, r13, r15)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00d9
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.h(java.lang.Object[], androidx.compose.runtime.saveable.Saver, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):java.lang.Object");
    }

    public static final Object i(Object[] objArr, Saver saver, Function0 function0, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(674689872, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        Object h2 = h(Arrays.copyOf(objArr, objArr.length), saver, (String) null, function0, composer, (i2 & 112) | 384 | ((i2 << 3) & 7168), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return h2;
    }

    public static final Object j(Object[] objArr, Function0 function0, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1564532345, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object h2 = h(Arrays.copyOf(objArr, objArr.length), SaverKt.f(), (String) null, function0, composer, ((i2 << 6) & 7168) | 384, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return h2;
    }

    public static final Unit k(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        saveableHolder.g(saver, saveableStateRegistry, str, obj, objArr);
        return Unit.f40552a;
    }

    public static final void l(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj != null && !saveableStateRegistry.b(obj)) {
            if (obj instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
                if (snapshotMutableState.d() == SnapshotStateKt.k() || snapshotMutableState.d() == SnapshotStateKt.r() || snapshotMutableState.d() == SnapshotStateKt.o()) {
                    str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = d(obj);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
