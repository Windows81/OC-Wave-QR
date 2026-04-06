package androidx.compose.ui.platform.actionmodecallback;

import android.os.Build;
import androidx.compose.ui.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3),
    Autofill(4);
    

    /* renamed from: A  reason: collision with root package name */
    public final int f17960A;

    /* renamed from: z  reason: collision with root package name */
    public final int f17961z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17962a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] r0 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Autofill     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f17962a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.actionmodecallback.MenuItemOption.WhenMappings.<clinit>():void");
        }
    }

    static {
        MenuItemOption[] d2;
        H = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    MenuItemOption(int i2) {
        this.f17961z = i2;
        this.f17960A = i2;
    }

    public final int f() {
        return this.f17961z;
    }

    public final int h() {
        return this.f17960A;
    }

    public final int j() {
        int i2 = WhenMappings.f17962a[ordinal()];
        if (i2 == 1) {
            return 17039361;
        }
        if (i2 == 2) {
            return 17039371;
        }
        if (i2 == 3) {
            return 17039363;
        }
        if (i2 == 4) {
            return 17039373;
        }
        if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (Build.VERSION.SDK_INT <= 26) {
            return R.string.f15525a;
        } else {
            return 17039386;
        }
    }
}
