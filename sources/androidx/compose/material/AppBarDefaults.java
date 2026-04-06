package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class AppBarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final AppBarDefaults f7138a = new AppBarDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7139b = Dp.m((float) 4);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7140c = Dp.m((float) 8);

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f7141d = PaddingKt.e(AppBarKt.f7143b, 0.0f, AppBarKt.f7143b, 0.0f, 10, (Object) null);

    public final float a() {
        return f7140c;
    }

    public final PaddingValues b() {
        return f7141d;
    }

    public final float c() {
        return f7139b;
    }
}
