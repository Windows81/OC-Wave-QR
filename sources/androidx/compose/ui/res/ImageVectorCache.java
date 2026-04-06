package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ImageVectorCache {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17990a = new HashMap();

    @Metadata
    public static final class ImageVectorEntry {

        /* renamed from: a  reason: collision with root package name */
        public final ImageVector f17991a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17992b;

        public ImageVectorEntry(ImageVector imageVector, int i2) {
            this.f17991a = imageVector;
            this.f17992b = i2;
        }

        public final int a() {
            return this.f17992b;
        }

        public final ImageVector b() {
            return this.f17991a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return Intrinsics.d(this.f17991a, imageVectorEntry.f17991a) && this.f17992b == imageVectorEntry.f17992b;
        }

        public int hashCode() {
            return (this.f17991a.hashCode() * 31) + Integer.hashCode(this.f17992b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f17991a + ", configFlags=" + this.f17992b + ')';
        }
    }

    @Metadata
    public static final class Key {

        /* renamed from: a  reason: collision with root package name */
        public final Resources.Theme f17993a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17994b;

        public Key(Resources.Theme theme, int i2) {
            this.f17993a = theme;
            this.f17994b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.d(this.f17993a, key.f17993a) && this.f17994b == key.f17994b;
        }

        public int hashCode() {
            return (this.f17993a.hashCode() * 31) + Integer.hashCode(this.f17994b);
        }

        public String toString() {
            return "Key(theme=" + this.f17993a + ", id=" + this.f17994b + ')';
        }
    }

    public final void a() {
        this.f17990a.clear();
    }

    public final ImageVectorEntry b(Key key) {
        WeakReference weakReference = (WeakReference) this.f17990a.get(key);
        if (weakReference != null) {
            return (ImageVectorEntry) weakReference.get();
        }
        return null;
    }

    public final void c(int i2) {
        Iterator it = this.f17990a.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (imageVectorEntry == null || Configuration.needNewResources(i2, imageVectorEntry.a())) {
                it.remove();
            }
        }
    }

    public final void d(Key key, ImageVectorEntry imageVectorEntry) {
        this.f17990a.put(key, new WeakReference(imageVectorEntry));
    }
}
