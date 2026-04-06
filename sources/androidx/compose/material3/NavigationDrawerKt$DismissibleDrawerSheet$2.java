package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class NavigationDrawerKt$DismissibleDrawerSheet$2 implements Function3<DrawerPredictiveBackState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10433A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f10434B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ float E;
    public final /* synthetic */ DrawerState F;
    public final /* synthetic */ Function3 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10435z;

    public static final float e(DrawerState drawerState) {
        return drawerState.d().r();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.material3.internal.FloatProducer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.material3.DrawerPredictiveBackState r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r12 = r18
            r1 = r19 & 6
            if (r1 != 0) goto L_0x0016
            r1 = r17
            boolean r2 = r12.W(r1)
            if (r2 == 0) goto L_0x0012
            r2 = 4
            goto L_0x0013
        L_0x0012:
            r2 = 2
        L_0x0013:
            r2 = r19 | r2
            goto L_0x001a
        L_0x0016:
            r1 = r17
            r2 = r19
        L_0x001a:
            r3 = r2 & 19
            r4 = 18
            if (r3 == r4) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r4 = r2 & 1
            boolean r3 = r12.E(r3, r4)
            if (r3 == 0) goto L_0x0087
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:732)"
            r5 = 1623455535(0x60c3f72f, float:1.12966455E20)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x003a:
            androidx.compose.foundation.layout.WindowInsets r3 = r0.f10435z
            androidx.compose.ui.Modifier r4 = r0.f10433A
            androidx.compose.ui.graphics.Shape r5 = r0.f10434B
            long r6 = r0.C
            long r8 = r0.D
            float r10 = r0.E
            androidx.compose.material3.DrawerState r11 = r0.F
            boolean r11 = r12.W(r11)
            androidx.compose.material3.DrawerState r13 = r0.F
            java.lang.Object r14 = r18.g()
            if (r11 != 0) goto L_0x005c
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r14 != r11) goto L_0x0064
        L_0x005c:
            androidx.compose.material3.o4 r14 = new androidx.compose.material3.o4
            r14.<init>(r13)
            r12.N(r14)
        L_0x0064:
            r11 = r14
            androidx.compose.material3.internal.FloatProducer r11 = (androidx.compose.material3.internal.FloatProducer) r11
            kotlin.jvm.functions.Function3 r13 = r0.G
            r14 = r2 & 14
            r15 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r13
            r12 = r18
            r13 = r14
            r14 = r15
            androidx.compose.material3.NavigationDrawerKt.i(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x008a
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x008a
        L_0x0087:
            r18.B()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2.c(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((DrawerPredictiveBackState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
