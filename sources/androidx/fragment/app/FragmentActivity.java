package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    public final FragmentController V = FragmentController.b(new HostCallbacks());
    public final LifecycleRegistry W = new LifecycleRegistry(this);
    public boolean X;
    public boolean Y;
    public boolean Z = true;

    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        public void A() {
            B();
        }

        public void B() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        /* renamed from: C */
        public FragmentActivity r() {
            return FragmentActivity.this;
        }

        public Lifecycle a() {
            return FragmentActivity.this.W;
        }

        public void b(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.n0(fragment);
        }

        public OnBackPressedDispatcher c() {
            return FragmentActivity.this.c();
        }

        public void d(MenuProvider menuProvider) {
            FragmentActivity.this.d(menuProvider);
        }

        public View f(int i2) {
            return FragmentActivity.this.findViewById(i2);
        }

        public void g(Consumer consumer) {
            FragmentActivity.this.g(consumer);
        }

        public boolean h() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void j(Consumer consumer) {
            FragmentActivity.this.j(consumer);
        }

        public void k(Consumer consumer) {
            FragmentActivity.this.k(consumer);
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public void o(Consumer consumer) {
            FragmentActivity.this.o(consumer);
        }

        public ActivityResultRegistry p() {
            return FragmentActivity.this.p();
        }

        public void q(Consumer consumer) {
            FragmentActivity.this.q(consumer);
        }

        public ViewModelStore s() {
            return FragmentActivity.this.s();
        }

        public LayoutInflater t() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public void u(Consumer consumer) {
            FragmentActivity.this.u(consumer);
        }

        public SavedStateRegistry v() {
            return FragmentActivity.this.v();
        }

        public void x(Consumer consumer) {
            FragmentActivity.this.x(consumer);
        }

        public void y(MenuProvider menuProvider) {
            FragmentActivity.this.y(menuProvider);
        }

        public void z(Consumer consumer) {
            FragmentActivity.this.z(consumer);
        }
    }

    public FragmentActivity() {
        g0();
    }

    public static boolean m0(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z2 = false;
        for (Fragment fragment : fragmentManager.z0()) {
            if (fragment != null) {
                if (fragment.D() != null) {
                    z2 |= m0(fragment.t(), state);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.s0;
                if (fragmentViewLifecycleOwner != null && fragmentViewLifecycleOwner.a().b().f(Lifecycle.State.STARTED)) {
                    fragment.s0.h(state);
                    z2 = true;
                }
                if (fragment.r0.b().f(Lifecycle.State.STARTED)) {
                    fragment.r0.n(state);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void b(int i2) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (A(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.X);
            printWriter.print(" mResumed=");
            printWriter.print(this.Y);
            printWriter.print(" mStopped=");
            printWriter.print(this.Z);
            if (getApplication() != null) {
                LoaderManager.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.V.l().Z(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final View e0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.V.n(view, str, context, attributeSet);
    }

    public FragmentManager f0() {
        return this.V.l();
    }

    public final void g0() {
        v().c("android:support:lifecycle", new a(this));
        g(new b(this));
        T(new c(this));
        S(new d(this));
    }

    public final /* synthetic */ Bundle h0() {
        l0();
        this.W.i(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    public final /* synthetic */ void i0(Configuration configuration) {
        this.V.m();
    }

    public final /* synthetic */ void j0(Intent intent) {
        this.V.m();
    }

    public final /* synthetic */ void k0(Context context) {
        this.V.a((Fragment) null);
    }

    public void l0() {
        do {
        } while (m0(f0(), Lifecycle.State.CREATED));
    }

    public void n0(Fragment fragment) {
    }

    public void o0() {
        this.W.i(Lifecycle.Event.ON_RESUME);
        this.V.h();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.V.m();
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.W.i(Lifecycle.Event.ON_CREATE);
        this.V.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View e0 = e0(view, str, context, attributeSet);
        return e0 == null ? super.onCreateView(view, str, context, attributeSet) : e0;
    }

    public void onDestroy() {
        super.onDestroy();
        this.V.f();
        this.W.i(Lifecycle.Event.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return this.V.d(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.Y = false;
        this.V.g();
        this.W.i(Lifecycle.Event.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        o0();
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.V.m();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        this.V.m();
        super.onResume();
        this.Y = true;
        this.V.k();
    }

    public void onStart() {
        this.V.m();
        super.onStart();
        this.Z = false;
        if (!this.X) {
            this.X = true;
            this.V.c();
        }
        this.V.k();
        this.W.i(Lifecycle.Event.ON_START);
        this.V.i();
    }

    public void onStateNotSaved() {
        this.V.m();
    }

    public void onStop() {
        super.onStop();
        this.Z = true;
        l0();
        this.V.j();
        this.W.i(Lifecycle.Event.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View e0 = e0((View) null, str, context, attributeSet);
        return e0 == null ? super.onCreateView(str, context, attributeSet) : e0;
    }
}
