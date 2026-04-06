package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import kotlin.Metadata;

@Metadata
public final class HapticDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final HapticDefaults f17786a = new HapticDefaults();

    public final boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && x.a((Vibrator) context.getSystemService(Vibrator.class), new int[]{1, 7, 2});
    }
}
