package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9290A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9291B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f9292z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9293a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9293a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.WhenMappings.<clinit>():void");
        }
    }

    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(SheetState sheetState, CoroutineScope coroutineScope, boolean z2, String str, String str2, String str3, Function2 function2) {
        this.f9292z = sheetState;
        this.f9290A = coroutineScope;
        this.f9291B = z2;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = function2;
    }

    public static final Unit i(SheetState sheetState, CoroutineScope coroutineScope) {
        SheetState sheetState2 = sheetState;
        int i2 = WhenMappings.f9293a[sheetState.k().ordinal()];
        if (i2 == 1) {
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1(sheetState2, (Continuation) null), 3, (Object) null);
        } else if (i2 != 2) {
            Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(sheetState2, (Continuation) null), 3, (Object) null);
        } else {
            Job unused3 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2(sheetState2, (Continuation) null), 3, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit k(SheetState sheetState, boolean z2, String str, String str2, String str3, CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (sheetState.j().p().e() > 1 && z2) {
            SheetValue k2 = sheetState.k();
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            if (k2 == sheetValue) {
                if (((Boolean) sheetState.j().s().invoke(SheetValue.Expanded)).booleanValue()) {
                    SemanticsPropertiesKt.p(semanticsPropertyReceiver, str, new V(coroutineScope, sheetState));
                }
            } else if (((Boolean) sheetState.j().s().invoke(sheetValue)).booleanValue()) {
                SemanticsPropertiesKt.e(semanticsPropertyReceiver, str2, new W(coroutineScope, sheetState));
            }
            if (!sheetState.o()) {
                SemanticsPropertiesKt.m(semanticsPropertyReceiver, str3, new X(coroutineScope, sheetState));
            }
        }
        return Unit.f40552a;
    }

    public static final boolean p(CoroutineScope coroutineScope, SheetState sheetState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$1$1(sheetState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final boolean q(CoroutineScope coroutineScope, SheetState sheetState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$2$1(sheetState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final boolean s(CoroutineScope coroutineScope, SheetState sheetState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$3$1(sheetState, (Continuation) null), 3, (Object) null);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: androidx.compose.material3.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.compose.material3.U} */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0099;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.runtime.Composer r13, int r14) {
        /*
            r12 = this;
            r0 = r14 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0009
            r0 = r2
            goto L_0x000a
        L_0x0009:
            r0 = r3
        L_0x000a:
            r1 = r14 & 1
            boolean r0 = r13.E(r0, r1)
            if (r0 == 0) goto L_0x0134
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0021
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.StandardBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:336)"
            r4 = -511691176(0xffffffffe1803658, float:-2.956374E20)
            androidx.compose.runtime.ComposerKt.Y(r4, r14, r0, r1)
        L_0x0021:
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.SheetState r14 = r12.f9292z
            boolean r14 = r13.W(r14)
            kotlinx.coroutines.CoroutineScope r0 = r12.f9290A
            boolean r0 = r13.l(r0)
            r14 = r14 | r0
            androidx.compose.material3.SheetState r0 = r12.f9292z
            kotlinx.coroutines.CoroutineScope r1 = r12.f9290A
            java.lang.Object r4 = r13.g()
            if (r14 != 0) goto L_0x0042
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r4 != r14) goto L_0x004a
        L_0x0042:
            androidx.compose.material3.T r4 = new androidx.compose.material3.T
            r4.<init>(r0, r1)
            r13.N(r4)
        L_0x004a:
            r9 = r4
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.ClickableKt.f(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.material3.SheetState r0 = r12.f9292z
            boolean r0 = r13.W(r0)
            boolean r1 = r12.f9291B
            boolean r1 = r13.d(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.C
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            kotlinx.coroutines.CoroutineScope r1 = r12.f9290A
            boolean r1 = r13.l(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.D
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.E
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            androidx.compose.material3.SheetState r5 = r12.f9292z
            boolean r6 = r12.f9291B
            java.lang.String r7 = r12.C
            java.lang.String r8 = r12.D
            java.lang.String r9 = r12.E
            kotlinx.coroutines.CoroutineScope r10 = r12.f9290A
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x0099
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00a2
        L_0x0099:
            androidx.compose.material3.U r1 = new androidx.compose.material3.U
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.N(r1)
        L_0x00a2:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r14, r2, r1)
            kotlin.jvm.functions.Function2 r0 = r12.F
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r3)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r13, r3)
            androidx.compose.runtime.CompositionLocalMap r4 = r13.I()
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.ComposedModifierKt.e(r13, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r13.v()
            if (r7 != 0) goto L_0x00cf
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00cf:
            r13.s()
            boolean r7 = r13.n()
            if (r7 == 0) goto L_0x00dc
            r13.y(r6)
            goto L_0x00df
        L_0x00dc:
            r13.K()
        L_0x00df:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r1, r7)
            kotlin.jvm.functions.Function2 r1 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x0109
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x0117
        L_0x0109:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.N(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.A(r2, r1)
        L_0x0117:
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r14, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r14 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r0.m(r13, r14)
            r13.T()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0137
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0137
        L_0x0134:
            r13.B()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.h(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
