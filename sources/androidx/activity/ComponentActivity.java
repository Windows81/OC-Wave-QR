package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import com.lokalise.sdk.api.Params;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {
    public static final Companion U = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public final ContextAwareHelper f42B = new ContextAwareHelper();
    public final MenuHostHelper C = new MenuHostHelper(new a(this));
    public final SavedStateRegistryController D;
    public ViewModelStore E;
    public final ReportFullyDrawnExecutor F;
    public final Lazy G;
    public int H;
    public final AtomicInteger I;
    public final ActivityResultRegistry J;
    public final CopyOnWriteArrayList K;
    public final CopyOnWriteArrayList L;
    public final CopyOnWriteArrayList M;
    public final CopyOnWriteArrayList N;
    public final CopyOnWriteArrayList O;
    public final CopyOnWriteArrayList P;
    public boolean Q;
    public boolean R;
    public final Lazy S;
    public final Lazy T;

    @Metadata
    public static final class Api33Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api33Impl f44a = new Api33Impl();

        public final OnBackInvokedDispatcher a(Activity activity) {
            Intrinsics.i(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.h(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class NonConfigurationInstances {

        /* renamed from: a  reason: collision with root package name */
        public Object f45a;

        /* renamed from: b  reason: collision with root package name */
        public ViewModelStore f46b;

        public final ViewModelStore a() {
            return this.f46b;
        }

        public final void b(Object obj) {
            this.f45a = obj;
        }

        public final void c(ViewModelStore viewModelStore) {
            this.f46b = viewModelStore;
        }
    }

    @Metadata
    public interface ReportFullyDrawnExecutor extends Executor {
        void A();

        void f0(View view);
    }

    @Metadata
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: A  reason: collision with root package name */
        public Runnable f47A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f48B;

        /* renamed from: z  reason: collision with root package name */
        public final long f49z = (SystemClock.uptimeMillis() + ((long) Params.Timeout.CONNECT_LONG));

        public ReportFullyDrawnExecutorImpl() {
        }

        public static final void b(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            Runnable runnable = reportFullyDrawnExecutorImpl.f47A;
            if (runnable != null) {
                Intrinsics.f(runnable);
                runnable.run();
                reportFullyDrawnExecutorImpl.f47A = null;
            }
        }

        public void A() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void execute(Runnable runnable) {
            Intrinsics.i(runnable, "runnable");
            this.f47A = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.h(decorView, "window.decorView");
            if (!this.f48B) {
                decorView.postOnAnimation(new g(this));
            } else if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void f0(View view) {
            Intrinsics.i(view, "view");
            if (!this.f48B) {
                this.f48B = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void onDraw() {
            Runnable runnable = this.f47A;
            if (runnable != null) {
                runnable.run();
                this.f47A = null;
                if (ComponentActivity.this.f().e()) {
                    this.f48B = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f49z) {
                this.f48B = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        SavedStateRegistryController b2 = SavedStateRegistryController.f22826c.b(this);
        this.D = b2;
        this.F = U();
        this.G = LazyKt.b(new ComponentActivity$fullyDrawnReporter$2(this));
        this.I = new AtomicInteger();
        this.J = new ComponentActivity$activityResultRegistry$1(this);
        this.K = new CopyOnWriteArrayList();
        this.L = new CopyOnWriteArrayList();
        this.M = new CopyOnWriteArrayList();
        this.N = new CopyOnWriteArrayList();
        this.O = new CopyOnWriteArrayList();
        this.P = new CopyOnWriteArrayList();
        if (a() != null) {
            a().a(new b(this));
            a().a(new c(this));
            a().a(new LifecycleEventObserver(this) {

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ ComponentActivity f43z;

                {
                    this.f43z = r1;
                }

                public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Intrinsics.i(lifecycleOwner, "source");
                    Intrinsics.i(event, "event");
                    this.f43z.V();
                    this.f43z.a().d(this);
                }
            });
            b2.c();
            SavedStateHandleSupport.c(this);
            v().c("android:support:activity-result", new d(this));
            S(new e(this));
            this.S = LazyKt.b(new ComponentActivity$defaultViewModelProviderFactory$2(this));
            this.T = LazyKt.b(new ComponentActivity$onBackPressedDispatcher$2(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static final void I(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        Intrinsics.i(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    public static final void J(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.f42B.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.s().a();
            }
            componentActivity.F.A();
        }
    }

    public static final Bundle K(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.J.k(bundle);
        return bundle;
    }

    public static final void L(ComponentActivity componentActivity, Context context) {
        Intrinsics.i(context, "it");
        Bundle a2 = componentActivity.v().a("android:support:activity-result");
        if (a2 != null) {
            componentActivity.J.j(a2);
        }
    }

    public static final void R(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.o(Api33Impl.f44a.a(componentActivity));
        }
    }

    public static final void Y(ComponentActivity componentActivity) {
        componentActivity.X();
    }

    public final void Q(OnBackPressedDispatcher onBackPressedDispatcher) {
        a().a(new f(onBackPressedDispatcher, this));
    }

    public final void S(OnContextAvailableListener onContextAvailableListener) {
        Intrinsics.i(onContextAvailableListener, "listener");
        this.f42B.a(onContextAvailableListener);
    }

    public final void T(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.M.add(consumer);
    }

    public final ReportFullyDrawnExecutor U() {
        return new ReportFullyDrawnExecutorImpl();
    }

    public final void V() {
        if (this.E == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.E = nonConfigurationInstances.a();
            }
            if (this.E == null) {
                this.E = new ViewModelStore();
            }
        }
    }

    public void W() {
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.h(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.h(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.h(decorView4, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.h(decorView5, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.b(decorView5, this);
    }

    public void X() {
        invalidateOptionsMenu();
    }

    public Object Z() {
        return null;
    }

    public Lifecycle a() {
        return super.a();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.F;
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        reportFullyDrawnExecutor.f0(decorView);
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher c() {
        return (OnBackPressedDispatcher) this.T.getValue();
    }

    public void d(MenuProvider menuProvider) {
        Intrinsics.i(menuProvider, "provider");
        this.C.f(menuProvider);
    }

    public FullyDrawnReporter f() {
        return (FullyDrawnReporter) this.G.getValue();
    }

    public final void g(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.K.add(consumer);
    }

    public final void j(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.O.remove(consumer);
    }

    public final void k(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.L.remove(consumer);
    }

    public final void l(OnContextAvailableListener onContextAvailableListener) {
        Intrinsics.i(onContextAvailableListener, "listener");
        this.f42B.d(onContextAvailableListener);
    }

    public ViewModelProvider.Factory m() {
        return (ViewModelProvider.Factory) this.S.getValue();
    }

    public CreationExtras n() {
        Bundle bundle = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras((CreationExtras) null, 1, (DefaultConstructorMarker) null);
        if (getApplication() != null) {
            CreationExtras.Key key = ViewModelProvider.AndroidViewModelFactory.f21999h;
            Application application = getApplication();
            Intrinsics.h(application, "application");
            mutableCreationExtras.c(key, application);
        }
        mutableCreationExtras.c(SavedStateHandleSupport.f21969a, this);
        mutableCreationExtras.c(SavedStateHandleSupport.f21970b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            mutableCreationExtras.c(SavedStateHandleSupport.f21971c, bundle);
        }
        return mutableCreationExtras;
    }

    public final void o(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.O.add(consumer);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.J.e(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        c().l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.i(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.D.d(bundle);
        this.f42B.c(this);
        super.onCreate(bundle);
        ReportFragment.f21958A.c(this);
        int i2 = this.H;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        Intrinsics.i(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.C.b(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intrinsics.i(menuItem, "item");
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.C.d(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z2) {
        if (!this.Q) {
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(new MultiWindowModeChangedInfo(z2));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        Intrinsics.i(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        Intrinsics.i(menu, "menu");
        this.C.c(menu);
        super.onPanelClosed(i2, menu);
    }

    public void onPictureInPictureModeChanged(boolean z2) {
        if (!this.R) {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(new PictureInPictureModeChangedInfo(z2));
            }
        }
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        Intrinsics.i(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.C.e(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        Intrinsics.i(strArr, "permissions");
        Intrinsics.i(iArr, "grantResults");
        if (!this.J.e(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object Z = Z();
        ViewModelStore viewModelStore = this.E;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.a();
        }
        if (viewModelStore == null && Z == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.b(Z);
        nonConfigurationInstances2.c(viewModelStore);
        return nonConfigurationInstances2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.i(bundle, "outState");
        if (a() instanceof LifecycleRegistry) {
            Lifecycle a2 = a();
            Intrinsics.g(a2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) a2).n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.D.e(bundle);
    }

    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Integer.valueOf(i2));
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final ActivityResultRegistry p() {
        return this.J;
    }

    public final void q(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.N.add(consumer);
    }

    public void reportFullyDrawn() {
        try {
            if (Trace.d()) {
                Trace.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            f().d();
            Trace.b();
        } catch (Throwable th) {
            Trace.b();
            throw th;
        }
    }

    public ViewModelStore s() {
        if (getApplication() != null) {
            V();
            ViewModelStore viewModelStore = this.E;
            Intrinsics.f(viewModelStore);
            return viewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void setContentView(int i2) {
        W();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.F;
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        reportFullyDrawnExecutor.f0(decorView);
        super.setContentView(i2);
    }

    public void startActivityForResult(Intent intent, int i2) {
        Intrinsics.i(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        Intrinsics.i(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public final void u(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.K.remove(consumer);
    }

    public final SavedStateRegistry v() {
        return this.D.b();
    }

    public final void x(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.L.add(consumer);
    }

    public void y(MenuProvider menuProvider) {
        Intrinsics.i(menuProvider, "provider");
        this.C.a(menuProvider);
    }

    public final void z(Consumer consumer) {
        Intrinsics.i(consumer, "listener");
        this.N.remove(consumer);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        Intrinsics.i(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Intrinsics.i(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        Intrinsics.i(configuration, "newConfig");
        this.Q = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.Q = false;
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(new MultiWindowModeChangedInfo(z2, configuration));
            }
        } catch (Throwable th) {
            this.Q = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        Intrinsics.i(configuration, "newConfig");
        this.R = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.R = false;
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(new PictureInPictureModeChangedInfo(z2, configuration));
            }
        } catch (Throwable th) {
            this.R = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        W();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.F;
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        reportFullyDrawnExecutor.f0(decorView);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.F;
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        reportFullyDrawnExecutor.f0(decorView);
        super.setContentView(view, layoutParams);
    }
}
