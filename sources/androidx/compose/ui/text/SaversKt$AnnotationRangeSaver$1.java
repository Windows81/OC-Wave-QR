package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$1 f18376z = new SaversKt$AnnotationRangeSaver$1();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18377a;

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
                f18377a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1.WhenMappings.<clinit>():void");
        }
    }

    public SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, AnnotatedString.Range range) {
        AnnotationType annotationType;
        Object obj;
        Object g2 = range.g();
        if (g2 instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (g2 instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (g2 instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (g2 instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (g2 instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.Link;
        } else if (g2 instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.Clickable;
        } else if (g2 instanceof StringAnnotation) {
            annotationType = AnnotationType.String;
        } else {
            throw new UnsupportedOperationException();
        }
        switch (WhenMappings.f18377a[annotationType.ordinal()]) {
            case 1:
                Object g3 = range.g();
                Intrinsics.g(g3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                obj = SaversKt.z((ParagraphStyle) g3, SaversKt.i(), saverScope);
                break;
            case 2:
                Object g4 = range.g();
                Intrinsics.g(g4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                obj = SaversKt.z((SpanStyle) g4, SaversKt.w(), saverScope);
                break;
            case 3:
                Object g5 = range.g();
                Intrinsics.g(g5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                obj = SaversKt.z((VerbatimTtsAnnotation) g5, SaversKt.f18352d, saverScope);
                break;
            case 4:
                Object g6 = range.g();
                Intrinsics.g(g6, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                obj = SaversKt.z((UrlAnnotation) g6, SaversKt.f18353e, saverScope);
                break;
            case 5:
                Object g7 = range.g();
                Intrinsics.g(g7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                obj = SaversKt.z((LinkAnnotation.Url) g7, SaversKt.f18354f, saverScope);
                break;
            case 6:
                Object g8 = range.g();
                Intrinsics.g(g8, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                obj = SaversKt.z((LinkAnnotation.Clickable) g8, SaversKt.f18355g, saverScope);
                break;
            case 7:
                Object g9 = range.g();
                Intrinsics.g(g9, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                obj = SaversKt.y(((StringAnnotation) g9).f());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.g(SaversKt.y(annotationType), obj, SaversKt.y(Integer.valueOf(range.h())), SaversKt.y(Integer.valueOf(range.f())), SaversKt.y(range.i()));
    }
}
