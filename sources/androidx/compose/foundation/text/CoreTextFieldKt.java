package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CoreTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: androidx.compose.foundation.text.LegacyTextFieldState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v68, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v69, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v14, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v15, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v16, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v17, resolved type: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1} */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r15v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03c6, code lost:
        if (r12 == r2.a()) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0494, code lost:
        if (r10 == r2.a()) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x061d, code lost:
        if (r5 == r2.a()) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0692, code lost:
        if (r15 == r2.a()) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06fe, code lost:
        if (r6 == r2.a()) goto L_0x0700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0797, code lost:
        if (r15 == r2.a()) goto L_0x0799;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0742  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x07d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0828  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x083c  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0866  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x08a5  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0959  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0960  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0967  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x09e9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0a11  */
    /* JADX WARNING: Removed duplicated region for block: B:477:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.text.input.TextFieldValue r52, kotlin.jvm.functions.Function1 r53, androidx.compose.ui.Modifier r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.input.VisualTransformation r56, kotlin.jvm.functions.Function1 r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.ui.graphics.Brush r59, boolean r60, int r61, int r62, androidx.compose.ui.text.input.ImeOptions r63, androidx.compose.foundation.text.KeyboardActions r64, boolean r65, boolean r66, kotlin.jvm.functions.Function3 r67, androidx.compose.foundation.text.TextFieldScrollerPosition r68, androidx.compose.runtime.Composer r69, int r70, int r71, int r72) {
        /*
            r15 = r52
            r14 = r70
            r13 = r71
            r12 = r72
            r0 = -244533042(0xfffffffff16cb8ce, float:-1.17219004E30)
            r1 = r69
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r11.W(r15)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            r10 = r53
            goto L_0x0043
        L_0x0031:
            r4 = r14 & 48
            r10 = r53
            if (r4 != 0) goto L_0x0043
            boolean r4 = r11.l(r10)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r9 = r54
            goto L_0x005f
        L_0x004c:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0049
            r9 = r54
            boolean r16 = r11.W(r9)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r16
        L_0x005f:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r7 = r55
            goto L_0x007d
        L_0x006a:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r55
            boolean r19 = r11.W(r7)
            if (r19 == 0) goto L_0x0079
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r1 = r1 | r19
        L_0x007d:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r2 = r56
            goto L_0x009b
        L_0x0088:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0085
            r2 = r56
            boolean r23 = r11.W(r2)
            if (r23 == 0) goto L_0x0097
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r23 = r20
        L_0x0099:
            r1 = r1 | r23
        L_0x009b:
            r23 = r12 & 32
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00a8
            r1 = r1 | r25
            r6 = r57
            goto L_0x00bb
        L_0x00a8:
            r26 = r14 & r25
            r6 = r57
            if (r26 != 0) goto L_0x00bb
            boolean r27 = r11.l(r6)
            if (r27 == 0) goto L_0x00b7
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r27 = r24
        L_0x00b9:
            r1 = r1 | r27
        L_0x00bb:
            r27 = r12 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00c6
            r1 = r1 | r28
            r5 = r58
            goto L_0x00d9
        L_0x00c6:
            r29 = r14 & r28
            r5 = r58
            if (r29 != 0) goto L_0x00d9
            boolean r30 = r11.W(r5)
            if (r30 == 0) goto L_0x00d5
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r30
        L_0x00d9:
            r8 = r12 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00e4
            r1 = r1 | r31
            r3 = r59
            goto L_0x00f7
        L_0x00e4:
            r31 = r14 & r31
            r3 = r59
            if (r31 != 0) goto L_0x00f7
            boolean r32 = r11.W(r3)
            if (r32 == 0) goto L_0x00f3
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f3:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r1 = r1 | r32
        L_0x00f7:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0102
            r1 = r1 | r33
            r2 = r60
            goto L_0x0115
        L_0x0102:
            r33 = r14 & r33
            r2 = r60
            if (r33 != 0) goto L_0x0115
            boolean r33 = r11.d(r2)
            if (r33 == 0) goto L_0x0111
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0111:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r1 = r1 | r33
        L_0x0115:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0120
            r1 = r1 | r33
            r3 = r61
            goto L_0x0133
        L_0x0120:
            r33 = r14 & r33
            r3 = r61
            if (r33 != 0) goto L_0x0133
            boolean r33 = r11.i(r3)
            if (r33 == 0) goto L_0x012f
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0131
        L_0x012f:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0131:
            r1 = r1 | r33
        L_0x0133:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013c
            r33 = r13 | 6
            r5 = r62
            goto L_0x0152
        L_0x013c:
            r33 = r13 & 6
            r5 = r62
            if (r33 != 0) goto L_0x0150
            boolean r33 = r11.i(r5)
            if (r33 == 0) goto L_0x014b
            r33 = 4
            goto L_0x014d
        L_0x014b:
            r33 = 2
        L_0x014d:
            r33 = r13 | r33
            goto L_0x0152
        L_0x0150:
            r33 = r13
        L_0x0152:
            r34 = r13 & 48
            if (r34 != 0) goto L_0x016e
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0165
            r5 = r63
            boolean r34 = r11.W(r5)
            if (r34 == 0) goto L_0x0167
            r34 = 32
            goto L_0x0169
        L_0x0165:
            r5 = r63
        L_0x0167:
            r34 = 16
        L_0x0169:
            r33 = r33 | r34
        L_0x016b:
            r5 = r33
            goto L_0x0171
        L_0x016e:
            r5 = r63
            goto L_0x016b
        L_0x0171:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x017a
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0177:
            r7 = r64
            goto L_0x018d
        L_0x017a:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0177
            r7 = r64
            boolean r33 = r11.W(r7)
            if (r33 == 0) goto L_0x0189
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0189:
            r18 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r5 = r5 | r18
        L_0x018d:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0196
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0193:
            r9 = r65
            goto L_0x01a6
        L_0x0196:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0193
            r9 = r65
            boolean r18 = r11.d(r9)
            if (r18 == 0) goto L_0x01a4
            r17 = 2048(0x800, float:2.87E-42)
        L_0x01a4:
            r5 = r5 | r17
        L_0x01a6:
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01af
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x01ac:
            r10 = r66
            goto L_0x01bf
        L_0x01af:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x01ac
            r10 = r66
            boolean r17 = r11.d(r10)
            if (r17 == 0) goto L_0x01bd
            r20 = 16384(0x4000, float:2.2959E-41)
        L_0x01bd:
            r5 = r5 | r20
        L_0x01bf:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            if (r17 == 0) goto L_0x01cb
            r5 = r5 | r25
            r10 = r67
            goto L_0x01de
        L_0x01cb:
            r18 = r13 & r25
            r10 = r67
            if (r18 != 0) goto L_0x01de
            boolean r18 = r11.l(r10)
            if (r18 == 0) goto L_0x01da
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01dc
        L_0x01da:
            r18 = r24
        L_0x01dc:
            r5 = r5 | r18
        L_0x01de:
            r18 = r12 & r24
            if (r18 == 0) goto L_0x01e7
            r5 = r5 | r28
            r10 = r68
            goto L_0x01fa
        L_0x01e7:
            r20 = r13 & r28
            r10 = r68
            if (r20 != 0) goto L_0x01fa
            boolean r20 = r11.W(r10)
            if (r20 == 0) goto L_0x01f6
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f8
        L_0x01f6:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x01f8:
            r5 = r5 | r20
        L_0x01fa:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r1 & r20
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0210
            r10 = 599187(0x92493, float:8.3964E-40)
            r10 = r10 & r5
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r10 == r13) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            r10 = 0
            goto L_0x0211
        L_0x0210:
            r10 = 1
        L_0x0211:
            r13 = r1 & 1
            boolean r10 = r11.E(r10, r13)
            if (r10 == 0) goto L_0x09e9
            r11.p()
            r10 = r14 & 1
            r13 = 0
            if (r10 == 0) goto L_0x0251
            boolean r10 = r11.J()
            if (r10 == 0) goto L_0x0228
            goto L_0x0251
        L_0x0228:
            r11.B()
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0231
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0231:
            r15 = r54
            r20 = r55
            r14 = r56
            r21 = r57
            r10 = r58
            r24 = r59
            r25 = r60
            r9 = r61
            r27 = r62
            r8 = r63
            r28 = r64
            r7 = r65
            r33 = r66
            r34 = r67
            r35 = r68
            goto L_0x02fc
        L_0x0251:
            if (r4 == 0) goto L_0x0256
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0258
        L_0x0256:
            r4 = r54
        L_0x0258:
            if (r16 == 0) goto L_0x0261
            androidx.compose.ui.text.TextStyle$Companion r10 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r10 = r10.a()
            goto L_0x0263
        L_0x0261:
            r10 = r55
        L_0x0263:
            if (r19 == 0) goto L_0x026c
            androidx.compose.ui.text.input.VisualTransformation$Companion r16 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r16 = r16.c()
            goto L_0x026e
        L_0x026c:
            r16 = r56
        L_0x026e:
            if (r23 == 0) goto L_0x0273
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 r19 = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1.f5666z
            goto L_0x0275
        L_0x0273:
            r19 = r57
        L_0x0275:
            if (r27 == 0) goto L_0x027a
            r20 = r13
            goto L_0x027c
        L_0x027a:
            r20 = r58
        L_0x027c:
            if (r8 == 0) goto L_0x028a
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r21 = androidx.compose.ui.graphics.Color.f15975b
            long r14 = r21.f()
            r8.<init>(r14, r13)
            goto L_0x028c
        L_0x028a:
            r8 = r59
        L_0x028c:
            if (r0 == 0) goto L_0x0290
            r0 = 1
            goto L_0x0292
        L_0x0290:
            r0 = r60
        L_0x0292:
            if (r2 == 0) goto L_0x0298
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x029a
        L_0x0298:
            r2 = r61
        L_0x029a:
            if (r3 == 0) goto L_0x029e
            r3 = 1
            goto L_0x02a0
        L_0x029e:
            r3 = r62
        L_0x02a0:
            r14 = r12 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x02ad
            androidx.compose.ui.text.input.ImeOptions$Companion r14 = androidx.compose.ui.text.input.ImeOptions.f18832h
            androidx.compose.ui.text.input.ImeOptions r14 = r14.a()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02af
        L_0x02ad:
            r14 = r63
        L_0x02af:
            if (r6 == 0) goto L_0x02b8
            androidx.compose.foundation.text.KeyboardActions$Companion r6 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r6 = r6.a()
            goto L_0x02ba
        L_0x02b8:
            r6 = r64
        L_0x02ba:
            if (r7 == 0) goto L_0x02be
            r7 = 1
            goto L_0x02c0
        L_0x02be:
            r7 = r65
        L_0x02c0:
            if (r9 == 0) goto L_0x02c4
            r9 = 0
            goto L_0x02c6
        L_0x02c4:
            r9 = r66
        L_0x02c6:
            if (r17 == 0) goto L_0x02cf
            androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt r15 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.f5639a
            kotlin.jvm.functions.Function3 r15 = r15.a()
            goto L_0x02d1
        L_0x02cf:
            r15 = r67
        L_0x02d1:
            if (r18 == 0) goto L_0x02ef
            r25 = r0
            r27 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            r35 = r13
        L_0x02df:
            r8 = r14
            r34 = r15
            r14 = r16
            r21 = r19
            r9 = r2
            r15 = r4
            r51 = r20
            r20 = r10
            r10 = r51
            goto L_0x02fc
        L_0x02ef:
            r35 = r68
            r25 = r0
            r27 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            goto L_0x02df
        L_0x02fc:
            r11.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:204)"
            r2 = -244533042(0xfffffffff16cb8ce, float:-1.17219004E30)
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r5, r0)
        L_0x030d:
            java.lang.Object r0 = r11.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r2.a()
            if (r0 != r3) goto L_0x0321
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r11.N(r0)
        L_0x0321:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            java.lang.Object r3 = r11.g()
            java.lang.Object r4 = r2.a()
            if (r3 != r4) goto L_0x0334
            androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter r3 = androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt.b()
            r11.N(r3)
        L_0x0334:
            androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter r3 = (androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter) r3
            java.lang.Object r4 = r11.g()
            java.lang.Object r6 = r2.a()
            if (r4 != r6) goto L_0x0348
            androidx.compose.ui.text.input.TextInputService r4 = new androidx.compose.ui.text.input.TextInputService
            r4.<init>(r3)
            r11.N(r4)
        L_0x0348:
            androidx.compose.ui.text.input.TextInputService r4 = (androidx.compose.ui.text.input.TextInputService) r4
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r6 = r11.C(r6)
            r19 = r6
            androidx.compose.ui.unit.Density r19 = (androidx.compose.ui.unit.Density) r19
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r6 = r11.C(r6)
            androidx.compose.ui.text.font.FontFamily$Resolver r6 = (androidx.compose.ui.text.font.FontFamily.Resolver) r6
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r13 = r11.C(r13)
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = (androidx.compose.foundation.text.selection.TextSelectionColors) r13
            long r17 = r13.a()
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r13 = r11.C(r13)
            androidx.compose.ui.focus.FocusManager r13 = (androidx.compose.ui.focus.FocusManager) r13
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r12 = r11.C(r12)
            androidx.compose.ui.platform.WindowInfo r12 = (androidx.compose.ui.platform.WindowInfo) r12
            r32 = r15
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.q()
            java.lang.Object r15 = r11.C(r15)
            androidx.compose.ui.platform.SoftwareKeyboardController r15 = (androidx.compose.ui.platform.SoftwareKeyboardController) r15
            r66 = r3
            r3 = 1
            if (r9 != r3) goto L_0x039e
            if (r25 != 0) goto L_0x039e
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x039e
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x03a0
        L_0x039e:
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x03a0:
            r67 = r9
            if (r35 != 0) goto L_0x03f3
            r9 = -1705353356(0xffffffff9a5a5f74, float:-4.515845E-23)
            r11.X(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r3}
            androidx.compose.foundation.text.TextFieldScrollerPosition$Companion r36 = androidx.compose.foundation.text.TextFieldScrollerPosition.f5959g
            androidx.compose.runtime.saveable.Saver r36 = r36.a()
            boolean r37 = r11.W(r3)
            r68 = r12
            java.lang.Object r12 = r11.g()
            if (r37 != 0) goto L_0x03c9
            r37 = r10
            java.lang.Object r10 = r2.a()
            if (r12 != r10) goto L_0x03d3
            goto L_0x03cb
        L_0x03c9:
            r37 = r10
        L_0x03cb:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 r12 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            r12.<init>(r3)
            r11.N(r12)
        L_0x03d3:
            r10 = r12
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r12 = 0
            r38 = 4
            r39 = 0
            r54 = r9
            r55 = r36
            r56 = r39
            r57 = r10
            r58 = r11
            r59 = r12
            r60 = r38
            java.lang.Object r9 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r54, r55, r56, r57, r58, r59, r60)
            androidx.compose.foundation.text.TextFieldScrollerPosition r9 = (androidx.compose.foundation.text.TextFieldScrollerPosition) r9
            r11.M()
            goto L_0x0402
        L_0x03f3:
            r37 = r10
            r68 = r12
            r9 = -1705354472(0xffffffff9a5a5b18, float:-4.5154928E-23)
            r11.X(r9)
            r11.M()
            r9 = r35
        L_0x0402:
            androidx.compose.foundation.gestures.Orientation r10 = r9.f()
            if (r10 == r3) goto L_0x0428
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Mismatching scroller orientation; "
            r1.append(r2)
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r3 != r2) goto L_0x041b
            java.lang.String r2 = "only single-line, non-wrap text fields can scroll horizontally"
            goto L_0x041d
        L_0x041b:
            java.lang.String r2 = "single-line, non-wrap text fields can only scroll horizontally"
        L_0x041d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0428:
            r3 = r1 & 14
            r10 = 4
            if (r3 != r10) goto L_0x042f
            r10 = 1
            goto L_0x0430
        L_0x042f:
            r10 = 0
        L_0x0430:
            r12 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r12) goto L_0x043a
            r1 = 1
            goto L_0x043b
        L_0x043a:
            r1 = 0
        L_0x043b:
            r1 = r1 | r10
            java.lang.Object r10 = r11.g()
            if (r1 != 0) goto L_0x044c
            java.lang.Object r1 = r2.a()
            if (r10 != r1) goto L_0x0449
            goto L_0x044c
        L_0x0449:
            r36 = r9
            goto L_0x0472
        L_0x044c:
            androidx.compose.ui.text.AnnotatedString r1 = r52.f()
            androidx.compose.ui.text.input.TransformedText r1 = androidx.compose.foundation.text.ValidatingOffsetMappingKt.c(r14, r1)
            androidx.compose.ui.text.TextRange r10 = r52.g()
            if (r10 == 0) goto L_0x046c
            r12 = r9
            long r9 = r10.r()
            r36 = r12
            androidx.compose.foundation.text.TextFieldDelegate$Companion r12 = androidx.compose.foundation.text.TextFieldDelegate.f5899a
            androidx.compose.ui.text.input.TransformedText r9 = r12.a(r9, r1)
            if (r9 != 0) goto L_0x046a
            goto L_0x046e
        L_0x046a:
            r10 = r9
            goto L_0x046f
        L_0x046c:
            r36 = r9
        L_0x046e:
            r10 = r1
        L_0x046f:
            r11.N(r10)
        L_0x0472:
            r1 = r10
            androidx.compose.ui.text.input.TransformedText r1 = (androidx.compose.ui.text.input.TransformedText) r1
            androidx.compose.ui.text.AnnotatedString r9 = r1.b()
            androidx.compose.ui.text.input.OffsetMapping r12 = r1.a()
            r69 = r1
            r10 = 0
            androidx.compose.runtime.RecomposeScope r1 = androidx.compose.runtime.ComposablesKt.c(r11, r10)
            boolean r38 = r11.W(r15)
            java.lang.Object r10 = r11.g()
            if (r38 != 0) goto L_0x0497
            r38 = r8
            java.lang.Object r8 = r2.a()
            if (r10 != r8) goto L_0x04ca
            goto L_0x0499
        L_0x0497:
            r38 = r8
        L_0x0499:
            androidx.compose.foundation.text.LegacyTextFieldState r10 = new androidx.compose.foundation.text.LegacyTextFieldState
            androidx.compose.foundation.text.TextDelegate r8 = new androidx.compose.foundation.text.TextDelegate
            r40 = 300(0x12c, float:4.2E-43)
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r54 = r8
            r55 = r9
            r56 = r20
            r57 = r42
            r58 = r43
            r59 = r25
            r60 = r44
            r61 = r19
            r62 = r6
            r63 = r45
            r64 = r40
            r65 = r41
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r10.<init>(r8, r1, r15)
            r11.N(r10)
        L_0x04ca:
            r8 = r10
            androidx.compose.foundation.text.LegacyTextFieldState r8 = (androidx.compose.foundation.text.LegacyTextFieldState) r8
            androidx.compose.ui.text.AnnotatedString r1 = r52.f()
            r54 = r8
            r55 = r1
            r56 = r9
            r57 = r20
            r58 = r25
            r59 = r19
            r60 = r6
            r61 = r53
            r62 = r28
            r63 = r13
            r64 = r17
            r54.R(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            androidx.compose.ui.text.input.EditProcessor r1 = r8.p()
            androidx.compose.ui.text.input.TextInputSession r6 = r8.h()
            r15 = 0
            r10 = r52
            r1.d(r10, r6)
            java.lang.Object r1 = r11.g()
            java.lang.Object r6 = r2.a()
            if (r1 != r6) goto L_0x050c
            androidx.compose.foundation.text.UndoManager r1 = new androidx.compose.foundation.text.UndoManager
            r6 = 1
            r9 = 0
            r1.<init>(r15, r6, r9)
            r11.N(r1)
        L_0x050c:
            androidx.compose.foundation.text.UndoManager r1 = (androidx.compose.foundation.text.UndoManager) r1
            r6 = 2
            r9 = 0
            r17 = 0
            r54 = r1
            r55 = r52
            r56 = r17
            r58 = r6
            r59 = r9
            androidx.compose.foundation.text.UndoManager.f(r54, r55, r56, r58, r59)
            java.lang.Object r6 = r11.g()
            java.lang.Object r9 = r2.a()
            if (r6 != r9) goto L_0x0532
            kotlin.coroutines.EmptyCoroutineContext r6 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r6 = androidx.compose.runtime.EffectsKt.j(r6, r11)
            r11.N(r6)
        L_0x0532:
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            java.lang.Object r9 = r11.g()
            java.lang.Object r15 = r2.a()
            if (r9 != r15) goto L_0x0545
            androidx.compose.foundation.relocation.BringIntoViewRequester r9 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.a()
            r11.N(r9)
        L_0x0545:
            r15 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequester r15 = (androidx.compose.foundation.relocation.BringIntoViewRequester) r15
            java.lang.Object r9 = r11.g()
            r65 = r13
            java.lang.Object r13 = r2.a()
            if (r9 != r13) goto L_0x055c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r9 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager
            r9.<init>(r1)
            r11.N(r9)
        L_0x055c:
            r13 = r9
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r13
            r13.l0(r12)
            r13.s0(r14)
            kotlin.jvm.functions.Function1 r9 = r8.o()
            r13.m0(r9)
            r13.p0(r8)
            r13.r0(r10)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r9 = r11.C(r9)
            androidx.compose.ui.platform.Clipboard r9 = (androidx.compose.ui.platform.Clipboard) r9
            r13.b0(r9)
            r13.c0(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.r()
            java.lang.Object r9 = r11.C(r9)
            androidx.compose.ui.platform.TextToolbar r9 = (androidx.compose.ui.platform.TextToolbar) r9
            r13.q0(r9)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.k()
            java.lang.Object r9 = r11.C(r9)
            androidx.compose.ui.hapticfeedback.HapticFeedback r9 = (androidx.compose.ui.hapticfeedback.HapticFeedback) r9
            r13.k0(r9)
            r13.i0(r0)
            r9 = r33 ^ 1
            r13.g0(r9)
            r13.h0(r7)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            boolean r17 = r11.l(r8)
            r18 = r1
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r40 = r14
            r14 = 2048(0x800, float:2.87E-42)
            if (r1 != r14) goto L_0x05b9
            r14 = 1
            goto L_0x05ba
        L_0x05b9:
            r14 = 0
        L_0x05ba:
            r14 = r17 | r14
            r17 = 57344(0xe000, float:8.0356E-41)
            r10 = r5 & r17
            r17 = r1
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r1) goto L_0x05c9
            r1 = 1
            goto L_0x05ca
        L_0x05c9:
            r1 = 0
        L_0x05ca:
            r1 = r1 | r14
            boolean r14 = r11.l(r4)
            r1 = r1 | r14
            r14 = 4
            if (r3 != r14) goto L_0x05d5
            r14 = 1
            goto L_0x05d6
        L_0x05d5:
            r14 = 0
        L_0x05d6:
            r1 = r1 | r14
            r14 = r5 & 112(0x70, float:1.57E-43)
            r14 = r14 ^ 48
            r41 = r3
            r3 = 32
            if (r14 <= r3) goto L_0x05ef
            r3 = r38
            boolean r38 = r11.W(r3)
            if (r38 != 0) goto L_0x05ea
            goto L_0x05f1
        L_0x05ea:
            r42 = r5
            r38 = r10
            goto L_0x05fb
        L_0x05ef:
            r3 = r38
        L_0x05f1:
            r38 = r10
            r10 = r5 & 48
            r42 = r5
            r5 = 32
            if (r10 != r5) goto L_0x05fd
        L_0x05fb:
            r5 = 1
            goto L_0x05fe
        L_0x05fd:
            r5 = 0
        L_0x05fe:
            r1 = r1 | r5
            boolean r5 = r11.l(r12)
            r1 = r1 | r5
            boolean r5 = r11.l(r6)
            r1 = r1 | r5
            boolean r5 = r11.l(r15)
            r1 = r1 | r5
            boolean r5 = r11.l(r13)
            r1 = r1 | r5
            java.lang.Object r5 = r11.g()
            if (r1 != 0) goto L_0x061f
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x063d
        L_0x061f:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
            r54 = r5
            r55 = r8
            r56 = r7
            r57 = r33
            r58 = r4
            r59 = r52
            r60 = r3
            r61 = r12
            r62 = r13
            r63 = r6
            r64 = r15
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r11.N(r5)
        L_0x063d:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r10 = r37
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.a(r9, r7, r0, r10, r5)
            if (r7 == 0) goto L_0x064b
            if (r33 != 0) goto L_0x064b
            r5 = 1
            goto L_0x064c
        L_0x064b:
            r5 = 0
        L_0x064c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.p(r5, r11, r6)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            boolean r37 = r11.W(r5)
            boolean r43 = r11.l(r8)
            r37 = r37 | r43
            boolean r43 = r11.l(r4)
            r37 = r37 | r43
            boolean r43 = r11.l(r13)
            r37 = r37 | r43
            r43 = r15
            r15 = 32
            if (r14 <= r15) goto L_0x067d
            boolean r26 = r11.W(r3)
            if (r26 != 0) goto L_0x067a
            goto L_0x067d
        L_0x067a:
            r44 = r1
            goto L_0x0683
        L_0x067d:
            r44 = r1
            r1 = r42 & 48
            if (r1 != r15) goto L_0x0685
        L_0x0683:
            r15 = 1
            goto L_0x0686
        L_0x0685:
            r15 = 0
        L_0x0686:
            r1 = r37 | r15
            java.lang.Object r15 = r11.g()
            if (r1 != 0) goto L_0x0694
            java.lang.Object r1 = r2.a()
            if (r15 != r1) goto L_0x06ab
        L_0x0694:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1 r15 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1
            r1 = 0
            r54 = r15
            r55 = r8
            r56 = r5
            r57 = r4
            r58 = r13
            r59 = r3
            r60 = r1
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r11.N(r15)
        L_0x06ab:
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r1 = 6
            androidx.compose.runtime.EffectsKt.g(r6, r15, r11, r1)
            boolean r1 = r11.l(r8)
            java.lang.Object r6 = r11.g()
            if (r1 != 0) goto L_0x06c1
            java.lang.Object r1 = r2.a()
            if (r6 != r1) goto L_0x06c9
        L_0x06c1:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
            r6.<init>(r8)
            r11.N(r6)
        L_0x06c9:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.text.selection.SelectionGesturesKt.r(r9, r6)
            boolean r6 = r11.l(r8)
            r30 = r5
            r5 = r38
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r15) goto L_0x06dd
            r15 = 1
            goto L_0x06de
        L_0x06dd:
            r15 = 0
        L_0x06de:
            r5 = r6 | r15
            r15 = r17
            r6 = 2048(0x800, float:2.87E-42)
            if (r15 != r6) goto L_0x06e8
            r6 = 1
            goto L_0x06e9
        L_0x06e8:
            r6 = 0
        L_0x06e9:
            r5 = r5 | r6
            boolean r6 = r11.l(r12)
            r5 = r5 | r6
            boolean r6 = r11.l(r13)
            r5 = r5 | r6
            java.lang.Object r6 = r11.g()
            if (r5 != 0) goto L_0x0700
            java.lang.Object r5 = r2.a()
            if (r6 != r5) goto L_0x0716
        L_0x0700:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
            r54 = r6
            r55 = r8
            r56 = r0
            r57 = r33
            r58 = r7
            r59 = r13
            r60 = r12
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r11.N(r6)
        L_0x0716:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.a(r1, r10, r7, r6)
            androidx.compose.foundation.text.selection.MouseSelectionObserver r5 = r13.M()
            androidx.compose.foundation.text.TextDragObserver r6 = r13.R()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.text.selection.SelectionGesturesKt.m(r1, r5, r6)
            androidx.compose.ui.input.pointer.PointerIcon r5 = androidx.compose.foundation.text.TextPointerIcon_androidKt.b()
            r37 = r10
            r16 = r14
            r6 = 2
            r10 = 0
            r14 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.pointer.PointerIconKt.b(r1, r5, r10, r6, r14)
            boolean r5 = r11.l(r8)
            r10 = r41
            r6 = 4
            if (r10 != r6) goto L_0x0742
            r6 = 1
            goto L_0x0743
        L_0x0742:
            r6 = 0
        L_0x0743:
            r5 = r5 | r6
            boolean r6 = r11.l(r12)
            r5 = r5 | r6
            java.lang.Object r6 = r11.g()
            if (r5 != 0) goto L_0x0759
            java.lang.Object r5 = r2.a()
            if (r6 != r5) goto L_0x0756
            goto L_0x0759
        L_0x0756:
            r14 = r52
            goto L_0x0763
        L_0x0759:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
            r14 = r52
            r6.<init>(r8, r14, r12)
            r11.N(r6)
        L_0x0763:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.draw.DrawModifierKt.b(r9, r6)
            boolean r5 = r11.l(r8)
            r6 = 2048(0x800, float:2.87E-42)
            if (r15 != r6) goto L_0x0773
            r15 = 1
            goto L_0x0774
        L_0x0773:
            r15 = 0
        L_0x0774:
            r5 = r5 | r15
            r6 = r68
            boolean r15 = r11.W(r6)
            r5 = r5 | r15
            boolean r15 = r11.l(r13)
            r5 = r5 | r15
            r15 = 4
            if (r10 != r15) goto L_0x0786
            r15 = 1
            goto L_0x0787
        L_0x0786:
            r15 = 0
        L_0x0787:
            r5 = r5 | r15
            boolean r15 = r11.l(r12)
            r5 = r5 | r15
            java.lang.Object r15 = r11.g()
            if (r5 != 0) goto L_0x0799
            java.lang.Object r5 = r2.a()
            if (r15 != r5) goto L_0x07af
        L_0x0799:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1 r15 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
            r54 = r15
            r55 = r8
            r56 = r7
            r57 = r6
            r58 = r13
            r59 = r52
            r60 = r12
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r11.N(r15)
        L_0x07af:
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            androidx.compose.ui.Modifier r15 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r9, r15)
            r68 = r15
            r5 = r40
            boolean r15 = r5 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier r5 = new androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier
            r54 = r5
            r55 = r69
            r56 = r52
            r57 = r8
            r58 = r33
            r59 = r7
            r60 = r15
            r61 = r12
            r62 = r13
            r63 = r3
            r64 = r0
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            if (r7 == 0) goto L_0x07e8
            if (r33 != 0) goto L_0x07e8
            boolean r0 = r6.b()
            if (r0 == 0) goto L_0x07e8
            boolean r0 = r8.z()
            if (r0 != 0) goto L_0x07e8
            r0 = 1
            goto L_0x07e9
        L_0x07e8:
            r0 = 0
        L_0x07e9:
            r54 = r9
            r55 = r8
            r56 = r52
            r57 = r12
            r58 = r24
            r59 = r0
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.text.TextFieldCursorKt.a(r54, r55, r56, r57, r58, r59)
            boolean r0 = r11.l(r13)
            r64 = r15
            java.lang.Object r15 = r11.g()
            if (r0 != 0) goto L_0x080b
            java.lang.Object r0 = r2.a()
            if (r15 != r0) goto L_0x0813
        L_0x080b:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1 r15 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
            r15.<init>(r13)
            r11.N(r15)
        L_0x0813:
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r0 = 0
            androidx.compose.runtime.EffectsKt.c(r13, r15, r11, r0)
            boolean r15 = r11.l(r8)
            boolean r22 = r11.l(r4)
            r15 = r15 | r22
            r0 = 4
            if (r10 != r0) goto L_0x0828
            r0 = 1
            goto L_0x0829
        L_0x0828:
            r0 = 0
        L_0x0829:
            r0 = r0 | r15
            r15 = r16
            r10 = 32
            if (r15 <= r10) goto L_0x0836
            boolean r15 = r11.W(r3)
            if (r15 != 0) goto L_0x083a
        L_0x0836:
            r15 = r42 & 48
            if (r15 != r10) goto L_0x083c
        L_0x083a:
            r15 = 1
            goto L_0x083d
        L_0x083c:
            r15 = 0
        L_0x083d:
            r0 = r0 | r15
            java.lang.Object r10 = r11.g()
            if (r0 != 0) goto L_0x084a
            java.lang.Object r0 = r2.a()
            if (r10 != r0) goto L_0x0852
        L_0x084a:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1 r10 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
            r10.<init>(r8, r4, r14, r3)
            r11.N(r10)
        L_0x0852:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            int r0 = r42 >> 3
            r0 = r0 & 14
            androidx.compose.runtime.EffectsKt.c(r3, r10, r11, r0)
            kotlin.jvm.functions.Function1 r0 = r8.o()
            r4 = r33 ^ 1
            r10 = r67
            r15 = 1
            if (r10 != r15) goto L_0x0869
            r16 = r15
            goto L_0x086b
        L_0x0869:
            r16 = 0
        L_0x086b:
            int r22 = r3.e()
            r54 = r9
            r55 = r8
            r56 = r13
            r57 = r52
            r58 = r0
            r59 = r4
            r60 = r16
            r61 = r12
            r62 = r18
            r63 = r22
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.TextFieldKeyInputKt.a(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            int r4 = r3.f()
            androidx.compose.ui.text.input.KeyboardType$Companion r16 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r15 = r16.f()
            boolean r4 = androidx.compose.ui.text.input.KeyboardType.n(r4, r15)
            if (r4 != 0) goto L_0x08a7
            int r4 = r3.f()
            int r15 = r16.e()
            boolean r4 = androidx.compose.ui.text.input.KeyboardType.n(r4, r15)
            if (r4 != 0) goto L_0x08a7
            r15 = 1
            goto L_0x08a8
        L_0x08a7:
            r15 = 0
        L_0x08a8:
            boolean r4 = b(r30)
            boolean r16 = r11.d(r15)
            r38 = r3
            r3 = r66
            boolean r18 = r11.l(r3)
            r16 = r16 | r18
            r54 = r12
            java.lang.Object r12 = r11.g()
            if (r16 != 0) goto L_0x08c8
            java.lang.Object r14 = r2.a()
            if (r12 != r14) goto L_0x08d0
        L_0x08c8:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1 r12 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
            r12.<init>(r15, r3)
            r11.N(r12)
        L_0x08d0:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.text.handwriting.StylusHandwritingKt.b(r9, r4, r15, r12)
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.foundation.text.AutofillHighlightKt.a()
            java.lang.Object r12 = r11.C(r12)
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.ui.graphics.Color) r12
            long r14 = r12.v()
            boolean r12 = r11.l(r8)
            boolean r16 = r11.j(r14)
            r12 = r12 | r16
            r67 = r10
            java.lang.Object r10 = r11.g()
            if (r12 != 0) goto L_0x08fc
            java.lang.Object r2 = r2.a()
            if (r10 != r2) goto L_0x0904
        L_0x08fc:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1 r10 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1
            r10.<init>(r8, r14)
            r11.N(r10)
        L_0x0904:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.DrawModifierKt.b(r9, r10)
            r15 = r32
            androidx.compose.ui.Modifier r2 = r15.o0(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt.a(r2, r3, r8, r13)
            androidx.compose.ui.Modifier r2 = r2.o0(r4)
            r3 = r44
            androidx.compose.ui.Modifier r2 = r2.o0(r3)
            r3 = r65
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.b(r2, r8, r3)
            androidx.compose.ui.Modifier r2 = o(r2, r8, r13)
            androidx.compose.ui.Modifier r0 = r2.o0(r0)
            r12 = r36
            r10 = r37
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.TextFieldScrollKt.d(r0, r12, r10, r7)
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            androidx.compose.ui.Modifier r0 = r0.o0(r5)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            r1.<init>(r8)
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r0, r1)
            if (r7 == 0) goto L_0x095c
            boolean r0 = r8.f()
            if (r0 == 0) goto L_0x095c
            boolean r0 = r8.A()
            if (r0 == 0) goto L_0x095c
            boolean r0 = r6.b()
            if (r0 == 0) goto L_0x095c
            r16 = 1
            goto L_0x095e
        L_0x095c:
            r16 = 0
        L_0x095e:
            if (r16 == 0) goto L_0x0967
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.c(r9, r13)
            r18 = r0
            goto L_0x0969
        L_0x0967:
            r18 = r9
        L_0x0969:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5 r9 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            r0 = r9
            r1 = r34
            r2 = r8
            r8 = r38
            r3 = r20
            r4 = r27
            r22 = r40
            r5 = r67
            r6 = r12
            r26 = r7
            r7 = r52
            r29 = r8
            r8 = r22
            r30 = r67
            r12 = r9
            r9 = r64
            r31 = r10
            r10 = r17
            r46 = r11
            r11 = r68
            r32 = r54
            r47 = r12
            r12 = r18
            r54 = r13
            r13 = r43
            r48 = r14
            r14 = r54
            r23 = r15
            r15 = r16
            r16 = r33
            r17 = r21
            r18 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 54
            r1 = -492537660(0xffffffffe2a478c4, float:-1.516984E21)
            r2 = r46
            r4 = r47
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r3, r4, r2, r0)
            r1 = 384(0x180, float:5.38E-43)
            r9 = r54
            r3 = r48
            c(r3, r9, r0, r2, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x09ca
            androidx.compose.runtime.ComposerKt.X()
        L_0x09ca:
            r4 = r20
            r6 = r21
            r5 = r22
            r3 = r23
            r8 = r24
            r9 = r25
            r14 = r26
            r11 = r27
            r13 = r28
            r12 = r29
            r10 = r30
            r7 = r31
            r15 = r33
            r16 = r34
            r17 = r35
            goto L_0x0a0b
        L_0x09e9:
            r2 = r11
            r2.B()
            r3 = r54
            r4 = r55
            r5 = r56
            r6 = r57
            r7 = r58
            r8 = r59
            r9 = r60
            r10 = r61
            r11 = r62
            r12 = r63
            r13 = r64
            r14 = r65
            r15 = r66
            r16 = r67
            r17 = r68
        L_0x0a0b:
            androidx.compose.runtime.ScopeUpdateScope r2 = r2.x()
            if (r2 == 0) goto L_0x0a2c
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
            r0 = r1
            r49 = r1
            r1 = r52
            r50 = r2
            r2 = r53
            r18 = r70
            r19 = r71
            r20 = r72
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r49
            r0 = r50
            r0.a(r1)
        L_0x0a2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.foundation.text.TextFieldScrollerPosition, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void c(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-20551815);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-20551815, i3, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            ContextMenu_androidKt.c(textFieldSelectionManager, function2, q2, (i3 >> 3) & 126);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, function2, i2));
        }
    }

    public static final void d(TextFieldSelectionManager textFieldSelectionManager, boolean z2, Composer composer, int i2) {
        int i3;
        TextLayoutResultProxy l2;
        TextLayoutResult f2;
        Composer q2 = composer.q(626339208);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(textFieldSelectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.d(z2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(626339208, i3, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z2) {
                q2.X(-1290924834);
                LegacyTextFieldState P = textFieldSelectionManager.P();
                TextLayoutResult textLayoutResult = null;
                if (!(P == null || (l2 = P.l()) == null || (f2 = l2.f()) == null)) {
                    LegacyTextFieldState P2 = textFieldSelectionManager.P();
                    if (!(P2 != null ? P2.B() : true)) {
                        textLayoutResult = f2;
                    }
                }
                if (textLayoutResult == null) {
                    q2.X(-1290601288);
                } else {
                    q2.X(-1290601287);
                    if (!TextRange.h(textFieldSelectionManager.U().h())) {
                        q2.X(-1685230508);
                        int b2 = textFieldSelectionManager.N().b(TextRange.n(textFieldSelectionManager.U().h()));
                        int b3 = textFieldSelectionManager.N().b(TextRange.i(textFieldSelectionManager.U().h()));
                        ResolvedTextDirection c2 = textLayoutResult.c(b2);
                        ResolvedTextDirection c3 = textLayoutResult.c(Math.max(b3 - 1, 0));
                        LegacyTextFieldState P3 = textFieldSelectionManager.P();
                        if (P3 == null || !P3.w()) {
                            q2.X(-1684548198);
                            q2.M();
                        } else {
                            q2.X(-1684812473);
                            TextFieldSelectionManagerKt.a(true, c2, textFieldSelectionManager, q2, ((i3 << 6) & 896) | 6);
                            q2.M();
                        }
                        LegacyTextFieldState P4 = textFieldSelectionManager.P();
                        if (P4 == null || !P4.v()) {
                            q2.X(-1684200998);
                            q2.M();
                        } else {
                            q2.X(-1684464312);
                            TextFieldSelectionManagerKt.a(false, c3, textFieldSelectionManager, q2, ((i3 << 6) & 896) | 6);
                            q2.M();
                        }
                        q2.M();
                    } else {
                        q2.X(-1684179174);
                        q2.M();
                    }
                    LegacyTextFieldState P5 = textFieldSelectionManager.P();
                    if (P5 != null) {
                        if (textFieldSelectionManager.Y()) {
                            P5.O(false);
                        }
                        if (P5.f()) {
                            if (P5.u()) {
                                textFieldSelectionManager.t0();
                            } else {
                                textFieldSelectionManager.X();
                            }
                        }
                        Unit unit = Unit.f40552a;
                    }
                }
                q2.M();
                q2.M();
            } else {
                q2.X(651160447);
                q2.M();
                textFieldSelectionManager.X();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z2, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.foundation.text.selection.OffsetProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.foundation.text.selection.TextFieldSelectionManager r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            androidx.compose.runtime.Composer r10 = r10.q(r0)
            r1 = r11 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r10.l(r9)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r11
            goto L_0x0018
        L_0x0017:
            r1 = r11
        L_0x0018:
            r3 = r1 & 3
            r4 = 0
            r5 = 1
            if (r3 == r2) goto L_0x0020
            r2 = r5
            goto L_0x0021
        L_0x0020:
            r2 = r4
        L_0x0021:
            r3 = r1 & 1
            boolean r2 = r10.E(r2, r3)
            if (r2 == 0) goto L_0x0101
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0035
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0035:
            androidx.compose.foundation.text.LegacyTextFieldState r0 = r9.P()
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.t()
            if (r0 != r5) goto L_0x00ee
            androidx.compose.ui.text.AnnotatedString r0 = r9.S()
            if (r0 == 0) goto L_0x00ee
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ee
            r0 = -289940723(0xffffffffeeb7db0d, float:-2.8450286E28)
            r10.X(r0)
            boolean r0 = r10.W(r9)
            java.lang.Object r1 = r10.g()
            if (r0 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x006c
        L_0x0065:
            androidx.compose.foundation.text.TextDragObserver r1 = r9.t()
            r10.N(r1)
        L_0x006c:
            androidx.compose.foundation.text.TextDragObserver r1 = (androidx.compose.foundation.text.TextDragObserver) r1
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r10.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            long r2 = r9.E(r0)
            boolean r0 = r10.j(r2)
            java.lang.Object r6 = r10.g()
            if (r0 != 0) goto L_0x008e
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x0096
        L_0x008e:
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
            r6.<init>(r2)
            r10.N(r6)
        L_0x0096:
            r0 = r6
            androidx.compose.foundation.text.selection.OffsetProvider r0 = (androidx.compose.foundation.text.selection.OffsetProvider) r0
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            boolean r7 = r10.l(r1)
            boolean r8 = r10.l(r9)
            r7 = r7 | r8
            java.lang.Object r8 = r10.g()
            if (r7 != 0) goto L_0x00b2
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00ba
        L_0x00b2:
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1 r8 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
            r8.<init>(r1, r9)
            r10.N(r8)
        L_0x00ba:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r8 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r8
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r6, r1, r8)
            boolean r6 = r10.j(r2)
            java.lang.Object r7 = r10.g()
            if (r6 != 0) goto L_0x00d2
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00da
        L_0x00d2:
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1 r7 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
            r7.<init>(r2)
            r10.N(r7)
        L_0x00da:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r2 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r1, r4, r7, r5, r2)
            r6 = 0
            r7 = 4
            r3 = 0
            r1 = r0
            r5 = r10
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.a(r1, r2, r3, r5, r6, r7)
            r10.M()
            goto L_0x00f7
        L_0x00ee:
            r0 = -288632802(0xffffffffeecbd01e, float:-3.1538528E28)
            r10.X(r0)
            r10.M()
        L_0x00f7:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0104
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0104
        L_0x0101:
            r10.B()
        L_0x0104:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.x()
            if (r10 == 0) goto L_0x0112
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4
            r0.<init>(r9, r11)
            r10.a(r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.e(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final Object l(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation continuation) {
        int b2 = offsetMapping.b(TextRange.k(textFieldValue.h()));
        Object a2 = bringIntoViewRequester.a(b2 < textLayoutResult.l().j().length() ? textLayoutResult.d(b2) : b2 != 0 ? textLayoutResult.d(b2 - 1) : new Rect(0.0f, 0.0f, 1.0f, (float) ((int) (TextFieldDelegateKt.b(textDelegate.j(), textDelegate.a(), textDelegate.b(), (String) null, 0, 24, (Object) null) & 4294967295L))), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public static final void m(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession h2 = legacyTextFieldState.h();
        if (h2 != null) {
            TextFieldDelegate.f5899a.f(h2, legacyTextFieldState.p(), legacyTextFieldState.o());
        }
        legacyTextFieldState.H((TextInputSession) null);
    }

    public static final void n(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            TextLayoutResultProxy l2 = legacyTextFieldState.l();
            if (l2 != null) {
                TextInputSession h2 = legacyTextFieldState.h();
                if (h2 == null) {
                    companion.m(d2, f2, g2);
                    return;
                }
                LayoutCoordinates k2 = legacyTextFieldState.k();
                if (k2 == null) {
                    companion.m(d2, f2, g2);
                    return;
                }
                TextFieldDelegate.f5899a.e(textFieldValue, legacyTextFieldState.x(), l2.f(), k2, h2, legacyTextFieldState.f(), offsetMapping);
                Unit unit = Unit.f40552a;
                companion.m(d2, f2, g2);
            }
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public static final Modifier o(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.b(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(legacyTextFieldState, textFieldSelectionManager));
    }

    public static final void p(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.H(TextFieldDelegate.f5899a.h(textInputService, textFieldValue, legacyTextFieldState.p(), imeOptions, legacyTextFieldState.o(), legacyTextFieldState.n()));
        n(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    public static final void q(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2) {
        SoftwareKeyboardController j2;
        if (!legacyTextFieldState.f()) {
            FocusRequester.i(focusRequester, 0, 1, (Object) null);
        } else if (z2 && (j2 = legacyTextFieldState.j()) != null) {
            j2.b();
        }
    }
}
