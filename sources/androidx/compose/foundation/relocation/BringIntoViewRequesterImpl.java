package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

@Metadata
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f5404a = new MutableVector(new BringIntoViewRequesterNode[16], 0);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(androidx.compose.ui.geometry.Rect r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r10 = r0.F
            int r2 = r0.E
            java.lang.Object r4 = r0.D
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.C
            androidx.compose.ui.geometry.Rect r5 = (androidx.compose.ui.geometry.Rect) r5
            kotlin.ResultKt.b(r11)
            r11 = r5
            goto L_0x006c
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            kotlin.ResultKt.b(r11)
            androidx.compose.runtime.collection.MutableVector r11 = r9.f5404a
            java.lang.Object[] r2 = r11.f15005z
            int r11 = r11.p()
            r4 = 0
            r7 = r11
            r11 = r10
            r10 = r7
            r8 = r4
            r4 = r2
            r2 = r8
        L_0x0050:
            if (r2 >= r10) goto L_0x006e
            r5 = r4[r2]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r5
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1 r6 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
            r6.<init>(r11)
            r0.C = r11
            r0.D = r4
            r0.E = r2
            r0.F = r10
            r0.I = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.a(r5, r6, r0)
            if (r5 != r1) goto L_0x006c
            return r1
        L_0x006c:
            int r2 = r2 + r3
            goto L_0x0050
        L_0x006e:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final MutableVector b() {
        return this.f5404a;
    }
}
