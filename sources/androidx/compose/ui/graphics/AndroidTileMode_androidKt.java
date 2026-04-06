package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;

@Metadata
public final class AndroidTileMode_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                android.graphics.Shader$TileMode[] r0 = android.graphics.Shader.TileMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f15921a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidTileMode_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Shader.TileMode a(int i2) {
        TileMode.Companion companion = TileMode.f16143b;
        return TileMode.g(i2, companion.a()) ? Shader.TileMode.CLAMP : TileMode.g(i2, companion.d()) ? Shader.TileMode.REPEAT : TileMode.g(i2, companion.c()) ? Shader.TileMode.MIRROR : TileMode.g(i2, companion.b()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.f16149a.a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
