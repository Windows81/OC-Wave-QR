package com.hansecom.abt.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
@Retention(RetentionPolicy.RUNTIME)
public @interface PaparazziConfig {

    @Metadata
    public enum RenderingMode {
        NORMAL,
        V_SCROLL,
        H_SCROLL,
        FULL_EXPAND,
        SHRINK;

        static {
            RenderingMode[] d2;
            F = EnumEntriesKt.a(d2);
        }
    }
}
