package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

public final class LoggerFactory {

    /* renamed from: a  reason: collision with root package name */
    public static int f44096a;

    /* renamed from: b  reason: collision with root package name */
    public static SubstituteLoggerFactory f44097b = new SubstituteLoggerFactory();

    /* renamed from: c  reason: collision with root package name */
    public static NOPLoggerFactory f44098c = new NOPLoggerFactory();

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f44099d = {"1.6", "1.7"};

    /* renamed from: e  reason: collision with root package name */
    public static String f44100e = "org/slf4j/impl/StaticLoggerBinder.class";

    public static final void a() {
        try {
            Set c2 = c();
            l(c2);
            StaticLoggerBinder.getSingleton();
            f44096a = 3;
            k(c2);
            d();
        } catch (NoClassDefFoundError e2) {
            if (i(e2.getMessage())) {
                f44096a = 4;
                Util.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                Util.a("Defaulting to no-operation (NOP) logger implementation");
                Util.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            b(e2);
            throw e2;
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (!(message == null || message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                f44096a = 2;
                Util.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.a("Your binding is version 1.5.5 or earlier.");
                Util.a("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        } catch (Exception e4) {
            b(e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    public static void b(Throwable th) {
        f44096a = 2;
        Util.b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f44100e) : classLoader.getResources(f44100e);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            Util.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static final void d() {
        List<SubstituteLogger> c2 = f44097b.c();
        if (!c2.isEmpty()) {
            Util.a("The following set of substitute loggers may have been accessed");
            Util.a("during the initialization phase. Logging calls during this");
            Util.a("phase were not honored. However, subsequent logging calls to these");
            Util.a("loggers will work as normally expected.");
            Util.a("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (SubstituteLogger substituteLogger : c2) {
                substituteLogger.f(g(substituteLogger.e()));
                Util.a(substituteLogger.e());
            }
            f44097b.b();
        }
    }

    public static ILoggerFactory e() {
        if (f44096a == 0) {
            f44096a = 1;
            j();
        }
        int i2 = f44096a;
        if (i2 == 1) {
            return f44097b;
        }
        if (i2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i2 == 4) {
                return f44098c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    public static Logger f(Class cls) {
        return g(cls.getName());
    }

    public static Logger g(String str) {
        return e().a(str);
    }

    public static boolean h(Set set) {
        return set.size() > 1;
    }

    public static boolean i(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    public static final void j() {
        a();
        if (f44096a == 3) {
            m();
        }
    }

    public static void k(Set set) {
        if (h(set)) {
            Util.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    public static void l(Set set) {
        if (h(set)) {
            Util.a("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Util.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            Util.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void m() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                strArr = f44099d;
                if (i2 >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i2])) {
                    z2 = true;
                }
                i2++;
            }
            if (!z2) {
                Util.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                Util.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Util.b("Unexpected problem occured during version sanity check", th);
        }
    }
}
