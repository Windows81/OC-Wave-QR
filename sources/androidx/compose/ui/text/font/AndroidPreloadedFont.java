package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

@Metadata
public abstract class AndroidPreloadedFont extends AndroidFont {

    /* renamed from: e  reason: collision with root package name */
    public final FontWeight f18669e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18670f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18671g;

    /* renamed from: h  reason: collision with root package name */
    public Typeface f18672h;

    public final FontWeight a() {
        return this.f18669e;
    }

    public final int c() {
        return this.f18670f;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.f18671g && this.f18672h == null) {
            this.f18672h = f(context);
        }
        this.f18671g = true;
        return this.f18672h;
    }
}
