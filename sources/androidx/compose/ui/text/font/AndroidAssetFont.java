package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidAssetFont extends AndroidPreloadedFont {

    /* renamed from: i  reason: collision with root package name */
    public final AssetManager f18657i;

    /* renamed from: j  reason: collision with root package name */
    public final String f18658j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        return Intrinsics.d(this.f18658j, androidAssetFont.f18658j) && Intrinsics.d(e(), androidAssetFont.e());
    }

    public Typeface f(Context context) {
        return TypefaceBuilderCompat.f18761a.a(this.f18657i, this.f18658j, context, e());
    }

    public int hashCode() {
        return (this.f18658j.hashCode() * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.f18658j + ", weight=" + a() + ", style=" + FontStyle.h(c()) + ')';
    }
}
