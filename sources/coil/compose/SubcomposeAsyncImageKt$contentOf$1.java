package coil.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SubcomposeAsyncImageKt$contentOf$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function4 f23336A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function4 f23337B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f23338z;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(coil.compose.SubcomposeAsyncImageScope r14, androidx.compose.runtime.Composer r15, int r16) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r10 = r15
            r2 = r16 & 14
            if (r2 != 0) goto L_0x0013
            boolean r2 = r15.W(r14)
            if (r2 == 0) goto L_0x000f
            r2 = 4
            goto L_0x0010
        L_0x000f:
            r2 = 2
        L_0x0010:
            r2 = r16 | r2
            goto L_0x0015
        L_0x0013:
            r2 = r16
        L_0x0015:
            r3 = r2 & 91
            r4 = 18
            if (r3 != r4) goto L_0x0027
            boolean r3 = r15.t()
            if (r3 != 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            r15.B()
            goto L_0x00d1
        L_0x0027:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0036
            r3 = -1
            java.lang.String r4 = "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:381)"
            r5 = -1302781228(0xffffffffb25922d4, float:-1.2638981E-8)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0036:
            coil.compose.AsyncImagePainter r3 = r14.i()
            coil.compose.AsyncImagePainter$State r3 = r3.z()
            boolean r4 = r3 instanceof coil.compose.AsyncImagePainter.State.Loading
            r5 = 0
            r6 = -418317557(0xffffffffe710fb0b, float:-6.846517E23)
            r7 = 1
            if (r4 == 0) goto L_0x0062
            r15.f(r6)
            kotlin.jvm.functions.Function4 r4 = r0.f23338z
            if (r4 == 0) goto L_0x005c
            r6 = r2 & 14
            r6 = r6 | 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.j(r14, r3, r15, r6)
            kotlin.Unit r3 = kotlin.Unit.f40552a
            goto L_0x005d
        L_0x005c:
            r5 = r7
        L_0x005d:
            r15.S()
        L_0x0060:
            r7 = r5
            goto L_0x00b5
        L_0x0062:
            boolean r4 = r3 instanceof coil.compose.AsyncImagePainter.State.Success
            if (r4 == 0) goto L_0x0080
            r15.f(r6)
            kotlin.jvm.functions.Function4 r4 = r0.f23336A
            if (r4 == 0) goto L_0x007b
            r6 = r2 & 14
            r6 = r6 | 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.j(r14, r3, r15, r6)
            kotlin.Unit r3 = kotlin.Unit.f40552a
            goto L_0x007c
        L_0x007b:
            r5 = r7
        L_0x007c:
            r15.S()
            goto L_0x0060
        L_0x0080:
            boolean r4 = r3 instanceof coil.compose.AsyncImagePainter.State.Error
            if (r4 == 0) goto L_0x009e
            r15.f(r6)
            kotlin.jvm.functions.Function4 r4 = r0.f23337B
            if (r4 == 0) goto L_0x0099
            r6 = r2 & 14
            r6 = r6 | 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.j(r14, r3, r15, r6)
            kotlin.Unit r3 = kotlin.Unit.f40552a
            goto L_0x009a
        L_0x0099:
            r5 = r7
        L_0x009a:
            r15.S()
            goto L_0x0060
        L_0x009e:
            boolean r3 = r3 instanceof coil.compose.AsyncImagePainter.State.Empty
            if (r3 == 0) goto L_0x00ac
            r3 = -418301399(0xffffffffe7113a29, float:-6.85816E23)
            r15.f(r3)
            r15.S()
            goto L_0x00b5
        L_0x00ac:
            r3 = -418301339(0xffffffffe7113a65, float:-6.858203E23)
            r15.f(r3)
            r15.S()
        L_0x00b5:
            if (r7 == 0) goto L_0x00c8
            r11 = r2 & 14
            r12 = 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r14
            r10 = r15
            coil.compose.SubcomposeAsyncImageKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00c8:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00d1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt$contentOf$1.b(coil.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SubcomposeAsyncImageScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
