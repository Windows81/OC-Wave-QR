package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R;

public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f778f;

    /* renamed from: a  reason: collision with root package name */
    public int f779a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f780b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f781c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f782d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f783e;

    public static class Api17Impl {
        public static Context a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }

    public ContextThemeWrapper(Context context, int i2) {
        super(context);
        this.f779a = i2;
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f778f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f778f = configuration2;
        }
        return configuration.equals(f778f);
    }

    public void a(Configuration configuration) {
        if (this.f783e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f782d == null) {
            this.f782d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f783e == null) {
            Configuration configuration = this.f782d;
            if (configuration == null || e(configuration)) {
                this.f783e = super.getResources();
            } else {
                this.f783e = Api17Impl.a(this, this.f782d).getResources();
            }
        }
        return this.f783e;
    }

    public int c() {
        return this.f779a;
    }

    public final void d() {
        boolean z2 = this.f780b == null;
        if (z2) {
            this.f780b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f780b.setTo(theme);
            }
        }
        f(this.f780b, this.f779a, z2);
    }

    public void f(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f781c == null) {
            this.f781c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f781c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f780b;
        if (theme != null) {
            return theme;
        }
        if (this.f779a == 0) {
            this.f779a = R.style.f444d;
        }
        d();
        return this.f780b;
    }

    public void setTheme(int i2) {
        if (this.f779a != i2) {
            this.f779a = i2;
            d();
        }
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f780b = theme;
    }
}
