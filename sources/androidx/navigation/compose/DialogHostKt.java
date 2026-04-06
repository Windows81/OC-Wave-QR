package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DialogHostKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.navigation.compose.DialogNavigator r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r6 = r20
            r7 = r22
            r0 = 294589392(0x118f13d0, float:2.2573632E-28)
            r1 = r21
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r7 & 6
            r2 = 2
            r15 = 4
            if (r1 != 0) goto L_0x001f
            boolean r1 = r14.W(r6)
            if (r1 == 0) goto L_0x001b
            r1 = r15
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r1 = r1 | r7
            r13 = r1
            goto L_0x0020
        L_0x001f:
            r13 = r7
        L_0x0020:
            r1 = r13 & 3
            if (r1 != r2) goto L_0x0030
            boolean r1 = r14.t()
            if (r1 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r14.B()
            goto L_0x013d
        L_0x0030:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x003c
            r1 = -1
            java.lang.String r2 = "androidx.navigation.compose.DialogHost (DialogHost.kt:40)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r1, r2)
        L_0x003c:
            r12 = 0
            androidx.compose.runtime.saveable.SaveableStateHolder r16 = androidx.compose.runtime.saveable.SaveableStateHolderKt.b(r14, r12)
            kotlinx.coroutines.flow.StateFlow r0 = r20.n()
            r11 = 0
            r10 = 1
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.b(r0, r11, r14, r12, r10)
            java.util.List r1 = b(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = f(r1, r14, r12)
            java.util.List r0 = b(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            d(r1, r0, r14, r12)
            kotlinx.coroutines.flow.StateFlow r0 = r20.o()
            androidx.compose.runtime.State r9 = androidx.compose.runtime.SnapshotStateKt.b(r0, r11, r14, r12, r10)
            java.lang.Object r0 = r14.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0079
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.SnapshotStateKt.f()
            r14.N(r0)
        L_0x0079:
            r8 = r0
            androidx.compose.runtime.snapshots.SnapshotStateList r8 = (androidx.compose.runtime.snapshots.SnapshotStateList) r8
            r0 = 1361037007(0x511fc6cf, float:4.2889703E10)
            r14.X(r0)
            java.util.Iterator r17 = r1.iterator()
        L_0x0086:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r17.next()
            r1 = r0
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r0 = r1.g()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination"
            kotlin.jvm.internal.Intrinsics.g(r0, r2)
            r5 = r0
            androidx.navigation.compose.DialogNavigator$Destination r5 = (androidx.navigation.compose.DialogNavigator.Destination) r5
            r0 = r13 & 14
            if (r0 != r15) goto L_0x00a5
            r0 = r10
            goto L_0x00a6
        L_0x00a5:
            r0 = r12
        L_0x00a6:
            boolean r2 = r14.l(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r14.g()
            if (r0 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00c1
        L_0x00b9:
            androidx.navigation.compose.DialogHostKt$DialogHost$1$1$1 r2 = new androidx.navigation.compose.DialogHostKt$DialogHost$1$1$1
            r2.<init>(r6, r1)
            r14.N(r2)
        L_0x00c1:
            r18 = r2
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            androidx.compose.ui.window.DialogProperties r19 = r5.O()
            androidx.navigation.compose.DialogHostKt$DialogHost$1$2 r4 = new androidx.navigation.compose.DialogHostKt$DialogHost$1$2
            r0 = r4
            r2 = r20
            r3 = r16
            r11 = r4
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = 1129586364(0x43541ebc, float:212.12006)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r10, r11, r14, r0)
            r1 = 384(0x180, float:5.38E-43)
            r2 = 0
            r3 = r8
            r8 = r18
            r4 = r9
            r9 = r19
            r5 = r10
            r10 = r0
            r0 = 0
            r11 = r14
            r18 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            androidx.compose.ui.window.AndroidDialog_androidKt.a(r8, r9, r10, r11, r12, r13)
            r11 = r0
            r13 = r1
            r8 = r3
            r9 = r4
            r10 = r5
            r12 = r18
            goto L_0x0086
        L_0x00fb:
            r3 = r8
            r4 = r9
            r5 = r10
            r0 = r11
            r18 = r12
            r1 = r13
            r14.M()
            java.util.Set r2 = c(r4)
            boolean r8 = r14.W(r4)
            r1 = r1 & 14
            if (r1 != r15) goto L_0x0113
            r12 = r5
            goto L_0x0115
        L_0x0113:
            r12 = r18
        L_0x0115:
            r1 = r8 | r12
            java.lang.Object r5 = r14.g()
            if (r1 != 0) goto L_0x0125
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x012d
        L_0x0125:
            androidx.navigation.compose.DialogHostKt$DialogHost$2$1 r5 = new androidx.navigation.compose.DialogHostKt$DialogHost$2$1
            r5.<init>(r4, r6, r3, r0)
            r14.N(r5)
        L_0x012d:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r0 = 48
            androidx.compose.runtime.EffectsKt.f(r2, r3, r5, r14, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x013d
            androidx.compose.runtime.ComposerKt.X()
        L_0x013d:
            androidx.compose.runtime.ScopeUpdateScope r0 = r14.x()
            if (r0 == 0) goto L_0x014b
            androidx.navigation.compose.DialogHostKt$DialogHost$3 r1 = new androidx.navigation.compose.DialogHostKt$DialogHost$3
            r1.<init>(r6, r7)
            r0.a(r1)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.a(androidx.navigation.compose.DialogNavigator, androidx.compose.runtime.Composer, int):void");
    }

    public static final List b(State state) {
        return (List) state.getValue();
    }

    public static final Set c(State state) {
        return (Set) state.getValue();
    }

    public static final void d(List list, Collection collection, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1537894851);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(collection) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1537894851, i3, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean booleanValue = ((Boolean) q2.C(InspectionModeKt.a())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                Lifecycle a2 = navBackStackEntry.a();
                boolean d2 = q2.d(booleanValue) | q2.l(list) | q2.l(navBackStackEntry);
                Object g2 = q2.g();
                if (d2 || g2 == Composer.f14567a.a()) {
                    g2 = new DialogHostKt$PopulateVisibleList$1$1$1(navBackStackEntry, booleanValue, list);
                    q2.N(g2);
                }
                EffectsKt.c(a2, (Function1) g2, q2, 0);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new DialogHostKt$PopulateVisibleList$2(list, collection, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList f(java.util.Collection r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.Y(r2, r7, r0, r1)
        L_0x000f:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.InspectionModeKt.a()
            java.lang.Object r7 = r6.C(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.W(r5)
            java.lang.Object r1 = r6.g()
            if (r0 != 0) goto L_0x002f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0069
        L_0x002f:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.f()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x003e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L_0x004f
            r3 = 1
            goto L_0x005d
        L_0x004f:
            androidx.lifecycle.Lifecycle r3 = r3.a()
            androidx.lifecycle.Lifecycle$State r3 = r3.b()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.f(r4)
        L_0x005d:
            if (r3 == 0) goto L_0x003e
            r0.add(r2)
            goto L_0x003e
        L_0x0063:
            r1.addAll(r0)
            r6.N(r1)
        L_0x0069:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0074
            androidx.compose.runtime.ComposerKt.X()
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.f(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
