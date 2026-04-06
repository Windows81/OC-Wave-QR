package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f22121a;

    /* renamed from: b  reason: collision with root package name */
    public OnLoadCompleteListener f22122b;

    /* renamed from: c  reason: collision with root package name */
    public OnLoadCanceledListener f22123c;

    /* renamed from: d  reason: collision with root package name */
    public Context f22124d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22125e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22126f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22127g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22128h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22129i;

    public final class ForceLoadContentObserver extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Loader f22130a;

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z2) {
            this.f22130a.o();
        }
    }

    public interface OnLoadCanceledListener<D> {
        void a(Loader loader);
    }

    public interface OnLoadCompleteListener<D> {
        void a(Loader loader, Object obj);
    }

    public void a() {
        this.f22126f = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f22129i = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
        OnLoadCanceledListener onLoadCanceledListener = this.f22123c;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.a(this);
        }
    }

    public void f(Object obj) {
        OnLoadCompleteListener onLoadCompleteListener = this.f22122b;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f22121a);
        printWriter.print(" mListener=");
        printWriter.println(this.f22122b);
        if (this.f22125e || this.f22128h || this.f22129i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f22125e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f22128h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f22129i);
        }
        if (this.f22126f || this.f22127g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f22126f);
            printWriter.print(" mReset=");
            printWriter.println(this.f22127g);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f22124d;
    }

    public boolean j() {
        return this.f22126f;
    }

    public boolean k() {
        return this.f22127g;
    }

    public boolean l() {
        return this.f22125e;
    }

    public void m() {
    }

    public boolean n() {
        return false;
    }

    public void o() {
        if (this.f22125e) {
            h();
        } else {
            this.f22128h = true;
        }
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
        q();
        this.f22127g = true;
        this.f22125e = false;
        this.f22126f = false;
        this.f22128h = false;
        this.f22129i = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.a(this, sb);
        sb.append(" id=");
        sb.append(this.f22121a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        if (this.f22129i) {
            o();
        }
    }

    public final void v() {
        this.f22125e = true;
        this.f22127g = false;
        this.f22126f = false;
        r();
    }

    public void w() {
        this.f22125e = false;
        s();
    }

    public boolean x() {
        boolean z2 = this.f22128h;
        this.f22128h = false;
        this.f22129i |= z2;
        return z2;
    }

    public void y(OnLoadCompleteListener onLoadCompleteListener) {
        OnLoadCompleteListener onLoadCompleteListener2 = this.f22122b;
        if (onLoadCompleteListener2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (onLoadCompleteListener2 == onLoadCompleteListener) {
            this.f22122b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
