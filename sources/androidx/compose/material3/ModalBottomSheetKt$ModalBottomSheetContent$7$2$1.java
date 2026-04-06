package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f10329A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10330B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Function2 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10331z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10332a;

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
                f10332a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.WhenMappings.<clinit>():void");
        }
    }

    public ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope, boolean z2, String str, String str2, String str3, Function2 function2) {
        this.f10331z = sheetState;
        this.f10329A = function0;
        this.f10330B = coroutineScope;
        this.C = z2;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.G = function2;
    }

    public static final Unit i(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope) {
        SheetState sheetState2 = sheetState;
        int i2 = WhenMappings.f10332a[sheetState.k().ordinal()];
        if (i2 == 1) {
            function0.invoke();
            Unit unit = Unit.f40552a;
        } else if (i2 != 2) {
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(sheetState2, (Continuation) null), 3, (Object) null);
        } else {
            Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(sheetState2, (Continuation) null), 3, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit k(boolean z2, SheetState sheetState, String str, String str2, String str3, Function0 function0, CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z2) {
            SemanticsPropertiesKt.m(semanticsPropertyReceiver, str, new R3(function0));
            if (sheetState.k() == SheetValue.PartiallyExpanded) {
                SemanticsPropertiesKt.p(semanticsPropertyReceiver, str2, new S3(sheetState, coroutineScope, sheetState));
            } else if (sheetState.m()) {
                SemanticsPropertiesKt.e(semanticsPropertyReceiver, str3, new T3(sheetState, coroutineScope));
            }
        }
        return Unit.f40552a;
    }

    public static final boolean p(Function0 function0) {
        function0.invoke();
        return true;
    }

    public static final boolean q(SheetState sheetState, CoroutineScope coroutineScope, SheetState sheetState2) {
        if (!((Boolean) sheetState.j().s().invoke(SheetValue.Expanded)).booleanValue()) {
            return true;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1(sheetState2, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final boolean s(SheetState sheetState, CoroutineScope coroutineScope) {
        if (!((Boolean) sheetState.j().s().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
            return true;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1(sheetState, (Continuation) null), 3, (Object) null);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: androidx.compose.material3.Q3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.compose.material3.Q3} */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00ab;
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
            if (r0 == 0) goto L_0x0146
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0021
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.ModalBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:383)"
            r4 = 2000500644(0x773d37a4, float:3.8377837E33)
            androidx.compose.runtime.ComposerKt.Y(r4, r14, r0, r1)
        L_0x0021:
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.SheetState r14 = r12.f10331z
            boolean r14 = r13.W(r14)
            kotlin.jvm.functions.Function0 r0 = r12.f10329A
            boolean r0 = r13.W(r0)
            r14 = r14 | r0
            kotlinx.coroutines.CoroutineScope r0 = r12.f10330B
            boolean r0 = r13.l(r0)
            r14 = r14 | r0
            androidx.compose.material3.SheetState r0 = r12.f10331z
            kotlin.jvm.functions.Function0 r1 = r12.f10329A
            kotlinx.coroutines.CoroutineScope r4 = r12.f10330B
            java.lang.Object r6 = r13.g()
            if (r14 != 0) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r6 != r14) goto L_0x0053
        L_0x004b:
            androidx.compose.material3.P3 r6 = new androidx.compose.material3.P3
            r6.<init>(r0, r1, r4)
            r13.N(r6)
        L_0x0053:
            r9 = r6
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.ClickableKt.f(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r12.C
            boolean r0 = r13.d(r0)
            androidx.compose.material3.SheetState r1 = r12.f10331z
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.D
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            kotlin.jvm.functions.Function0 r1 = r12.f10329A
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.E
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            kotlinx.coroutines.CoroutineScope r1 = r12.f10330B
            boolean r1 = r13.l(r1)
            r0 = r0 | r1
            java.lang.String r1 = r12.F
            boolean r1 = r13.W(r1)
            r0 = r0 | r1
            boolean r5 = r12.C
            androidx.compose.material3.SheetState r6 = r12.f10331z
            java.lang.String r7 = r12.D
            java.lang.String r8 = r12.E
            java.lang.String r9 = r12.F
            kotlin.jvm.functions.Function0 r10 = r12.f10329A
            kotlinx.coroutines.CoroutineScope r11 = r12.f10330B
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x00ab
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00b4
        L_0x00ab:
            androidx.compose.material3.Q3 r1 = new androidx.compose.material3.Q3
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.N(r1)
        L_0x00b4:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r14, r2, r1)
            kotlin.jvm.functions.Function2 r0 = r12.G
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r3)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r13, r3)
            androidx.compose.runtime.CompositionLocalMap r4 = r13.I()
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.ComposedModifierKt.e(r13, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r13.v()
            if (r7 != 0) goto L_0x00e1
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00e1:
            r13.s()
            boolean r7 = r13.n()
            if (r7 == 0) goto L_0x00ee
            r13.y(r6)
            goto L_0x00f1
        L_0x00ee:
            r13.K()
        L_0x00f1:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r1, r7)
            kotlin.jvm.functions.Function2 r1 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x011b
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x0129
        L_0x011b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.N(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.A(r2, r1)
        L_0x0129:
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r14, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r14 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r0.m(r13, r14)
            r13.T()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0149
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0149
        L_0x0146:
            r13.B()
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.h(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
