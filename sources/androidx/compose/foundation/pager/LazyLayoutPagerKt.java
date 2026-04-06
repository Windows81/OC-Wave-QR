package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KProperty0;

@Metadata
public final class LazyLayoutPagerKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.foundation.pager.PagerWrapperFlingBehavior} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: androidx.compose.foundation.pager.PagerBringIntoViewSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v89, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r34, androidx.compose.foundation.pager.PagerState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, androidx.compose.foundation.gestures.Orientation r38, androidx.compose.foundation.gestures.TargetedFlingBehavior r39, boolean r40, androidx.compose.foundation.OverscrollEffect r41, int r42, float r43, androidx.compose.foundation.pager.PageSize r44, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, kotlin.jvm.functions.Function1 r46, androidx.compose.ui.Alignment.Horizontal r47, androidx.compose.ui.Alignment.Vertical r48, androidx.compose.foundation.gestures.snapping.SnapPosition r49, kotlin.jvm.functions.Function4 r50, androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            r1 = r34
            r0 = r35
            r15 = r37
            r14 = r38
            r13 = r39
            r12 = r40
            r11 = r45
            r10 = r52
            r9 = r53
            r8 = r54
            r2 = 1125194810(0x43111c3a, float:145.11026)
            r3 = r51
            androidx.compose.runtime.Composer r7 = r3.q(r2)
            r2 = r8 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r10 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0033
            boolean r2 = r7.W(r1)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r10
            goto L_0x0034
        L_0x0033:
            r2 = r10
        L_0x0034:
            r4 = r8 & 2
            if (r4 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x004b
            boolean r4 = r7.W(r0)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r2 = r2 | r4
        L_0x004b:
            r4 = r8 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0058
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r4 = r36
            goto L_0x006b
        L_0x0058:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0055
            r4 = r36
            boolean r18 = r7.W(r4)
            if (r18 == 0) goto L_0x0067
            r18 = r17
            goto L_0x0069
        L_0x0067:
            r18 = r16
        L_0x0069:
            r2 = r2 | r18
        L_0x006b:
            r18 = r8 & 8
            r19 = 1024(0x400, float:1.435E-42)
            r20 = 2048(0x800, float:2.87E-42)
            if (r18 == 0) goto L_0x0076
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0086
            boolean r3 = r7.d(r15)
            if (r3 == 0) goto L_0x0083
            r3 = r20
            goto L_0x0085
        L_0x0083:
            r3 = r19
        L_0x0085:
            r2 = r2 | r3
        L_0x0086:
            r3 = r8 & 16
            r18 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0091
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x0091:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a1
            boolean r3 = r7.W(r14)
            if (r3 == 0) goto L_0x009e
            r3 = r21
            goto L_0x00a0
        L_0x009e:
            r3 = r18
        L_0x00a0:
            r2 = r2 | r3
        L_0x00a1:
            r3 = r8 & 32
            r22 = 65536(0x10000, float:9.18355E-41)
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00ac
            r2 = r2 | r23
            goto L_0x00bc
        L_0x00ac:
            r3 = r10 & r23
            if (r3 != 0) goto L_0x00bc
            boolean r3 = r7.W(r13)
            if (r3 == 0) goto L_0x00b9
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r3 = r22
        L_0x00bb:
            r2 = r2 | r3
        L_0x00bc:
            r3 = r8 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00c5
            r2 = r2 | r24
            goto L_0x00d5
        L_0x00c5:
            r3 = r10 & r24
            if (r3 != 0) goto L_0x00d5
            boolean r3 = r7.d(r12)
            if (r3 == 0) goto L_0x00d2
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r2 = r2 | r3
        L_0x00d5:
            r3 = r8 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00df
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
        L_0x00dc:
            r3 = r41
            goto L_0x00f3
        L_0x00df:
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 & r10
            if (r3 != 0) goto L_0x00dc
            r3 = r41
            boolean r25 = r7.W(r3)
            if (r25 == 0) goto L_0x00ef
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r2 = r2 | r25
        L_0x00f3:
            r5 = r8 & 256(0x100, float:3.59E-43)
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 == 0) goto L_0x00fe
            r2 = r2 | r26
            r6 = r42
            goto L_0x0111
        L_0x00fe:
            r26 = r10 & r26
            r6 = r42
            if (r26 != 0) goto L_0x0111
            boolean r27 = r7.i(r6)
            if (r27 == 0) goto L_0x010d
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010d:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r2 = r2 | r27
        L_0x0111:
            r1 = r8 & 512(0x200, float:7.175E-43)
            r28 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x011c
            r2 = r2 | r28
            r3 = r43
            goto L_0x012f
        L_0x011c:
            r28 = r10 & r28
            r3 = r43
            if (r28 != 0) goto L_0x012f
            boolean r28 = r7.h(r3)
            if (r28 == 0) goto L_0x012b
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012d
        L_0x012b:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012d:
            r2 = r2 | r28
        L_0x012f:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013a
            r3 = r9 | 6
            r28 = r3
            r3 = r44
            goto L_0x0152
        L_0x013a:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x014e
            r3 = r44
            boolean r28 = r7.W(r3)
            if (r28 == 0) goto L_0x0149
            r28 = 4
            goto L_0x014b
        L_0x0149:
            r28 = 2
        L_0x014b:
            r28 = r9 | r28
            goto L_0x0152
        L_0x014e:
            r3 = r44
            r28 = r9
        L_0x0152:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x015b
            r28 = r28 | 48
        L_0x0158:
            r3 = r28
            goto L_0x016d
        L_0x015b:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x0158
            boolean r3 = r7.l(r11)
            if (r3 == 0) goto L_0x0168
            r25 = 32
            goto L_0x016a
        L_0x0168:
            r25 = 16
        L_0x016a:
            r28 = r28 | r25
            goto L_0x0158
        L_0x016d:
            r4 = r8 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0176
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0173:
            r4 = r46
            goto L_0x0186
        L_0x0176:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0173
            r4 = r46
            boolean r25 = r7.l(r4)
            if (r25 == 0) goto L_0x0184
            r16 = r17
        L_0x0184:
            r3 = r3 | r16
        L_0x0186:
            r4 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x018f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x018c:
            r4 = r47
            goto L_0x019f
        L_0x018f:
            r4 = r9 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x018c
            r4 = r47
            boolean r16 = r7.W(r4)
            if (r16 == 0) goto L_0x019d
            r19 = r20
        L_0x019d:
            r3 = r3 | r19
        L_0x019f:
            r4 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x01a8
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x01a5:
            r4 = r48
            goto L_0x01b8
        L_0x01a8:
            r4 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x01a5
            r4 = r48
            boolean r16 = r7.W(r4)
            if (r16 == 0) goto L_0x01b6
            r18 = r21
        L_0x01b6:
            r3 = r3 | r18
        L_0x01b8:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r8 & r16
            if (r16 == 0) goto L_0x01c4
            r3 = r3 | r23
            r15 = r49
            goto L_0x01d7
        L_0x01c4:
            r16 = r9 & r23
            r15 = r49
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r7.W(r15)
            if (r16 == 0) goto L_0x01d3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01d5
        L_0x01d3:
            r16 = r22
        L_0x01d5:
            r3 = r3 | r16
        L_0x01d7:
            r16 = r8 & r22
            if (r16 == 0) goto L_0x01e0
            r3 = r3 | r24
            r15 = r50
            goto L_0x01f3
        L_0x01e0:
            r16 = r9 & r24
            r15 = r50
            if (r16 != 0) goto L_0x01f3
            boolean r16 = r7.l(r15)
            if (r16 == 0) goto L_0x01ef
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f1
        L_0x01ef:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01f1:
            r3 = r3 | r16
        L_0x01f3:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r2 & r16
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            r15 = 0
            r18 = 1
            if (r4 != r6) goto L_0x020c
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r3
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r4 == r6) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r4 = r15
            goto L_0x020e
        L_0x020c:
            r4 = r18
        L_0x020e:
            r6 = r2 & 1
            boolean r4 = r7.E(r4, r6)
            if (r4 == 0) goto L_0x046a
            if (r5 == 0) goto L_0x021a
            r6 = r15
            goto L_0x021c
        L_0x021a:
            r6 = r42
        L_0x021c:
            if (r1 == 0) goto L_0x0224
            float r1 = (float) r15
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            goto L_0x0226
        L_0x0224:
            r1 = r43
        L_0x0226:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0234
            r4 = 1125194810(0x43111c3a, float:145.11026)
            java.lang.String r5 = "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)"
            androidx.compose.runtime.ComposerKt.Y(r4, r2, r3, r5)
        L_0x0234:
            if (r6 < 0) goto L_0x0239
            r4 = r18
            goto L_0x023a
        L_0x0239:
            r4 = r15
        L_0x023a:
            if (r4 != 0) goto L_0x0250
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "beyondViewportPageCount should be greater than or equal to 0, you selected "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r4)
        L_0x0250:
            r5 = r2 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r5 != r4) goto L_0x0259
            r4 = r18
            goto L_0x025a
        L_0x0259:
            r4 = r15
        L_0x025a:
            java.lang.Object r15 = r7.g()
            if (r4 != 0) goto L_0x0268
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r15 != r4) goto L_0x0270
        L_0x0268:
            androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1 r15 = new androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
            r15.<init>(r0)
            r7.N(r15)
        L_0x0270:
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            int r4 = r2 >> 3
            r14 = r4 & 14
            int r16 = r3 >> 15
            r17 = r16 & 112(0x70, float:1.57E-43)
            r17 = r14 | r17
            r19 = r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r17 = r17 | r2
            r2 = r35
            r20 = r3
            r3 = r50
            r29 = r4
            r4 = r46
            r42 = r14
            r14 = r5
            r5 = r15
            r43 = r6
            r15 = 2
            r6 = r7
            r21 = r7
            r7 = r17
            kotlin.jvm.functions.Function0 r22 = c(r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r21.g()
            androidx.compose.runtime.Composer$Companion r23 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r23.a()
            if (r2 != r3) goto L_0x02b4
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            r7 = r21
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r7)
            r7.N(r2)
            goto L_0x02b6
        L_0x02b4:
            r7 = r21
        L_0x02b6:
            r6 = r2
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            r2 = 32
            if (r14 != r2) goto L_0x02c0
            r2 = r18
            goto L_0x02c1
        L_0x02c0:
            r2 = 0
        L_0x02c1:
            java.lang.Object r3 = r7.g()
            if (r2 != 0) goto L_0x02cd
            java.lang.Object r2 = r23.a()
            if (r3 != r2) goto L_0x02d5
        L_0x02cd:
            androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1 r3 = new androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
            r3.<init>(r0)
            r7.N(r3)
        L_0x02d5:
            r17 = r3
            kotlin.jvm.functions.Function0 r17 = (kotlin.jvm.functions.Function0) r17
            r2 = 65520(0xfff0, float:9.1813E-41)
            r2 = r19 & r2
            int r3 = r19 >> 9
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r4
            r2 = r2 | r3
            int r3 = r20 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r2 = r2 | r3
            int r3 = r20 << 15
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r20 = r2 | r3
            r21 = r16 & 14
            r2 = r22
            r3 = r35
            r4 = r36
            r5 = r37
            r24 = r6
            r6 = r38
            r25 = r7
            r7 = r43
            r8 = r1
            r9 = r44
            r10 = r47
            r26 = r1
            r1 = r11
            r11 = r48
            r1 = r12
            r12 = r49
            r1 = r13
            r13 = r24
            r1 = r38
            r31 = r42
            r30 = r14
            r14 = r17
            r28 = 0
            r15 = r25
            r16 = r20
            r17 = r21
            kotlin.jvm.functions.Function2 r12 = androidx.compose.foundation.pager.PagerMeasurePolicyKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r1 != r10) goto L_0x033a
            r15 = r18
            r13 = r25
        L_0x0337:
            r2 = r31
            goto L_0x033f
        L_0x033a:
            r13 = r25
            r15 = r28
            goto L_0x0337
        L_0x033f:
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r4 = androidx.compose.foundation.pager.PagerSemanticsKt.a(r0, r15, r13, r2)
            r5 = r30
            r3 = 32
            if (r5 != r3) goto L_0x034c
            r15 = r18
            goto L_0x034e
        L_0x034c:
            r15 = r28
        L_0x034e:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r19 & r3
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r6) goto L_0x0359
            r3 = r18
            goto L_0x035b
        L_0x0359:
            r3 = r28
        L_0x035b:
            r3 = r3 | r15
            java.lang.Object r6 = r13.g()
            if (r3 != 0) goto L_0x036d
            java.lang.Object r3 = r23.a()
            if (r6 != r3) goto L_0x0369
            goto L_0x036d
        L_0x0369:
            r14 = r1
            r1 = r39
            goto L_0x0378
        L_0x036d:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior
            r14 = r1
            r1 = r39
            r6.<init>(r1, r0)
            r13.N(r6)
        L_0x0378:
            r11 = r6
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r11 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r11
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt.a()
            java.lang.Object r3 = r13.C(r3)
            androidx.compose.foundation.gestures.BringIntoViewSpec r3 = (androidx.compose.foundation.gestures.BringIntoViewSpec) r3
            r6 = 32
            if (r5 != r6) goto L_0x038c
            r15 = r18
            goto L_0x038e
        L_0x038c:
            r15 = r28
        L_0x038e:
            boolean r5 = r13.W(r3)
            r5 = r5 | r15
            java.lang.Object r6 = r13.g()
            if (r5 != 0) goto L_0x039f
            java.lang.Object r5 = r23.a()
            if (r6 != r5) goto L_0x03a7
        L_0x039f:
            androidx.compose.foundation.pager.PagerBringIntoViewSpec r6 = new androidx.compose.foundation.pager.PagerBringIntoViewSpec
            r6.<init>(r0, r3)
            r13.N(r6)
        L_0x03a7:
            r15 = r6
            androidx.compose.foundation.pager.PagerBringIntoViewSpec r15 = (androidx.compose.foundation.pager.PagerBringIntoViewSpec) r15
            r1 = r40
            if (r1 == 0) goto L_0x03d0
            r3 = 1935359245(0x735b3d0d, float:1.7369862E31)
            r13.X(r3)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            int r5 = r19 >> 21
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            r9 = r43
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r2 = androidx.compose.foundation.pager.PagerBeyondBoundsModifierKt.a(r0, r9, r13, r2)
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo r5 = r35.u()
            r8 = r37
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.b(r3, r2, r5, r8, r14)
            r13.M()
        L_0x03ce:
            r7 = r2
            goto L_0x03e0
        L_0x03d0:
            r8 = r37
            r9 = r43
            r2 = 1935788068(0x7361c824, float:1.7888277E31)
            r13.X(r2)
            r13.M()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x03ce
        L_0x03e0:
            androidx.compose.ui.layout.RemeasurementModifier r2 = r35.R()
            r6 = r34
            androidx.compose.ui.Modifier r2 = r6.o0(r2)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r3 = r35.t()
            androidx.compose.ui.Modifier r2 = r2.o0(r3)
            r3 = r29
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            int r5 = r19 >> 6
            r16 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r16
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            int r16 = r19 << 6
            r5 = r16 & r5
            r16 = r3 | r5
            r3 = r22
            r5 = r38
            r6 = r40
            r42 = r12
            r12 = r7
            r7 = r37
            r8 = r13
            r17 = r9
            r9 = r16
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.c(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r10) goto L_0x0421
            r3 = r18
            r4 = r24
            goto L_0x0425
        L_0x0421:
            r4 = r24
            r3 = r28
        L_0x0425:
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.pager.PagerKt.h(r2, r0, r3, r4, r1)
            androidx.compose.ui.Modifier r2 = r2.o0(r12)
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = r35.A()
            r9 = 0
            r3 = r35
            r4 = r38
            r5 = r40
            r6 = r37
            r7 = r11
            r10 = r41
            r11 = r15
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ScrollingContainerKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r2 = b(r2, r0)
            r3 = 0
            r4 = 0
            r1 = r45
            r5 = 2
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.b(r2, r1, r3, r5, r4)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r5 = r35.O()
            r8 = 0
            r3 = r22
            r6 = r42
            r7 = r13
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0465
            androidx.compose.runtime.ComposerKt.X()
        L_0x0465:
            r9 = r17
            r10 = r26
            goto L_0x0473
        L_0x046a:
            r13 = r7
            r1 = r11
            r13.B()
            r9 = r42
            r10 = r43
        L_0x0473:
            androidx.compose.runtime.ScopeUpdateScope r15 = r13.x()
            if (r15 == 0) goto L_0x04af
            androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2 r13 = new androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
            r0 = r13
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r11 = r44
            r12 = r45
            r14 = r13
            r13 = r46
            r32 = r14
            r14 = r47
            r33 = r15
            r15 = r48
            r16 = r49
            r17 = r50
            r18 = r52
            r19 = r53
            r20 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r32
            r0 = r33
            r0.a(r1)
        L_0x04af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Modifier b(Modifier modifier, PagerState pagerState) {
        return modifier.o0(SuspendingPointerInputFilterKt.c(Modifier.f15489d, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState)));
    }

    public static final Function0 c(PagerState pagerState, Function4 function4, Function1 function1, Function0 function0, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1372505274, i2, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        State p2 = SnapshotStateKt.p(function4, composer, (i2 >> 3) & 14);
        State p3 = SnapshotStateKt.p(function1, composer, (i2 >> 6) & 14);
        boolean z2 = false;
        boolean W = ((((i2 & 14) ^ 6) > 4 && composer.W(pagerState)) || (i2 & 6) == 4) | composer.W(p2) | composer.W(p3);
        if ((((i2 & 7168) ^ 3072) > 2048 && composer.W(function0)) || (i2 & 3072) == 2048) {
            z2 = true;
        }
        boolean z3 = W | z2;
        Object g2 = composer.g();
        if (z3 || g2 == Composer.f14567a.a()) {
            g2 = new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1(SnapshotStateKt.d(SnapshotStateKt.o(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.d(SnapshotStateKt.o(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(p2, p3, function0)), pagerState)));
            composer.N(g2);
        }
        KProperty0 kProperty0 = (KProperty0) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return kProperty0;
    }
}
