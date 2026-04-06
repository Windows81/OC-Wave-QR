package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ColorSchemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9479a = CompositionLocalKt.j(new C0262v0());

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9480b = CompositionLocalKt.j(new C0271w0());

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(2:95|96)|97|99) */
        /* JADX WARNING: Can't wrap try/catch for region: R(99:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|99) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.ColorSchemeKeyTokens[] r0 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Background     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.ErrorContainer     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseOnSurface     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InversePrimary     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseSurface     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnBackground     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnError     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnErrorContainer     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimary     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryContainer     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondary     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryContainer     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurface     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurfaceVariant     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceTint     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiary     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryContainer     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Outline     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OutlineVariant     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Primary     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryContainer     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Scrim     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Secondary     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryContainer     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Surface     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceVariant     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceBright     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainer     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerHigh     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerHighest     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerLow     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerLowest     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceDim     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Tertiary     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryContainer     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryFixed     // Catch:{ NoSuchFieldError -> 0x0172 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
            L_0x0172:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryFixedDim     // Catch:{ NoSuchFieldError -> 0x017c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
            L_0x017c:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryFixed     // Catch:{ NoSuchFieldError -> 0x0186 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
            L_0x0186:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryFixedVariant     // Catch:{ NoSuchFieldError -> 0x0190 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
            L_0x0190:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryFixed     // Catch:{ NoSuchFieldError -> 0x019a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
            L_0x019a:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryFixedDim     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryFixed     // Catch:{ NoSuchFieldError -> 0x01ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
            L_0x01ae:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryFixedVariant     // Catch:{ NoSuchFieldError -> 0x01b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
            L_0x01b8:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryFixed     // Catch:{ NoSuchFieldError -> 0x01c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
            L_0x01c2:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryFixedDim     // Catch:{ NoSuchFieldError -> 0x01cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cc }
            L_0x01cc:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryFixed     // Catch:{ NoSuchFieldError -> 0x01d6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d6 }
            L_0x01d6:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryFixedVariant     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                f9481a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ColorSchemeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final ColorScheme c() {
        return m(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535, (Object) null);
    }

    public static final boolean d() {
        return true;
    }

    public static final long e(ColorScheme colorScheme, long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1610977682, i2, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean booleanValue = ((Boolean) composer.C(f9480b)).booleanValue();
        if (Color.n(j2, colorScheme.W()) && booleanValue) {
            j2 = n(colorScheme, f2);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }

    public static final long f(ColorScheme colorScheme, long j2) {
        return Color.n(j2, colorScheme.N()) ? colorScheme.x() : Color.n(j2, colorScheme.S()) ? colorScheme.B() : Color.n(j2, colorScheme.g0()) ? colorScheme.H() : Color.n(j2, colorScheme.a()) ? colorScheme.u() : Color.n(j2, colorScheme.p()) ? colorScheme.v() : Color.n(j2, colorScheme.O()) ? colorScheme.y() : Color.n(j2, colorScheme.T()) ? colorScheme.C() : Color.n(j2, colorScheme.h0()) ? colorScheme.I() : Color.n(j2, colorScheme.q()) ? colorScheme.w() : Color.n(j2, colorScheme.t()) ? colorScheme.r() : Color.n(j2, colorScheme.W()) ? colorScheme.F() : Color.n(j2, colorScheme.f0()) ? colorScheme.G() : Color.n(j2, colorScheme.X()) ? colorScheme.F() : Color.n(j2, colorScheme.Y()) ? colorScheme.F() : Color.n(j2, colorScheme.Z()) ? colorScheme.F() : Color.n(j2, colorScheme.a0()) ? colorScheme.F() : Color.n(j2, colorScheme.b0()) ? colorScheme.F() : Color.n(j2, colorScheme.c0()) ? colorScheme.F() : Color.n(j2, colorScheme.d0()) ? colorScheme.F() : Color.n(j2, colorScheme.P()) ? colorScheme.z() : Color.n(j2, colorScheme.Q()) ? colorScheme.z() : Color.n(j2, colorScheme.U()) ? colorScheme.D() : Color.n(j2, colorScheme.V()) ? colorScheme.D() : Color.n(j2, colorScheme.i0()) ? colorScheme.J() : Color.n(j2, colorScheme.j0()) ? colorScheme.J() : Color.f15975b.f();
    }

    public static final long g(long j2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        composer.X(89374938);
        long f2 = f(MaterialTheme.f10273a.a(composer, 6), j2);
        if (f2 == 16) {
            f2 = ((Color) composer.C(ContentColorKt.a())).v();
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return f2;
    }

    public static final ColorScheme h() {
        PaletteTokens paletteTokens = PaletteTokens.f13827a;
        return m(0, 0, 0, paletteTokens.W(), 0, 0, 0, 0, paletteTokens.j0(), 0, 0, 0, paletteTokens.w0(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, paletteTokens.d(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -33558793, 65535, (Object) null);
    }

    public static final long i(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.f9481a[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.a();
            case 2:
                return colorScheme.p();
            case 3:
                return colorScheme.q();
            case 4:
                return colorScheme.r();
            case 5:
                return colorScheme.s();
            case 6:
                return colorScheme.t();
            case 7:
                return colorScheme.u();
            case 8:
                return colorScheme.v();
            case 9:
                return colorScheme.w();
            case 10:
                return colorScheme.x();
            case 11:
                return colorScheme.y();
            case 12:
                return colorScheme.B();
            case 13:
                return colorScheme.C();
            case 14:
                return colorScheme.F();
            case 15:
                return colorScheme.G();
            case 16:
                return colorScheme.e0();
            case 17:
                return colorScheme.H();
            case 18:
                return colorScheme.I();
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /*19*/:
                return colorScheme.L();
            case 20:
                return colorScheme.M();
            case 21:
                return colorScheme.N();
            case 22:
                return colorScheme.O();
            case 23:
                return colorScheme.R();
            case Service.METRICS_FIELD_NUMBER /*24*/:
                return colorScheme.S();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                return colorScheme.T();
            case Service.BILLING_FIELD_NUMBER /*26*/:
                return colorScheme.W();
            case 27:
                return colorScheme.f0();
            case Service.MONITORING_FIELD_NUMBER /*28*/:
                return colorScheme.X();
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
                return colorScheme.Y();
            case 30:
                return colorScheme.Z();
            case 31:
                return colorScheme.a0();
            case 32:
                return colorScheme.b0();
            case 33:
                return colorScheme.c0();
            case 34:
                return colorScheme.d0();
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /*35*/:
                return colorScheme.g0();
            case 36:
                return colorScheme.h0();
            case 37:
                return colorScheme.P();
            case 38:
                return colorScheme.Q();
            case 39:
                return colorScheme.z();
            case 40:
                return colorScheme.A();
            case 41:
                return colorScheme.U();
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /*42*/:
                return colorScheme.V();
            case 43:
                return colorScheme.D();
            case 44:
                return colorScheme.E();
            case 45:
                return colorScheme.i0();
            case 46:
                return colorScheme.j0();
            case 47:
                return colorScheme.J();
            case 48:
                return colorScheme.K();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal j() {
        return f9479a;
    }

    public static final long k(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-810780884, i2, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long i3 = i(MaterialTheme.f10273a.a(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return i3;
    }

    public static final ColorScheme l(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ColorScheme m(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, int i2, int i3, Object obj) {
        int i4 = i2;
        int i5 = i3;
        long z2 = (i4 & 1) != 0 ? ColorLightTokens.f12959a.z() : j2;
        return l(z2, (i4 & 2) != 0 ? ColorLightTokens.f12959a.j() : j3, (i4 & 4) != 0 ? ColorLightTokens.f12959a.A() : j4, (i4 & 8) != 0 ? ColorLightTokens.f12959a.k() : j5, (i4 & 16) != 0 ? ColorLightTokens.f12959a.e() : j6, (i4 & 32) != 0 ? ColorLightTokens.f12959a.E() : j7, (i4 & 64) != 0 ? ColorLightTokens.f12959a.n() : j8, (i4 & 128) != 0 ? ColorLightTokens.f12959a.F() : j9, (i4 & 256) != 0 ? ColorLightTokens.f12959a.o() : j10, (i4 & 512) != 0 ? ColorLightTokens.f12959a.R() : j11, (i4 & 1024) != 0 ? ColorLightTokens.f12959a.t() : j12, (i4 & 2048) != 0 ? ColorLightTokens.f12959a.S() : j13, (i4 & 4096) != 0 ? ColorLightTokens.f12959a.u() : j14, (i4 & 8192) != 0 ? ColorLightTokens.f12959a.a() : j15, (i4 & 16384) != 0 ? ColorLightTokens.f12959a.g() : j16, (i4 & 32768) != 0 ? ColorLightTokens.f12959a.I() : j17, (i4 & 65536) != 0 ? ColorLightTokens.f12959a.r() : j18, (i4 & 131072) != 0 ? ColorLightTokens.f12959a.Q() : j19, (i4 & 262144) != 0 ? ColorLightTokens.f12959a.s() : j20, (i4 & 524288) != 0 ? z2 : j21, (i4 & 1048576) != 0 ? ColorLightTokens.f12959a.f() : j22, (i4 & 2097152) != 0 ? ColorLightTokens.f12959a.d() : j23, (i4 & 4194304) != 0 ? ColorLightTokens.f12959a.b() : j24, (i4 & 8388608) != 0 ? ColorLightTokens.f12959a.h() : j25, (i4 & 16777216) != 0 ? ColorLightTokens.f12959a.c() : j26, (i4 & 33554432) != 0 ? ColorLightTokens.f12959a.i() : j27, (i4 & 67108864) != 0 ? ColorLightTokens.f12959a.x() : j28, (i4 & 134217728) != 0 ? ColorLightTokens.f12959a.y() : j29, (i4 & 268435456) != 0 ? ColorLightTokens.f12959a.D() : j30, (i4 & 536870912) != 0 ? ColorLightTokens.f12959a.J() : j31, (i4 & 1073741824) != 0 ? ColorLightTokens.f12959a.K() : j32, (i4 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.f12959a.L() : j33, (i5 & 1) != 0 ? ColorLightTokens.f12959a.M() : j34, (i5 & 2) != 0 ? ColorLightTokens.f12959a.N() : j35, (i5 & 4) != 0 ? ColorLightTokens.f12959a.O() : j36, (i5 & 8) != 0 ? ColorLightTokens.f12959a.P() : j37, (i5 & 16) != 0 ? ColorLightTokens.f12959a.B() : j38, (i5 & 32) != 0 ? ColorLightTokens.f12959a.C() : j39, (i5 & 64) != 0 ? ColorLightTokens.f12959a.l() : j40, (i5 & 128) != 0 ? ColorLightTokens.f12959a.m() : j41, (i5 & 256) != 0 ? ColorLightTokens.f12959a.G() : j42, (i5 & 512) != 0 ? ColorLightTokens.f12959a.H() : j43, (i5 & 1024) != 0 ? ColorLightTokens.f12959a.p() : j44, (i5 & 2048) != 0 ? ColorLightTokens.f12959a.q() : j45, (i5 & 4096) != 0 ? ColorLightTokens.f12959a.T() : j46, (i5 & 8192) != 0 ? ColorLightTokens.f12959a.U() : j47, (i5 & 16384) != 0 ? ColorLightTokens.f12959a.v() : j48, (i5 & 32768) != 0 ? ColorLightTokens.f12959a.w() : j49);
    }

    public static final long n(ColorScheme colorScheme, float f2) {
        if (Dp.o(f2, Dp.m((float) 0))) {
            return colorScheme.W();
        }
        return ColorKt.g(Color.l(colorScheme.e0(), ((((float) Math.log((double) (f2 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W());
    }
}
