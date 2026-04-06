package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

@Metadata
public final class AndroidUriHandler implements UriHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17651a;

    public AndroidUriHandler(Context context) {
        this.f17651a = context;
    }

    public void a(String str) {
        try {
            this.f17651a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e2) {
            throw new IllegalArgumentException("Can't open " + str + '.', e2);
        }
    }
}
