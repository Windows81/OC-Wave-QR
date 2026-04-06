package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ShapesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10994a = CompositionLocalKt.j(new N5());

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10995a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.ShapeKeyTokens[] r0 = androidx.compose.material3.tokens.ShapeKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLargeIncreased     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraExtraLarge     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLargeTop     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmall     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmallTop     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLarge     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeIncreased     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeEnd     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeTop     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerMedium     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerNone     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerSmall     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.material3.tokens.ShapeKeyTokens r1 = androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeStart     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                f10995a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ShapesKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Shapes b() {
        return new Shapes((CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, 31, (DefaultConstructorMarker) null);
    }

    public static final CornerBasedShape c(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.d(cornerBasedShape, cornerSize, (CornerSize) null, (CornerSize) null, cornerSize, 6, (Object) null);
    }

    public static /* synthetic */ CornerBasedShape d(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cornerSize = ShapeDefaults.f10967a.a();
        }
        return c(cornerBasedShape, cornerSize);
    }

    public static final Shape e(Shapes shapes, ShapeKeyTokens shapeKeyTokens) {
        switch (WhenMappings.f10995a[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.b();
            case 2:
                return shapes.c();
            case 3:
                return shapes.a();
            case 4:
                return k(shapes.b(), (CornerSize) null, 1, (Object) null);
            case 5:
                return shapes.d();
            case 6:
                return k(shapes.d(), (CornerSize) null, 1, (Object) null);
            case 7:
                return RoundedCornerShapeKt.f();
            case 8:
                return shapes.e();
            case 9:
                return shapes.f();
            case 10:
                return d(shapes.e(), (CornerSize) null, 1, (Object) null);
            case 11:
                return k(shapes.e(), (CornerSize) null, 1, (Object) null);
            case 12:
                return shapes.g();
            case 13:
                return RectangleShapeKt.a();
            case 14:
                return shapes.h();
            case 15:
                return i(shapes.e(), (CornerSize) null, 1, (Object) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal f() {
        return f10994a;
    }

    public static final Shape g(ShapeKeyTokens shapeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1629172543, i2, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        Shape e2 = e(MaterialTheme.f10273a.d(composer, 6), shapeKeyTokens);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public static final CornerBasedShape h(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.d(cornerBasedShape, (CornerSize) null, cornerSize, cornerSize, (CornerSize) null, 9, (Object) null);
    }

    public static /* synthetic */ CornerBasedShape i(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cornerSize = ShapeDefaults.f10967a.a();
        }
        return h(cornerBasedShape, cornerSize);
    }

    public static final CornerBasedShape j(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.d(cornerBasedShape, (CornerSize) null, (CornerSize) null, cornerSize, cornerSize, 3, (Object) null);
    }

    public static /* synthetic */ CornerBasedShape k(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cornerSize = ShapeDefaults.f10967a.a();
        }
        return j(cornerBasedShape, cornerSize);
    }
}
