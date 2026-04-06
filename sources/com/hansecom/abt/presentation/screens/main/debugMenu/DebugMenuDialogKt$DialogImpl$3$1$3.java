package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DebugMenuDialogKt$DialogImpl$3$1$3 implements Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f37616A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37617B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DebugMenu.State f37618z;

    public DebugMenuDialogKt$DialogImpl$3$1$3(DebugMenu.State state, MutableState mutableState, Function1 function1, MutableState mutableState2) {
        this.f37618z = state;
        this.f37616A = mutableState;
        this.f37617B = function1;
        this.C = mutableState2;
    }

    /* access modifiers changed from: private */
    public static final Unit f(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit g(MutableState mutableState) {
        DebugMenuDialogKt.j(mutableState, false);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    public final void e(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer, int i2) {
        int i3;
        ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope2 = exposedDropdownMenuBoxScope;
        Composer composer2 = composer;
        Intrinsics.i(exposedDropdownMenuBoxScope2, "$this$ExposedDropdownMenuBox");
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composer2.W(exposedDropdownMenuBoxScope2) : composer2.l(exposedDropdownMenuBoxScope2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1500654706, i3, -1, "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl.<anonymous>.<anonymous>.<anonymous> (DebugMenuDialog.kt:102)");
            }
            String d2 = this.f37618z.d();
            TextFieldColors g2 = OutlinedTextFieldDefaults.f10533a.g(composer2, 6);
            Modifier h2 = SizeKt.h(ExposedDropdownMenuBoxScope.l(exposedDropdownMenuBoxScope, Modifier.f15489d, ExposedDropdownMenuAnchorType.f9935b.b(), false, 2, (Object) null), 0.0f, 1, (Object) null);
            composer2.X(-1544051265);
            Object g3 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g3 == companion.a()) {
                g3 = new h();
                composer2.N(g3);
            }
            composer.M();
            Function2 b2 = ComposableSingletons$DebugMenuDialogKt.f37600a.b();
            final MutableState mutableState = this.f37616A;
            OutlinedTextFieldKt.g(d2, (Function1) g3, h2, false, true, (TextStyle) null, b2, (Function2) null, (Function2) null, ComposableLambdaKt.e(1946437097, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1946437097, i2, -1, "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugMenuDialog.kt:108)");
                        }
                        ExposedDropdownMenuDefaults.f9944a.b(DebugMenuDialogKt.i(mutableState), (Modifier) null, composer, ExposedDropdownMenuDefaults.f9946c << 6, 2);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, g2, composer, 806903856, 0, 0, 4193704);
            boolean o2 = DebugMenuDialogKt.i(this.f37616A);
            composer2.X(-1544030639);
            MutableState mutableState2 = this.f37616A;
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new i(mutableState2);
                composer2.N(g4);
            }
            composer.M();
            final DebugMenu.State state = this.f37618z;
            final Function1 function1 = this.f37617B;
            final MutableState mutableState3 = this.f37616A;
            final MutableState mutableState4 = this.C;
            exposedDropdownMenuBoxScope.d(o2, (Function0) g4, (Modifier) null, (ScrollState) null, false, (Shape) null, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(1560886576, true, new Function3<ColumnScope, Composer, Integer, Unit>() {
                public static final Unit e(Function1 function1, String str, MutableState mutableState, MutableState mutableState2) {
                    function1.invoke(new DebugMenu.Action.RealmChange(str));
                    DebugMenuDialogKt.j(mutableState, false);
                    DebugMenuDialogKt.l(mutableState2, true);
                    return Unit.f40552a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.functions.Function0} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void c(androidx.compose.foundation.layout.ColumnScope r20, androidx.compose.runtime.Composer r21, int r22) {
                    /*
                        r19 = this;
                        r0 = r19
                        r13 = r21
                        r1 = r22
                        java.lang.String r2 = "$this$ExposedDropdownMenu"
                        r3 = r20
                        kotlin.jvm.internal.Intrinsics.i(r3, r2)
                        r2 = r1 & 17
                        r3 = 16
                        if (r2 != r3) goto L_0x001f
                        boolean r2 = r21.t()
                        if (r2 != 0) goto L_0x001a
                        goto L_0x001f
                    L_0x001a:
                        r21.B()
                        goto L_0x00ac
                    L_0x001f:
                        boolean r2 = androidx.compose.runtime.ComposerKt.P()
                        if (r2 == 0) goto L_0x002e
                        r2 = -1
                        java.lang.String r3 = "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugMenuDialog.kt:119)"
                        r4 = 1560886576(0x5d093d30, float:6.1806957E17)
                        androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
                    L_0x002e:
                        com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$State r1 = r2
                        kotlinx.collections.immutable.PersistentList r1 = r1.c()
                        kotlin.jvm.functions.Function1 r14 = r6
                        androidx.compose.runtime.MutableState r15 = r9
                        androidx.compose.runtime.MutableState r12 = r10
                        java.util.Iterator r16 = r1.iterator()
                    L_0x003e:
                        boolean r1 = r16.hasNext()
                        if (r1 == 0) goto L_0x00a3
                        java.lang.Object r1 = r16.next()
                        java.lang.String r1 = (java.lang.String) r1
                        com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3$1$3$4$1$1 r2 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3$1$3$4$1$1
                        r2.<init>(r1)
                        r3 = 54
                        r4 = 908100528(0x362083b0, float:2.391851E-6)
                        r5 = 1
                        androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r5, r2, r13, r3)
                        r3 = -716998602(0xffffffffd5437836, float:-1.34325668E13)
                        r13.X(r3)
                        boolean r3 = r13.W(r14)
                        boolean r4 = r13.W(r1)
                        r3 = r3 | r4
                        java.lang.Object r4 = r21.g()
                        if (r3 != 0) goto L_0x0076
                        androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r3 = r3.a()
                        if (r4 != r3) goto L_0x007e
                    L_0x0076:
                        com.hansecom.abt.presentation.screens.main.debugMenu.j r4 = new com.hansecom.abt.presentation.screens.main.debugMenu.j
                        r4.<init>(r14, r1, r15, r12)
                        r13.N(r4)
                    L_0x007e:
                        r3 = r4
                        kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                        r21.M()
                        r11 = 6
                        r17 = 508(0x1fc, float:7.12E-43)
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r1 = r2
                        r2 = r3
                        r3 = r4
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r7 = r8
                        r8 = r9
                        r9 = r10
                        r10 = r21
                        r18 = r12
                        r12 = r17
                        androidx.compose.material3.AndroidMenu_androidKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        r12 = r18
                        goto L_0x003e
                    L_0x00a3:
                        boolean r1 = androidx.compose.runtime.ComposerKt.P()
                        if (r1 == 0) goto L_0x00ac
                        androidx.compose.runtime.ComposerKt.X()
                    L_0x00ac:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3$1$3.AnonymousClass4.c(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    c((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), composer, 48, (ExposedDropdownMenuBoxScope.f9940a << 3) | 6 | ((i3 << 3) & 112), 1020);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }
}
