package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ToggleableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier a(androidx.compose.ui.Modifier r10, boolean r11, androidx.compose.foundation.interaction.MutableInteractionSource r12, androidx.compose.foundation.Indication r13, boolean r14, androidx.compose.ui.semantics.Role r15, kotlin.jvm.functions.Function1 r16) {
        /*
            r2 = r12
            r1 = r13
            boolean r0 = r1 instanceof androidx.compose.foundation.IndicationNodeFactory
            if (r0 == 0) goto L_0x0018
            r3 = r1
            androidx.compose.foundation.IndicationNodeFactory r3 = (androidx.compose.foundation.IndicationNodeFactory) r3
            androidx.compose.foundation.selection.ToggleableElement r8 = new androidx.compose.foundation.selection.ToggleableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0016:
            r0 = r10
            goto L_0x0059
        L_0x0018:
            if (r1 != 0) goto L_0x0029
            androidx.compose.foundation.selection.ToggleableElement r8 = new androidx.compose.foundation.selection.ToggleableElement
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0016
        L_0x0029:
            if (r2 == 0) goto L_0x0044
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.IndicationKt.b(r0, r12, r13)
            androidx.compose.foundation.selection.ToggleableElement r9 = new androidx.compose.foundation.selection.ToggleableElement
            r7 = 0
            r3 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r8 = r8.o0(r9)
            goto L_0x0016
        L_0x0044:
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 r7 = new androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            r0 = r7
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.ComposedModifierKt.c(r6, r1, r7, r0, r1)
            goto L_0x0016
        L_0x0059:
            androidx.compose.ui.Modifier r0 = r10.o0(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.ToggleableKt.a(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function1):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier b(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, Role role, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        boolean z4 = z3;
        if ((i2 & 16) != 0) {
            role = null;
        }
        return a(modifier, z2, mutableInteractionSource, indication, z4, role, function1);
    }

    public static final Modifier c(Modifier modifier, boolean z2, boolean z3, Role role, Function1 function1) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z2, z3, role, function1) : InspectableValueKt.a(), new ToggleableKt$toggleable$2(z2, z3, role, function1));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z2, boolean z3, Role role, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return c(modifier, z2, z3, role, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier e(androidx.compose.ui.Modifier r10, androidx.compose.ui.state.ToggleableState r11, androidx.compose.foundation.interaction.MutableInteractionSource r12, androidx.compose.foundation.Indication r13, boolean r14, androidx.compose.ui.semantics.Role r15, kotlin.jvm.functions.Function0 r16) {
        /*
            r2 = r12
            r1 = r13
            boolean r0 = r1 instanceof androidx.compose.foundation.IndicationNodeFactory
            if (r0 == 0) goto L_0x0018
            r3 = r1
            androidx.compose.foundation.IndicationNodeFactory r3 = (androidx.compose.foundation.IndicationNodeFactory) r3
            androidx.compose.foundation.selection.TriStateToggleableElement r8 = new androidx.compose.foundation.selection.TriStateToggleableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0016:
            r0 = r10
            goto L_0x0059
        L_0x0018:
            if (r1 != 0) goto L_0x0029
            androidx.compose.foundation.selection.TriStateToggleableElement r8 = new androidx.compose.foundation.selection.TriStateToggleableElement
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0016
        L_0x0029:
            if (r2 == 0) goto L_0x0044
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.IndicationKt.b(r0, r12, r13)
            androidx.compose.foundation.selection.TriStateToggleableElement r9 = new androidx.compose.foundation.selection.TriStateToggleableElement
            r7 = 0
            r3 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r8 = r8.o0(r9)
            goto L_0x0016
        L_0x0044:
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 r7 = new androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            r0 = r7
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.ComposedModifierKt.c(r6, r1, r7, r0, r1)
            goto L_0x0016
        L_0x0059:
            androidx.compose.ui.Modifier r0 = r10.o0(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.ToggleableKt.e(androidx.compose.ui.Modifier, androidx.compose.ui.state.ToggleableState, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):androidx.compose.ui.Modifier");
    }
}
