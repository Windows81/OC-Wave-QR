package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class InputContentInfoCompat {

    /* renamed from: a  reason: collision with root package name */
    public final InputContentInfoCompatImpl f20423a;

    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20425a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f20426b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f20427c;

        public Uri a() {
            return this.f20425a;
        }

        public void b() {
        }

        public Uri c() {
            return this.f20427c;
        }

        public Object d() {
            return null;
        }

        public ClipDescription getDescription() {
            return this.f20426b;
        }
    }

    public interface InputContentInfoCompatImpl {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f20423a = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
    }

    public static InputContentInfoCompat f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(obj));
    }

    public Uri a() {
        return this.f20423a.a();
    }

    public ClipDescription b() {
        return this.f20423a.getDescription();
    }

    public Uri c() {
        return this.f20423a.c();
    }

    public void d() {
        this.f20423a.b();
    }

    public Object e() {
        return this.f20423a.d();
    }

    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f20424a;

        public InputContentInfoCompatApi25Impl(Object obj) {
            this.f20424a = (InputContentInfo) obj;
        }

        public Uri a() {
            return this.f20424a.getContentUri();
        }

        public void b() {
            this.f20424a.requestPermission();
        }

        public Uri c() {
            return this.f20424a.getLinkUri();
        }

        public Object d() {
            return this.f20424a;
        }

        public ClipDescription getDescription() {
            return this.f20424a.getDescription();
        }

        public InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f20424a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.f20423a = inputContentInfoCompatImpl;
    }
}
