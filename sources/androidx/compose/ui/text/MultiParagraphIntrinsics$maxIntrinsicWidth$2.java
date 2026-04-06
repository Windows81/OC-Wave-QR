package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiParagraphIntrinsics$maxIntrinsicWidth$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MultiParagraphIntrinsics f18306z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$maxIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.f18306z = multiParagraphIntrinsics;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.compose.ui.text.ParagraphIntrinsicInfo} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = r0.b();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Float invoke() {
        /*
            r8 = this;
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = r8.f18306z
            java.util.List r0 = r0.e()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000e
            r0 = 0
            goto L_0x0042
        L_0x000e:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            r2 = r1
            androidx.compose.ui.text.ParagraphIntrinsicInfo r2 = (androidx.compose.ui.text.ParagraphIntrinsicInfo) r2
            androidx.compose.ui.text.ParagraphIntrinsics r2 = r2.b()
            float r2 = r2.g()
            int r3 = kotlin.collections.CollectionsKt.o(r0)
            r4 = 1
            if (r4 > r3) goto L_0x0041
        L_0x0025:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.text.ParagraphIntrinsicInfo r6 = (androidx.compose.ui.text.ParagraphIntrinsicInfo) r6
            androidx.compose.ui.text.ParagraphIntrinsics r6 = r6.b()
            float r6 = r6.g()
            int r7 = java.lang.Float.compare(r2, r6)
            if (r7 >= 0) goto L_0x003c
            r1 = r5
            r2 = r6
        L_0x003c:
            if (r4 == r3) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0041:
            r0 = r1
        L_0x0042:
            androidx.compose.ui.text.ParagraphIntrinsicInfo r0 = (androidx.compose.ui.text.ParagraphIntrinsicInfo) r0
            if (r0 == 0) goto L_0x0051
            androidx.compose.ui.text.ParagraphIntrinsics r0 = r0.b()
            if (r0 == 0) goto L_0x0051
            float r0 = r0.g()
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2.invoke():java.lang.Float");
    }
}
