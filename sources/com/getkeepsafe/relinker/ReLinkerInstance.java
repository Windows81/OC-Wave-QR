package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.ReLinker;
import com.getkeepsafe.relinker.elf.ElfParser;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ReLinkerInstance {

    /* renamed from: a  reason: collision with root package name */
    public final Set f23779a;

    /* renamed from: b  reason: collision with root package name */
    public final ReLinker.LibraryLoader f23780b;

    /* renamed from: c  reason: collision with root package name */
    public final ReLinker.LibraryInstaller f23781c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23782d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23783e;

    /* renamed from: f  reason: collision with root package name */
    public ReLinker.Logger f23784f;

    public ReLinkerInstance() {
        this(new SystemLibraryLoader(), new ApkLibraryInstaller());
    }

    public void b(Context context, String str, String str2) {
        File c2 = c(context);
        File d2 = d(context, str, str2);
        final String a2 = this.f23780b.a(str);
        File[] listFiles = c2.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith(a2);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f23782d || !file.getAbsolutePath().equals(d2.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String a2 = this.f23780b.a(str);
        if (TextUtils.a(str2)) {
            return new File(c(context), a2);
        }
        File c2 = c(context);
        return new File(c2, a2 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, (String) null, (ReLinker.LoadListener) null);
    }

    public void f(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!TextUtils.a(str)) {
            i("Beginning load of %s...", str);
            if (loadListener == null) {
                g(context, str, str2);
                return;
            }
            final Context context2 = context;
            final String str3 = str;
            final String str4 = str2;
            final ReLinker.LoadListener loadListener2 = loadListener;
            new Thread(new Runnable() {
                public void run() {
                    try {
                        ReLinkerInstance.this.g(context2, str3, str4);
                        loadListener2.a();
                    } catch (UnsatisfiedLinkError e2) {
                        loadListener2.b(e2);
                    } catch (MissingLibraryException e3) {
                        loadListener2.b(e3);
                    }
                }
            }).start();
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    public final void g(Context context, String str, String str2) {
        ElfParser elfParser;
        ElfParser elfParser2;
        if (!this.f23779a.contains(str) || this.f23782d) {
            try {
                this.f23780b.b(str);
                this.f23779a.add(str);
                i("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e2) {
                i("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                i("%s (%s) was not loaded normally, re-linking...", str, str2);
                File d2 = d(context, str, str2);
                if (!d2.exists() || this.f23782d) {
                    if (this.f23782d) {
                        i("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    b(context, str, str2);
                    this.f23781c.a(context, this.f23780b.d(), this.f23780b.a(str), d2, this);
                }
                try {
                    if (this.f23783e) {
                        elfParser = null;
                        elfParser2 = new ElfParser(d2);
                        List<String> c2 = elfParser2.c();
                        elfParser2.close();
                        for (String c3 : c2) {
                            e(context, this.f23780b.c(c3));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f23780b.e(d2.getAbsolutePath());
                this.f23779a.add(str);
                i("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                elfParser = elfParser2;
                elfParser.close();
                throw th;
            }
        } else {
            i("%s already loaded previously!", str);
        }
    }

    public void h(String str) {
        ReLinker.Logger logger = this.f23784f;
        if (logger != null) {
            logger.a(str);
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public ReLinkerInstance(ReLinker.LibraryLoader libraryLoader, ReLinker.LibraryInstaller libraryInstaller) {
        this.f23779a = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (libraryInstaller != null) {
            this.f23780b = libraryLoader;
            this.f23781c = libraryInstaller;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }
}
