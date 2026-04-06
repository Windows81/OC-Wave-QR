package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$2 f18378z = new SaversKt$AnnotationRangeSaver$2();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.text.AnnotationType[] r0 = androidx.compose.ui.text.AnnotationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.Span     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.VerbatimTts     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.Url     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.Link     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.Clickable     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.ui.text.AnnotationType.String     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f18379a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2.WhenMappings.<clinit>():void");
        }
    }

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.compose.ui.text.ParagraphStyle] */
    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.compose.ui.text.SpanStyle] */
    /* JADX WARNING: type inference failed for: r1v9, types: [androidx.compose.ui.text.VerbatimTtsAnnotation] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.compose.ui.text.UrlAnnotation] */
    /* JADX WARNING: type inference failed for: r1v15, types: [androidx.compose.ui.text.LinkAnnotation$Url] */
    /* JADX WARNING: type inference failed for: r1v18, types: [androidx.compose.ui.text.LinkAnnotation$Clickable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.text.AnnotatedString.Range invoke(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.g(r7, r0)
            java.util.List r7 = (java.util.List) r7
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            androidx.compose.ui.text.AnnotationType r0 = (androidx.compose.ui.text.AnnotationType) r0
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            kotlin.jvm.internal.Intrinsics.f(r0)
            r2 = 2
            java.lang.Object r2 = r7.get(r2)
            if (r2 == 0) goto L_0x0020
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r2 = r2.intValue()
            r3 = 3
            java.lang.Object r3 = r7.get(r3)
            if (r3 == 0) goto L_0x0032
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            kotlin.jvm.internal.Intrinsics.f(r3)
            int r3 = r3.intValue()
            r4 = 4
            java.lang.Object r4 = r7.get(r4)
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0045
        L_0x0044:
            r4 = r1
        L_0x0045:
            kotlin.jvm.internal.Intrinsics.f(r4)
            int[] r5 = androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2.WhenMappings.f18379a
            int r0 = r0.ordinal()
            r0 = r5[r0]
            r5 = 1
            switch(r0) {
                case 1: goto L_0x013b;
                case 2: goto L_0x0114;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00c5;
                case 5: goto L_0x009d;
                case 6: goto L_0x0075;
                case 7: goto L_0x005a;
                default: goto L_0x0054;
            }
        L_0x0054:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x005a:
            java.lang.Object r7 = r7.get(r5)
            if (r7 == 0) goto L_0x0063
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
        L_0x0063:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            java.lang.String r0 = androidx.compose.ui.text.StringAnnotation.b(r1)
            androidx.compose.ui.text.StringAnnotation r0 = androidx.compose.ui.text.StringAnnotation.a(r0)
            r7.<init>(r0, r2, r3, r4)
            goto L_0x0161
        L_0x0075:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.f18355g
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x008a
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            if (r7 == 0) goto L_0x0093
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.LinkAnnotation$Clickable r1 = (androidx.compose.ui.text.LinkAnnotation.Clickable) r1
        L_0x0093:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
            goto L_0x0161
        L_0x009d:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.f18354f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x00b2
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x00b2
            goto L_0x00bb
        L_0x00b2:
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.LinkAnnotation$Url r1 = (androidx.compose.ui.text.LinkAnnotation.Url) r1
        L_0x00bb:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
            goto L_0x0161
        L_0x00c5:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.f18353e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x00da
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            if (r7 == 0) goto L_0x00e3
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.UrlAnnotation r1 = (androidx.compose.ui.text.UrlAnnotation) r1
        L_0x00e3:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
            goto L_0x0161
        L_0x00ed:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.f18352d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x0102
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x0102
            goto L_0x010b
        L_0x0102:
            if (r7 == 0) goto L_0x010b
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.VerbatimTtsAnnotation r1 = (androidx.compose.ui.text.VerbatimTtsAnnotation) r1
        L_0x010b:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
            goto L_0x0161
        L_0x0114:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.w()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x0129
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x0129
            goto L_0x0132
        L_0x0129:
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.SpanStyle r1 = (androidx.compose.ui.text.SpanStyle) r1
        L_0x0132:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
            goto L_0x0161
        L_0x013b:
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.runtime.saveable.Saver r0 = androidx.compose.ui.text.SaversKt.i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L_0x0150
            boolean r5 = r0 instanceof androidx.compose.ui.text.NonNullValueClassSaver
            if (r5 != 0) goto L_0x0150
            goto L_0x0159
        L_0x0150:
            if (r7 == 0) goto L_0x0159
            java.lang.Object r7 = r0.a(r7)
            r1 = r7
            androidx.compose.ui.text.ParagraphStyle r1 = (androidx.compose.ui.text.ParagraphStyle) r1
        L_0x0159:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.compose.ui.text.AnnotatedString$Range r7 = new androidx.compose.ui.text.AnnotatedString$Range
            r7.<init>(r1, r2, r3, r4)
        L_0x0161:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2.invoke(java.lang.Object):androidx.compose.ui.text.AnnotatedString$Range");
    }
}
