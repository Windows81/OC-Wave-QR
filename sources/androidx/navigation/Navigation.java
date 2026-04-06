package androidx.navigation;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata
public final class Navigation {

    /* renamed from: a  reason: collision with root package name */
    public static final Navigation f22423a = new Navigation();

    public final NavController b(View view) {
        Object tag = view.getTag(R.id.f22443a);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }
}
