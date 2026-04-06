package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RealSubcomposeAsyncImageScope implements SubcomposeAsyncImageScope, BoxScope {

    /* renamed from: a  reason: collision with root package name */
    public final BoxScope f23313a;

    /* renamed from: b  reason: collision with root package name */
    public final AsyncImagePainter f23314b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23315c;

    /* renamed from: d  reason: collision with root package name */
    public final Alignment f23316d;

    /* renamed from: e  reason: collision with root package name */
    public final ContentScale f23317e;

    /* renamed from: f  reason: collision with root package name */
    public final float f23318f;

    /* renamed from: g  reason: collision with root package name */
    public final ColorFilter f23319g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23320h;

    public RealSubcomposeAsyncImageScope(BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2) {
        this.f23313a = boxScope;
        this.f23314b = asyncImagePainter;
        this.f23315c = str;
        this.f23316d = alignment;
        this.f23317e = contentScale;
        this.f23318f = f2;
        this.f23319g = colorFilter;
        this.f23320h = z2;
    }

    public Modifier a(Modifier modifier) {
        return this.f23313a.a(modifier);
    }

    public ContentScale b() {
        return this.f23317e;
    }

    public float c() {
        return this.f23318f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSubcomposeAsyncImageScope)) {
            return false;
        }
        RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
        return Intrinsics.d(this.f23313a, realSubcomposeAsyncImageScope.f23313a) && Intrinsics.d(this.f23314b, realSubcomposeAsyncImageScope.f23314b) && Intrinsics.d(this.f23315c, realSubcomposeAsyncImageScope.f23315c) && Intrinsics.d(this.f23316d, realSubcomposeAsyncImageScope.f23316d) && Intrinsics.d(this.f23317e, realSubcomposeAsyncImageScope.f23317e) && Float.compare(this.f23318f, realSubcomposeAsyncImageScope.f23318f) == 0 && Intrinsics.d(this.f23319g, realSubcomposeAsyncImageScope.f23319g) && this.f23320h == realSubcomposeAsyncImageScope.f23320h;
    }

    public ColorFilter f() {
        return this.f23319g;
    }

    public Modifier g(Modifier modifier, Alignment alignment) {
        return this.f23313a.g(modifier, alignment);
    }

    public String getContentDescription() {
        return this.f23315c;
    }

    public Alignment h() {
        return this.f23316d;
    }

    public int hashCode() {
        int hashCode = ((this.f23313a.hashCode() * 31) + this.f23314b.hashCode()) * 31;
        String str = this.f23315c;
        int i2 = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23316d.hashCode()) * 31) + this.f23317e.hashCode()) * 31) + Float.hashCode(this.f23318f)) * 31;
        ColorFilter colorFilter = this.f23319g;
        if (colorFilter != null) {
            i2 = colorFilter.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Boolean.hashCode(this.f23320h);
    }

    public AsyncImagePainter i() {
        return this.f23314b;
    }

    public boolean p() {
        return this.f23320h;
    }

    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f23313a + ", painter=" + this.f23314b + ", contentDescription=" + this.f23315c + ", alignment=" + this.f23316d + ", contentScale=" + this.f23317e + ", alpha=" + this.f23318f + ", colorFilter=" + this.f23319g + ", clipToBounds=" + this.f23320h + ')';
    }
}
