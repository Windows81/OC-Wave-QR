package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TypographyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11688a = CompositionLocalKt.j(new k8());

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11689a;

        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.TypographyKeyTokens[] r0 = androidx.compose.material3.tokens.TypographyKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayMedium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplaySmall     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineLarge     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineMedium     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineSmall     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleLarge     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleMedium     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleSmall     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyLarge     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyMedium     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodySmall     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelLarge     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelMedium     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmall     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayLargeEmphasized     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplayMediumEmphasized     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.DisplaySmallEmphasized     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineLargeEmphasized     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineMediumEmphasized     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineSmallEmphasized     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleLargeEmphasized     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleMediumEmphasized     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.TitleSmallEmphasized     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyLargeEmphasized     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodyMediumEmphasized     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.BodySmallEmphasized     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelLargeEmphasized     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelMediumEmphasized     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                androidx.compose.material3.tokens.TypographyKeyTokens r1 = androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmallEmphasized     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                f11689a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TypographyKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Typography b() {
        return new Typography((TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, 32767, (DefaultConstructorMarker) null);
    }

    public static final TextStyle c(Typography typography, TypographyKeyTokens typographyKeyTokens) {
        switch (WhenMappings.f11689a[typographyKeyTokens.ordinal()]) {
            case 1:
                return typography.g();
            case 2:
                return typography.i();
            case 3:
                return typography.k();
            case 4:
                return typography.m();
            case 5:
                return typography.o();
            case 6:
                return typography.q();
            case 7:
                return typography.y();
            case 8:
                return typography.A();
            case 9:
                return typography.C();
            case 10:
                return typography.a();
            case 11:
                return typography.c();
            case 12:
                return typography.e();
            case 13:
                return typography.s();
            case 14:
                return typography.u();
            case 15:
                return typography.w();
            case 16:
                return typography.h();
            case 17:
                return typography.j();
            case 18:
                return typography.l();
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /*19*/:
                return typography.n();
            case 20:
                return typography.p();
            case 21:
                return typography.r();
            case 22:
                return typography.z();
            case 23:
                return typography.B();
            case Service.METRICS_FIELD_NUMBER /*24*/:
                return typography.D();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                return typography.b();
            case Service.BILLING_FIELD_NUMBER /*26*/:
                return typography.d();
            case 27:
                return typography.f();
            case Service.MONITORING_FIELD_NUMBER /*28*/:
                return typography.t();
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
                return typography.v();
            case 30:
                return typography.x();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal d() {
        return f11688a;
    }

    public static final TextStyle e(TypographyKeyTokens typographyKeyTokens, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1049072145, i2, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        TextStyle c2 = c(MaterialTheme.f10273a.e(composer, 6), typographyKeyTokens);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }
}
