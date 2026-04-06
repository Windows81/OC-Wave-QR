package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

public class ContentCaptureSessionCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17974a;

    /* renamed from: b  reason: collision with root package name */
    public final View f17975b;

    public static class Api23Impl {
    }

    public static class Api29Impl {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newAutofillId(autofillId, j2);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public static class Api34Impl {
    }

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f17974a = contentCaptureSession;
        this.f17975b = view;
    }

    public static ContentCaptureSessionCompat g(ContentCaptureSession contentCaptureSession, View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a2 = a.a(this.f17974a);
            AutofillIdCompat a3 = ViewCompatShims.a(this.f17975b);
            Objects.requireNonNull(a3);
            Api29Impl.f(a2, a3.a(), new long[]{Long.MIN_VALUE});
        }
    }

    public AutofillId b(long j2) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a2 = a.a(this.f17974a);
        AutofillIdCompat a3 = ViewCompatShims.a(this.f17975b);
        Objects.requireNonNull(a3);
        return Api29Impl.a(a2, a3.a(), j2);
    }

    public ViewStructureCompat c(AutofillId autofillId, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.i(Api29Impl.b(a.a(this.f17974a), autofillId, j2));
        }
        return null;
    }

    public void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.c(a.a(this.f17974a), viewStructure);
        }
    }

    public void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(a.a(this.f17974a), autofillId);
        }
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.e(a.a(this.f17974a), autofillId, charSequence);
        }
    }
}
