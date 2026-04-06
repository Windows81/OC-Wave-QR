package com.hansecom.mapi.models;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Metadata
@Serializable
public enum ErrorCode {
    _4000("4000"),
    _4001("4001"),
    _4002("4002"),
    _4003("4003"),
    _4004("4004"),
    _4005("4005"),
    _4006("4006"),
    _4007("4007"),
    _4008("4008"),
    _4009("4009"),
    _30000("30000"),
    _30001("30001");
    

    /* renamed from: A  reason: collision with root package name */
    public static final Lazy f39309A = null;
    public static final Companion Companion = null;

    /* renamed from: z  reason: collision with root package name */
    public final String f39311z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) ErrorCode.f39309A.getValue();
        }

        public final KSerializer<ErrorCode> serializer() {
            return a();
        }

        public Companion() {
        }
    }

    static {
        ErrorCode[] d2;
        C = EnumEntriesKt.a(d2);
        Companion = new Companion((DefaultConstructorMarker) null);
        f39309A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39312z);
    }

    /* access modifiers changed from: public */
    ErrorCode(String str) {
        this.f39311z = str;
    }

    public String toString() {
        return this.f39311z;
    }
}
