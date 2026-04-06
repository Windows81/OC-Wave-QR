package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$AnnotationRangeListSaver$2 extends Lambda implements Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeListSaver$2 f18375z = new SaversKt$AnnotationRangeListSaver$2();

    public SaversKt$AnnotationRangeListSaver$2() {
        super(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.text.AnnotatedString$Range} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List invoke(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.g(r8, r0)
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0042
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.runtime.saveable.Saver r4 = androidx.compose.ui.text.SaversKt.f18351c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r3, r5)
            r6 = 0
            if (r5 == 0) goto L_0x0030
            boolean r5 = r4 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r4.a(r3)
            r6 = r3
            androidx.compose.ui.text.AnnotatedString$Range r6 = (androidx.compose.ui.text.AnnotatedString.Range) r6
        L_0x0039:
            kotlin.jvm.internal.Intrinsics.f(r6)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2.invoke(java.lang.Object):java.util.List");
    }
}
