package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl extends LoaderManager {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f22092c = false;

    /* renamed from: a  reason: collision with root package name */
    public final LifecycleOwner f22093a;

    /* renamed from: b  reason: collision with root package name */
    public final LoaderViewModel f22094b;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f22095l;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f22096m;

        /* renamed from: n  reason: collision with root package name */
        public final Loader f22097n;

        /* renamed from: o  reason: collision with root package name */
        public LifecycleOwner f22098o;

        /* renamed from: p  reason: collision with root package name */
        public LoaderObserver f22099p;

        /* renamed from: q  reason: collision with root package name */
        public Loader f22100q;

        public void a(Loader loader, Object obj) {
            if (LoaderManagerImpl.f22092c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(obj);
                return;
            }
            if (LoaderManagerImpl.f22092c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(obj);
        }

        public void k() {
            if (LoaderManagerImpl.f22092c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f22097n.v();
        }

        public void l() {
            if (LoaderManagerImpl.f22092c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f22097n.w();
        }

        public void n(Observer observer) {
            super.n(observer);
            this.f22098o = null;
            this.f22099p = null;
        }

        public void o(Object obj) {
            super.o(obj);
            Loader loader = this.f22100q;
            if (loader != null) {
                loader.t();
                this.f22100q = null;
            }
        }

        public Loader p(boolean z2) {
            if (LoaderManagerImpl.f22092c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f22097n.b();
            this.f22097n.a();
            LoaderObserver loaderObserver = this.f22099p;
            if (loaderObserver != null) {
                n(loaderObserver);
                if (z2) {
                    loaderObserver.d();
                }
            }
            this.f22097n.y(this);
            if ((loaderObserver == null || loaderObserver.c()) && !z2) {
                return this.f22097n;
            }
            this.f22097n.t();
            return this.f22100q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f22095l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f22096m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f22097n);
            Loader loader = this.f22097n;
            loader.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f22099p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f22099p);
                LoaderObserver loaderObserver = this.f22099p;
                loaderObserver.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public Loader r() {
            return this.f22097n;
        }

        public void s() {
            LifecycleOwner lifecycleOwner = this.f22098o;
            LoaderObserver loaderObserver = this.f22099p;
            if (lifecycleOwner != null && loaderObserver != null) {
                super.n(loaderObserver);
                i(lifecycleOwner, loaderObserver);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f22095l);
            sb.append(" : ");
            DebugUtils.a(this.f22097n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class LoaderObserver<D> implements Observer<D> {

        /* renamed from: A  reason: collision with root package name */
        public final LoaderManager.LoaderCallbacks f22101A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f22102B;

        /* renamed from: z  reason: collision with root package name */
        public final Loader f22103z;

        public void a(Object obj) {
            if (LoaderManagerImpl.f22092c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f22103z + ": " + this.f22103z.d(obj));
            }
            this.f22101A.a(this.f22103z, obj);
            this.f22102B = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f22102B);
        }

        public boolean c() {
            return this.f22102B;
        }

        public void d() {
            if (this.f22102B) {
                if (LoaderManagerImpl.f22092c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f22103z);
                }
                this.f22101A.b(this.f22103z);
            }
        }

        public String toString() {
            return this.f22101A.toString();
        }
    }

    public static class LoaderViewModel extends ViewModel {

        /* renamed from: d  reason: collision with root package name */
        public static final ViewModelProvider.Factory f22104d = new ViewModelProvider.Factory() {
            public ViewModel b(Class cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public SparseArrayCompat f22105b = new SparseArrayCompat();

        /* renamed from: c  reason: collision with root package name */
        public boolean f22106c = false;

        public static LoaderViewModel h(ViewModelStore viewModelStore) {
            return (LoaderViewModel) new ViewModelProvider(viewModelStore, f22104d).a(LoaderViewModel.class);
        }

        public void f() {
            super.f();
            int o2 = this.f22105b.o();
            for (int i2 = 0; i2 < o2; i2++) {
                ((LoaderInfo) this.f22105b.p(i2)).p(true);
            }
            this.f22105b.c();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f22105b.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f22105b.o(); i2++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.f22105b.p(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f22105b.j(i2));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void i() {
            int o2 = this.f22105b.o();
            for (int i2 = 0; i2 < o2; i2++) {
                ((LoaderInfo) this.f22105b.p(i2)).s();
            }
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f22093a = lifecycleOwner;
        this.f22094b = LoaderViewModel.h(viewModelStore);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f22094b.g(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f22094b.i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.a(this.f22093a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
