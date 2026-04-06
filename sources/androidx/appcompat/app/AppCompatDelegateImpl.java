package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public static final SimpleArrayMap I0 = new SimpleArrayMap();
    public static final boolean J0 = false;
    public static final int[] K0 = {16842836};
    public static final boolean L0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean M0 = true;
    public final Runnable A0;
    public boolean B0;
    public Rect C0;
    public Rect D0;
    public AppCompatViewInflater E0;
    public LayoutIncludeDetector F0;
    public OnBackInvokedDispatcher G0;
    public OnBackInvokedCallback H0;
    public final Object I;
    public final Context J;
    public Window K;
    public AppCompatWindowCallback L;
    public final AppCompatCallback M;
    public ActionBar N;
    public MenuInflater O;
    public CharSequence P;
    public DecorContentParent Q;
    public ActionMenuPresenterCallback R;
    public PanelMenuPresenterCallback S;
    public ActionMode T;
    public ActionBarContextView U;
    public PopupWindow V;
    public Runnable W;
    public ViewPropertyAnimatorCompat X;
    public boolean Y;
    public boolean Z;
    public ViewGroup a0;
    public TextView b0;
    public View c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public PanelFeatureState[] l0;
    public PanelFeatureState m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public Configuration r0;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public AutoNightModeManager w0;
    public AutoNightModeManager x0;
    public boolean y0;
    public int z0;

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1  reason: invalid class name */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f574a;

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f574a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f574a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4  reason: invalid class name */
    public class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatDelegateImpl f577a;

        public void a(Rect rect) {
            rect.top = this.f577a.c1((WindowInsetsCompat) null, rect);
        }
    }

    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatDelegateImpl f582a;

        public void a(int i2) {
            ActionBar r2 = this.f582a.r();
            if (r2 != null) {
                r2.s(i2);
            }
        }
    }

    public interface ActionBarMenuCallback {
        boolean a(int i2);

        View onCreatePanelView(int i2);
    }

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        public void c(MenuBuilder menuBuilder, boolean z2) {
            AppCompatDelegateImpl.this.W(menuBuilder);
        }

        public boolean d(MenuBuilder menuBuilder) {
            Window.Callback s0 = AppCompatDelegateImpl.this.s0();
            if (s0 == null) {
                return true;
            }
            s0.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public ActionMode.Callback f584a;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f584a = callback;
        }

        public void a(ActionMode actionMode) {
            this.f584a.a(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.V != null) {
                appCompatDelegateImpl.K.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.W);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.U != null) {
                appCompatDelegateImpl2.g0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.X = ViewCompat.c(appCompatDelegateImpl3.U).b(0.0f);
                AppCompatDelegateImpl.this.X.h(new ViewPropertyAnimatorListenerAdapter() {
                    public void b(View view) {
                        AppCompatDelegateImpl.this.U.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl.V;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl.U.getParent() instanceof View) {
                            ViewCompat.R((View) AppCompatDelegateImpl.this.U.getParent());
                        }
                        AppCompatDelegateImpl.this.U.l();
                        AppCompatDelegateImpl.this.X.h((ViewPropertyAnimatorListener) null);
                        AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl2.X = null;
                        ViewCompat.R(appCompatDelegateImpl2.a0);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.M;
            if (appCompatCallback != null) {
                appCompatCallback.i(appCompatDelegateImpl4.T);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.T = null;
            ViewCompat.R(appCompatDelegateImpl5.a0);
            AppCompatDelegateImpl.this.a1();
        }

        public boolean b(ActionMode actionMode, Menu menu) {
            return this.f584a.b(actionMode, menu);
        }

        public boolean c(ActionMode actionMode, Menu menu) {
            ViewCompat.R(AppCompatDelegateImpl.this.a0);
            return this.f584a.c(actionMode, menu);
        }

        public boolean d(ActionMode actionMode, MenuItem menuItem) {
            return this.f584a.d(actionMode, menuItem);
        }
    }

    public static class Api17Impl {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }

        public static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    public static class Api21Impl {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class Api24Impl {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static LocaleListCompat b(Configuration configuration) {
            return LocaleListCompat.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.h()));
        }

        public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.h()));
        }
    }

    public static class Api26Impl {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    public static class Api33Impl {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            g gVar = new g(appCompatDelegateImpl);
            c.a(obj).registerOnBackInvokedCallback(1000000, gVar);
            return gVar;
        }

        public static void c(Object obj, Object obj2) {
            c.a(obj).unregisterOnBackInvokedCallback(b.a(obj2));
        }
    }

    public class AppCompatWindowCallback extends WindowCallbackWrapper {

        /* renamed from: A  reason: collision with root package name */
        public ActionBarMenuCallback f587A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f588B;
        public boolean C;
        public boolean D;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.C = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.C = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.C = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback) {
            try {
                this.f588B = true;
                callback.onContentChanged();
                this.f588B = false;
            } catch (Throwable th) {
                this.f588B = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void d(Window.Callback callback, int i2, Menu menu) {
            try {
                this.D = true;
                callback.onPanelClosed(i2, menu);
                this.D = false;
            } catch (Throwable th) {
                this.D = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.C ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        public final android.view.ActionMode e(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.J, callback);
            androidx.appcompat.view.ActionMode U0 = AppCompatDelegateImpl.this.U0(callbackWrapper);
            if (U0 != null) {
                return callbackWrapper.e(U0);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f588B) {
                a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r0 = r1.f587A
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl.this.G0(i2);
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            if (this.D) {
                a().onPanelClosed(i2, menu);
                return;
            }
            super.onPanelClosed(i2, menu);
            AppCompatDelegateImpl.this.H0(i2);
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            boolean z2 = true;
            if (menuBuilder != null) {
                menuBuilder.a0(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.f587A;
            if (actionBarMenuCallback == null || !actionBarMenuCallback.a(i2)) {
                z2 = false;
            }
            if (!z2) {
                z2 = super.onPreparePanel(i2, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.a0(false);
            }
            return z2;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
            MenuBuilder menuBuilder;
            PanelFeatureState q0 = AppCompatDelegateImpl.this.q0(0, true);
            if (q0 == null || (menuBuilder = q0.f605j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i2);
            }
        }

        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (!AppCompatDelegateImpl.this.y0() || i2 != 0) {
                return super.onWindowStartingActionMode(callback, i2);
            }
            return e(callback);
        }
    }

    public class AutoBatteryNightModeManager extends AutoNightModeManager {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f589c;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.f589c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return Api21Impl.a(this.f589c) ? 2 : 1;
        }

        public void d() {
            AppCompatDelegateImpl.this.Q();
        }
    }

    public abstract class AutoNightModeManager {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f591a;

        public AutoNightModeManager() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f591a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.J.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f591a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f591a == null) {
                    this.f591a = new BroadcastReceiver() {
                        public void onReceive(Context context, Intent intent) {
                            AutoNightModeManager.this.d();
                        }
                    };
                }
                AppCompatDelegateImpl.this.J.registerReceiver(this.f591a, b2);
            }
        }
    }

    public class AutoTimeNightModeManager extends AutoNightModeManager {

        /* renamed from: c  reason: collision with root package name */
        public final TwilightManager f594c;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.f594c = twilightManager;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f594c.d() ? 2 : 1;
        }

        public void d() {
            AppCompatDelegateImpl.this.Q();
        }
    }

    public static class ContextThemeWrapperCompatApi17Impl {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        public final boolean b(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.Y(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.b(getContext(), i2));
        }
    }

    public static final class PanelFeatureState {

        /* renamed from: a  reason: collision with root package name */
        public int f596a;

        /* renamed from: b  reason: collision with root package name */
        public int f597b;

        /* renamed from: c  reason: collision with root package name */
        public int f598c;

        /* renamed from: d  reason: collision with root package name */
        public int f599d;

        /* renamed from: e  reason: collision with root package name */
        public int f600e;

        /* renamed from: f  reason: collision with root package name */
        public int f601f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f602g;

        /* renamed from: h  reason: collision with root package name */
        public View f603h;

        /* renamed from: i  reason: collision with root package name */
        public View f604i;

        /* renamed from: j  reason: collision with root package name */
        public MenuBuilder f605j;

        /* renamed from: k  reason: collision with root package name */
        public ListMenuPresenter f606k;

        /* renamed from: l  reason: collision with root package name */
        public Context f607l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f608m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f609n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f610o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f611p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f612q = false;

        /* renamed from: r  reason: collision with root package name */
        public boolean f613r;

        /* renamed from: s  reason: collision with root package name */
        public Bundle f614s;

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }
            };

            /* renamed from: A  reason: collision with root package name */
            public boolean f615A;

            /* renamed from: B  reason: collision with root package name */
            public Bundle f616B;

            /* renamed from: z  reason: collision with root package name */
            public int f617z;

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f617z = parcel.readInt();
                boolean z2 = true;
                if (parcel.readInt() != 1) {
                    z2 = false;
                }
                savedState.f615A = z2;
                if (z2) {
                    savedState.f616B = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f617z);
                parcel.writeInt(this.f615A ? 1 : 0);
                if (this.f615A) {
                    parcel.writeBundle(this.f616B);
                }
            }
        }

        public PanelFeatureState(int i2) {
            this.f596a = i2;
        }

        public MenuView a(MenuPresenter.Callback callback) {
            if (this.f605j == null) {
                return null;
            }
            if (this.f606k == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.f607l, R.layout.f412l);
                this.f606k = listMenuPresenter;
                listMenuPresenter.h(callback);
                this.f605j.b(this.f606k);
            }
            return this.f606k.b(this.f602g);
        }

        public boolean b() {
            if (this.f603h == null) {
                return false;
            }
            if (this.f604i != null) {
                return true;
            }
            return this.f606k.a().getCount() > 0;
        }

        public void c(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.f605j;
            if (menuBuilder != menuBuilder2) {
                if (menuBuilder2 != null) {
                    menuBuilder2.O(this.f606k);
                }
                this.f605j = menuBuilder;
                if (menuBuilder != null && (listMenuPresenter = this.f606k) != null) {
                    menuBuilder.b(listMenuPresenter);
                }
            }
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.f295a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(R.attr.H, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            } else {
                newTheme.applyStyle(R.style.f442b, true);
            }
            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.f607l = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.A0);
            this.f597b = obtainStyledAttributes.getResourceId(R.styleable.D0, 0);
            this.f601f = obtainStyledAttributes.getResourceId(R.styleable.C0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        public void c(MenuBuilder menuBuilder, boolean z2) {
            MenuBuilder D = menuBuilder.D();
            boolean z3 = D != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z3) {
                menuBuilder = D;
            }
            PanelFeatureState j0 = appCompatDelegateImpl.j0(menuBuilder);
            if (j0 == null) {
                return;
            }
            if (z3) {
                AppCompatDelegateImpl.this.V(j0.f596a, j0, D);
                AppCompatDelegateImpl.this.Z(j0, true);
                return;
            }
            AppCompatDelegateImpl.this.Z(j0, z2);
        }

        public boolean d(MenuBuilder menuBuilder) {
            Window.Callback s0;
            if (menuBuilder != menuBuilder.D()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f0 || (s0 = appCompatDelegateImpl.s0()) == null || AppCompatDelegateImpl.this.q0) {
                return true;
            }
            s0.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, (Window) null, appCompatCallback, activity);
    }

    public static Configuration k0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            Api24Impl.a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            Api26Impl.a(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            Api17Impl.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    public void A() {
        ActionBar r2 = r();
        if (r2 != null) {
            r2.t(true);
        }
    }

    public boolean A0() {
        boolean z2 = this.n0;
        this.n0 = false;
        PanelFeatureState q02 = q0(0, false);
        if (q02 == null || !q02.f610o) {
            androidx.appcompat.view.ActionMode actionMode = this.T;
            if (actionMode != null) {
                actionMode.c();
                return true;
            }
            ActionBar r2 = r();
            return r2 != null && r2.h();
        }
        if (!z2) {
            Z(q02, true);
        }
        return true;
    }

    public void B(Bundle bundle) {
    }

    public boolean B0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.n0 = z2;
        } else if (i2 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void C() {
        P(true, false);
    }

    public final boolean C0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState q02 = q0(i2, true);
        if (!q02.f610o) {
            return M0(q02, keyEvent);
        }
        return false;
    }

    public void D() {
        ActionBar r2 = r();
        if (r2 != null) {
            r2.t(false);
        }
    }

    public boolean D0(int i2, KeyEvent keyEvent) {
        ActionBar r2 = r();
        if (r2 != null && r2.o(i2, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.m0;
        if (panelFeatureState == null || !L0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.m0 == null) {
                PanelFeatureState q02 = q0(0, true);
                M0(q02, keyEvent);
                boolean L02 = L0(q02, keyEvent.getKeyCode(), keyEvent, 1);
                q02.f608m = false;
                if (L02) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.m0;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f609n = true;
        }
        return true;
    }

    public boolean E0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.ActionMode r0 = r4.T
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.q0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.DecorContentParent r5 = r4.Q
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.J
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.DecorContentParent r5 = r4.Q
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.q0
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.M0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.DecorContentParent r5 = r4.Q
            boolean r0 = r5.h()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.DecorContentParent r5 = r4.Q
            boolean r0 = r5.g()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f610o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f609n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f608m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f613r
            if (r5 == 0) goto L_0x005b
            r2.f608m = r1
            boolean r5 = r4.M0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.J0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.Z(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.J
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.F0(int, android.view.KeyEvent):boolean");
    }

    public boolean G(int i2) {
        int O0 = O0(i2);
        if (this.j0 && O0 == 108) {
            return false;
        }
        if (this.f0 && O0 == 1) {
            this.f0 = false;
        }
        if (O0 == 1) {
            W0();
            this.j0 = true;
            return true;
        } else if (O0 == 2) {
            W0();
            this.d0 = true;
            return true;
        } else if (O0 == 5) {
            W0();
            this.e0 = true;
            return true;
        } else if (O0 == 10) {
            W0();
            this.h0 = true;
            return true;
        } else if (O0 == 108) {
            W0();
            this.f0 = true;
            return true;
        } else if (O0 != 109) {
            return this.K.requestFeature(O0);
        } else {
            W0();
            this.g0 = true;
            return true;
        }
    }

    public void G0(int i2) {
        ActionBar r2;
        if (i2 == 108 && (r2 = r()) != null) {
            r2.i(true);
        }
    }

    public void H(int i2) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.a0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.J).inflate(i2, viewGroup);
        this.L.c(this.K.getCallback());
    }

    public void H0(int i2) {
        if (i2 == 108) {
            ActionBar r2 = r();
            if (r2 != null) {
                r2.i(false);
            }
        } else if (i2 == 0) {
            PanelFeatureState q02 = q0(i2, true);
            if (q02.f610o) {
                Z(q02, false);
            }
        }
    }

    public void I(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.a0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.L.c(this.K.getCallback());
    }

    public void I0(ViewGroup viewGroup) {
    }

    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.a0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.L.c(this.K.getCallback());
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J0(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12.f610o
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r11.q0
            if (r0 == 0) goto L_0x000a
            goto L_0x00f3
        L_0x000a:
            int r0 = r12.f596a
            if (r0 != 0) goto L_0x0020
            android.content.Context r0 = r11.J
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L_0x0020
            return
        L_0x0020:
            android.view.Window$Callback r0 = r11.s0()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            int r2 = r12.f596a
            androidx.appcompat.view.menu.MenuBuilder r3 = r12.f605j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L_0x0035
            r11.Z(r12, r1)
            return
        L_0x0035:
            android.content.Context r0 = r11.J
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r13 = r11.M0(r12, r13)
            if (r13 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.ViewGroup r13 = r12.f602g
            r2 = -2
            if (r13 == 0) goto L_0x0064
            boolean r3 = r12.f612q
            if (r3 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            android.view.View r13 = r12.f604i
            if (r13 == 0) goto L_0x00c6
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00c6
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x0064:
            if (r13 != 0) goto L_0x0071
            boolean r13 = r11.v0(r12)
            if (r13 == 0) goto L_0x0070
            android.view.ViewGroup r13 = r12.f602g
            if (r13 != 0) goto L_0x0080
        L_0x0070:
            return
        L_0x0071:
            boolean r3 = r12.f612q
            if (r3 == 0) goto L_0x0080
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L_0x0080
            android.view.ViewGroup r13 = r12.f602g
            r13.removeAllViews()
        L_0x0080:
            boolean r13 = r11.u0(r12)
            if (r13 == 0) goto L_0x00f1
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x008d
            goto L_0x00f1
        L_0x008d:
            android.view.View r13 = r12.f603h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        L_0x009a:
            int r3 = r12.f597b
            android.view.ViewGroup r4 = r12.f602g
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.f603h
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.f603h
            r3.removeView(r4)
        L_0x00b2:
            android.view.ViewGroup r3 = r12.f602g
            android.view.View r4 = r12.f603h
            r3.addView(r4, r13)
            android.view.View r13 = r12.f603h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto L_0x00c6
            android.view.View r13 = r12.f603h
            r13.requestFocus()
        L_0x00c6:
            r4 = r2
        L_0x00c7:
            r13 = 0
            r12.f609n = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            int r6 = r12.f599d
            int r7 = r12.f600e
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r5 = -2
            r8 = 1002(0x3ea, float:1.404E-42)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.f598c
            r13.gravity = r2
            int r2 = r12.f601f
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.f602g
            r0.addView(r2, r13)
            r12.f610o = r1
            int r12 = r12.f596a
            if (r12 != 0) goto L_0x00f0
            r11.a1()
        L_0x00f0:
            return
        L_0x00f1:
            r12.f612q = r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.J0(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.G0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.H0) == null)) {
            Api33Impl.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.H0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.I;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.G0 = Api33Impl.a((Activity) this.I);
                a1();
            }
        }
        this.G0 = onBackInvokedDispatcher;
        a1();
    }

    public final ActionBar K0() {
        return this.N;
    }

    public void L(int i2) {
        this.t0 = i2;
    }

    public final boolean L0(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        MenuBuilder menuBuilder;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f608m || M0(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f605j) != null) {
            z2 = menuBuilder.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.Q == null) {
            Z(panelFeatureState, true);
        }
        return z2;
    }

    public final void M(CharSequence charSequence) {
        this.P = charSequence;
        DecorContentParent decorContentParent = this.Q;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (K0() != null) {
            K0().u(charSequence);
        } else {
            TextView textView = this.b0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean M0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.q0) {
            return false;
        }
        if (panelFeatureState.f608m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.m0;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            Z(panelFeatureState2, false);
        }
        Window.Callback s02 = s0();
        if (s02 != null) {
            panelFeatureState.f604i = s02.onCreatePanelView(panelFeatureState.f596a);
        }
        int i2 = panelFeatureState.f596a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (decorContentParent3 = this.Q) != null) {
            decorContentParent3.c();
        }
        if (panelFeatureState.f604i == null && (!z2 || !(K0() instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.f605j;
            if (menuBuilder == null || panelFeatureState.f613r) {
                if (menuBuilder == null && (!w0(panelFeatureState) || panelFeatureState.f605j == null)) {
                    return false;
                }
                if (z2 && this.Q != null) {
                    if (this.R == null) {
                        this.R = new ActionMenuPresenterCallback();
                    }
                    this.Q.a(panelFeatureState.f605j, this.R);
                }
                panelFeatureState.f605j.d0();
                if (!s02.onCreatePanelMenu(panelFeatureState.f596a, panelFeatureState.f605j)) {
                    panelFeatureState.c((MenuBuilder) null);
                    if (z2 && (decorContentParent2 = this.Q) != null) {
                        decorContentParent2.a((Menu) null, this.R);
                    }
                    return false;
                }
                panelFeatureState.f613r = false;
            }
            panelFeatureState.f605j.d0();
            Bundle bundle = panelFeatureState.f614s;
            if (bundle != null) {
                panelFeatureState.f605j.P(bundle);
                panelFeatureState.f614s = null;
            }
            if (!s02.onPreparePanel(0, panelFeatureState.f604i, panelFeatureState.f605j)) {
                if (z2 && (decorContentParent = this.Q) != null) {
                    decorContentParent.a((Menu) null, this.R);
                }
                panelFeatureState.f605j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f611p = z3;
            panelFeatureState.f605j.setQwertyMode(z3);
            panelFeatureState.f605j.c0();
        }
        panelFeatureState.f608m = true;
        panelFeatureState.f609n = false;
        this.m0 = panelFeatureState;
        return true;
    }

    public final void N0(boolean z2) {
        DecorContentParent decorContentParent = this.Q;
        if (decorContentParent == null || !decorContentParent.d() || (ViewConfiguration.get(this.J).hasPermanentMenuKey() && !this.Q.e())) {
            PanelFeatureState q02 = q0(0, true);
            q02.f612q = true;
            Z(q02, false);
            J0(q02, (KeyEvent) null);
            return;
        }
        Window.Callback s02 = s0();
        if (this.Q.b() && z2) {
            this.Q.g();
            if (!this.q0) {
                s02.onPanelClosed(108, q0(0, true).f605j);
            }
        } else if (s02 != null && !this.q0) {
            if (this.y0 && (this.z0 & 1) != 0) {
                this.K.getDecorView().removeCallbacks(this.A0);
                this.A0.run();
            }
            PanelFeatureState q03 = q0(0, true);
            MenuBuilder menuBuilder = q03.f605j;
            if (menuBuilder != null && !q03.f613r && s02.onPreparePanel(0, q03.f604i, menuBuilder)) {
                s02.onMenuOpened(108, q03.f605j);
                this.Q.h();
            }
        }
    }

    public final boolean O(boolean z2) {
        return P(z2, true);
    }

    public final int O0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public final boolean P(boolean z2, boolean z3) {
        if (this.q0) {
            return false;
        }
        int U2 = U();
        int z02 = z0(this.J, U2);
        LocaleListCompat T2 = Build.VERSION.SDK_INT < 33 ? T(this.J) : null;
        if (!z3 && T2 != null) {
            T2 = p0(this.J.getResources().getConfiguration());
        }
        boolean Z0 = Z0(z02, T2, z2);
        if (U2 == 0) {
            o0(this.J).e();
        } else {
            AutoNightModeManager autoNightModeManager = this.w0;
            if (autoNightModeManager != null) {
                autoNightModeManager.a();
            }
        }
        if (U2 == 3) {
            n0(this.J).e();
        } else {
            AutoNightModeManager autoNightModeManager2 = this.x0;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.a();
            }
        }
        return Z0;
    }

    public void P0(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.d(configuration, localeListCompat);
    }

    public boolean Q() {
        return O(true);
    }

    public void Q0(LocaleListCompat localeListCompat) {
        Api24Impl.c(localeListCompat);
    }

    public final void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.a0.findViewById(16908290);
        View decorView = this.K.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.J.obtainStyledAttributes(R.styleable.A0);
        obtainStyledAttributes.getValue(R.styleable.M0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.N0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(R.styleable.K0)) {
            obtainStyledAttributes.getValue(R.styleable.K0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.L0)) {
            obtainStyledAttributes.getValue(R.styleable.L0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.I0)) {
            obtainStyledAttributes.getValue(R.styleable.I0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.J0)) {
            obtainStyledAttributes.getValue(R.styleable.J0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean R0() {
        /*
            r1 = this;
            boolean r0 = r1.Z
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.a0
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.ViewCompat.D(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.R0():boolean");
    }

    public final void S(Window window) {
        if (this.K == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AppCompatWindowCallback)) {
                AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
                this.L = appCompatWindowCallback;
                window.setCallback(appCompatWindowCallback);
                TintTypedArray t2 = TintTypedArray.t(this.J, (AttributeSet) null, K0);
                Drawable g2 = t2.g(0);
                if (g2 != null) {
                    window.setBackgroundDrawable(g2);
                }
                t2.v();
                this.K = window;
                if (Build.VERSION.SDK_INT >= 33 && this.G0 == null) {
                    K((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.K.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.C((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public LocaleListCompat T(Context context) {
        LocaleListCompat q2;
        if (Build.VERSION.SDK_INT >= 33 || (q2 = AppCompatDelegate.q()) == null) {
            return null;
        }
        LocaleListCompat p02 = p0(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat b2 = LocaleOverlayHelper.b(q2, p02);
        return b2.f() ? p02 : b2;
    }

    public boolean T0() {
        if (this.G0 == null) {
            return false;
        }
        PanelFeatureState q02 = q0(0, false);
        return (q02 != null && q02.f610o) || this.T != null;
    }

    public final int U() {
        int i2 = this.s0;
        return i2 != -100 ? i2 : AppCompatDelegate.m();
    }

    public androidx.appcompat.view.ActionMode U0(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback != null) {
            androidx.appcompat.view.ActionMode actionMode = this.T;
            if (actionMode != null) {
                actionMode.c();
            }
            ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
            ActionBar r2 = r();
            if (r2 != null) {
                androidx.appcompat.view.ActionMode v2 = r2.v(actionModeCallbackWrapperV9);
                this.T = v2;
                if (!(v2 == null || (appCompatCallback = this.M) == null)) {
                    appCompatCallback.h(v2);
                }
            }
            if (this.T == null) {
                this.T = V0(actionModeCallbackWrapperV9);
            }
            a1();
            return this.T;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void V(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.l0;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f605j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f610o) && !this.q0) {
            this.L.d(this.K.getCallback(), i2, menu);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.ActionMode V0(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            r7 = this;
            r7.g0()
            androidx.appcompat.view.ActionMode r0 = r7.T
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.AppCompatCallback r0 = r7.M
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.q0
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.ActionMode r0 = r0.t(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.T = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.U
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.i0
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.J
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.R.attr.f300f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.J
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r6 = r7.J
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.J
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.U = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.R.attr.f303i
            r5.<init>(r4, r1, r6)
            r7.V = r5
            r6 = 2
            androidx.core.widget.PopupWindowCompat.b(r5, r6)
            android.widget.PopupWindow r5 = r7.V
            androidx.appcompat.widget.ActionBarContextView r6 = r7.U
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.V
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.R.attr.f296b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.U
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.V
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$6 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$6
            r0.<init>()
            r7.W = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.a0
            int r4 = androidx.appcompat.R.id.f382h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.l0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.U = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.U
            if (r0 == 0) goto L_0x015b
            r7.g0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.U
            r0.l()
            androidx.appcompat.view.StandaloneActionMode r0 = new androidx.appcompat.view.StandaloneActionMode
            androidx.appcompat.widget.ActionBarContextView r4 = r7.U
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.U
            android.widget.PopupWindow r6 = r7.V
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            r8.i(r0)
            r7.T = r0
            boolean r8 = r7.R0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            androidx.core.view.ViewPropertyAnimatorCompat r8 = androidx.core.view.ViewCompat.c(r8)
            androidx.core.view.ViewPropertyAnimatorCompat r8 = r8.b(r0)
            r7.X = r8
            androidx.appcompat.app.AppCompatDelegateImpl$7 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$7
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.U
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.ViewCompat.R(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.V
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.K
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.W
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.T = r1
        L_0x015b:
            androidx.appcompat.view.ActionMode r8 = r7.T
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.AppCompatCallback r0 = r7.M
            if (r0 == 0) goto L_0x0166
            r0.h(r8)
        L_0x0166:
            r7.a1()
            androidx.appcompat.view.ActionMode r8 = r7.T
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.V0(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    public void W(MenuBuilder menuBuilder) {
        if (!this.k0) {
            this.k0 = true;
            this.Q.j();
            Window.Callback s02 = s0();
            if (s02 != null && !this.q0) {
                s02.onPanelClosed(108, menuBuilder);
            }
            this.k0 = false;
        }
    }

    public final void W0() {
        if (this.Z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        AutoNightModeManager autoNightModeManager = this.w0;
        if (autoNightModeManager != null) {
            autoNightModeManager.a();
        }
        AutoNightModeManager autoNightModeManager2 = this.x0;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.a();
        }
    }

    public final AppCompatActivity X0() {
        Context context = this.J;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    public void Y(int i2) {
        Z(q0(i2, true), true);
    }

    public final void Y0(Configuration configuration) {
        Activity activity = (Activity) this.I;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).a().b().f(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.p0 && !this.q0) {
            activity.onConfigurationChanged(configuration);
        }
    }

    public void Z(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (!z2 || panelFeatureState.f596a != 0 || (decorContentParent = this.Q) == null || !decorContentParent.b()) {
            WindowManager windowManager = (WindowManager) this.J.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f610o || (viewGroup = panelFeatureState.f602g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    V(panelFeatureState.f596a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f608m = false;
            panelFeatureState.f609n = false;
            panelFeatureState.f610o = false;
            panelFeatureState.f603h = null;
            panelFeatureState.f612q = true;
            if (this.m0 == panelFeatureState) {
                this.m0 = null;
            }
            if (panelFeatureState.f596a == 0) {
                a1();
                return;
            }
            return;
        }
        W(panelFeatureState.f605j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Z0(int r9, androidx.core.os.LocaleListCompat r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.J
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.a0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.J
            int r1 = r8.m0(r1)
            android.content.res.Configuration r2 = r8.r0
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.J
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r8.p0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.LocaleListCompat r0 = r8.p0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0045
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0045
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L_0x0045:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x006f
            boolean r11 = r8.o0
            if (r11 == 0) goto L_0x006f
            boolean r11 = L0
            if (r11 != 0) goto L_0x0058
            boolean r11 = r8.p0
            if (r11 == 0) goto L_0x006f
        L_0x0058:
            java.lang.Object r11 = r8.I
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x006f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x006f
            java.lang.Object r11 = r8.I
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.ActivityCompat.q(r11)
            r11 = r7
            goto L_0x0070
        L_0x006f:
            r11 = r6
        L_0x0070:
            if (r11 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            r11 = r3 & r1
            if (r11 != r3) goto L_0x0079
            r6 = r7
        L_0x0079:
            r8.b1(r4, r0, r6, r5)
            goto L_0x007e
        L_0x007d:
            r7 = r11
        L_0x007e:
            if (r7 == 0) goto L_0x009a
            java.lang.Object r11 = r8.I
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L_0x009a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x008f
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.u0(r9)
        L_0x008f:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r8.I
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            r9.t0(r10)
        L_0x009a:
            if (r7 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00af
            android.content.Context r9 = r8.J
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.LocaleListCompat r9 = r8.p0(r9)
            r8.Q0(r9)
        L_0x00af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.Z0(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState j02;
        Window.Callback s02 = s0();
        if (s02 == null || this.q0 || (j02 = j0(menuBuilder.D())) == null) {
            return false;
        }
        return s02.onMenuItemSelected(j02.f596a, menuItem);
    }

    public final Configuration a0(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        if (localeListCompat != null) {
            P0(configuration2, localeListCompat);
        }
        return configuration2;
    }

    public void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean T0 = T0();
            if (T0 && this.H0 == null) {
                this.H0 = Api33Impl.b(this.G0, this);
            } else if (!T0 && (onBackInvokedCallback = this.H0) != null) {
                Api33Impl.c(this.G0, onBackInvokedCallback);
            }
        }
    }

    public void b(MenuBuilder menuBuilder) {
        N0(true);
    }

    public final ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.J.obtainStyledAttributes(R.styleable.A0);
        if (obtainStyledAttributes.hasValue(R.styleable.F0)) {
            if (obtainStyledAttributes.getBoolean(R.styleable.O0, false)) {
                G(1);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.F0, false)) {
                G(108);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.G0, false)) {
                G(109);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.H0, false)) {
                G(10);
            }
            this.i0 = obtainStyledAttributes.getBoolean(R.styleable.B0, false);
            obtainStyledAttributes.recycle();
            i0();
            this.K.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.J);
            if (this.j0) {
                viewGroup = this.h0 ? (ViewGroup) from.inflate(R.layout.f417q, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.f416p, (ViewGroup) null);
            } else if (this.i0) {
                viewGroup = (ViewGroup) from.inflate(R.layout.f408h, (ViewGroup) null);
                this.g0 = false;
                this.f0 = false;
            } else if (this.f0) {
                TypedValue typedValue = new TypedValue();
                this.J.getTheme().resolveAttribute(R.attr.f300f, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.ContextThemeWrapper(this.J, typedValue.resourceId) : this.J).inflate(R.layout.f418r, (ViewGroup) null);
                DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(R.id.f391q);
                this.Q = decorContentParent;
                decorContentParent.setWindowCallback(s0());
                if (this.g0) {
                    this.Q.i(109);
                }
                if (this.d0) {
                    this.Q.i(2);
                }
                if (this.e0) {
                    this.Q.i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                ViewCompat.d0(viewGroup, new OnApplyWindowInsetsListener() {
                    public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                        int l2 = windowInsetsCompat.l();
                        int c1 = AppCompatDelegateImpl.this.c1(windowInsetsCompat, (Rect) null);
                        if (l2 != c1) {
                            windowInsetsCompat = windowInsetsCompat.r(windowInsetsCompat.j(), c1, windowInsetsCompat.k(), windowInsetsCompat.i());
                        }
                        return ViewCompat.J(view, windowInsetsCompat);
                    }
                });
                if (this.Q == null) {
                    this.b0 = (TextView) viewGroup.findViewById(R.id.S);
                }
                ViewUtils.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.f376b);
                ViewGroup viewGroup2 = (ViewGroup) this.K.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.K.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() {
                    public void a() {
                    }

                    public void onDetachedFromWindow() {
                        AppCompatDelegateImpl.this.d0();
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f0 + ", windowActionBarOverlay: " + this.g0 + ", android:windowIsFloating: " + this.i0 + ", windowActionModeOverlay: " + this.h0 + ", windowNoTitle: " + this.j0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public final void b1(int i2, LocaleListCompat localeListCompat, boolean z2, Configuration configuration) {
        Resources resources = this.J.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        if (localeListCompat != null) {
            P0(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i3 = this.t0;
        if (i3 != 0) {
            this.J.setTheme(i3);
            this.J.getTheme().applyStyle(this.t0, true);
        }
        if (z2 && (this.I instanceof Activity)) {
            Y0(configuration2);
        }
    }

    public View c0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        if (this.E0 == null) {
            String string = this.J.obtainStyledAttributes(R.styleable.A0).getString(R.styleable.E0);
            if (string == null) {
                this.E0 = new AppCompatViewInflater();
            } else {
                try {
                    this.E0 = (AppCompatViewInflater) this.J.getClassLoader().loadClass(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.E0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z3 = J0;
        boolean z4 = false;
        if (z3) {
            if (this.F0 == null) {
                this.F0 = new LayoutIncludeDetector();
            }
            if (this.F0.a(attributeSet)) {
                z2 = true;
                return this.E0.r(view, str, context, attributeSet, z2, z3, true, VectorEnabledTintResources.c());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z4 = S0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z4 = true;
            }
        }
        z2 = z4;
        return this.E0.r(view, str, context, attributeSet, z2, z3, true, VectorEnabledTintResources.c());
    }

    public final int c1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3 = 0;
        int l2 = windowInsetsCompat != null ? windowInsetsCompat.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.U;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
            boolean z4 = true;
            if (this.U.isShown()) {
                if (this.C0 == null) {
                    this.C0 = new Rect();
                    this.D0 = new Rect();
                }
                Rect rect2 = this.C0;
                Rect rect3 = this.D0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.j(), windowInsetsCompat.l(), windowInsetsCompat.k(), windowInsetsCompat.i());
                }
                ViewUtils.a(this.a0, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                WindowInsetsCompat w2 = ViewCompat.w(this.a0);
                int j2 = w2 == null ? 0 : w2.j();
                int k2 = w2 == null ? 0 : w2.k();
                if (marginLayoutParams2.topMargin == i4 && marginLayoutParams2.leftMargin == i5 && marginLayoutParams2.rightMargin == i6) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i4;
                    marginLayoutParams2.leftMargin = i5;
                    marginLayoutParams2.rightMargin = i6;
                    z3 = true;
                }
                if (i4 <= 0 || this.c0 != null) {
                    View view = this.c0;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i2 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == j2 && marginLayoutParams.rightMargin == k2))) {
                        marginLayoutParams.height = i2;
                        marginLayoutParams.leftMargin = j2;
                        marginLayoutParams.rightMargin = k2;
                        this.c0.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.J);
                    this.c0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.a0.addView(this.c0, -1, layoutParams);
                }
                View view3 = this.c0;
                if (view3 == null) {
                    z4 = false;
                }
                if (z4 && view3.getVisibility() != 0) {
                    d1(this.c0);
                }
                if (!this.h0 && z4) {
                    l2 = 0;
                }
                z2 = z4;
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.U.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.c0;
        if (view4 != null) {
            if (!z2) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
        return l2;
    }

    public void d0() {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent = this.Q;
        if (decorContentParent != null) {
            decorContentParent.j();
        }
        if (this.V != null) {
            this.K.getDecorView().removeCallbacks(this.W);
            if (this.V.isShowing()) {
                try {
                    this.V.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.V = null;
        }
        g0();
        PanelFeatureState q02 = q0(0, false);
        if (q02 != null && (menuBuilder = q02.f605j) != null) {
            menuBuilder.close();
        }
    }

    public final void d1(View view) {
        view.setBackgroundColor((ViewCompat.z(view) & 8192) != 0 ? ContextCompat.c(this.J, R.color.f323b) : ContextCompat.c(this.J, R.color.f322a));
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.a0.findViewById(16908290)).addView(view, layoutParams);
        this.L.c(this.K.getCallback());
    }

    public boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.I;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.K.getDecorView()) != null && KeyEventDispatcher.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.L.b(this.K.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    public void f0(int i2) {
        PanelFeatureState q02;
        PanelFeatureState q03 = q0(i2, true);
        if (q03.f605j != null) {
            Bundle bundle = new Bundle();
            q03.f605j.Q(bundle);
            if (bundle.size() > 0) {
                q03.f614s = bundle;
            }
            q03.f605j.d0();
            q03.f605j.clear();
        }
        q03.f613r = true;
        q03.f612q = true;
        if ((i2 == 108 || i2 == 0) && this.Q != null && (q02 = q0(0, false)) != null) {
            q02.f608m = false;
            M0(q02, (KeyEvent) null);
        }
    }

    public Context g(Context context) {
        this.o0 = true;
        int z02 = z0(context, U());
        if (AppCompatDelegate.u(context)) {
            AppCompatDelegate.N(context);
        }
        LocaleListCompat T2 = T(context);
        if (M0 && (context instanceof ContextThemeWrapper)) {
            try {
                ContextThemeWrapperCompatApi17Impl.a((ContextThemeWrapper) context, a0(context, z02, T2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
            try {
                ((androidx.appcompat.view.ContextThemeWrapper) context).a(a0(context, z02, T2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!L0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = Api17Impl.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration a02 = a0(context, z02, T2, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, R.style.f443c);
        contextThemeWrapper.a(a02);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.a(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(contextThemeWrapper);
    }

    public void g0() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.X;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
        }
    }

    public final void h0() {
        if (!this.Z) {
            this.a0 = b0();
            CharSequence r02 = r0();
            if (!TextUtils.isEmpty(r02)) {
                DecorContentParent decorContentParent = this.Q;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(r02);
                } else if (K0() != null) {
                    K0().u(r02);
                } else {
                    TextView textView = this.b0;
                    if (textView != null) {
                        textView.setText(r02);
                    }
                }
            }
            R();
            I0(this.a0);
            this.Z = true;
            PanelFeatureState q02 = q0(0, false);
            if (this.q0) {
                return;
            }
            if (q02 == null || q02.f605j == null) {
                x0(108);
            }
        }
    }

    public final void i0() {
        if (this.K == null) {
            Object obj = this.I;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.K == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public View j(int i2) {
        h0();
        return this.K.findViewById(i2);
    }

    public PanelFeatureState j0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.l0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f605j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public Context l() {
        return this.J;
    }

    public final Context l0() {
        ActionBar r2 = r();
        Context k2 = r2 != null ? r2.k() : null;
        return k2 == null ? this.J : k2;
    }

    public final int m0(Context context) {
        if (!this.v0 && (this.I instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.I.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.u0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.u0 = 0;
            }
        }
        this.v0 = true;
        return this.u0;
    }

    public int n() {
        return this.s0;
    }

    public final AutoNightModeManager n0(Context context) {
        if (this.x0 == null) {
            this.x0 = new AutoBatteryNightModeManager(context);
        }
        return this.x0;
    }

    public final AutoNightModeManager o0(Context context) {
        if (this.w0 == null) {
            this.w0 = new AutoTimeNightModeManager(TwilightManager.a(context));
        }
        return this.w0;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    public MenuInflater p() {
        if (this.O == null) {
            t0();
            ActionBar actionBar = this.N;
            this.O = new SupportMenuInflater(actionBar != null ? actionBar.k() : this.J);
        }
        return this.O;
    }

    public LocaleListCompat p0(Configuration configuration) {
        return Api24Impl.b(configuration);
    }

    public PanelFeatureState q0(int i2, boolean z2) {
        PanelFeatureState[] panelFeatureStateArr = this.l0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i2 + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.l0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    public ActionBar r() {
        t0();
        return this.N;
    }

    public final CharSequence r0() {
        Object obj = this.I;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.P;
    }

    public void s() {
        LayoutInflater from = LayoutInflater.from(this.J);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final Window.Callback s0() {
        return this.K.getCallback();
    }

    public void t() {
        if (K0() != null && !r().l()) {
            x0(0);
        }
    }

    public final void t0() {
        h0();
        if (this.f0 && this.N == null) {
            Object obj = this.I;
            if (obj instanceof Activity) {
                this.N = new WindowDecorActionBar((Activity) this.I, this.g0);
            } else if (obj instanceof Dialog) {
                this.N = new WindowDecorActionBar((Dialog) this.I);
            }
            ActionBar actionBar = this.N;
            if (actionBar != null) {
                actionBar.r(this.B0);
            }
        }
    }

    public final boolean u0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f604i;
        if (view != null) {
            panelFeatureState.f603h = view;
            return true;
        } else if (panelFeatureState.f605j == null) {
            return false;
        } else {
            if (this.S == null) {
                this.S = new PanelMenuPresenterCallback();
            }
            View view2 = (View) panelFeatureState.a(this.S);
            panelFeatureState.f603h = view2;
            return view2 != null;
        }
    }

    public final boolean v0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(l0());
        panelFeatureState.f602g = new ListMenuDecorView(panelFeatureState.f607l);
        panelFeatureState.f598c = 81;
        return true;
    }

    public void w(Configuration configuration) {
        ActionBar r2;
        if (this.f0 && this.Z && (r2 = r()) != null) {
            r2.m(configuration);
        }
        AppCompatDrawableManager.b().g(this.J);
        this.r0 = new Configuration(this.J.getResources().getConfiguration());
        P(false, false);
    }

    public final boolean w0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.J;
        int i2 = panelFeatureState.f596a;
        if ((i2 == 0 || i2 == 108) && this.Q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(R.attr.f300f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(R.attr.f301g, typedValue, true);
            } else {
                theme2.resolveAttribute(R.attr.f301g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.R(this);
        panelFeatureState.c(menuBuilder);
        return true;
    }

    public void x(Bundle bundle) {
        String str;
        this.o0 = true;
        O(false);
        i0();
        Object obj = this.I;
        if (obj instanceof Activity) {
            try {
                str = NavUtils.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar K02 = K0();
                if (K02 == null) {
                    this.B0 = true;
                } else {
                    K02.r(true);
                }
            }
            AppCompatDelegate.d(this);
        }
        this.r0 = new Configuration(this.J.getResources().getConfiguration());
        this.p0 = true;
    }

    public final void x0(int i2) {
        this.z0 = (1 << i2) | this.z0;
        if (!this.y0) {
            ViewCompat.P(this.K.getDecorView(), this.A0);
            this.y0 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.I
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.AppCompatDelegate.E(r3)
        L_0x0009:
            boolean r0 = r3.y0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.K
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.A0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.q0 = r0
            int r0 = r3.s0
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.I
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.SimpleArrayMap r0 = I0
            java.lang.Object r1 = r3.I
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.s0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.SimpleArrayMap r0 = I0
            java.lang.Object r1 = r3.I
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.ActionBar r0 = r3.N
            if (r0 == 0) goto L_0x005b
            r0.n()
        L_0x005b:
            r3.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.y():void");
    }

    public boolean y0() {
        return this.Y;
    }

    public void z(Bundle bundle) {
        h0();
    }

    public int z0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        return n0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return o0(context).c();
            }
        }
        return i2;
    }

    public AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity X0;
        this.X = null;
        this.Y = true;
        this.s0 = -100;
        this.A0 = new Runnable() {
            public void run() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl.z0 & 1) != 0) {
                    appCompatDelegateImpl.f0(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl2.z0 & 4096) != 0) {
                    appCompatDelegateImpl2.f0(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.y0 = false;
                appCompatDelegateImpl3.z0 = 0;
            }
        };
        this.J = context;
        this.M = appCompatCallback;
        this.I = obj;
        if (this.s0 == -100 && (obj instanceof Dialog) && (X0 = X0()) != null) {
            this.s0 = X0.p0().n();
        }
        if (this.s0 == -100) {
            SimpleArrayMap simpleArrayMap = I0;
            Integer num = (Integer) simpleArrayMap.get(obj.getClass().getName());
            if (num != null) {
                this.s0 = num.intValue();
                simpleArrayMap.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        AppCompatDrawableManager.h();
    }
}
