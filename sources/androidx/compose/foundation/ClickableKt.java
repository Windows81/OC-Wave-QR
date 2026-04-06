package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

@Metadata
public final class ClickableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier c(androidx.compose.ui.Modifier r10, androidx.compose.foundation.interaction.MutableInteractionSource r11, androidx.compose.foundation.Indication r12, boolean r13, java.lang.String r14, androidx.compose.ui.semantics.Role r15, kotlin.jvm.functions.Function0 r16) {
        /*
            r1 = r11
            r2 = r12
            boolean r0 = r2 instanceof androidx.compose.foundation.IndicationNodeFactory
            if (r0 == 0) goto L_0x0017
            androidx.compose.foundation.IndicationNodeFactory r2 = (androidx.compose.foundation.IndicationNodeFactory) r2
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0015:
            r0 = r10
            goto L_0x0058
        L_0x0017:
            if (r2 != 0) goto L_0x0028
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0015
        L_0x0028:
            if (r1 == 0) goto L_0x0043
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.IndicationKt.b(r0, r11, r12)
            androidx.compose.foundation.ClickableElement r9 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r9
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r8 = r8.o0(r9)
            goto L_0x0015
        L_0x0043:
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 r7 = new androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            r0 = r7
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.ComposedModifierKt.c(r6, r1, r7, r0, r1)
            goto L_0x0015
        L_0x0058:
            androidx.compose.ui.Modifier r0 = r10.o0(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.c(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier d(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return c(modifier, mutableInteractionSource, indication, z2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : role, function0);
    }

    public static final Modifier e(Modifier modifier, boolean z2, String str, Role role, Function0 function0) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z2, str, role, function0) : InspectableValueKt.a(), new ClickableKt$clickable$2(z2, str, role, function0));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return e(modifier, z2, str, role, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.ui.Modifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX WARNING: type inference failed for: r12v4, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier g(androidx.compose.ui.Modifier r14, androidx.compose.foundation.interaction.MutableInteractionSource r15, androidx.compose.foundation.Indication r16, boolean r17, java.lang.String r18, androidx.compose.ui.semantics.Role r19, java.lang.String r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, boolean r23, kotlin.jvm.functions.Function0 r24) {
        /*
            r1 = r15
            r2 = r16
            boolean r0 = r2 instanceof androidx.compose.foundation.IndicationNodeFactory
            if (r0 == 0) goto L_0x0024
            androidx.compose.foundation.IndicationNodeFactory r2 = (androidx.compose.foundation.IndicationNodeFactory) r2
            androidx.compose.foundation.CombinedClickableElement r12 = new androidx.compose.foundation.CombinedClickableElement
            r11 = 0
            r0 = r12
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r24
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0021:
            r0 = r14
            goto L_0x0087
        L_0x0024:
            if (r2 != 0) goto L_0x0040
            androidx.compose.foundation.CombinedClickableElement r12 = new androidx.compose.foundation.CombinedClickableElement
            r11 = 0
            r2 = 0
            r0 = r12
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r24
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0021
        L_0x0040:
            if (r1 == 0) goto L_0x0066
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.IndicationKt.b(r0, r15, r2)
            androidx.compose.foundation.CombinedClickableElement r13 = new androidx.compose.foundation.CombinedClickableElement
            r11 = 0
            r2 = 0
            r0 = r13
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r24
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r12 = r12.o0(r13)
            goto L_0x0021
        L_0x0066:
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1 r11 = new androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
            r0 = r11
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r24
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 1
            r1 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.ComposedModifierKt.c(r10, r1, r11, r0, r1)
            goto L_0x0021
        L_0x0087:
            androidx.compose.ui.Modifier r0 = r14.o0(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.g(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier h(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z3, Function0 function03, int i2, Object obj) {
        int i3 = i2;
        return g(modifier, mutableInteractionSource, indication, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : role, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : function0, (i3 & 128) != 0 ? null : function02, (i3 & 256) != 0 ? true : z3, function03);
    }

    public static final boolean i(TraversableNode traversableNode) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        TraversableNodeKt.c(traversableNode, ScrollableContainerNode.P, new ClickableKt$hasScrollableContainer$1(booleanRef));
        return booleanRef.f40901z;
    }

    public static final boolean j(KeyEvent keyEvent) {
        return KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.b()) && k(keyEvent);
    }

    public static final boolean k(KeyEvent keyEvent) {
        long a2 = KeyEvent_androidKt.a(keyEvent);
        Key.Companion companion = Key.f16750b;
        if (Key.r(a2, companion.b()) ? true : Key.r(a2, companion.g()) ? true : Key.r(a2, companion.k())) {
            return true;
        }
        return Key.r(a2, companion.n());
    }

    public static final boolean l(KeyEvent keyEvent) {
        return KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) && k(keyEvent);
    }
}
