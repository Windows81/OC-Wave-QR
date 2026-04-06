package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$32 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22554A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f22555B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ State D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f22556z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$32(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, MutableState mutableState, State state) {
        super(4);
        this.f22556z = seekableTransitionState;
        this.f22554A = navBackStackEntry;
        this.f22555B = saveableStateHolder;
        this.C = mutableState;
        this.D = state;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(final androidx.compose.animation.AnimatedContentScope r4, final androidx.navigation.NavBackStackEntry r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r3 = this;
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)"
            r2 = 820763100(0x30ebd9dc, float:1.716042E-9)
            androidx.compose.runtime.ComposerKt.Y(r2, r7, r0, r1)
        L_0x000f:
            androidx.compose.animation.core.SeekableTransitionState r7 = r3.f22556z
            java.lang.Object r7 = r7.a()
            androidx.navigation.NavBackStackEntry r0 = r3.f22554A
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r0)
            androidx.compose.runtime.MutableState r0 = r3.C
            boolean r0 = androidx.navigation.compose.NavHostKt.i(r0)
            if (r0 != 0) goto L_0x004c
            if (r7 == 0) goto L_0x0026
            goto L_0x004c
        L_0x0026:
            androidx.compose.runtime.State r7 = r3.D
            java.util.List r7 = androidx.navigation.compose.NavHostKt.l(r7)
            int r0 = r7.size()
            java.util.ListIterator r7 = r7.listIterator(r0)
        L_0x0034:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r7.previous()
            r1 = r0
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 == 0) goto L_0x0034
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r5 = r0
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
        L_0x004c:
            if (r5 != 0) goto L_0x004f
            goto L_0x0065
        L_0x004f:
            androidx.compose.runtime.saveable.SaveableStateHolder r7 = r3.f22555B
            androidx.navigation.compose.NavHostKt$NavHost$32$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$32$1
            r0.<init>(r5, r4)
            r4 = 54
            r1 = -1263531443(0xffffffffb4b00a4d, float:-3.279005E-7)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r0, r6, r4)
            r0 = 384(0x180, float:5.38E-43)
            androidx.navigation.compose.NavBackStackEntryProviderKt.a(r5, r7, r4, r6, r0)
        L_0x0065:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x006e
            androidx.compose.runtime.ComposerKt.X()
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$32.b(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
