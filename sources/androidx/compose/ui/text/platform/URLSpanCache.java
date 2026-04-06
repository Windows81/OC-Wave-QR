package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata
public final class URLSpanCache {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f18995a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f18996b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f18997c = new WeakHashMap();

    public final ClickableSpan a(AnnotatedString.Range range) {
        WeakHashMap weakHashMap = this.f18997c;
        Object obj = weakHashMap.get(range);
        if (obj == null) {
            obj = new ComposeClickableSpan((LinkAnnotation) range.g());
            weakHashMap.put(range, obj);
        }
        return (ClickableSpan) obj;
    }

    public final URLSpan b(AnnotatedString.Range range) {
        WeakHashMap weakHashMap = this.f18996b;
        Object obj = weakHashMap.get(range);
        if (obj == null) {
            obj = new URLSpan(((LinkAnnotation.Url) range.g()).e());
            weakHashMap.put(range, obj);
        }
        return (URLSpan) obj;
    }

    public final URLSpan c(UrlAnnotation urlAnnotation) {
        WeakHashMap weakHashMap = this.f18995a;
        Object obj = weakHashMap.get(urlAnnotation);
        if (obj == null) {
            obj = new URLSpan(urlAnnotation.a());
            weakHashMap.put(urlAnnotation, obj);
        }
        return (URLSpan) obj;
    }
}
