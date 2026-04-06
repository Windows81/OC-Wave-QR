package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public final class ContentInfoCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Compat f20197a;

    public static final class Api31Impl {
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final BuilderCompat f20198a;

        public Builder(ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f20198a = new BuilderCompat31Impl(clipData, i2);
            } else {
                this.f20198a = new BuilderCompatImpl(clipData, i2);
            }
        }

        public ContentInfoCompat a() {
            return this.f20198a.d();
        }

        public Builder b(Bundle bundle) {
            this.f20198a.setExtras(bundle);
            return this;
        }

        public Builder c(int i2) {
            this.f20198a.b(i2);
            return this;
        }

        public Builder d(Uri uri) {
            this.f20198a.a(uri);
            return this;
        }
    }

    public interface BuilderCompat {
        void a(Uri uri);

        void b(int i2);

        ContentInfoCompat d();

        void setExtras(Bundle bundle);
    }

    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f20199a;

        public BuilderCompat31Impl(ClipData clipData, int i2) {
            this.f20199a = C0355d.a(clipData, i2);
        }

        public void a(Uri uri) {
            ContentInfo.Builder unused = this.f20199a.setLinkUri(uri);
        }

        public void b(int i2) {
            ContentInfo.Builder unused = this.f20199a.setFlags(i2);
        }

        public ContentInfoCompat d() {
            return new ContentInfoCompat(new Compat31Impl(this.f20199a.build()));
        }

        public void setExtras(Bundle bundle) {
            ContentInfo.Builder unused = this.f20199a.setExtras(bundle);
        }
    }

    public static final class BuilderCompatImpl implements BuilderCompat {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f20200a;

        /* renamed from: b  reason: collision with root package name */
        public int f20201b;

        /* renamed from: c  reason: collision with root package name */
        public int f20202c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f20203d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f20204e;

        public BuilderCompatImpl(ClipData clipData, int i2) {
            this.f20200a = clipData;
            this.f20201b = i2;
        }

        public void a(Uri uri) {
            this.f20203d = uri;
        }

        public void b(int i2) {
            this.f20202c = i2;
        }

        public ContentInfoCompat d() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        public void setExtras(Bundle bundle) {
            this.f20204e = bundle;
        }
    }

    public interface Compat {
        ClipData a();

        int b();

        int c();

        ContentInfo d();
    }

    public static final class Compat31Impl implements Compat {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f20205a;

        public Compat31Impl(ContentInfo contentInfo) {
            this.f20205a = C0352a.a(Preconditions.f(contentInfo));
        }

        public ClipData a() {
            return this.f20205a.getClip();
        }

        public int b() {
            return this.f20205a.getSource();
        }

        public int c() {
            return this.f20205a.getFlags();
        }

        public ContentInfo d() {
            return this.f20205a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f20205a + "}";
        }
    }

    public static final class CompatImpl implements Compat {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f20206a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20207b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20208c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f20209d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f20210e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.f20206a = (ClipData) Preconditions.f(builderCompatImpl.f20200a);
            this.f20207b = Preconditions.b(builderCompatImpl.f20201b, 0, 5, "source");
            this.f20208c = Preconditions.e(builderCompatImpl.f20202c, 1);
            this.f20209d = builderCompatImpl.f20203d;
            this.f20210e = builderCompatImpl.f20204e;
        }

        public ClipData a() {
            return this.f20206a;
        }

        public int b() {
            return this.f20207b;
        }

        public int c() {
            return this.f20208c;
        }

        public ContentInfo d() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f20206a.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.e(this.f20207b));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.a(this.f20208c));
            String str2 = "";
            if (this.f20209d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f20209d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f20210e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.f20197a = compat;
    }

    public static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    public static String e(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static ContentInfoCompat g(ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    public ClipData b() {
        return this.f20197a.a();
    }

    public int c() {
        return this.f20197a.c();
    }

    public int d() {
        return this.f20197a.b();
    }

    public ContentInfo f() {
        ContentInfo d2 = this.f20197a.d();
        Objects.requireNonNull(d2);
        return C0352a.a(d2);
    }

    public String toString() {
        return this.f20197a.toString();
    }
}
