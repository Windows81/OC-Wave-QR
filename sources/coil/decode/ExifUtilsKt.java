package coil.decode;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;

@Metadata
public final class ExifUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f23377a = SetsKt.f("image/jpeg", "image/webp", "image/heic", "image/heif");

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23378a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                coil.decode.ExifOrientationPolicy[] r0 = coil.decode.ExifOrientationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                coil.decode.ExifOrientationPolicy r1 = coil.decode.ExifOrientationPolicy.RESPECT_PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                coil.decode.ExifOrientationPolicy r1 = coil.decode.ExifOrientationPolicy.IGNORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                coil.decode.ExifOrientationPolicy r1 = coil.decode.ExifOrientationPolicy.RESPECT_ALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f23378a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.decode.ExifUtilsKt.WhenMappings.<clinit>():void");
        }
    }

    public static final boolean a(ExifData exifData) {
        return exifData.a() > 0;
    }

    public static final boolean b(ExifData exifData) {
        return exifData.a() == 90 || exifData.a() == 270;
    }

    public static final boolean c(ExifOrientationPolicy exifOrientationPolicy, String str) {
        int i2 = WhenMappings.f23378a[exifOrientationPolicy.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return false;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f23377a.contains(str)) {
            return false;
        }
        return true;
    }
}
