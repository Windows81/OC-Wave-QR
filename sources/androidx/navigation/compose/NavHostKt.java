package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class NavHostKt {
    public static final EnterTransition B(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 l0;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 O = ((ComposeNavigator.Destination) navDestination).O();
            if (O != null) {
                return (EnterTransition) O.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (l0 = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).l0()) == null) {
            return null;
        } else {
            return (EnterTransition) l0.invoke(animatedContentTransitionScope);
        }
    }

    public static final ExitTransition C(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 o0;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 P = ((ComposeNavigator.Destination) navDestination).P();
            if (P != null) {
                return (ExitTransition) P.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (o0 = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).o0()) == null) {
            return null;
        } else {
            return (ExitTransition) o0.invoke(animatedContentTransitionScope);
        }
    }

    public static final EnterTransition D(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 p0;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 Q = ((ComposeNavigator.Destination) navDestination).Q();
            if (Q != null) {
                return (EnterTransition) Q.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (p0 = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).p0()) == null) {
            return null;
        } else {
            return (EnterTransition) p0.invoke(animatedContentTransitionScope);
        }
    }

    public static final ExitTransition E(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 q0;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 R = ((ComposeNavigator.Destination) navDestination).R();
            if (R != null) {
                return (ExitTransition) R.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (q0 = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).q0()) == null) {
            return null;
        } else {
            return (ExitTransition) q0.invoke(animatedContentTransitionScope);
        }
    }

    public static final SizeTransform F(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 r0;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 S = ((ComposeNavigator.Destination) navDestination).S();
            if (S != null) {
                return (SizeTransform) S.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (r0 = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).r0()) == null) {
            return null;
        } else {
            return (SizeTransform) r0.invoke(animatedContentTransitionScope);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(androidx.navigation.NavHostController r18, androidx.navigation.NavGraph r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r4 = r22
            r0 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r18
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r18
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r18
            r3 = r4
        L_0x0029:
            r5 = r23 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
            r15 = r19
            goto L_0x0044
        L_0x0032:
            r5 = r4 & 48
            r15 = r19
            if (r5 != 0) goto L_0x0044
            boolean r5 = r1.l(r15)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r20
            goto L_0x005f
        L_0x004d:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r20
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0071
            boolean r7 = r1.t()
            if (r7 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r1.B()
            r3 = r6
            goto L_0x00a6
        L_0x0071:
            if (r5 == 0) goto L_0x0078
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r17 = r5
            goto L_0x007a
        L_0x0078:
            r17 = r6
        L_0x007a:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0086
            r5 = -1
            java.lang.String r6 = "androidx.navigation.compose.NavHost (NavHost.kt:392)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r5, r6)
        L_0x0086:
            r0 = r3 & 1022(0x3fe, float:1.432E-42)
            r16 = 504(0x1f8, float:7.06E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r18
            r6 = r19
            r7 = r17
            r14 = r1
            r15 = r0
            c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x00a4:
            r3 = r17
        L_0x00a6:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x00bd
            androidx.navigation.compose.NavHostKt$NavHost$19 r7 = new androidx.navigation.compose.NavHostKt$NavHost$19
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.a(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.navigation.NavHostController r23, androidx.navigation.NavGraph r24, androidx.compose.ui.Modifier r25, androidx.compose.ui.Alignment r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function1 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r9 = r32
            r10 = r33
            r0 = -1818191915(0xffffffff93a097d5, float:-4.0539396E-27)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r24
            goto L_0x0046
        L_0x0034:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r24
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r25
            goto L_0x0061
        L_0x004f:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r25
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r10 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r26
            goto L_0x007c
        L_0x006a:
            r8 = r9 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r26
            boolean r11 = r1.W(r8)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r10 & 16
            if (r11 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r27
            goto L_0x0097
        L_0x0085:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r27
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r10 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r28
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009e
            r14 = r28
            boolean r15 = r1.l(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00cd
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r29
            boolean r16 = r1.l(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r29
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r29
        L_0x00cf:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00eb
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e4
            r0 = r30
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x00e6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e4:
            r0 = r30
        L_0x00e6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r3 = r3 | r17
            goto L_0x00ed
        L_0x00eb:
            r0 = r30
        L_0x00ed:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0109
            boolean r0 = r1.t()
            if (r0 != 0) goto L_0x00fe
            goto L_0x0109
        L_0x00fe:
            r1.B()
            r11 = r30
            r3 = r6
            r5 = r12
            r6 = r14
            r7 = r15
            goto L_0x0196
        L_0x0109:
            r1.p()
            r0 = r9 & 1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0132
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x011d
            goto L_0x0132
        L_0x011d:
            r1.B()
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0126
            r3 = r3 & r17
        L_0x0126:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012b
            r3 = r3 & r2
        L_0x012b:
            r5 = r30
            r7 = r3
            r0 = r12
            r2 = r14
        L_0x0130:
            r3 = r15
            goto L_0x015b
        L_0x0132:
            if (r5 == 0) goto L_0x0137
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x0137:
            if (r7 == 0) goto L_0x0140
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            r8 = r0
        L_0x0140:
            if (r11 == 0) goto L_0x0145
            androidx.navigation.compose.NavHostKt$NavHost$20 r0 = androidx.navigation.compose.NavHostKt$NavHost$20.f22532z
            r12 = r0
        L_0x0145:
            if (r13 == 0) goto L_0x014a
            androidx.navigation.compose.NavHostKt$NavHost$21 r0 = androidx.navigation.compose.NavHostKt$NavHost$21.f22533z
            r14 = r0
        L_0x014a:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0151
            r3 = r3 & r17
            r15 = r12
        L_0x0151:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012b
            r3 = r3 & r2
            r7 = r3
            r0 = r12
            r2 = r14
            r5 = r2
            goto L_0x0130
        L_0x015b:
            r1.U()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x016d
            r11 = -1
            java.lang.String r12 = "androidx.navigation.compose.NavHost (NavHost.kt:430)"
            r13 = -1818191915(0xffffffff93a097d5, float:-4.0539396E-27)
            androidx.compose.runtime.ComposerKt.Y(r13, r7, r11, r12)
        L_0x016d:
            r11 = 33554430(0x1fffffe, float:9.4039537E-38)
            r21 = r7 & r11
            r22 = 256(0x100, float:3.59E-43)
            r19 = 0
            r11 = r23
            r12 = r24
            r13 = r6
            r14 = r8
            r15 = r0
            r16 = r2
            r17 = r3
            r18 = r5
            r20 = r1
            c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.X()
        L_0x0191:
            r7 = r3
            r11 = r5
            r3 = r6
            r5 = r0
            r6 = r2
        L_0x0196:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01af
            androidx.navigation.compose.NavHostKt$NavHost$22 r13 = new androidx.navigation.compose.NavHostKt$NavHost$22
            r0 = r13
            r1 = r23
            r2 = r24
            r4 = r8
            r8 = r11
            r9 = r32
            r10 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.b(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: androidx.navigation.compose.NavHostKt$NavHost$25$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: androidx.navigation.compose.NavHostKt$NavHost$30$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: androidx.navigation.compose.NavHostKt$NavHost$33$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: androidx.navigation.compose.NavHostKt$NavHost$33$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.navigation.compose.NavHostKt$NavHost$30$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: androidx.navigation.compose.NavHostKt$NavHost$25$1} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0266, code lost:
        if (r4 == r29.a()) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03a9, code lost:
        if (r14 == r29.a()) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x047a, code lost:
        if (r12 == r29.a()) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04fb, code lost:
        if (r12 == r29.a()) goto L_0x04fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.navigation.NavHostController r35, androidx.navigation.NavGraph r36, androidx.compose.ui.Modifier r37, androidx.compose.ui.Alignment r38, kotlin.jvm.functions.Function1 r39, kotlin.jvm.functions.Function1 r40, kotlin.jvm.functions.Function1 r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r1 = r35
            r10 = r45
            r11 = r46
            r0 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            r2 = r44
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r36
            goto L_0x0041
        L_0x002f:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r36
            boolean r6 = r2.l(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r37
            goto L_0x005c
        L_0x004a:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r37
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r9 = r38
            goto L_0x0077
        L_0x0065:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            r9 = r38
            boolean r12 = r2.W(r9)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r12
        L_0x0077:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r14 = r39
            goto L_0x0092
        L_0x0080:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x007d
            r14 = r39
            boolean r15 = r2.l(r14)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
        L_0x0092:
            r15 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r3 = r3 | r16
            r13 = r40
            goto L_0x00b0
        L_0x009d:
            r16 = r10 & r16
            r13 = r40
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r2.l(r13)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r17 = r10 & r16
            if (r17 != 0) goto L_0x00ca
            r17 = r11 & 64
            r4 = r41
            if (r17 != 0) goto L_0x00c5
            boolean r19 = r2.l(r4)
            if (r19 == 0) goto L_0x00c5
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r3 = r3 | r19
            goto L_0x00cc
        L_0x00ca:
            r4 = r41
        L_0x00cc:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r10 & r19
            if (r20 != 0) goto L_0x00e8
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r42
            boolean r22 = r2.l(r0)
            if (r22 == 0) goto L_0x00e3
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r42
        L_0x00e3:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r22
            goto L_0x00ea
        L_0x00e8:
            r0 = r42
        L_0x00ea:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f5
            r3 = r3 | r22
            r4 = r43
            goto L_0x0108
        L_0x00f5:
            r22 = r10 & r22
            r4 = r43
            if (r22 != 0) goto L_0x0108
            boolean r22 = r2.l(r4)
            if (r22 == 0) goto L_0x0104
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r22
        L_0x0108:
            r22 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r3 & r22
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r5) goto L_0x0129
            boolean r4 = r2.t()
            if (r4 != 0) goto L_0x0119
            goto L_0x0129
        L_0x0119:
            r2.B()
            r8 = r42
            r11 = r1
            r3 = r7
            r4 = r9
            r6 = r13
            r5 = r14
            r7 = r41
            r9 = r43
            goto L_0x0582
        L_0x0129:
            r2.p()
            r4 = r10 & 1
            r5 = 0
            if (r4 == 0) goto L_0x0156
            boolean r4 = r2.J()
            if (r4 == 0) goto L_0x0138
            goto L_0x0156
        L_0x0138:
            r2.B()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0143
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0143:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014b
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x014b:
            r15 = r42
            r4 = r7
            r6 = r9
            r8 = r13
            r7 = r14
            r9 = r41
            r14 = r43
            goto L_0x0198
        L_0x0156:
            if (r6 == 0) goto L_0x015b
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x015c
        L_0x015b:
            r4 = r7
        L_0x015c:
            if (r8 == 0) goto L_0x0165
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r6 = r6.o()
            goto L_0x0166
        L_0x0165:
            r6 = r9
        L_0x0166:
            if (r12 == 0) goto L_0x016b
            androidx.navigation.compose.NavHostKt$NavHost$23 r7 = androidx.navigation.compose.NavHostKt$NavHost$23.f22537z
            goto L_0x016c
        L_0x016b:
            r7 = r14
        L_0x016c:
            if (r15 == 0) goto L_0x0171
            androidx.navigation.compose.NavHostKt$NavHost$24 r8 = androidx.navigation.compose.NavHostKt$NavHost$24.f22538z
            goto L_0x0172
        L_0x0171:
            r8 = r13
        L_0x0172:
            r9 = r11 & 64
            if (r9 == 0) goto L_0x017d
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r9
            r9 = r3
            r3 = r7
            goto L_0x0180
        L_0x017d:
            r9 = r3
            r3 = r41
        L_0x0180:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x018b
            r12 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r9 = r9 & r12
            r12 = r9
            r9 = r8
            goto L_0x018e
        L_0x018b:
            r12 = r9
            r9 = r42
        L_0x018e:
            if (r0 == 0) goto L_0x0195
            r14 = r5
        L_0x0191:
            r15 = r9
            r9 = r3
            r3 = r12
            goto L_0x0198
        L_0x0195:
            r14 = r43
            goto L_0x0191
        L_0x0198:
            r2.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01aa
            r0 = -1
            java.lang.String r12 = "androidx.navigation.compose.NavHost (NavHost.kt:490)"
            r13 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r0, r12)
        L_0x01aa:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.c()
            java.lang.Object r0 = r2.C(r0)
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r12 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r13 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r12 = r12.c(r2, r13)
            if (r12 == 0) goto L_0x059a
            androidx.lifecycle.ViewModelStore r12 = r12.s()
            r1.u0(r12)
            r35.r0(r36)
            androidx.navigation.NavigatorProvider r12 = r35.M()
            java.lang.String r13 = "composable"
            androidx.navigation.Navigator r12 = r12.e(r13)
            boolean r13 = r12 instanceof androidx.navigation.compose.ComposeNavigator
            if (r13 == 0) goto L_0x01da
            androidx.navigation.compose.ComposeNavigator r12 = (androidx.navigation.compose.ComposeNavigator) r12
            r13 = r12
            goto L_0x01db
        L_0x01da:
            r13 = r5
        L_0x01db:
            if (r13 != 0) goto L_0x0205
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01e6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e6:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x0204
            androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1 r13 = new androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r15
            r9 = r14
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0204:
            return
        L_0x0205:
            kotlinx.coroutines.flow.StateFlow r12 = r13.m()
            r10 = 0
            r11 = 1
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.b(r12, r5, r2, r10, r11)
            java.lang.Object r10 = r2.g()
            androidx.compose.runtime.Composer$Companion r29 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r29.a()
            if (r10 != r11) goto L_0x0223
            r10 = 0
            androidx.compose.runtime.MutableFloatState r10 = androidx.compose.runtime.PrimitiveSnapshotStateKt.a(r10)
            r2.N(r10)
        L_0x0223:
            androidx.compose.runtime.MutableFloatState r10 = (androidx.compose.runtime.MutableFloatState) r10
            java.lang.Object r11 = r2.g()
            java.lang.Object r5 = r29.a()
            if (r11 != r5) goto L_0x023d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r30 = r6
            r6 = 0
            r11 = 2
            androidx.compose.runtime.MutableState r11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r5, r6, r11, r6)
            r2.N(r11)
            goto L_0x023f
        L_0x023d:
            r30 = r6
        L_0x023f:
            r5 = r11
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            java.util.List r6 = m(r12)
            int r6 = r6.size()
            r11 = 1
            if (r6 <= r11) goto L_0x024f
            r6 = 1
            goto L_0x0250
        L_0x024f:
            r6 = 0
        L_0x0250:
            boolean r11 = r2.W(r12)
            boolean r18 = r2.W(r13)
            r11 = r11 | r18
            r31 = r4
            java.lang.Object r4 = r2.g()
            if (r11 != 0) goto L_0x0268
            java.lang.Object r11 = r29.a()
            if (r4 != r11) goto L_0x027d
        L_0x0268:
            androidx.navigation.compose.NavHostKt$NavHost$25$1 r4 = new androidx.navigation.compose.NavHostKt$NavHost$25$1
            r11 = 0
            r37 = r4
            r38 = r13
            r39 = r12
            r40 = r10
            r41 = r5
            r42 = r11
            r37.<init>(r38, r39, r40, r41, r42)
            r2.N(r4)
        L_0x027d:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r11 = 0
            androidx.activity.compose.PredictiveBackHandlerKt.a(r6, r4, r2, r11, r11)
            boolean r4 = r2.l(r1)
            boolean r6 = r2.l(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r2.g()
            if (r4 != 0) goto L_0x0298
            java.lang.Object r4 = r29.a()
            if (r6 != r4) goto L_0x02a0
        L_0x0298:
            androidx.navigation.compose.NavHostKt$NavHost$26$1 r6 = new androidx.navigation.compose.NavHostKt$NavHost$26$1
            r6.<init>(r1, r0)
            r2.N(r6)
        L_0x02a0:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r4 = 0
            androidx.compose.runtime.EffectsKt.c(r0, r6, r2, r4)
            androidx.compose.runtime.saveable.SaveableStateHolder r0 = androidx.compose.runtime.saveable.SaveableStateHolderKt.b(r2, r4)
            kotlinx.coroutines.flow.StateFlow r6 = r35.O()
            r1 = 1
            r11 = 0
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.b(r6, r11, r2, r4, r1)
            java.lang.Object r1 = r2.g()
            java.lang.Object r4 = r29.a()
            if (r1 != r4) goto L_0x02ca
            androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1 r1 = new androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
            r1.<init>(r6)
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.e(r1)
            r2.N(r1)
        L_0x02ca:
            androidx.compose.runtime.State r1 = (androidx.compose.runtime.State) r1
            java.util.List r4 = l(r1)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.q0(r4)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            java.lang.Object r6 = r2.g()
            java.lang.Object r11 = r29.a()
            if (r6 != r11) goto L_0x02e8
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r2.N(r6)
        L_0x02e8:
            java.util.Map r6 = (java.util.Map) r6
            r11 = 653365120(0x26f18f80, float:1.676163E-15)
            r2.X(r11)
            if (r4 == 0) goto L_0x051b
            boolean r11 = r2.W(r13)
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r3 & r18
            r40 = r0
            r0 = r18 ^ r16
            r32 = r6
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r6) goto L_0x030a
            boolean r0 = r2.W(r9)
            if (r0 != 0) goto L_0x030e
        L_0x030a:
            r0 = r3 & r16
            if (r0 != r6) goto L_0x0310
        L_0x030e:
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            r0 = r0 | r11
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r11) goto L_0x031c
            r6 = 1
            goto L_0x031d
        L_0x031c:
            r6 = 0
        L_0x031d:
            r0 = r0 | r6
            java.lang.Object r6 = r2.g()
            if (r0 != 0) goto L_0x032a
            java.lang.Object r0 = r29.a()
            if (r6 != r0) goto L_0x0332
        L_0x032a:
            androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1 r6 = new androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
            r6.<init>(r13, r9, r7, r5)
            r2.N(r6)
        L_0x0332:
            r0 = r6
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            boolean r6 = r2.W(r13)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r3
            r11 = r11 ^ r19
            r44 = r9
            r9 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 <= r9) goto L_0x034a
            boolean r11 = r2.W(r15)
            if (r11 != 0) goto L_0x034e
        L_0x034a:
            r11 = r3 & r19
            if (r11 != r9) goto L_0x0350
        L_0x034e:
            r9 = 1
            goto L_0x0351
        L_0x0350:
            r9 = 0
        L_0x0351:
            r6 = r6 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r3
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r11) goto L_0x035b
            r9 = 1
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            r6 = r6 | r9
            java.lang.Object r9 = r2.g()
            if (r6 != 0) goto L_0x0369
            java.lang.Object r6 = r29.a()
            if (r9 != r6) goto L_0x0371
        L_0x0369:
            androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1 r9 = new androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
            r9.<init>(r13, r15, r8, r5)
            r2.N(r9)
        L_0x0371:
            r6 = r9
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r3
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != r11) goto L_0x037d
            r9 = 1
            goto L_0x037e
        L_0x037d:
            r9 = 0
        L_0x037e:
            java.lang.Object r11 = r2.g()
            if (r9 != 0) goto L_0x038a
            java.lang.Object r9 = r29.a()
            if (r11 != r9) goto L_0x0392
        L_0x038a:
            androidx.navigation.compose.NavHostKt$NavHost$finalSizeTransform$1$1 r11 = new androidx.navigation.compose.NavHostKt$NavHost$finalSizeTransform$1$1
            r11.<init>(r14)
            r2.N(r11)
        L_0x0392:
            r9 = r11
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r16 = r2.W(r13)
            r17 = r14
            java.lang.Object r14 = r2.g()
            if (r16 != 0) goto L_0x03ac
            r16 = r15
            java.lang.Object r15 = r29.a()
            if (r14 != r15) goto L_0x03b6
            goto L_0x03ae
        L_0x03ac:
            r16 = r15
        L_0x03ae:
            androidx.navigation.compose.NavHostKt$NavHost$27$1 r14 = new androidx.navigation.compose.NavHostKt$NavHost$27$1
            r14.<init>(r1, r13)
            r2.N(r14)
        L_0x03b6:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15 = 6
            androidx.compose.runtime.EffectsKt.c(r11, r14, r2, r15)
            java.lang.Object r11 = r2.g()
            java.lang.Object r14 = r29.a()
            if (r11 != r14) goto L_0x03ce
            androidx.compose.animation.core.SeekableTransitionState r11 = new androidx.compose.animation.core.SeekableTransitionState
            r11.<init>(r4)
            r2.N(r11)
        L_0x03ce:
            androidx.compose.animation.core.SeekableTransitionState r11 = (androidx.compose.animation.core.SeekableTransitionState) r11
            int r14 = androidx.compose.animation.core.SeekableTransitionState.f2640s
            r14 = r14 | 48
            java.lang.String r15 = "entry"
            r33 = r8
            r8 = 0
            androidx.compose.animation.core.Transition r15 = androidx.compose.animation.core.TransitionKt.h(r11, r15, r2, r14, r8)
            boolean r8 = i(r5)
            if (r8 == 0) goto L_0x041f
            r8 = -1218260648(0xffffffffb762d158, float:-1.3519391E-5)
            r2.X(r8)
            float r8 = n(r10)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            boolean r14 = r2.W(r12)
            boolean r18 = r2.l(r11)
            r14 = r14 | r18
            r34 = r7
            java.lang.Object r7 = r2.g()
            if (r14 != 0) goto L_0x0409
            java.lang.Object r14 = r29.a()
            if (r7 != r14) goto L_0x0412
        L_0x0409:
            androidx.navigation.compose.NavHostKt$NavHost$28$1 r7 = new androidx.navigation.compose.NavHostKt$NavHost$28$1
            r14 = 0
            r7.<init>(r11, r12, r10, r14)
            r2.N(r7)
        L_0x0412:
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r10 = 0
            androidx.compose.runtime.EffectsKt.g(r8, r7, r2, r10)
            r2.M()
            r8 = r32
            r7 = 0
            goto L_0x0458
        L_0x041f:
            r34 = r7
            r7 = -1218005611(0xffffffffb766b595, float:-1.3751346E-5)
            r2.X(r7)
            boolean r7 = r2.l(r11)
            boolean r8 = r2.l(r4)
            r7 = r7 | r8
            boolean r8 = r2.W(r15)
            r7 = r7 | r8
            java.lang.Object r8 = r2.g()
            if (r7 != 0) goto L_0x0444
            java.lang.Object r7 = r29.a()
            if (r8 != r7) goto L_0x0442
            goto L_0x0444
        L_0x0442:
            r7 = 0
            goto L_0x044d
        L_0x0444:
            androidx.navigation.compose.NavHostKt$NavHost$29$1 r8 = new androidx.navigation.compose.NavHostKt$NavHost$29$1
            r7 = 0
            r8.<init>(r11, r4, r15, r7)
            r2.N(r8)
        L_0x044d:
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r10 = 0
            androidx.compose.runtime.EffectsKt.g(r4, r8, r2, r10)
            r2.M()
            r8 = r32
        L_0x0458:
            boolean r10 = r2.l(r8)
            boolean r12 = r2.W(r13)
            r10 = r10 | r12
            boolean r12 = r2.W(r0)
            r10 = r10 | r12
            boolean r12 = r2.W(r6)
            r10 = r10 | r12
            boolean r12 = r2.W(r9)
            r10 = r10 | r12
            java.lang.Object r12 = r2.g()
            if (r10 != 0) goto L_0x047c
            java.lang.Object r10 = r29.a()
            if (r12 != r10) goto L_0x0494
        L_0x047c:
            androidx.navigation.compose.NavHostKt$NavHost$30$1 r12 = new androidx.navigation.compose.NavHostKt$NavHost$30$1
            r21 = r12
            r22 = r8
            r23 = r13
            r24 = r0
            r25 = r6
            r26 = r9
            r27 = r1
            r28 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2.N(r12)
        L_0x0494:
            r14 = r12
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            androidx.navigation.compose.NavHostKt$NavHost$31 r0 = androidx.navigation.compose.NavHostKt$NavHost$31.f22553z
            androidx.navigation.compose.NavHostKt$NavHost$32 r6 = new androidx.navigation.compose.NavHostKt$NavHost$32
            r37 = r6
            r38 = r11
            r39 = r4
            r41 = r5
            r42 = r1
            r37.<init>(r38, r39, r40, r41, r42)
            r4 = 54
            r5 = 820763100(0x30ebd9dc, float:1.716042E-9)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r9, r6, r2, r4)
            int r5 = r3 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 221184(0x36000, float:3.09945E-40)
            r5 = r5 | r6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r19 = r5 | r3
            r20 = 0
            r12 = r15
            r5 = r13
            r13 = r31
            r9 = r17
            r3 = r15
            r10 = r16
            r15 = r30
            r16 = r0
            r17 = r4
            r18 = r2
            androidx.compose.animation.AnimatedContentKt.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r3.i()
            java.lang.Object r4 = r3.q()
            boolean r6 = r2.W(r3)
            r11 = r35
            boolean r12 = r2.l(r11)
            r6 = r6 | r12
            boolean r12 = r2.W(r5)
            r6 = r6 | r12
            boolean r12 = r2.l(r8)
            r6 = r6 | r12
            java.lang.Object r12 = r2.g()
            if (r6 != 0) goto L_0x04fd
            java.lang.Object r6 = r29.a()
            if (r12 != r6) goto L_0x0514
        L_0x04fd:
            androidx.navigation.compose.NavHostKt$NavHost$33$1 r12 = new androidx.navigation.compose.NavHostKt$NavHost$33$1
            r6 = 0
            r37 = r12
            r38 = r3
            r39 = r35
            r40 = r8
            r41 = r1
            r42 = r5
            r43 = r6
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r2.N(r12)
        L_0x0514:
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r1 = 0
            androidx.compose.runtime.EffectsKt.f(r0, r4, r12, r2, r1)
            goto L_0x0526
        L_0x051b:
            r11 = r35
            r34 = r7
            r33 = r8
            r44 = r9
            r9 = r14
            r10 = r15
            r7 = 0
        L_0x0526:
            r2.M()
            androidx.navigation.NavigatorProvider r0 = r35.M()
            java.lang.String r1 = "dialog"
            androidx.navigation.Navigator r0 = r0.e(r1)
            boolean r1 = r0 instanceof androidx.navigation.compose.DialogNavigator
            if (r1 == 0) goto L_0x053b
            r5 = r0
            androidx.navigation.compose.DialogNavigator r5 = (androidx.navigation.compose.DialogNavigator) r5
            goto L_0x053c
        L_0x053b:
            r5 = r7
        L_0x053c:
            if (r5 != 0) goto L_0x056a
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0547
            androidx.compose.runtime.ComposerKt.X()
        L_0x0547:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x0569
            androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1 r13 = new androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r31
            r4 = r30
            r5 = r34
            r6 = r33
            r7 = r44
            r8 = r10
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0569:
            return
        L_0x056a:
            r0 = 0
            androidx.navigation.compose.DialogHostKt.a(r5, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0577
            androidx.compose.runtime.ComposerKt.X()
        L_0x0577:
            r7 = r44
            r8 = r10
            r4 = r30
            r3 = r31
            r6 = r33
            r5 = r34
        L_0x0582:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x0599
            androidx.navigation.compose.NavHostKt$NavHost$34 r13 = new androidx.navigation.compose.NavHostKt$NavHost$34
            r0 = r13
            r1 = r35
            r2 = r36
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0599:
            return
        L_0x059a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.c(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: androidx.navigation.NavGraph} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.navigation.NavHostController r30, java.lang.Object r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.Alignment r33, kotlin.reflect.KClass r34, java.util.Map r35, kotlin.jvm.functions.Function1 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function1 r38, kotlin.jvm.functions.Function1 r39, kotlin.jvm.functions.Function1 r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            r2 = r31
            r12 = r41
            r13 = r43
            r15 = r45
            r0 = -1476019057(0xffffffffa805bc8f, float:-7.42387E-15)
            r1 = r42
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r15 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r13 | 6
            r6 = r3
            r3 = r30
            goto L_0x002f
        L_0x001b:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r30
            boolean r6 = r1.l(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r13
            goto L_0x002f
        L_0x002c:
            r3 = r30
            r6 = r13
        L_0x002f:
            r7 = r15 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.l(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r32
            goto L_0x0061
        L_0x004f:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r32
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r11
        L_0x0061:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r14 = r33
            goto L_0x007d
        L_0x006a:
            r14 = r13 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0067
            r14 = r33
            boolean r16 = r1.W(r14)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r16
        L_0x007d:
            r16 = r15 & 16
            if (r16 == 0) goto L_0x0086
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r4 = r34
            goto L_0x0099
        L_0x0086:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0083
            r4 = r34
            boolean r17 = r1.l(r4)
            if (r17 == 0) goto L_0x0095
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r6 = r6 | r17
        L_0x0099:
            r17 = r15 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a4
            r6 = r6 | r18
            r5 = r35
            goto L_0x00b7
        L_0x00a4:
            r18 = r13 & r18
            r5 = r35
            if (r18 != 0) goto L_0x00b7
            boolean r19 = r1.l(r5)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r6 = r6 | r19
        L_0x00b7:
            r19 = r15 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c2
            r6 = r6 | r20
            r8 = r36
            goto L_0x00d5
        L_0x00c2:
            r20 = r13 & r20
            r8 = r36
            if (r20 != 0) goto L_0x00d5
            boolean r21 = r1.l(r8)
            if (r21 == 0) goto L_0x00d1
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r6 = r6 | r21
        L_0x00d5:
            r9 = r15 & 128(0x80, float:1.794E-43)
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00e0
            r6 = r6 | r22
            r0 = r37
            goto L_0x00f3
        L_0x00e0:
            r22 = r13 & r22
            r0 = r37
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x00ef
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r6 = r6 | r23
        L_0x00f3:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x010f
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0108
            r0 = r38
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x010a
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x0108:
            r0 = r38
        L_0x010a:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r6 = r6 | r23
            goto L_0x0111
        L_0x010f:
            r0 = r38
        L_0x0111:
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x012d
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0126
            r0 = r39
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x0128
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0126:
            r0 = r39
        L_0x0128:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r6 = r6 | r23
            goto L_0x012f
        L_0x012d:
            r0 = r39
        L_0x012f:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0138
            r18 = r44 | 6
            r3 = r40
            goto L_0x014e
        L_0x0138:
            r23 = r44 & 6
            r3 = r40
            if (r23 != 0) goto L_0x014c
            boolean r23 = r1.l(r3)
            if (r23 == 0) goto L_0x0147
            r18 = 4
            goto L_0x0149
        L_0x0147:
            r18 = 2
        L_0x0149:
            r18 = r44 | r18
            goto L_0x014e
        L_0x014c:
            r18 = r44
        L_0x014e:
            r3 = r15 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0157
            r18 = r18 | 48
        L_0x0154:
            r3 = r18
            goto L_0x0169
        L_0x0157:
            r3 = r44 & 48
            if (r3 != 0) goto L_0x0154
            boolean r3 = r1.l(r12)
            if (r3 == 0) goto L_0x0164
            r20 = 32
            goto L_0x0166
        L_0x0164:
            r20 = 16
        L_0x0166:
            r18 = r18 | r20
            goto L_0x0154
        L_0x0169:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r18
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x0194
            r4 = r3 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0194
            boolean r4 = r1.t()
            if (r4 != 0) goto L_0x0180
            goto L_0x0194
        L_0x0180:
            r1.B()
            r5 = r34
            r6 = r35
            r9 = r38
            r11 = r40
            r7 = r8
            r3 = r10
            r4 = r14
            r8 = r37
            r10 = r39
            goto L_0x02a5
        L_0x0194:
            r1.p()
            r4 = r13 & 1
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x01c6
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            r1.B()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b1
            r6 = r6 & r18
        L_0x01b1:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01b6
            r6 = r6 & r5
        L_0x01b6:
            r11 = r34
            r9 = r37
            r4 = r39
            r0 = r40
            r5 = r6
            r7 = r14
            r14 = r35
            r6 = r38
            goto L_0x0214
        L_0x01c6:
            if (r7 == 0) goto L_0x01cb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01cc
        L_0x01cb:
            r4 = r10
        L_0x01cc:
            if (r11 == 0) goto L_0x01d5
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r7.o()
            goto L_0x01d6
        L_0x01d5:
            r7 = r14
        L_0x01d6:
            if (r16 == 0) goto L_0x01da
            r11 = 0
            goto L_0x01dc
        L_0x01da:
            r11 = r34
        L_0x01dc:
            if (r17 == 0) goto L_0x01e3
            java.util.Map r14 = kotlin.collections.MapsKt.h()
            goto L_0x01e5
        L_0x01e3:
            r14 = r35
        L_0x01e5:
            if (r19 == 0) goto L_0x01e9
            androidx.navigation.compose.NavHostKt$NavHost$15 r8 = androidx.navigation.compose.NavHostKt$NavHost$15.f22521z
        L_0x01e9:
            if (r9 == 0) goto L_0x01ee
            androidx.navigation.compose.NavHostKt$NavHost$16 r9 = androidx.navigation.compose.NavHostKt$NavHost$16.f22522z
            goto L_0x01f0
        L_0x01ee:
            r9 = r37
        L_0x01f0:
            r10 = r15 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01f9
            r6 = r6 & r18
            r10 = r6
            r6 = r8
            goto L_0x01fc
        L_0x01f9:
            r10 = r6
            r6 = r38
        L_0x01fc:
            r42 = r4
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0207
            r4 = r10 & r5
            r10 = r4
            r4 = r9
            goto L_0x0209
        L_0x0207:
            r4 = r39
        L_0x0209:
            if (r0 == 0) goto L_0x0210
            r5 = r10
            r0 = 0
        L_0x020d:
            r10 = r42
            goto L_0x0214
        L_0x0210:
            r0 = r40
            r5 = r10
            goto L_0x020d
        L_0x0214:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0225
            java.lang.String r13 = "androidx.navigation.compose.NavHost (NavHost.kt:354)"
            r15 = -1476019057(0xffffffffa805bc8f, float:-7.42387E-15)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r3, r13)
        L_0x0225:
            boolean r13 = r1.W(r11)
            boolean r15 = r1.W(r2)
            r13 = r13 | r15
            r15 = r3 & 112(0x70, float:1.57E-43)
            r32 = r0
            r0 = 32
            if (r15 != r0) goto L_0x0238
            r0 = 1
            goto L_0x0239
        L_0x0238:
            r0 = 0
        L_0x0239:
            r0 = r0 | r13
            java.lang.Object r13 = r1.g()
            if (r0 != 0) goto L_0x0248
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r13 != r0) goto L_0x025b
        L_0x0248:
            androidx.navigation.NavigatorProvider r0 = r30.M()
            androidx.navigation.NavGraphBuilder r13 = new androidx.navigation.NavGraphBuilder
            r13.<init>((androidx.navigation.NavigatorProvider) r0, (java.lang.Object) r2, (kotlin.reflect.KClass) r11, (java.util.Map) r14)
            r12.invoke(r13)
            androidx.navigation.NavGraph r13 = r13.a()
            r1.N(r13)
        L_0x025b:
            r17 = r13
            androidx.navigation.NavGraph r17 = (androidx.navigation.NavGraph) r17
            r0 = r5 & 8078(0x1f8e, float:1.132E-41)
            int r5 = r5 >> 6
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r13
            r0 = r0 | r5
            int r3 = r3 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r26 = r0 | r3
            r27 = 0
            r16 = r30
            r18 = r10
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r6
            r23 = r4
            r24 = r32
            r25 = r1
            c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x029b
            androidx.compose.runtime.ComposerKt.X()
        L_0x029b:
            r3 = r10
            r5 = r11
            r11 = r32
            r10 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            r9 = r6
            r6 = r14
        L_0x02a5:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x02c8
            androidx.navigation.compose.NavHostKt$NavHost$18 r14 = new androidx.navigation.compose.NavHostKt$NavHost$18
            r0 = r14
            r1 = r30
            r2 = r31
            r12 = r41
            r13 = r43
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.d(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.reflect.KClass, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void e(androidx.navigation.NavHostController r26, java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.Alignment r29, java.lang.String r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, kotlin.jvm.functions.Function1 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r2 = r27
            r10 = r35
            r11 = r37
            r12 = r38
            r0 = 410432995(0x1876b5e3, float:3.1886584E-24)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r11 | 6
            r4 = r3
            r3 = r26
            goto L_0x002f
        L_0x001b:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r26
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r11
            goto L_0x002f
        L_0x002c:
            r3 = r26
            r4 = r11
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
            goto L_0x0046
        L_0x0036:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0046
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r4 = r4 | r5
        L_0x0046:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r28
            goto L_0x0061
        L_0x004f:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r28
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r29
            goto L_0x007c
        L_0x006a:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r29
            boolean r13 = r1.W(r9)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r15 = r30
            goto L_0x0098
        L_0x0085:
            r15 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0082
            r15 = r30
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x0094
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r16
        L_0x0098:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a3
            r4 = r4 | r17
            r6 = r31
            goto L_0x00b6
        L_0x00a3:
            r17 = r11 & r17
            r6 = r31
            if (r17 != 0) goto L_0x00b6
            boolean r17 = r1.l(r6)
            if (r17 == 0) goto L_0x00b2
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r4 = r4 | r17
        L_0x00b6:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c1
            r4 = r4 | r18
            r14 = r32
            goto L_0x00d4
        L_0x00c1:
            r18 = r11 & r18
            r14 = r32
            if (r18 != 0) goto L_0x00d4
            boolean r19 = r1.l(r14)
            if (r19 == 0) goto L_0x00d0
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r4 = r4 | r19
        L_0x00d4:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r11 & r19
            if (r19 != 0) goto L_0x00f0
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e9
            r0 = r33
            boolean r20 = r1.l(r0)
            if (r20 == 0) goto L_0x00eb
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00e9:
            r0 = r33
        L_0x00eb:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r4 = r4 | r20
            goto L_0x00f2
        L_0x00f0:
            r0 = r33
        L_0x00f2:
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x010e
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0107
            r0 = r34
            boolean r20 = r1.l(r0)
            if (r20 == 0) goto L_0x0109
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0107:
            r0 = r34
        L_0x0109:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r4 = r4 | r20
            goto L_0x0110
        L_0x010e:
            r0 = r34
        L_0x0110:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0119
            r4 = r4 | r20
            goto L_0x0129
        L_0x0119:
            r0 = r11 & r20
            if (r0 != 0) goto L_0x0129
            boolean r0 = r1.l(r10)
            if (r0 == 0) goto L_0x0126
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r4 = r4 | r0
        L_0x0129:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r4
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0146
            boolean r0 = r1.t()
            if (r0 != 0) goto L_0x0139
            goto L_0x0146
        L_0x0139:
            r1.B()
            r8 = r33
            r3 = r7
            r4 = r9
            r7 = r14
            r5 = r15
            r9 = r34
            goto L_0x023f
        L_0x0146:
            r1.p()
            r0 = r11 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r21 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0170
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x015a
            goto L_0x0170
        L_0x015a:
            r1.B()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0163
            r4 = r4 & r21
        L_0x0163:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0168
            r4 = r4 & r3
        L_0x0168:
            r5 = r34
            r8 = r4
            r3 = r14
            r0 = r15
            r4 = r33
            goto L_0x01a6
        L_0x0170:
            if (r5 == 0) goto L_0x0175
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r7 = r0
        L_0x0175:
            if (r8 == 0) goto L_0x017e
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            r9 = r0
        L_0x017e:
            if (r13 == 0) goto L_0x0182
            r0 = 0
            r15 = r0
        L_0x0182:
            if (r16 == 0) goto L_0x0187
            androidx.navigation.compose.NavHostKt$NavHost$3 r0 = androidx.navigation.compose.NavHostKt$NavHost$3.f22549z
            r6 = r0
        L_0x0187:
            if (r17 == 0) goto L_0x018c
            androidx.navigation.compose.NavHostKt$NavHost$4 r0 = androidx.navigation.compose.NavHostKt$NavHost$4.f22562z
            r14 = r0
        L_0x018c:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0194
            r4 = r4 & r21
            r0 = r6
            goto L_0x0196
        L_0x0194:
            r0 = r33
        L_0x0196:
            r5 = r12 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x01a1
            r4 = r4 & r3
            r8 = r4
            r3 = r14
            r5 = r3
        L_0x019e:
            r4 = r0
            r0 = r15
            goto L_0x01a6
        L_0x01a1:
            r5 = r34
            r8 = r4
            r3 = r14
            goto L_0x019e
        L_0x01a6:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01b8
            r13 = -1
            java.lang.String r14 = "androidx.navigation.compose.NavHost (NavHost.kt:142)"
            r15 = 410432995(0x1876b5e3, float:3.1886584E-24)
            androidx.compose.runtime.ComposerKt.Y(r15, r8, r13, r14)
        L_0x01b8:
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = r8 & r13
            r16 = 1
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r14 != r15) goto L_0x01c6
            r14 = r16
            goto L_0x01c7
        L_0x01c6:
            r14 = 0
        L_0x01c7:
            r15 = r8 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r15 != r13) goto L_0x01d0
            r13 = r16
            goto L_0x01d1
        L_0x01d0:
            r13 = 0
        L_0x01d1:
            r13 = r13 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r8
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            if (r14 != r15) goto L_0x01dc
            r15 = r16
            goto L_0x01dd
        L_0x01dc:
            r15 = 0
        L_0x01dd:
            r13 = r13 | r15
            java.lang.Object r14 = r1.g()
            if (r13 != 0) goto L_0x01ec
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x01ff
        L_0x01ec:
            androidx.navigation.NavigatorProvider r13 = r26.M()
            androidx.navigation.NavGraphBuilder r14 = new androidx.navigation.NavGraphBuilder
            r14.<init>(r13, r2, r0)
            r10.invoke(r14)
            androidx.navigation.NavGraph r14 = r14.a()
            r1.N(r14)
        L_0x01ff:
            androidx.navigation.NavGraph r14 = (androidx.navigation.NavGraph) r14
            r13 = r8 & 8078(0x1f8e, float:1.132E-41)
            int r8 = r8 >> 3
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r8
            r13 = r13 | r15
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r8
            r13 = r13 | r15
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r8
            r13 = r13 | r15
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r15
            r23 = r13 | r8
            r24 = 256(0x100, float:3.59E-43)
            r21 = 0
            r13 = r26
            r15 = r7
            r16 = r9
            r17 = r6
            r18 = r3
            r19 = r4
            r20 = r5
            r22 = r1
            c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0236
            androidx.compose.runtime.ComposerKt.X()
        L_0x0236:
            r8 = r4
            r4 = r9
            r9 = r5
            r5 = r0
            r25 = r7
            r7 = r3
            r3 = r25
        L_0x023f:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0258
            androidx.navigation.compose.NavHostKt$NavHost$6 r14 = new androidx.navigation.compose.NavHostKt$NavHost$6
            r0 = r14
            r1 = r26
            r2 = r27
            r10 = r35
            r11 = r37
            r12 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.e(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.navigation.NavGraph} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.navigation.NavHostController r29, java.lang.String r30, androidx.compose.ui.Modifier r31, androidx.compose.ui.Alignment r32, java.lang.String r33, kotlin.jvm.functions.Function1 r34, kotlin.jvm.functions.Function1 r35, kotlin.jvm.functions.Function1 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function1 r38, kotlin.jvm.functions.Function1 r39, androidx.compose.runtime.Composer r40, int r41, int r42, int r43) {
        /*
            r2 = r30
            r11 = r39
            r12 = r41
            r14 = r43
            r0 = 1840250294(0x6daffdb6, float:6.8083243E27)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r12 | 6
            r6 = r3
            r3 = r29
            goto L_0x002f
        L_0x001b:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r29
            boolean r6 = r1.l(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r12
            goto L_0x002f
        L_0x002c:
            r3 = r29
            r6 = r12
        L_0x002f:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r12 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.W(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r31
            goto L_0x0061
        L_0x004f:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r31
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r10
        L_0x0061:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r13 = r32
            goto L_0x007c
        L_0x006a:
            r13 = r12 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r13 = r32
            boolean r15 = r1.W(r13)
            if (r15 == 0) goto L_0x0079
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r15
        L_0x007c:
            r15 = r14 & 16
            if (r15 == 0) goto L_0x0085
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r8 = r33
            goto L_0x0098
        L_0x0085:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r33
            boolean r17 = r1.W(r8)
            if (r17 == 0) goto L_0x0094
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r6 = r6 | r17
        L_0x0098:
            r17 = r14 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a3
            r6 = r6 | r18
            r5 = r34
            goto L_0x00b6
        L_0x00a3:
            r18 = r12 & r18
            r5 = r34
            if (r18 != 0) goto L_0x00b6
            boolean r19 = r1.l(r5)
            if (r19 == 0) goto L_0x00b2
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r6 = r6 | r19
        L_0x00b6:
            r19 = r14 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c1
            r6 = r6 | r20
            r0 = r35
            goto L_0x00d4
        L_0x00c1:
            r20 = r12 & r20
            r0 = r35
            if (r20 != 0) goto L_0x00d4
            boolean r21 = r1.l(r0)
            if (r21 == 0) goto L_0x00d0
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r6 = r6 | r21
        L_0x00d4:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00f0
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e9
            r4 = r36
            boolean r22 = r1.l(r4)
            if (r22 == 0) goto L_0x00eb
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00e9:
            r4 = r36
        L_0x00eb:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r6 = r6 | r22
            goto L_0x00f2
        L_0x00f0:
            r4 = r36
        L_0x00f2:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r12 & r22
            if (r22 != 0) goto L_0x010e
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0107
            r0 = r37
            boolean r22 = r1.l(r0)
            if (r22 == 0) goto L_0x0109
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0107:
            r0 = r37
        L_0x0109:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r6 = r6 | r22
            goto L_0x0110
        L_0x010e:
            r0 = r37
        L_0x0110:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011b
            r6 = r6 | r22
            r3 = r38
            goto L_0x012e
        L_0x011b:
            r22 = r12 & r22
            r3 = r38
            if (r22 != 0) goto L_0x012e
            boolean r22 = r1.l(r3)
            if (r22 == 0) goto L_0x012a
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x012a:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r6 = r6 | r22
        L_0x012e:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0135
            r3 = r42 | 6
            goto L_0x0147
        L_0x0135:
            r3 = r42 & 6
            if (r3 != 0) goto L_0x0145
            boolean r3 = r1.l(r11)
            if (r3 == 0) goto L_0x0141
            r3 = 4
            goto L_0x0142
        L_0x0141:
            r3 = 2
        L_0x0142:
            r3 = r42 | r3
            goto L_0x0147
        L_0x0145:
            r3 = r42
        L_0x0147:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r22
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x016f
            r4 = r3 & 3
            r5 = 2
            if (r4 != r5) goto L_0x016f
            boolean r4 = r1.t()
            if (r4 != 0) goto L_0x015d
            goto L_0x016f
        L_0x015d:
            r1.B()
            r6 = r34
            r7 = r35
            r10 = r38
            r5 = r8
            r3 = r9
            r4 = r13
            r8 = r36
            r9 = r37
            goto L_0x027b
        L_0x016f:
            r1.p()
            r4 = r12 & 1
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r21 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r4 == 0) goto L_0x019f
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x0183
            goto L_0x019f
        L_0x0183:
            r1.B()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018c
            r6 = r6 & r21
        L_0x018c:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0191
            r6 = r6 & r5
        L_0x0191:
            r10 = r35
            r5 = r37
            r0 = r38
            r4 = r9
            r7 = r13
            r9 = r34
            r13 = r6
            r6 = r36
            goto L_0x01dc
        L_0x019f:
            if (r7 == 0) goto L_0x01a4
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a5
        L_0x01a4:
            r4 = r9
        L_0x01a5:
            if (r10 == 0) goto L_0x01ae
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r7.o()
            goto L_0x01af
        L_0x01ae:
            r7 = r13
        L_0x01af:
            if (r15 == 0) goto L_0x01b2
            r8 = 0
        L_0x01b2:
            if (r17 == 0) goto L_0x01b7
            androidx.navigation.compose.NavHostKt$NavHost$7 r9 = androidx.navigation.compose.NavHostKt$NavHost$7.f22566z
            goto L_0x01b9
        L_0x01b7:
            r9 = r34
        L_0x01b9:
            if (r19 == 0) goto L_0x01be
            androidx.navigation.compose.NavHostKt$NavHost$8 r10 = androidx.navigation.compose.NavHostKt$NavHost$8.f22567z
            goto L_0x01c0
        L_0x01be:
            r10 = r35
        L_0x01c0:
            r13 = r14 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01c9
            r6 = r6 & r21
            r13 = r6
            r6 = r9
            goto L_0x01cc
        L_0x01c9:
            r13 = r6
            r6 = r36
        L_0x01cc:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x01d4
            r5 = r5 & r13
            r13 = r5
            r5 = r10
            goto L_0x01d6
        L_0x01d4:
            r5 = r37
        L_0x01d6:
            if (r0 == 0) goto L_0x01da
            r0 = 0
            goto L_0x01dc
        L_0x01da:
            r0 = r38
        L_0x01dc:
            r1.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x01ed
            java.lang.String r15 = "androidx.navigation.compose.NavHost (NavHost.kt:210)"
            r12 = 1840250294(0x6daffdb6, float:6.8083243E27)
            androidx.compose.runtime.ComposerKt.Y(r12, r13, r3, r15)
        L_0x01ed:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r13
            r17 = 1
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r15) goto L_0x01fa
            r12 = r17
            goto L_0x01fb
        L_0x01fa:
            r12 = 0
        L_0x01fb:
            r15 = r13 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r15 != r14) goto L_0x0204
            r14 = r17
            goto L_0x0205
        L_0x0204:
            r14 = 0
        L_0x0205:
            r12 = r12 | r14
            r3 = r3 & 14
            r14 = 4
            if (r3 != r14) goto L_0x020e
            r15 = r17
            goto L_0x020f
        L_0x020e:
            r15 = 0
        L_0x020f:
            r3 = r12 | r15
            java.lang.Object r12 = r1.g()
            if (r3 != 0) goto L_0x021f
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r12 != r3) goto L_0x0232
        L_0x021f:
            androidx.navigation.NavigatorProvider r3 = r29.M()
            androidx.navigation.NavGraphBuilder r12 = new androidx.navigation.NavGraphBuilder
            r12.<init>(r3, r2, r8)
            r11.invoke(r12)
            androidx.navigation.NavGraph r12 = r12.a()
            r1.N(r12)
        L_0x0232:
            r16 = r12
            androidx.navigation.NavGraph r16 = (androidx.navigation.NavGraph) r16
            r3 = r13 & 8078(0x1f8e, float:1.132E-41)
            int r12 = r13 >> 3
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r13
            r25 = r3 | r12
            r26 = 0
            r15 = r29
            r17 = r4
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r6
            r22 = r5
            r23 = r0
            r24 = r1
            c(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0270
            androidx.compose.runtime.ComposerKt.X()
        L_0x0270:
            r3 = r4
            r4 = r7
            r7 = r10
            r10 = r0
            r28 = r9
            r9 = r5
            r5 = r8
            r8 = r6
            r6 = r28
        L_0x027b:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x029a
            androidx.navigation.compose.NavHostKt$NavHost$10 r14 = new androidx.navigation.compose.NavHostKt$NavHost$10
            r0 = r14
            r1 = r29
            r2 = r30
            r11 = r39
            r12 = r41
            r13 = r42
            r27 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.f(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.navigation.NavGraph} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void g(androidx.navigation.NavHostController r21, java.lang.String r22, androidx.compose.ui.Modifier r23, java.lang.String r24, kotlin.jvm.functions.Function1 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r2 = r22
            r5 = r25
            r6 = r27
            r0 = 141827520(0x8741dc0, float:7.346105E-34)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r6 | 6
            r4 = r3
            r3 = r21
            goto L_0x002d
        L_0x0019:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r21
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r6
            goto L_0x002d
        L_0x002a:
            r3 = r21
            r4 = r6
        L_0x002d:
            r7 = r28 & 2
            r8 = 32
            if (r7 == 0) goto L_0x0036
            r4 = r4 | 48
            goto L_0x0045
        L_0x0036:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x0045
            boolean r7 = r1.W(r2)
            if (r7 == 0) goto L_0x0042
            r7 = r8
            goto L_0x0044
        L_0x0042:
            r7 = 16
        L_0x0044:
            r4 = r4 | r7
        L_0x0045:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r9 = r23
            goto L_0x0060
        L_0x004e:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004b
            r9 = r23
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x005d
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r4 = r4 | r10
        L_0x0060:
            r10 = r28 & 8
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r12 = r24
            goto L_0x007c
        L_0x006b:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0068
            r12 = r24
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0079
            r13 = r11
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r28 & 16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x0085:
            r13 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0094
            boolean r13 = r1.l(r5)
            if (r13 == 0) goto L_0x0091
            r13 = r14
            goto L_0x0093
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
        L_0x0094:
            r13 = r4 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r15) goto L_0x00a7
            boolean r13 = r1.t()
            if (r13 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r1.B()
            r4 = r12
            goto L_0x0124
        L_0x00a7:
            if (r7 == 0) goto L_0x00ae
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r19 = r7
            goto L_0x00b0
        L_0x00ae:
            r19 = r9
        L_0x00b0:
            if (r10 == 0) goto L_0x00b5
            r7 = 0
            r15 = r7
            goto L_0x00b6
        L_0x00b5:
            r15 = r12
        L_0x00b6:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00c2
            r7 = -1
            java.lang.String r9 = "androidx.navigation.compose.NavHost (NavHost.kt:90)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r7, r9)
        L_0x00c2:
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            r7 = 0
            r9 = 1
            if (r0 != r11) goto L_0x00ca
            r0 = r9
            goto L_0x00cb
        L_0x00ca:
            r0 = r7
        L_0x00cb:
            r10 = r4 & 112(0x70, float:1.57E-43)
            if (r10 != r8) goto L_0x00d1
            r8 = r9
            goto L_0x00d2
        L_0x00d1:
            r8 = r7
        L_0x00d2:
            r0 = r0 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r4
            if (r8 != r14) goto L_0x00da
            r7 = r9
        L_0x00da:
            r0 = r0 | r7
            java.lang.Object r7 = r1.g()
            if (r0 != 0) goto L_0x00e9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x00fc
        L_0x00e9:
            androidx.navigation.NavigatorProvider r0 = r21.M()
            androidx.navigation.NavGraphBuilder r7 = new androidx.navigation.NavGraphBuilder
            r7.<init>(r0, r2, r15)
            r5.invoke(r7)
            androidx.navigation.NavGraph r7 = r7.a()
            r1.N(r7)
        L_0x00fc:
            r8 = r7
            androidx.navigation.NavGraph r8 = (androidx.navigation.NavGraph) r8
            r0 = r4 & 910(0x38e, float:1.275E-42)
            r18 = 504(0x1f8, float:7.06E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r4 = 0
            r7 = r21
            r9 = r19
            r20 = r15
            r15 = r4
            r16 = r1
            r17 = r0
            c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0120
            androidx.compose.runtime.ComposerKt.X()
        L_0x0120:
            r9 = r19
            r4 = r20
        L_0x0124:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x013e
            androidx.navigation.compose.NavHostKt$NavHost$2 r10 = new androidx.navigation.compose.NavHostKt$NavHost$2
            r0 = r10
            r1 = r21
            r2 = r22
            r3 = r9
            r5 = r25
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.g(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: androidx.navigation.NavGraph} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.navigation.NavHostController r30, kotlin.reflect.KClass r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.Alignment r33, kotlin.reflect.KClass r34, java.util.Map r35, kotlin.jvm.functions.Function1 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function1 r38, kotlin.jvm.functions.Function1 r39, kotlin.jvm.functions.Function1 r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            r2 = r31
            r12 = r41
            r13 = r43
            r15 = r45
            r0 = 750467758(0x2cbb3aae, float:5.3213744E-12)
            r1 = r42
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r15 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r13 | 6
            r6 = r3
            r3 = r30
            goto L_0x002f
        L_0x001b:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r30
            boolean r6 = r1.l(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r13
            goto L_0x002f
        L_0x002c:
            r3 = r30
            r6 = r13
        L_0x002f:
            r7 = r15 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.l(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r32
            goto L_0x0061
        L_0x004f:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r32
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r11
        L_0x0061:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r14 = r33
            goto L_0x007d
        L_0x006a:
            r14 = r13 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0067
            r14 = r33
            boolean r16 = r1.W(r14)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r16
        L_0x007d:
            r16 = r15 & 16
            if (r16 == 0) goto L_0x0086
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r4 = r34
            goto L_0x0099
        L_0x0086:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0083
            r4 = r34
            boolean r17 = r1.l(r4)
            if (r17 == 0) goto L_0x0095
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r6 = r6 | r17
        L_0x0099:
            r17 = r15 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a4
            r6 = r6 | r18
            r5 = r35
            goto L_0x00b7
        L_0x00a4:
            r18 = r13 & r18
            r5 = r35
            if (r18 != 0) goto L_0x00b7
            boolean r19 = r1.l(r5)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r6 = r6 | r19
        L_0x00b7:
            r19 = r15 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c2
            r6 = r6 | r20
            r8 = r36
            goto L_0x00d5
        L_0x00c2:
            r20 = r13 & r20
            r8 = r36
            if (r20 != 0) goto L_0x00d5
            boolean r21 = r1.l(r8)
            if (r21 == 0) goto L_0x00d1
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r6 = r6 | r21
        L_0x00d5:
            r9 = r15 & 128(0x80, float:1.794E-43)
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00e0
            r6 = r6 | r22
            r0 = r37
            goto L_0x00f3
        L_0x00e0:
            r22 = r13 & r22
            r0 = r37
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x00ef
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r6 = r6 | r23
        L_0x00f3:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x010f
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0108
            r0 = r38
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x010a
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x0108:
            r0 = r38
        L_0x010a:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r6 = r6 | r23
            goto L_0x0111
        L_0x010f:
            r0 = r38
        L_0x0111:
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x012d
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0126
            r0 = r39
            boolean r23 = r1.l(r0)
            if (r23 == 0) goto L_0x0128
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0126:
            r0 = r39
        L_0x0128:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r6 = r6 | r23
            goto L_0x012f
        L_0x012d:
            r0 = r39
        L_0x012f:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0138
            r18 = r44 | 6
            r3 = r40
            goto L_0x014e
        L_0x0138:
            r23 = r44 & 6
            r3 = r40
            if (r23 != 0) goto L_0x014c
            boolean r23 = r1.l(r3)
            if (r23 == 0) goto L_0x0147
            r18 = 4
            goto L_0x0149
        L_0x0147:
            r18 = 2
        L_0x0149:
            r18 = r44 | r18
            goto L_0x014e
        L_0x014c:
            r18 = r44
        L_0x014e:
            r3 = r15 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0157
            r18 = r18 | 48
        L_0x0154:
            r3 = r18
            goto L_0x0169
        L_0x0157:
            r3 = r44 & 48
            if (r3 != 0) goto L_0x0154
            boolean r3 = r1.l(r12)
            if (r3 == 0) goto L_0x0164
            r20 = 32
            goto L_0x0166
        L_0x0164:
            r20 = 16
        L_0x0166:
            r18 = r18 | r20
            goto L_0x0154
        L_0x0169:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r18
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x0194
            r4 = r3 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0194
            boolean r4 = r1.t()
            if (r4 != 0) goto L_0x0180
            goto L_0x0194
        L_0x0180:
            r1.B()
            r5 = r34
            r6 = r35
            r9 = r38
            r11 = r40
            r7 = r8
            r3 = r10
            r4 = r14
            r8 = r37
            r10 = r39
            goto L_0x02a5
        L_0x0194:
            r1.p()
            r4 = r13 & 1
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x01c6
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            r1.B()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b1
            r6 = r6 & r18
        L_0x01b1:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01b6
            r6 = r6 & r5
        L_0x01b6:
            r11 = r34
            r9 = r37
            r4 = r39
            r0 = r40
            r5 = r6
            r7 = r14
            r14 = r35
            r6 = r38
            goto L_0x0214
        L_0x01c6:
            if (r7 == 0) goto L_0x01cb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01cc
        L_0x01cb:
            r4 = r10
        L_0x01cc:
            if (r11 == 0) goto L_0x01d5
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r7.o()
            goto L_0x01d6
        L_0x01d5:
            r7 = r14
        L_0x01d6:
            if (r16 == 0) goto L_0x01da
            r11 = 0
            goto L_0x01dc
        L_0x01da:
            r11 = r34
        L_0x01dc:
            if (r17 == 0) goto L_0x01e3
            java.util.Map r14 = kotlin.collections.MapsKt.h()
            goto L_0x01e5
        L_0x01e3:
            r14 = r35
        L_0x01e5:
            if (r19 == 0) goto L_0x01e9
            androidx.navigation.compose.NavHostKt$NavHost$11 r8 = androidx.navigation.compose.NavHostKt$NavHost$11.f22516z
        L_0x01e9:
            if (r9 == 0) goto L_0x01ee
            androidx.navigation.compose.NavHostKt$NavHost$12 r9 = androidx.navigation.compose.NavHostKt$NavHost$12.f22517z
            goto L_0x01f0
        L_0x01ee:
            r9 = r37
        L_0x01f0:
            r10 = r15 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01f9
            r6 = r6 & r18
            r10 = r6
            r6 = r8
            goto L_0x01fc
        L_0x01f9:
            r10 = r6
            r6 = r38
        L_0x01fc:
            r42 = r4
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0207
            r4 = r10 & r5
            r10 = r4
            r4 = r9
            goto L_0x0209
        L_0x0207:
            r4 = r39
        L_0x0209:
            if (r0 == 0) goto L_0x0210
            r5 = r10
            r0 = 0
        L_0x020d:
            r10 = r42
            goto L_0x0214
        L_0x0210:
            r0 = r40
            r5 = r10
            goto L_0x020d
        L_0x0214:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0225
            java.lang.String r13 = "androidx.navigation.compose.NavHost (NavHost.kt:282)"
            r15 = 750467758(0x2cbb3aae, float:5.3213744E-12)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r3, r13)
        L_0x0225:
            boolean r13 = r1.W(r11)
            boolean r15 = r1.W(r2)
            r13 = r13 | r15
            r15 = r3 & 112(0x70, float:1.57E-43)
            r32 = r0
            r0 = 32
            if (r15 != r0) goto L_0x0238
            r0 = 1
            goto L_0x0239
        L_0x0238:
            r0 = 0
        L_0x0239:
            r0 = r0 | r13
            java.lang.Object r13 = r1.g()
            if (r0 != 0) goto L_0x0248
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r13 != r0) goto L_0x025b
        L_0x0248:
            androidx.navigation.NavigatorProvider r0 = r30.M()
            androidx.navigation.NavGraphBuilder r13 = new androidx.navigation.NavGraphBuilder
            r13.<init>((androidx.navigation.NavigatorProvider) r0, (kotlin.reflect.KClass) r2, (kotlin.reflect.KClass) r11, (java.util.Map) r14)
            r12.invoke(r13)
            androidx.navigation.NavGraph r13 = r13.a()
            r1.N(r13)
        L_0x025b:
            r17 = r13
            androidx.navigation.NavGraph r17 = (androidx.navigation.NavGraph) r17
            r0 = r5 & 8078(0x1f8e, float:1.132E-41)
            int r5 = r5 >> 6
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r13
            r0 = r0 | r5
            int r3 = r3 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r26 = r0 | r3
            r27 = 0
            r16 = r30
            r18 = r10
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r6
            r23 = r4
            r24 = r32
            r25 = r1
            c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x029b
            androidx.compose.runtime.ComposerKt.X()
        L_0x029b:
            r3 = r10
            r5 = r11
            r11 = r32
            r10 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            r9 = r6
            r6 = r14
        L_0x02a5:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x02c8
            androidx.navigation.compose.NavHostKt$NavHost$14 r14 = new androidx.navigation.compose.NavHostKt$NavHost$14
            r0 = r14
            r1 = r30
            r2 = r31
            r12 = r41
            r13 = r43
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.h(androidx.navigation.NavHostController, kotlin.reflect.KClass, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.reflect.KClass, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final boolean i(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void j(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final List k(State state) {
        return (List) state.getValue();
    }

    public static final List l(State state) {
        return (List) state.getValue();
    }

    public static final List m(State state) {
        return (List) state.getValue();
    }

    public static final float n(MutableFloatState mutableFloatState) {
        return mutableFloatState.c();
    }

    public static final void o(MutableFloatState mutableFloatState, float f2) {
        mutableFloatState.j(f2);
    }
}
