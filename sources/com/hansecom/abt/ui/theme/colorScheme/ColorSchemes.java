package com.hansecom.abt.ui.theme.colorScheme;

import android.graphics.Color;
import kotlin.Metadata;

@Metadata
public interface ColorSchemes {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f38931a = Companion.f38932a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f38932a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final int f38933b = Color.argb(230, 255, 255, 255);

        /* renamed from: c  reason: collision with root package name */
        public static final int f38934c = Color.argb(128, 27, 27, 27);

        public final int a() {
            return f38934c;
        }

        public final int b() {
            return f38933b;
        }
    }

    @Metadata
    public static final class DefaultImpls {
        public static AbtColorScheme a(ColorSchemes colorSchemes, boolean z2) {
            return z2 ? colorSchemes.b() : colorSchemes.a();
        }
    }

    AbtColorScheme a();

    AbtColorScheme b();
}
