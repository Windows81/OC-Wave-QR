package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

public class ViewCompatShims {

    public static class Api26Impl {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    public static class Api29Impl {
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    public static class Api30Impl {
        public static void a(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }
    }

    public static AutofillIdCompat a(View view) {
        return AutofillIdCompat.b(Api26Impl.a(view));
    }

    public static ContentCaptureSessionCompat b(View view) {
        ContentCaptureSession a2;
        if (Build.VERSION.SDK_INT < 29 || (a2 = Api29Impl.a(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.g(a2, view);
    }

    public static void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(view, i2);
        }
    }
}
