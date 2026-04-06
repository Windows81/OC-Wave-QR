package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidPath_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15919a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.graphics.Path$Direction[] r0 = androidx.compose.ui.graphics.Path.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.graphics.Path$Direction r1 = androidx.compose.ui.graphics.Path.Direction.CounterClockwise     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.graphics.Path$Direction r1 = androidx.compose.ui.graphics.Path.Direction.Clockwise     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f15919a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidPath_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Path a() {
        return new AndroidPath((Path) null, 1, (DefaultConstructorMarker) null);
    }

    public static final Path c(Path path) {
        return new AndroidPath(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction e(Path.Direction direction) {
        int i2 = WhenMappings.f15919a[direction.ordinal()];
        if (i2 == 1) {
            return Path.Direction.CCW;
        }
        if (i2 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
