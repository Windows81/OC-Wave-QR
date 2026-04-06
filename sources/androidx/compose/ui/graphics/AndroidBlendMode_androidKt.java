package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.BlendMode;
import kotlin.Metadata;

@Metadata
public final class AndroidBlendMode_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(2:57|58)|59|61) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.BlendMode[] r0 = android.graphics.BlendMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.BlendMode r1 = android.graphics.BlendMode.CLEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OVER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_IN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_IN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OUT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_ATOP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_ATOP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.XOR     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.PLUS     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.MODULATE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SCREEN     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DARKEN     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.LIGHTEN     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_DODGE     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_BURN     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.HARD_LIGHT     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SOFT_LIGHT     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DIFFERENCE     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.EXCLUSION     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.MULTIPLY     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.HUE     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SATURATION     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.LUMINOSITY     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                f15880a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidBlendMode_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final BlendMode a(int i2) {
        BlendMode.Companion companion = BlendMode.f15926b;
        return BlendMode.F(i2, companion.a()) ? android.graphics.BlendMode.CLEAR : BlendMode.F(i2, companion.x()) ? android.graphics.BlendMode.SRC : BlendMode.F(i2, companion.g()) ? android.graphics.BlendMode.DST : BlendMode.F(i2, companion.B()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.F(i2, companion.k()) ? android.graphics.BlendMode.DST_OVER : BlendMode.F(i2, companion.z()) ? android.graphics.BlendMode.SRC_IN : BlendMode.F(i2, companion.i()) ? android.graphics.BlendMode.DST_IN : BlendMode.F(i2, companion.A()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.F(i2, companion.j()) ? android.graphics.BlendMode.DST_OUT : BlendMode.F(i2, companion.y()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.F(i2, companion.h()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.F(i2, companion.C()) ? android.graphics.BlendMode.XOR : BlendMode.F(i2, companion.t()) ? android.graphics.BlendMode.PLUS : BlendMode.F(i2, companion.q()) ? android.graphics.BlendMode.MODULATE : BlendMode.F(i2, companion.v()) ? android.graphics.BlendMode.SCREEN : BlendMode.F(i2, companion.s()) ? android.graphics.BlendMode.OVERLAY : BlendMode.F(i2, companion.e()) ? android.graphics.BlendMode.DARKEN : BlendMode.F(i2, companion.o()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.F(i2, companion.d()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.F(i2, companion.c()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.F(i2, companion.m()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.F(i2, companion.w()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.F(i2, companion.f()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.F(i2, companion.l()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.F(i2, companion.r()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.F(i2, companion.n()) ? android.graphics.BlendMode.HUE : BlendMode.F(i2, companion.u()) ? android.graphics.BlendMode.SATURATION : BlendMode.F(i2, companion.b()) ? android.graphics.BlendMode.COLOR : BlendMode.F(i2, companion.p()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i2) {
        BlendMode.Companion companion = BlendMode.f15926b;
        return BlendMode.F(i2, companion.a()) ? PorterDuff.Mode.CLEAR : BlendMode.F(i2, companion.x()) ? PorterDuff.Mode.SRC : BlendMode.F(i2, companion.g()) ? PorterDuff.Mode.DST : BlendMode.F(i2, companion.B()) ? PorterDuff.Mode.SRC_OVER : BlendMode.F(i2, companion.k()) ? PorterDuff.Mode.DST_OVER : BlendMode.F(i2, companion.z()) ? PorterDuff.Mode.SRC_IN : BlendMode.F(i2, companion.i()) ? PorterDuff.Mode.DST_IN : BlendMode.F(i2, companion.A()) ? PorterDuff.Mode.SRC_OUT : BlendMode.F(i2, companion.j()) ? PorterDuff.Mode.DST_OUT : BlendMode.F(i2, companion.y()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.F(i2, companion.h()) ? PorterDuff.Mode.DST_ATOP : BlendMode.F(i2, companion.C()) ? PorterDuff.Mode.XOR : BlendMode.F(i2, companion.t()) ? PorterDuff.Mode.ADD : BlendMode.F(i2, companion.v()) ? PorterDuff.Mode.SCREEN : BlendMode.F(i2, companion.s()) ? PorterDuff.Mode.OVERLAY : BlendMode.F(i2, companion.e()) ? PorterDuff.Mode.DARKEN : BlendMode.F(i2, companion.o()) ? PorterDuff.Mode.LIGHTEN : BlendMode.F(i2, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
