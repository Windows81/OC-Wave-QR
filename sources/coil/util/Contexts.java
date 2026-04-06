package coil.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;

@Metadata
/* renamed from: coil.util.-Contexts  reason: invalid class name */
public final class Contexts {
    public static final Drawable a(Context context, int i2) {
        Drawable b2 = AppCompatResources.b(context, i2);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i2).toString());
    }

    public static final Drawable b(Resources resources, int i2, Resources.Theme theme) {
        Drawable d2 = ResourcesCompat.d(resources, i2, theme);
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i2).toString());
    }

    public static final Lifecycle c(Context context) {
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).a();
    }

    public static final Drawable d(Context context, Resources resources, int i2) {
        XmlResourceParser xml = resources.getXml(i2);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i2, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return ContextCompat.a(context, str) == 0;
    }
}
