package com.hansecom.abt.data.config.menu;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import t.b;

@Metadata
@Serializable
public enum MenuItemType {
    NAVIGATION,
    ACTION,
    GROUP,
    SWITCH,
    WEBVIEW,
    BROWSER,
    UNKNOWN;
    
    public static final Companion Companion = null;

    /* renamed from: z  reason: collision with root package name */
    public static final Lazy f33249z = null;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) MenuItemType.f33249z.getValue();
        }

        public final KSerializer<MenuItemType> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MenuItemType[] f2;
        C = EnumEntriesKt.a(f2);
        Companion = new Companion((DefaultConstructorMarker) null);
        f33249z = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new b());
    }
}
