package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebViewGlueCommunicator {

    public static class LAZY_COMPAT_CONVERTER_HOLDER {

        /* renamed from: a  reason: collision with root package name */
        public static final WebkitToCompatConverter f23202a = new WebkitToCompatConverter(WebViewGlueCommunicator.d().getWebkitToCompatConverter());
    }

    public static class LAZY_FACTORY_HOLDER {

        /* renamed from: a  reason: collision with root package name */
        public static final WebViewProviderFactory f23203a = WebViewGlueCommunicator.a();
    }

    public static WebViewProviderFactory a() {
        try {
            return new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new IncompatibleApkWebViewProviderFactory();
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static WebkitToCompatConverter c() {
        return LAZY_COMPAT_CONVERTER_HOLDER.f23202a;
    }

    public static WebViewProviderFactory d() {
        return LAZY_FACTORY_HOLDER.f23203a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? ApiHelperForP.b() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
